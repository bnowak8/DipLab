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
public class GuiMessenger implements IMessengerStrategy{
    private String message;
    private String input_Message = "Enter your message";
    
    @Override
    public void renderMessage(){
        
        this.message = JOptionPane.showInputDialog(input_Message);
    }
    
    @Override
    public void outPutMessage(){
        
        JOptionPane.showMessageDialog(null, message);
    }
    
}
