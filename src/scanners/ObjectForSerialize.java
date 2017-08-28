package scanners;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by alexei.yakushyn on 28.08.2017.
 */
public class ObjectForSerialize implements Externalizable {

    ArrayList<String> list = new ArrayList<>();

    public ObjectForSerialize(ArrayList<String> list) {
        this.list = list;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(list);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        list = (ArrayList<String>) in.readObject();
    }
}
