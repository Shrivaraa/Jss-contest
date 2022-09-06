import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;

public class SpamRemover {

    public static void removeSpam(String folder) {

        // Your logic goes here

        ArrayList<String> spm = new ArrayList<>();
        spm.add("Idiot");
        spm.add("Boring");
        spm.add("Stupid");

        String content = "";
        File f[] = (new File(folder)).listFiles();

        for(File file: f) {
            try {
                content = Files.readString(Paths.get(file.getAbsolutePath()));

                for(String temp: spm)
                    content = content.replace(temp, "");

                FileWriter fW = new FileWriter(file);
                fW.write(content);
                fW.close();
            } catch(IOException ie) {
                ie.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        String folder = "C:/notes";
        removeSpam(folder);
    }
}
