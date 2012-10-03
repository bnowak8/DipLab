/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import javax.swing.JOptionPane;

/**
 *
 * @author bnowak8
 */
public class GuiMessenger implements IMessengerInputStrategy, IMessengerOutputStrategy{
    private final String input_Message = "Enter your message";
    
    @Override
    public Message setMessage(){
        Message msg = new Message(JOptionPane.showInputDialog(input_Message));
        return msg;
    }
    
    @Override
    public void outPutMessage(IMessengerInputStrategy input){
        Message msg = input.setMessage();
        
        JOptionPane.showMessageDialog(null, msg.getMessage());
    }
    
}
