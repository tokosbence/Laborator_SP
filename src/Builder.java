import java.util.HashMap;



public interface Builder {
	public void build();

	public Element getResult();

	public Element buildSection(HashMap<String, Object> map);

	public Element buildImage(HashMap<String, Object> map);

	public Element buildParagraph(HashMap<String, Object> map);

	public Element buildImageProxy(HashMap<String, Object> map);
}
