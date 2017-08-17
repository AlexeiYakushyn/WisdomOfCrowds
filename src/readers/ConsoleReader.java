package readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by java2 on 17.08.17.
 */
public class ConsoleReader implements Readers {

    public String word;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public String read() {
        try {
            return word = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return word;
    }
}
