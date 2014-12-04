import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class CSS {
	static class Grid {
		public String[] column;
		
		public Grid(String[] input) {
			column = input;
		}
	}
	
	private ArrayList<Grid> rows;
	
	public CSS() {
		
	}
	
	public CSS(ArrayList<Grid> rows) {
		this.rows = rows;
	}
	
	public Grid getRow(int index){
		return rows.get(index);
	}
	
	public void writeCSS(){
		File file = new File("genfile.html");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.err.println("Unable to create file");
			}
		}
		FileWriter fw = null;
		try {
			fw = new FileWriter(file.getAbsoluteFile());
		} catch (IOException e) {
			System.err.println("Unable to load FileWriter");
		}
		BufferedWriter bw = new BufferedWriter(fw);
		try {
			bw.write("<html>\n");
			bw.write("	<body>\n");
			for (Grid grid : rows) {
				bw.write("	<div class='row'>\n");
				for (String col : grid.column) {
					bw.write("		<div class='col-md-" + col + "'></div>\n");
				}
				bw.write("	</div>\n");
			}
			bw.write("	</body>\n");
			bw.write("</html>");
		} catch (IOException e) {
			System.err.println("Unable to write to buffer");
		}
		try {
			bw.close();
		} catch (IOException e) {
			System.err.println("Unable to close BufferedReader");
		}
	}
}
