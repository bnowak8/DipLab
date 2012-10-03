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
        
        public void getMessage(IMessengerInputStrategy input, IMessengerOutputStrategy output){
            output.outPutMessage(input);
        }
    
}
