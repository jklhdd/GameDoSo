/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.view.LoginScreen;
import client.view.SettingsScreen;
import common.Controller;
import common.Screen;
import common.View;
import java.awt.event.ActionEvent;

/**
 *
 * @author tuananhdev
 */
public class HomeController extends Controller implements View.OnClickListener{

    public HomeController(View view) {
        super(view);
        
        this.view.setOnClickListener(this);
    }

    @Override
    public void onClick(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "login": login();break;
            case "rank": showRank(); break;
            case "settings": showSettings(); break;    
        }
    }

    private void login() {
        System.out.println("Login !!");
        
        //init login view, login controller
        Screen loginScreen = (Screen) new LoginScreen(this.view.game);
        loginScreen.showScreen();
        
        LoginController loginController = new LoginController((View) loginScreen);
        
        this.view.navigateTo(loginScreen);
    }

    private void showRank() {
        
    }

    private void showSettings() {
        Screen settingsScreen = (Screen) new SettingsScreen(this.view.game);
        settingsScreen.showScreen();
        
        this.view.navigateTo(settingsScreen);
    }
    
    
}
