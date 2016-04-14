/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rental_System;

import java.util.Date;

/**
 *
 * @author Simmigon Flagg
 */
public class AdminController extends AdminView {

    protected void makePassword() {

        StringBuilder makePassword = new StringBuilder();
        makePassword.append(makePassword);

        Date date = new Date();
        int count = 0;

        String[] time = date.toString().split(" ");
        for (String time1 : time) {
            System.out.println("Time:" + time1);
            if (count == 2) {
                Object f = txtNewFirst.getText();
                String l = txtNewLast.getText();
                
                System.out.println(" "+f.toString());
                System.out.println(" "+l);
              //  char fl = f.toUpperCase().charAt(0);
              //  char ll = l.toUpperCase().charAt(0);
               // makePassword.append(fl).append(ll).append(time1);
                

            }
            if (count == 5) {
                makePassword.append(time1.charAt(2));
                makePassword.append(time1.charAt(3));
             //   makePassword.append(txtNewSSN.getText().subSequence(2, 5));
            }
            count++;
        }
        System.out.println("makePassword.append(time1);" + makePassword);
    }

}
