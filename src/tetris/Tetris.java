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


    public Tetris() {
    	
    	//remove score and status bars
        Board board = new Board(this);
        
        //remove instructions
        
        add(board);

        setSize(400, 700);
        setTitle("Tetris");
        
        //eliminate window listener

   }

}