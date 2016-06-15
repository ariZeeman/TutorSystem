import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
        array = s.nextLine().split(",");
        Tutor temp = new Tutor(array[0], array[1], array[2], array[3], Integer.parseInt(array[4]), array[5]);
        return temp;
    }

    /**
     *
     * @param s
     * @return
     */
    public Peer createPeerFromFile(Scanner s) {
        String[] array = null; //array of info for peer
        array = s.nextLine().split(",");
        Peer temp = new Peer(array[0], array[1], array[2], array[3], array[4]);
        return temp;
    }

    /**
     *
     * @param s
     * @return
     */
    public Teacher createTeacherFromFile(Scanner s) {
        String[] array = null; //array of info for peer
        array = s.nextLine().split(",");
        Teacher temp = new Teacher(array[0], array[1], array[2], array[3]);
        return temp;
    }

    /**
     * Method which prints out an object to a file
     *
     * @param o the object that is being created
     * @param pw PrintWriter which prints the object to a file
     */
    public void addObjectToFile(Object o, PrintWriter pw) {
        pw.append(o.toString());
    }

    public void createAssignment(Peer peer, Scanner s) throws IOException {
        ArrayList ar = new ArrayList(); //arraylist of tutors
        File assignments = new File("Assignemnts.txt"); //file of assignments
        PrintWriter pw = new PrintWriter(new FileWriter(assignments, false)); //writes assignments to file
        Tutor temp = new Tutor(); //temporary stores tutor for comparison to peer's subject
        while (s.hasNext()) {
            temp = createTutorFromFile(s);
            if (peer.getSubject().equals(temp.getSubject())) { //if the peer is looking for the subject the tutor teaches
                ar.add(temp); //the tutor gets added
            }
        }
        Tutor[] tutorArray = (Tutor[]) ar.toArray();
        Tutor tutor = fewestPeers(tutorArray); //creates the tutor who has the fewest # of peers

        Assignments assignment = new Assignments(tutor, peer); //creates new assignment
        addObjectToFile(assignment, pw); //prints the assignment to the file
    }

    public Tutor fewestPeers(Tutor[] tutors) {
        Tutor lowest = tutors[0];
        for (int i = 1; i < tutors.length; i++) {
            if (tutors[i].getNumPeers() < lowest.getNumPeers()) {
                lowest = tutors[i];
            }
        }
        return lowest;
    }

    public Tutor[] needVerification(Teacher teacher) { //param = teacher who tutors have asked for verification from

        return null;
    }

    /**
     *
     * @param tutors this is temporary because we have a method to generate
     * tutors and this will replace it
     * @param teacher
     * @return
     */
    public Tutor[] needVerification(Tutor[] tutors, Teacher teacher) { //param = teacher who tutors have asked for verification from
        ArrayList<Tutor> list = new ArrayList();
        for (int i = 0; i < tutors.length; i++) {
            if (!tutors[i].getVisibility() && tutors[i].getSubject().equals(teacher.getSubject())) {
                list.add(tutors[i]);
            }
        }
        Tutor[] needsVerification = new Tutor[list.size()];
        needsVerification = (Tutor[]) list.toArray();
        return null;
    }

}
