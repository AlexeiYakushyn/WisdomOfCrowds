package readers;

import java.io.FileNotFoundException;

/**
 * Created by alexei.yakushyn on 17.08.17.
 */
public interface Readers {

    String read() throws FileNotFoundException;
}
