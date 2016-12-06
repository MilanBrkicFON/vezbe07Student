/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import util.Budzet;
import util.NeuspesanUpis;
import util.Samofinansirajuci;
import util.Status;

/**
 *
 * @author Milan
 */
public class ShapeFactory {
    
    
    static Status vratiStatusNaOsnovuESPB(Student student, int espb){
        Status s = null;
        if (espb < 48) {
            s = new NeuspesanUpis(student);
        }
        if (espb >= 48 && espb<60) {
            s = new Samofinansirajuci(student);
        }
        if (espb == 60) {
            s = new Budzet(student);
        }
        return s;
    }
}
