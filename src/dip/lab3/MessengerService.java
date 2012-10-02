/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author mashit
 */
public class MessengerService {
    
    public MessengerService(){
        
    }
    
        public void getMessage(IMessengerStrategy e){
            e.renderMessage();
            e.outPutMessage();
        
    }
    
}
