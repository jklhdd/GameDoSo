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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author tuananhdev
 */
public abstract class View extends JFrame implements ActionListener{

    private int xMouse;
    private int yMouse;
    public Game game;
    
    public interface OnClickListener {
        void onClick(ActionEvent e);
    }
    
    protected OnClickListener onClickListener;
    
    public View(Game game) throws HeadlessException {
        super();
    }
    
    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        onClickListener.onClick(e);
    }
    
    public void navigateTo(Screen screen) {
        this.game.setScreen(screen);
    }
}
