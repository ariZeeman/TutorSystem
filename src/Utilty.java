import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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

    public Tutor createTutorFromFile() throws FileNotFoundException { //have the scanner being used as a parameter? also return array of turors, or just one?
        File f = new File("tutors.txt");
        Scanner s = new Scanner(f);
        ArrayList<Tutor> list = new ArrayList<>();
        int counter = 0;
        list.add(new Tutor());
        String st = s.nextLine();
        String[] array = (st.split(","));
        list.get(counter).setSubject(array[0]);
        list.get(counter).setFirstName(array[1]);
        list.get(counter).setLastName(array[2]);
        list.get(counter).setPhoneNumber(array[3]);
        list.get(counter).setEmail(array[4]);
        int m = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                list.get(counter).setAvailability(i, j, Boolean.parseBoolean(array[m]));
                m++;
            }
        }
        list.get(counter).setVisibility(Boolean.parseBoolean(array[36]));
        counter++;
        Tutor temp = new Tutor(array[0], array[1], array[2], array[3]); //initializes tutor with info from line
        return temp;
    }

    public void addObjectToFile(Object o, PrintWriter pw) {
        pw.println(o.toString());
    }

}
