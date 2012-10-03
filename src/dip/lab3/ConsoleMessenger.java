
package dip.lab3;

import java.util.Scanner;


public class ConsoleMessenger implements IMessengerInputStrategy, IMessengerOutputStrategy{
    private final String get_Input = "Enter Message";    

    public Message setMessage() {
        
        Scanner input = new Scanner(System.in);
        System.out.println(get_Input);
        Message msg = new Message(input.nextLine());
        return msg;
    }

    public void outPutMessage(IMessengerInputStrategy input) {
        Message msg = input.setMessage();
        System.out.println(msg.getMessage());
    }
    
}
