package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    String pin;
    String cardno;

    main_Class(String pin, String cardno) {
        this.pin = pin;
        this.cardno = cardno;

        public static void main (String[]args){
            new main_Class("", "");
        }
    }
}