/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_System;

import static Rental_System.AppHome.connection;
import java.util.ArrayList;

/**
 *
 * @author Simmigon Flagg
 */
public class Login {

    static Database logins = new Database();
    LoginView vCom = new LoginView();

    public Object[] login() {
        
        Object[] user = null;
      
        char[] p = vCom.txtPasswordLogin.getPassword();
        String pass = "";
        for (int i = 0;
                i < p.length;
                i++) {
            char q = p[i];
            pass += q;
        }
        user = connection.isLogin(vCom.txtLoginName.getText(), pass);
        return user;

    }

}
