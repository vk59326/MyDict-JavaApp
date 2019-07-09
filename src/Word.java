
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vivek
 */
public class Word implements Serializable {

    private int count;
    SortedSet<String> wrd;
    HashMap<String, ArrayList<String>> mean;

    Word() {
        wrd = new TreeSet();
        mean = new HashMap();
    }

    public void addWord(String word, String hmean, String eng, String type) {
        count++;
        wrd.add(word);
        ArrayList<String> ar;
        ar = new ArrayList();
        ar.add(hmean);
        ar.add(eng);
        ar.add(type);
        mean.put(word, ar);
    }

    public void upDate(String word, String hmean, String eng, String type) {
        ArrayList<String> ar;
        ar = new ArrayList();
        ar.add(hmean);
        ar.add(eng);
        ar.add(type);
        mean.put(word, ar);
    }
}
