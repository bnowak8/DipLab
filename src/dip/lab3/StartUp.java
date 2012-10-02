
package dip.lab3;


public class StartUp {
    
    public static void main(String[] args) {
        
        MessengerService messenger = new MessengerService();
        
        IMessengerStrategy guiMessenger = new GuiMessenger();
        
        messenger.getMessage(guiMessenger);
        
        
        IMessengerStrategy consoleMessenger = new ConsoleMessenger();
        
        messenger.getMessage(consoleMessenger);        
    }
    
}
