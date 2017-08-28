package readers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alexei.yakushyn on 17.08.17.
 */
public class ConsoleReader implements Readers {

    public String word;

    BufferedReader reader = null;

    @Override
    public String read() {
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String word = null;
            System.out.println("Enter something : " + "// it has to be 'word'");
            System.out.println("To stop enter 'exit'" + "work only after input exit word");

            while ((word = reader.readLine()) != null) {

                if (word.equals("exit")) {
                    System.out.println("Exit!");
                    break;
                } else read();
                return word;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return word;
    }
}
