/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import util.Samofinansirajuci;
import util.Statusi;

/**
 *
 * @author Ilija Antovic
 */
public class Student {
    int indeks;
    int godinaUpisa;
    String imePrezime;
    int brojESPB;
    int godina;
    Statusi statusStudenta;
    
    public Student(int indeks, int godinaUpisa, String imePrezime, int brojESPB, int godina) {
        this.indeks = indeks;
        this.godinaUpisa = godinaUpisa;
        this.imePrezime = imePrezime;
        this.brojESPB = brojESPB;
        this.godina = godina;
        statusStudenta = new Samofinansirajuci(this);
    }



    public void upisiNarednuGodinu(){
        if(brojESPB<48){
            System.out.println("UPIS GODINE: Nemate dovoljno bodova za upis godine!");
        }
        if(brojESPB>=48 && brojESPB<60){
            System.out.println("UPIS GODINE: Upisali ste "+(godina+1)+". godinu kao samofinansirajuci student!\nPlatite XXXXXX dinara!");
            godina+=1;
        }
        if(brojESPB==60){
            System.out.println("UPIS GODINE: Upisali ste "+(godina+1)+". godinu i bicete finansirani iz budzeta!\nCestitamo!");
            godina+=1;
        }
    }

    public void poloziIspit(){
        brojESPB+=6;
        System.out.println("POLAGANJE ISPITA: Bravo, polozili ste ispit! Trenutni broj ESPB je: "+brojESPB);
    }

    public void prikaziTrenutniStatus(){
        if(brojESPB<48){
            System.out.println("STATUS: Obnavlja godinu!");
        }
        if(brojESPB>=48 && brojESPB<60){
            System.out.println("STATUS: Moze upisati narednu godinu kao samofinansirajuci student!");
        }
        if(brojESPB==60){
            System.out.println("STATUS: Moze upisati narednu godinu i bice finansiran iz budzeta!");
        }
    }
}
