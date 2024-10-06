import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {

    JFrame frame;
    Draw draw;
    JButton buttonReset;

    static JButton button [] = new JButton[9];
    static int state[] = new int[9];
    static int player = 0;
    static int gewinner = 0;

    public Gui (){

        /*frame = new JFrame();
        frame.setSize(800,600);
        frame.setLocation(100,100);
        frame.setResizable(false);
        frame.setTitle("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/

        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setTitle("Tic Tac Toe");

        for(int i = 0; i < button.length; i++){
            button[i] = new JButton();
            button[i].setVisible(true);
            button[i].addActionListener(new ActionHandler());
            button[i].setFocusPainted(false);
            button[i].setContentAreaFilled(false);
            button[i].setBorder(null);
            frame.add(button[i]);
        }

        ButtonPlacement.place();

        buttonReset = new JButton("Reset");
        buttonReset.setBounds(675,500,100,40);
        buttonReset.setVisible(true);
        buttonReset.setBackground(new Color(51,102,153));
        buttonReset.setForeground(Color.WHITE);
        buttonReset.setFocusPainted(false);
        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Funktion.reset();
            }
        });

        frame.add(buttonReset);

        draw = new Draw();
        draw.setBounds(0,0,800,600);
        draw.setVisible(true);


        frame.add(draw);
        frame.setVisible(true);
    }

}
