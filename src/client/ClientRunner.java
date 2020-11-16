/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import client.controller.HomeController;
import client.view.HomeScreen;
import common.View;

/**
 *
 * @author tuananhdev
 */
public class ClientRunner {
    public static void main(String[] args) {
        HomeScreen homeScreen = new HomeScreen();
        homeScreen.setVisible(true);
        homeScreen.setSize(View.WIDTH, View.HEIGHT);
        
        HomeController homeController = new HomeController(homeScreen);
        
    }
}
