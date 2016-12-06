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
public class NeuspesanUpis extends Status{

    public NeuspesanUpis(Student student) {
        super(student);
    }



    @Override
    public void upisiNarednuGodinu(int brojESPB) {
        if (brojESPB >= 48 && brojESPB<60) {
            student.setStatusStudenta(new Samofinansirajuci(student));
        }else{
            System.out.println("UPIS GODINE: Nemate dovoljno bodova za upis godine!");
        }
    }
    
}
