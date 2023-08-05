
package Main;

import javax.swing.UIManager;

/**
 *
 * @author Usuario1
 */
public class PaulinaAndEdgarHack {

    public static void main(String[] args) {
        //System.out.println("Hello World!")
       MainRun login = new MainRun();
        login.setVisible(true);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
