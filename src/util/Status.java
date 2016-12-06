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
public abstract class Status {
    
    protected Student student;

    public Status(Student student) {
        this.student = student;
    }
    
    public void prikaziTrenutniStatus(){
        if(this instanceof NeuspesanUpis){
            System.out.println("STATUS: Obnavlja godinu!");
        }
        if(this instanceof Samofinansirajuci){
            System.out.println("STATUS: Moze upisati narednu godinu kao samofinansirajuci student!");
        }
        if(this instanceof Budzet){
            System.out.println("STATUS: Moze upisati narednu godinu i bice finansiran iz budzeta!");
        }
    }

    public abstract void upisiNarednuGodinu(int brojESPB);

    public Status vratiStatus(int brojESPB) {
        if(brojESPB < 48){
            return new NeuspesanUpis(student);
        }
        if (brojESPB >= 48 && brojESPB<60) {
            return new Samofinansirajuci(student);
        }
        if (brojESPB == 60) {
            return new Budzet(student);
        }
        return null;
    }
    
}
