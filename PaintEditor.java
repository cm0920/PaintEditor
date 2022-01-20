//Names: Caleb Mandapat, Cole McCarthy
//Period 5

import javax.swing.*;
import java.awt.*;

public class PaintEditor extends JFrame {
    //variables
    private static int brushSize;
    private static Color color;


    PaintEditor(){
        setTitle("Real Paint");
        setPreferredSize(new Dimension(800, 800));
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (screenSize.width - getWidth())), (int) (0.5 * (screenSize.height - getHeight())), getWidth(), getHeight());

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    private void initGUI(){

        //Two main panels
        JPanel drawingPanel = new JPanel();
        JPanel buttonPanel = new JPanel();

        //Radio Buttons Setup
        JRadioButtonMenuItem menu = new JRadioButtonMenuItem();
        JRadioButton small = new JRadioButton();
        JRadioButton medium = new JRadioButton();
        JRadioButton large = new JRadioButton();

        getContentPane().add(drawingPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);




    }

    public static void main(String[] args){
        new PaintEditor();
    }
}
