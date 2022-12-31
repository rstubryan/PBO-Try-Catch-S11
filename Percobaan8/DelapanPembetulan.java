/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author Restu
 */
public class DelapanPembetulan {
    public void methodA(){
    System.out.println("Method A");
    }
    public void methodB() throws IOException {
        System.out.println(20/0);
        System.out.println("Method B");
    }
}

class Utama {
    public static void main(String[] args) {
        Delapan o=new Delapan();
        o.methodA();
        try {
            o.methodB();
        }
        catch(Exception e) {
            System.out.println("Error di Method B");
        }
        finally {
            System.out.println("Ini selalu dicetak");
        };
    }
}
