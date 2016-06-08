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

    private final String email, lastName, firstName;

    /**
     * Default constructor for the Teacher class/object, is subject to change as
     * we progress through the project and determine what needs to stay or go.
     *
     * @param mail the email the teacher is registering with
     * @param last the last name of the teacher
     * @param first the first name of the teacher
     */
    public Teacher(String mail, String last, String first) {
        email = mail;
        lastName = last;
        firstName = first;
    }
}
