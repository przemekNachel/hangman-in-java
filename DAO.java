import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class DAO{

    private String string;
    private String filename = "countries_and_capitals.txt";

    private String fileToString(String filename){

        try {
            String string = new String(Files.readAllBytes(Paths.get(filename)));
        } catch(IOException e) {
            System.out.println("No file " + filename);
        }

        return string;
    }

    private void stringToFile(String string, String filename){
        
        try {
            Files.write(Paths.get(filename), string.toString().getBytes());
        } catch(IOException e) {
            System.out.println("No file " + filename);
        }
    }
}