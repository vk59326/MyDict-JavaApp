
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vivek
 */
public class InitDict {

    public static void main(String arg[]) {

        Word nw = new Word();
        try (ObjectOutputStream in = new ObjectOutputStream(new FileOutputStream("wrd.txt"))) {
            in.writeObject(nw);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InitDict.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InitDict.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
