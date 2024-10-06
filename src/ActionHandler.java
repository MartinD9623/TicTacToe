import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed (ActionEvent e){

        if(Gui.gewinner == 0){

            //Reihe 1
            if(e.getSource() == Gui.button[0]){

                if(Gui.state[0] == 0 && Gui.player == 0){
                    Gui.state[0] = 1;
                    Gui.player = 1;
                }else if(Gui.state[0] == 0 && Gui.player == 1) {
                    Gui.state[0] = 2;
                    Gui.player = 0;
                }
                }else if(e.getSource() == Gui.button[1]){

                    if(Gui.state[1] == 0 && Gui.player == 0){
                        Gui.state[1] = 1;
                        Gui.player = 1;
                    }else if(Gui.state[1] == 0 && Gui.player == 1){
                        Gui.state[1] = 2;
                        Gui.player = 0;
                    }
            }else if(e.getSource() == Gui.button[2]){

                if(Gui.state[2] == 0 && Gui.player == 0){
                    Gui.state[2] = 1;
                    Gui.player = 1;
                }else if(Gui.state[2] == 0 && Gui.player == 1){
                    Gui.state[2] = 2;
                    Gui.player = 0;
                }
            }else if(e.getSource() == Gui.button[3]){

                if(Gui.state[3] == 0 && Gui.player == 0){
                    Gui.state[3] = 1;
                    Gui.player = 1;
                }else if(Gui.state[3] == 0 && Gui.player == 1){
                    Gui.state[3] = 2;
                    Gui.player = 0;
                }
            }else if(e.getSource() == Gui.button[4]){

                if(Gui.state[4] == 0 && Gui.player == 0){
                    Gui.state[4] = 1;
                    Gui.player = 1;
                }else if(Gui.state[4] == 0 && Gui.player == 1){
                    Gui.state[4] = 2;
                    Gui.player = 0;
                }
            }else if(e.getSource() == Gui.button[5]){

                if(Gui.state[5] == 0 && Gui.player == 0){
                    Gui.state[5] = 1;
                    Gui.player = 1;
                }else if(Gui.state[5] == 0 && Gui.player == 1){
                    Gui.state[5] = 2;
                    Gui.player = 0;
                }
            }else if(e.getSource() == Gui.button[6]){

                if(Gui.state[6] == 0 && Gui.player == 0){
                    Gui.state[6] = 1;
                    Gui.player = 1;
                }else if(Gui.state[6] == 0 && Gui.player == 1){
                    Gui.state[6] = 2;
                    Gui.player = 0;
                }
            }else if(e.getSource() == Gui.button[7]){

                if(Gui.state[7] == 0 && Gui.player == 0){
                    Gui.state[7] = 1;
                    Gui.player = 1;
                }else if(Gui.state[7] == 0 && Gui.player == 1){
                    Gui.state[7] = 2;
                    Gui.player = 0;
                }
            }else if(e.getSource() == Gui.button[8]){

                if(Gui.state[8] == 0 && Gui.player == 0){
                    Gui.state[8] = 1;
                    Gui.player = 1;
                }else if(Gui.state[8] == 0 && Gui.player == 1){
                    Gui.state[8] = 2;
                    Gui.player = 0;
                }
            }
        }

    }

}
