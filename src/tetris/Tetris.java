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
        JOptionPane.showMessageDialog(board,
        		"Welcome to Tetris \n "
        		+ "Created by Prachi\n\n"
        		+ "Instructions for the game\n"
        		+ " You have to eliminate rows of blocks by fitting them in the empty spaces\n"
        		+ " Keys : \n"
        		+ " Navigation:\n"
        		+ " 1. Left : LEFT\n"
        		+ " 2. Right: RIGHT\n"
        		+ " Rotation\n"
        		+ " 1. Left : UP\n"
        		+ " 2. Right:DOWN\n"
        		+ " Drop down :SPACE\n"
        		+ " Pause     :Press <P>");
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