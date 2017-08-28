package readers;

import scanners.FileScanner;
import scanners.Serialization;

import java.io.File;
import java.io.IOException;

/**
 * Created by alexei.yakushyn on 17.08.17.
 */
public class Main {


    public static void main(String[] args) throws IOException {


        ConsoleReader cr = new ConsoleReader();
        String s = cr.read();
       // System.out.println(cr.read());

//        MyFileReader fr = new MyFileReader();
//        System.out.println(fr.read());

        FileScanner scanner = new FileScanner();
        System.out.println(scanner.scanDir(FileScanner.PATH, s));
        System.out.println(scanner.listFile);

        Serialization serial = new Serialization();
        serial.serialize(scanner.listFile);
        //serial.deSerialize();
    }
}
