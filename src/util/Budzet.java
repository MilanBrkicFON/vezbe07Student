/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import main.Student;

/**
 *
 * @author Milan
 */
public class Budzet extends Status{
    
    public Budzet(Student student) {
        super(student);
        System.out.println("UPIS GODINE: Upisali ste "+(student.getGodina()+1)+". godinu i bicete finansirani iz budzeta!\nCestitamo!");
        student.setGodina(student.getGodina()+1);
    }

    @Override
    public void prikaziTrenutniStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upisiNarednuGodinu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
