/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screencapture;

/**
 *
 * @author DONGRE
 */
public class ScreenCapture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StorageFrame f=new StorageFrame();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StorageFrame().setVisible(true);
            }
        });
    }
    
}
