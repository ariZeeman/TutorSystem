import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 349173815
 */
public class Utilty {

    /**
     * Bubble/Sinking sort that is for the StockInfo objects.
     *
     * @param array the array to be sorted
     * @return the sorted array
     */
    public static Tutor[] bubbleSort(Tutor[] array) {
        boolean swapped;
        do {
            //nothing has been swapped, will stay that way until something is
            swapped = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(array[i - 1]) < 0) {
                    //empty variable for a swap
                    Tutor t = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = t;
                    //something has been swapped
                    swapped = true;
                }
            }
            //run until nothing has to be swapped
        } while (swapped);
        return array;
    }

    public Tutor[] createTutorFromFile() throws FileNotFoundException {
        File f = new File("tutors.txt");
        Scanner s = new Scanner(f);
        ArrayList<Tutor> temp = new ArrayList<>();
        while (s.hasNext()) {
            String st = s.nextLine();
            String[] array = (st.split(","));
            temp.setSubject(array[0]);
            temp.set;
        }
        return null;

    }
}
