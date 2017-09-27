package tetris;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class Tetris extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel statusbar,score;


    public Tetris() {
    	
    	score =new JLabel("Score:");
        statusbar = new JLabel(" 0");
        add(score, BorderLayout.SOUTH);
        add(statusbar, BorderLayout.SOUTH);
        Board board = new Board(this);
        
        //remove instructions
        
        add(board);
        board.start();

        setSize(400, 700);
        setTitle("Tetris");
        
        //eliminate window listener

   }

   public JLabel getStatusBar() {
       return statusbar;
   }

}