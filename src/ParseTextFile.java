import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ParseTextFile {
    
    public static ArrayList<String> parseTextFile(String path) {
        try {
            
            final BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            ArrayList<String> parsedLine = new ArrayList<String>();
            
            while((line = reader.readLine()) != null)
            {
                parsedLine.add(line.split(" ")[0]);
                parsedLine.add(line.split(" ")[1]);
            }
            
            reader.close();
            return parsedLine;
            
    
            } catch(IOException e) {
                System.out.println("Error while reading a file!");
                e.printStackTrace();
                return null;
            }
    }
}
