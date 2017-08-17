package readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by java2 on 17.08.17.
 */
public class MyFileReader implements Readers {

    public static final String FILENAME = "/home/java2/IdeaProjects/WisdomOfCrowds/src/resources/myTextFile.txt";
    BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));

    public MyFileReader() throws FileNotFoundException {
    }

    @Override
    public String read() {
        String line = null;
        try {
            line = fileReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
