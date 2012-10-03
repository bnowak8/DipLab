
package dip.lab3;


public class StartUp {
    
    public static void main(String[] args) {
        

        
        IMessengerInputStrategy consoleMessengerInput = new GuiMessenger();
        IMessengerOutputStrategy consoleMessengerOutput = new ConsoleMessenger();
        
        MessengerService messenger = new MessengerService();
        
        messenger.getMessage(consoleMessengerInput ,consoleMessengerOutput);        
    }
    
}
