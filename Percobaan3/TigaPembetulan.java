/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Restu
 */
public class TigaPembetulan {
    public static void main(String[] args) {
        int bil=10;
        try {
            System.out.println(bil/0);
        }
        catch(Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
