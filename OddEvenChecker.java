/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package odd.even.checker;

/**
 *
 * @author Zhel
 */
public class OddEvenChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int number = 5;
      int result = Power (number);
        System.out.println("RESULT: " + result);
      
    }
    static int Power(int number){
        if (number % 2 == 0){
      return 1;
        }else{
            return 0;
        }
    
        }
    
}
