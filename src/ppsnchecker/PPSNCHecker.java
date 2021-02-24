/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppsnchecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Ken
 */
public class PPSNCHecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myPPSN="";
        
        BufferedReader myKB = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Please enter your PPSN");
       try{
           //using buffered reader so must have a try catch
           //because i am inputting a string anyway, i don't need to use the catch
        myPPSN = myKB.readLine();
       }
       catch (Exception e) {
         //deliberately blank
       }
       
        if ( (myPPSN.length() < 8) || (myPPSN.length() > 9) ) {
            //invalid length
        
            System.out.println("Invalid PPSN. Must be 7 numbers followed by 1 or 2 letters"); 
        }
        else{
            
            String first7 = myPPSN.substring(0,7);	//all characters starting from 1st to 7th 
            String lastFew = myPPSN.substring(7);	//everything after the 7th character
            
            if ( (first7.matches("[0-9]+")) && (lastFew.matches("[a-zA-Z]+")) ){
		//valid – first 7 characters are numeric ; last few are letters
		System.out.println("That is a valid PPSN");
            }
            else {
		// invalid – not all letters
		System.out.println("Invalid PPSN. Must be 7 numbers followed by 1 or 2 letters");
            }


        }
    
    }
}
