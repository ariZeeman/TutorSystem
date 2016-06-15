/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 349173815
 */
public class Tutor implements Comparable {

    private String subject;
    private String firstName, lastName;
    private String phoneNumber;
    private String email;
    private int numPeers;
    private String password;
    private Teacher teacher = new Teacher();
    private boolean[][] availability = new boolean[5][6];
    private boolean visibility = false;

    /**
     * Default constructor for the tutor object
     *
     */
    public Tutor() {
    }

    /**
     * Constructor for the tutor with Subject, FirstName, LastName, PhoneNumber.
     *
     * @param subject subject for tutor to teach
     * @param phoneNumber phoneNumber of tutor
     * @param firstName tutors first name
     * @param lastName tutors last name
     */
    public Tutor(String subject, String firstName, String lastName, String phoneNumber, int numPeers, String password) {
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.numPeers = numPeers;
        this.password = password;
    }

    /**
     * The order this is written in!!!!!!!!v important!!!!!!
     * Subject,FirstName,LastName,PhoneNumber,Email,numPeers,password,Availability[5][6],Visibility
     *
     * @return String value to write to files
     */
    @Override
    public String toString() {
        String string;
        string = subject + "," + firstName + "," + lastName + "," + phoneNumber + "," + email + "," + numPeers + "," + password + ",";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                string = string + availability[i][j] + ",";
            }
        }
        string = string + visibility + ",";
        return string;
    }

    /**
     * The setter method for the availability which allows the user to set the
     * value of a single boolean within the array.
     *
     * @param i the index for the days [0=Monday, 1=Tuesday...4=Friday]
     * @param j the index for the periods [0=period 1, etc., 5=after school]
     * @param trueFalse whether the selected day is available
     */
    public void setAvailability(int i, int j, boolean trueFalse) {
        if (i < 0 || i > 4) {
            System.out.println("array index for days out of bounds action not preformed");
            return;
        } else if (j < 0 || j > 5) {
            System.out.println("array index for periods out of bounds action not performed");
            return;
        }
        availability[i][j] = trueFalse;
    }

    /**
     * This getter gets a single boolean from the boolean array based on day and
     * period.
     *
     * @param i
     * @param j
     * @return
     */
    public boolean getAvailability(int i, int j) {
        if (i < 0 || i > 4) {
            System.out.println("array index for days out of bounds action not preformed");
            throw new ArrayIndexOutOfBoundsException();
        } else if (j < 0 || j > 5) {
            System.out.println("array index for periods out of bounds action not performed");
            throw new ArrayIndexOutOfBoundsException();
        }
        return getAvailability()[i][j];
    }

    /**
     * Method which allows visibility (meaning they can be found by the search
     * program, this is set to true when a teacher signs off on a student).
     *
     * @param b the value of visibility
     */
    public void setVisibility(boolean b) {
        visibility = b;
    }

    /**
     * This method returns whether the tutor is visible to the search algorithm
     * or not.
     *
     * @return whether or not the tutor can be "seen" by the search algorithm
     */
    public boolean getVisibility() {
        return visibility;
    }

    /**
     *
     * @param subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * This methods allows you to retrieve the entire 2d array of availability.
     *
     * @return the availability
     */
    public boolean[][] getAvailability() {
        return availability;
    }

    /**
     * This setter allows you to create an entire 2d boolean array from one that
     * already exists.
     *
     * @param availability the entire boolean value being written
     */
    public void setAvailability(boolean[][] availability) {
        this.availability = availability;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * When a
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Object o) {
        Tutor b = (Tutor) o;
        return this.subject.compareTo(b.subject);
    }
}
