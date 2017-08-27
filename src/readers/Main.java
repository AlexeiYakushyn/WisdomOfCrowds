package readers;

import scanners.FileScanner;

import java.io.File;
import java.io.IOException;

/**
 * Created by java2 on 17.08.17.
 */
public class Main {


    public static void main(String[] args) throws IOException {


//        ConsoleReader cr = new ConsoleReader();
//
//        System.out.println(cr.read());
//
//        MyFileReader fr = new MyFileReader();
//
//        System.out.println(fr.read());

        FileScanner scanner = new FileScanner();

       // System.out.println(FileScanner.PATH);
       //scanner.scanDir(FileScanner.PATH, "word");
        System.out.println(scanner.scanDir(FileScanner.PATH, "word"));

    }
}
