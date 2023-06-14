import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("AYI BOGAN RECO24");
        vec.add("RESUL24");
        vec.add("YAHYA24");

        System.out.println(vec.contains("RESUL"));
        Iterator<String> ıtr = vec.iterator();
        while (ıtr.hasNext()){
            System.out.println(ıtr.next());
        }

        for(String stu:vec){
            System.out.println(stu);
        }
    }
}
