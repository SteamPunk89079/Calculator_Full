import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {


    public MyFrame(){
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator final");
        ImageIcon calculatorIcon = new ImageIcon("D:\\JAVA4\\CALCULATOR FINAL\\calculator-icon-1693x2048-eqjjzkap.png");
        setIconImage(calculatorIcon.getImage());
        setLocationRelativeTo(null);
        this.setResizable(false);


        add(new MyPanel());
        this.pack();

    }
}
