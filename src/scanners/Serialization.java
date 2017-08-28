package scanners;

import java.io.*;
import java.util.ArrayList;

import static scanners.FileScanner.PATH;

/**
 * Created by alexei.yakushyn on 28.08.2017.
 */
public class Serialization implements Serializable {

    public void serialize(ArrayList<String> list) throws IOException {
       // File file = new File(PATH + "tmp.txt");
        String path = "E:\\ProgrammFiles\\hillel\\WisdomOfCrowds\\src\\tmp.txt";
        File file = new File(path);
        ObjectForSerialize forSerialize = new ObjectForSerialize(list);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        try {
            out.writeObject(forSerialize);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

/*    public void deSerialize() throws FileNotFoundException {
        String path = "E:\\ProgrammFiles\\hillel\\WisdomOfCrowds\\src\\tmp.txt";
        File file = new File(path);
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            ObjectForSerialize os = (ObjectForSerialize) ois.readObject();
            System.out.println(os.getClass());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}

