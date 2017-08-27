package scanners;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by java2 on 17.08.17.
 */
public class FileScanner {
    public static int count = 0;
    public static String PATH = "D:\\myjava\\com.hillel.core\\WisdomOfCrowds\\src\\resources\\";
   // public static File dirtry = new File(PATH);
    ArrayList<String> listFile = new ArrayList<>();

    public int scan(String word) throws IOException {




        return count;
    }

    public int scanDir(String dir, String word) throws FileNotFoundException {
        File dirtry = new File(dir);
        File[] fList = dirtry.listFiles();

        for (File file : fList) {
            if (file.isFile()) {
                if (readFile(file.getAbsolutePath(), word)) {
                    count++;

                }
            }
        }
        return count;
    }

    public void readFile(String path, String word) throws FileNotFoundException {
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
        //return count;
    }
}

