
package dip.lab3;

import java.util.Scanner;


public class ConsoleMessenger implements IMessengerStrategy{
    private String get_Input = "Enter Message";
    private String message;
    
    public void outPutMessage(){
        System.out.println(message);
    }

    public void renderMessage(){
        
        Scanner input = new Scanner(System.in);
 
        System.out.println(get_Input);
        
        this.message = input.nextLine();
        
    }
    
}
