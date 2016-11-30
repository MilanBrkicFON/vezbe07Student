/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author Ilija Antovic
 */
public class Glavna {

    public static void main(String[] args){
        Student student=new Student(111, 2006, "Pera Peric", 42, 1);

        student.prikaziTrenutniStatus();
        student.upisiNarednuGodinu();
        student.poloziIspit();
        student.prikaziTrenutniStatus();
        student.upisiNarednuGodinu();
        student.poloziIspit();
        student.poloziIspit();
        student.prikaziTrenutniStatus();
        student.upisiNarednuGodinu();
    }
}
