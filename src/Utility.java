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
public class Utility {

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

    /**
     * The method which creates a tutor from a file.
     *
     * @param s the scanner that is reading from the file
     * @return the tutor that has been created from the file.
     */
    public Tutor createTutorFromFile(Scanner s) { //have the scanner being used as a parameter? also return array of turors, or just one?
        String[] array = null; //array of info for peer
        if (s.hasNext()) {
            array = s.nextLine().split(",");
        }
        Tutor temp = new Tutor(array[0], array[1], array[2], array[3]);
        return temp;
    }

    /**
     *
     * @param s
     * @return
     */
    public Peer createPeerFromFile(Scanner s) {
        String[] array = null; //array of info for peer
        if (s.hasNext()) {
            array = s.nextLine().split(",");
        }
        Peer temp = new Peer(array[0], array[1], array[2], array[3]);
        return temp;
    }

    /**
     *
     * @param s
     * @return
     */
    public Teacher createTeacherFromFile(Scanner s) {
        String[] array = null; //array of info for peer
        if (s.hasNext()) {
            array = s.nextLine().split(",");
        }
        Teacher temp = new Teacher(array[0], array[1], array[2]);
        return temp;
    }

    /**
     * Method which prints out an object to a file
     *
     * @param o the object that is being created
     * @param pw PrintWriter which prints the object to a file
     */
    public void addObjectToFile(Object o, PrintWriter pw) {
        pw.println(o.toString());
    }

}
