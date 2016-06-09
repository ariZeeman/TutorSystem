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
    private final boolean[][] availability = new boolean[5][6];

    /**
     * Default constructor for the tutor object
     */
    public Tutor() {
    }

    /**
     * The setter method for the availability which allows
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
}
