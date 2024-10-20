package View;

import Model.Model;
import Controller.Controller;

import javax.swing.*;
import java.awt.*;


public class View extends JFrame{
    private JFrame jFrame;
    private JMenuBar jMenuBar;
    private JMenu file;
    private JMenuItem openFile;
    private JMenuItem saveFile;
    private JFileChooser jf;
    private JTextArea text;
    private JButton sendButton;
    private JLabel info;


    private Controller controller;

    public View(Controller controller){
        this.controller = controller;
    }
    public void createWindow(){
        jFrame = new JFrame();
        jMenuBar = new JMenuBar();
        file = new JMenu("File");
        openFile = new JMenuItem("Open");
        saveFile = new JMenuItem("Save");
        sendButton = new JButton("Send");
        text = new JTextArea();
        info = new JLabel("Tired");

        add(text, BorderLayout.CENTER);
        add(sendButton, BorderLayout.SOUTH);
        add(info, BorderLayout.NORTH);
        sendButton.addActionListener(e->{
            int pin;
            String textPin = this.text.getText();
            pin = Integer.parseInt(textPin);
            info.setText("JUST DO IT:" + pin);

            controller.checkPin(pin);
        });
        setJMenuBar(jMenuBar);
        jMenuBar.add(file);
        file.add(openFile);
        file.add(saveFile);


        setSize(500, 500);
        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
