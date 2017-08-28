package scanners;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by java2 on 17.08.17.
 */
public class FileScanner implements Serializable {
    public static int count = 0;
    public static final String PATH = "E:\\ProgrammFiles\\hillel\\WisdomOfCrowds\\src\\resources\\";
    // public static File dirtry = new File(PATH);
    public ArrayList<String> listFile = new ArrayList<>();

    public int scanDir(String dir, String word) throws FileNotFoundException {
        File dirtry = new File(dir);
        File[] fList = dirtry.listFiles();

        for (File file : fList) {
            if (file.isFile()) {
                if (file.getAbsolutePath().endsWith(".txt")) {
                    count += readFile(file.getAbsolutePath(), word);
                }
            }
            if (file.isDirectory()) {
                String s = file.getAbsolutePath();
                scanDir(s, word);
            }
        }
        return count;
    }

    public int readFile(String path, String word) throws FileNotFoundException {
        count = 0;
        File dir = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                if (line.contains(word)) {
                    listFile.add(line);
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}

