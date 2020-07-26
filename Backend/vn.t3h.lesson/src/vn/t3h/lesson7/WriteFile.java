package vn.t3h.lesson7;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void toFile(String nameFile, String content) {
		try (FileWriter fw = new FileWriter(nameFile)){
			fw.write(content);
			fw.flush();
			System.out.println("write end .!");
		}catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}

	}

}
