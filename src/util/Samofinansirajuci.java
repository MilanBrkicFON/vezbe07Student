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
public class Samofinansirajuci extends Status{

    public Samofinansirajuci(Student student) {
        super(student);
        System.out.println("UPIS GODINE: Upisali ste "+(student.getGodina()+1)+". godinu kao samofinansirajuci student!\nPlatite XXXXXX dinara!");
        student.setGodina(student.getGodina()+1);
    }

    @Override
    public void upisiNarednuGodinu() {
        if (student.getBrojESPB()==60) {
            student.setStatusStudenta(new Budzet(student));
        }
    }

    
    
}
