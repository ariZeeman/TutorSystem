import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public Tutor createTutorFromFile(Scanner s) {
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

    /**
     * This is the method which generates an array of tutors to be used by the
     * application, which uses the individual createTutorFromFile method.
     *
     * @return an array of tutors
     */
    public Tutor[] generateTutors() {
        try {
            File f = new File("tutors.txt");
            Scanner s = new Scanner(f);
            ArrayList<Tutor> list = new ArrayList();
            Tutor[] me;
            int counter = 0;
            while (s.hasNext()) {
                list.add(createTutorFromFile(s));
                counter++;
            }
            me = new Tutor[counter];
            me = list.toArray(me);
            return me;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return null;
    }

    /**
     * Method which returns an array of teachers, will probably be called to
     * fill out info in the drop menu.
     *
     * @return an array of teachers read from the teacher file
     */
    public Teacher[] generateTeachers() {
        try {
            File f = new File("teachers.txt");
            Scanner s = new Scanner(f);
            ArrayList<Teacher> list = new ArrayList();
            int counter = 0;
            Teacher[] teachers;
            while (s.hasNext()) {
                list.add(createTeacherFromFile(s));
                counter++;
            }
            teachers = new Teacher[counter];
            teachers = list.toArray(teachers);
            return teachers;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return null;
    }

    /**
     * Method which returns an array of Peer objects, same as the other
     * generateObject() methods.
     *
     * @return an array of peers from the peer file.
     */
    public Peer[] generatePeer() {
        try {
            File f = new File("peers.txt");
            Scanner s = new Scanner(f);
            ArrayList<Peer> list = new ArrayList();
            int counter = 0;
            Peer[] peers;
            while (s.hasNext()) {
                list.add(createPeerFromFile(s));
                counter++;
            }
            peers = new Peer[counter];
            peers = list.toArray(peers);
            return peers;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utility.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
