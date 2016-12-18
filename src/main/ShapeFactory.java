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
    
    
    static Status vratiStatusNaOsnovuESPB(Student student){
        
        if (student.brojESPB < 48) {
            return new NeuspesanUpis(student);
        }
        if (student.brojESPB >= 48 && student.brojESPB<60) {
            return new Samofinansirajuci(student);
        }
        if (student.brojESPB == 60) {
            return new Budzet(student);
        }
        return null;
    }
}
