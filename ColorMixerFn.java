package colormixer;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
/**
 *
 * @author Merhawi Tesfay
 */
public class ColorMixer extends JFrame {

// Declaring the objects and components.
    
    private JPanel panel, panel1, panel2;
    private JSlider slider1, slider2, slider3;
    private JLabel label1, label2, label3;
    private JButton button;
    
// Creating a constructor to setup the the contents of the JFrame.
    
    public ColorMixer(){
        
// JSlider
        
        slider1 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        slider2 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        slider3 = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
        
        EventChangeColor e = new EventChangeColor();
        slider1.addChangeListener(e);
        slider2.addChangeListener(e);
        slider3.addChangeListener(e);
        
// JLabel
        
        label1 = new JLabel("Red = 0");
        label2 = new JLabel("Green = 0");
        label3 = new JLabel("Blue = 0");
        
// JButton
        
        button = new JButton("Reset");
        
        EventReset r = new EventReset();
        button.addActionListener(r);
        
// JPanel
        
        panel = new JPanel();
        panel1 = new JPanel();
        panel2 = new JPanel();
        
        panel.setLayout(new BorderLayout());
        panel1.setLayout(new GridLayout(6, 1));
        panel2.setLayout(new BorderLayout());
        
        panel1.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 5));
        panel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
       
        panel2.setBackground(Color.BLACK);
        
        panel.add(panel1, BorderLayout.WEST);
        panel.add(panel2, BorderLayout.CENTER);
        this.getContentPane().add(panel);
        
        panel1.add(label1);
        panel1.add(slider1);
        
        panel1.add(label2);
        panel1.add(slider2);
        
        panel1.add(label3);
        panel1.add(slider3);
        
        panel2.add(button, BorderLayout.PAGE_END);
    }
   
    public class EventChangeColor implements ChangeListener {
        
        public void stateChanged(ChangeEvent e){
            
            int r = slider1.getValue();
            int g = slider2.getValue();
            int b = slider3.getValue();
            
            label1.setText("Red = " + r);
            label2.setText("Green = " + g);
            label3.setText("Blue = " + b);
            
            panel2.setBackground(new Color(r, g, b));
        }    
    }
    
    public class EventReset implements ActionListener {
            
        public void actionPerformed(ActionEvent r){
            
            slider1.setValue(0);
            slider2.setValue(0);
            slider3.setValue(0);
            
            label1.setText("Red = 0");
            label2.setText("Green = 0");
            label3.setText("Blue = 0");
        }          
    }  
}
//Color Mixer function file
