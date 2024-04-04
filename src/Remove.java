import java.io.*;
import java.util.Scanner;

public class Remove {
    public  void  remove(String UsrerName)throws IOException {

        File inputFile = new File("usersData.txt");
        File tempFile = new File("tempfile.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            String trimmedLine = currentLine.trim();
            if(trimmedLine.contains(UsrerName)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        boolean successful = tempFile.renameTo(inputFile);
        inputFile.delete();
        tempFile.renameTo(new File("usersData.txt"));

    }

}



