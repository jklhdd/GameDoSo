/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.ItemUser;
import client.Status;
import client.view.GameScreen;
import common.Controller;
import common.View;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author tuananhdev
 */
public class GameController extends Controller implements View.OnMouseClickListener{

    
    private JList list;
    private DefaultListModel<ItemUser> model;
    
    public GameController(View view) {
        super(view);
        this.view.setOnMouseClickListener(this);
        this.list  = ((GameScreen)this.view).getList();
        this.model = ((GameScreen)this.view).getModel();
        
        model.addElement(new ItemUser("Tuấn Anh", "src/server/assets/person.png", Status.ONLINE));
        model.addElement(new ItemUser("Tuấn Anh", "src/server/assets/person.png", Status.ONLINE));
        model.addElement(new ItemUser("Tuấn Anh", "src/server/assets/person.png", Status.OFFLINE));
        model.addElement(new ItemUser("Tuấn Anh", "src/server/assets/person.png", Status.ONLINE));
        model.addElement(new ItemUser("Tuấn Anh", "src/server/assets/person.png", Status.ONLINE));
        model.addElement(new ItemUser("Tuấn Anh", "src/server/assets/person.png", Status.PLAYING));
        
    }

    @Override
    public void onMouseClick(MouseEvent e) {
        int index = this.list.locationToIndex(e.getPoint());
        if(e.getX() >= 300 && e.getX() <= 380 && e.getY() >= 10 + index*50 && e.getY() <= 40 + index*50) {
            this.onButtonClick(index);
        }
    }
    
    private void onButtonClick(int position) {
    }
}
