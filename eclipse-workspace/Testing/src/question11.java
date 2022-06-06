import java.io.BufferedReader;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class question11 {

    public static void main(String[] args) {
        
        int midtermScore = 75;
        int addedScore = 10;
        

        //here is both of them, one is commented to provide correct output for other requirement
        midtermScore = midtermScore + addedScore;
        //midtermScore += addedScore;
        
        System.out.printf("%04d%n", midtermScore);
        
        String shirtSize = "";
        shirtSize = JOptionPane.showInputDialog("What is your shirt size? (L, M, or S):  ");
        
        
    }

}
