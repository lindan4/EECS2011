/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maps;

/**
 *
 * @author bmccune
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = "";
        for (Integer i = 0; i < 10;i++){
            System.out.println(i.hashCode());
            s = s +"a";
            System.out.println(s.hashCode());
        }
        
        System.out.println(((Character)'a').hashCode());
    }
    
}
