package scanners;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by java2 on 17.08.17.
 */
public class FileScanner {

    public int scan(String word) throws IOException {
        int count = 0;

        //Scanner scnr = new Scanner(new BufferedReader(new FileReader("/home/java2/IdeaProjects/WisdomOfCrowds/src/resources/")));

        String path = "/home/java2/IdeaProjects/WisdomOfCrowds/src/resources/";
        File dir = new File(path);


        ArrayList<String> listFile = new ArrayList<>();
        ArrayList<String> listFile2 = new ArrayList<>();

        for (File parent1 : dir.listFiles()) {

            if (!parent1.isDirectory()) {
                listFile.add(parent1.getName());
            }
        }

        for (int i = 0; i < listFile.size(); i++) {
            listFile2.add(path + listFile.get(i));
        }
        //System.out.println(listFile2);


        String line;
        for (int i = 0; i < listFile2.size(); i++) {
            BufferedReader fileReader = new BufferedReader(new FileReader(listFile2.get(i)));
            while ((line = fileReader.readLine()) != null) {

                if (line.contains(word)) {
                    count++;
                }
            }

        }
        return count;
    }
}

