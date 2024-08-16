package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;


import Main.Inputs.KeyboardListener;
import Main.Inputs.MyMouseListener;
// import Monster.NormalMonster;

public class GameScreen extends JPanel {
    private Dimension size;
    private Game game; 
    private MyMouseListener myMouseListener;
    private KeyboardListener keyboardListener;


    public GameScreen(Game game) {
        this.game = game;
        setPanelSize();
    }

    private void setPanelSize() {
        size = new Dimension(640, 740);

        setPreferredSize(size);
        setMaximumSize(size);
        setMinimumSize(size);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        game.getRender().render(g);
    }
    public void initInputs() {
        myMouseListener = new MyMouseListener(game);
        keyboardListener = new KeyboardListener();

        addMouseListener(myMouseListener);
        addMouseMotionListener(myMouseListener);
        addKeyListener(keyboardListener);
        requestFocus();
    }

}
