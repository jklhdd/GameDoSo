/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author tuananhdev
 */
public class View extends JFrame implements ActionListener{

    private int xMouse;
    private int yMouse;

    public static int WIDTH = 680;
    public static int HEIGHT = 460;
    

    public interface OnClickListener {
        void onClick(ActionEvent e);
    }
    
    protected OnClickListener onClickListener;
    
    public View() throws HeadlessException {
        super();
        
        this.setResizable(false);
 
        this.setLocationRelativeTo(null);
        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mousePressed(MouseEvent e) {
                xMouse = e.getX();
                yMouse = e.getY();
            }
            
        });
        
        this.addMouseMotionListener(new MouseMotionAdapter() {

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                
                View.this.setLocation(x - xMouse, y - yMouse);
            }
        });
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
            
        });
    }
    
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        onClickListener.onClick(e);
    }
    
    
}
