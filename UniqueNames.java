package fileDirectory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UniqueNames {

	public static void main(String[] args) throws IOException {
													 // [0] split in _ [1]
		SimpleDateFormat dtf = new SimpleDateFormat("MMddyyyy_HHmmss");
		Date date = new Date();
		String dateTime = dtf.format(date);

		String[] myArray = dateTime.split("_");
		
		String dateStamp = myArray[0];
		String timeStamp = myArray[1];
		
		
		File file = new File("C:\\fall2019\\" + dateStamp);
		if (!file.exists()) {
			if (file.mkdir()) {
				
				writeFile("C:\\fall2019\\" + dateStamp + "\\log_" + dateTime + ".txt", "Hello this is my tweet");
			} 
		}
			else {
				
				writeFile("C:\\fall2019\\"  + dateStamp + "\\log_" + dateTime + ".txt", "Hello this is my tweet");
			}
		}


	public static void writeFile(String path, String name) throws IOException {

		File f = new File(path);
		FileWriter fr = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fr);

		bw.write(name);
		bw.newLine();
		bw.write(name);
		bw.close();

	}
}
