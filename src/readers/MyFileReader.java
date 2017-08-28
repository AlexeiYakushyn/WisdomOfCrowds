package readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by alexei.yakushyn on 17.08.17.
 */
public class MyFileReader implements Readers {

    public static final String FILENAME = "/home/java2/IdeaProjects/WisdomOfCrowds/src/resources/myTextFile.txt";

    public MyFileReader() throws FileNotFoundException {
    }

    @Override
    public String read() throws FileNotFoundException {
        BufferedReader fileReader = new BufferedReader(new FileReader(FILENAME));

        String line = null;
        try {
            line = fileReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return line;
    }
}
