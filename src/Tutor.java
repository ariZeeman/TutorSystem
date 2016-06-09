/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 349173815
 */
public class Tutor {

    private String subject;
    private String firstName, lastName;
    private String phoneNumber;
    private int maxPerSession;
    private String email;
    //first array dimension is the days, second is the period
    private boolean[][] availability = new boolean[5][6];

    /**
     * Default constructor for the tutor object
     */
    public Tutor() {
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
     * @return the maxPerSession
     */
    public int getMaxPerSession() {
        return maxPerSession;
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
     * @param maxPerSession the maxPerSession to set
     */
    public void setMaxPerSession(int maxPerSession) {
        this.maxPerSession = maxPerSession;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
