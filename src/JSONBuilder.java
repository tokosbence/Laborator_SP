import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.io.*;
import com.fasterxml.*;
import com.fasterxml.jackson.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.core.*;


public class JSONBuilder implements Builder {
	
	private String file;
	private Element element;

	public JSONBuilder(String file) {
		this.file = file;
	}
	
	@Override
	public void build() {
		// TODO Auto-generated method stub
		try {
			ObjectMapper mapper = new ObjectMapper();

			@SuppressWarnings("unchecked")
			HashMap<String, Object> map = mapper.readValue(new File(file), HashMap.class);
			element = processMap(map);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private Element processMap(HashMap<String, Object> map) {
		Element e = null;
		String elementClass = (String) map.get("class");
		if ("section".equalsIgnoreCase(elementClass)) {
			e = this.buildSection(map);
		}
		if ("image".equalsIgnoreCase(elementClass)) {
			e = this.buildImage(map);
		}
		if ("paragraph".equalsIgnoreCase(elementClass)) {
			e = this.buildParagraph(map);
		}
		if ("imageproxy".equalsIgnoreCase(elementClass)) {
			e = this.buildImageProxy(map);
		}
		return e;
	}

	@Override
	public Element getResult() {
		// TODO Auto-generated method stub
		return element;
	}

	@Override
	public Element buildSection(HashMap<String, Object> map) {
		Sectiuni s = new Sectiuni((String) map.get("title"));
		@SuppressWarnings("unchecked")
		Collection<HashMap<String, Object>> children = (Collection) map.get("children");
		for (HashMap<String, Object> child : children) {
			Element el = processMap(child);
			if(el != null) {
				s.add(el);
			}
		}
		return s;
	}

	@Override
	public Element buildImage(HashMap<String, Object> map) {
		return new Imagine(map.get("url").toString());
	}

	@Override
	public Element buildParagraph(HashMap<String, Object> map) {
		return new Paragraf();
	}

	@Override
	public Element buildImageProxy(HashMap<String, Object> map) {
		/*return new ImageProxy( new Imagine(map.get("url").toString()));*/
		return null;
	}

}
