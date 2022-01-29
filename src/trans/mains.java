

package trans;
import java.awt.*;
public class mains {
    public static void main(String [] args){
        menuprincipale men = new menuprincipale();
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        men.setLocation((screen.width - men.getSize().width)/2,(screen.height - men.getSize().height)/2);
        men.setVisible(true);
    }
}
