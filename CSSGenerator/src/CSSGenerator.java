import java.io.IOException;

public class CSSGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CSS css = new CSSFactory().createCSS(CSSGenerator.class.getResourceAsStream("/input.txt"));
		} catch (IOException e) {
			System.err.println("Unable to build CSS");
		}
	}

}
