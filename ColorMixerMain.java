package colormixer;
import javax.swing.JFrame;
/**
 *
 * @author Merhawi
 */
public class ColorMixerDemo {
    
    public static void main(String[] args){
        
        ColorMixer mixer = new ColorMixer();
        
        mixer.setVisible(true);
        mixer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mixer.setSize(600, 250);
        //frame.setResizable(false);
        
    }
}
