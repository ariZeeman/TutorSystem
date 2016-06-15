/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 349173815
 */
public class Teacher {

    private String email;
    private String lastName;
    private String firstName;
    private String password;

    /**
     * Constructor for the Teacher class/object, is subject to change as we
     * progress through the project and determine what needs to stay or go.
     *
     * @param mail the email the teacher is registering with
     * @param last the last name of the teacher
     * @param first the first name of the teacher
     */
    public Teacher(String first, String last, String email, String password) {
        this.firstName = first;
        this.lastName = last;
        this.email = email;
        this.password = password;
    }

    /**
     * Default empty constructor for a teacher
     */
    public Teacher() {
    }

    /**
     * Method which retrieves the email of a teacher.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns the Last name of the teacher
     *
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * The method which allows the First name to be retrieved
     *
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * The method that is used to set an email address for a teacher.
     *
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The method which sets the last name for a teacher
     *
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * The method which sets the first name for a teacher
     *
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This method prints out a teacher's name as a string (for use in a
     * drop-down menu)
     *
     * @return the first letter of the teacher's last name with a comma followed
     * by their first name's first letter. (ex. Mike R-D would appear as "R-D,
     * M.").
     */
    @Override
    public String toString() {
        return firstName + "," + lastName + "," + email;
    }
}
