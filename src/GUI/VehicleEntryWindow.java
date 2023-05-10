package GUI;

import Vehicle.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VehicleEntryWindow extends JFrame
{


    VehiclePanel vehiclePanel;

    public VehicleEntryWindow()
    {
        super("Agency");
        this.add(new VehiclePanel());
        this.setVisible(true);
        this.setResizable(false);
        this.pack();


        //chooseLabel=new JLabel("Choose the vehicle:",JLabel.CENTER);
        //chooseLabel.setSize(100,100);


        //comboBox=new JComboBox(Vehicles);
        //this.add(chooseLabel);
        //this.add(comboBox);
        //comboBox.addActionListener(this);
        //contentPane.add(chooseLabel);



        /*JLabel makeLabel = new JLabel("Make:");
        JTextField makeTextField = new JTextField(20);
        JLabel modelLabel = new JLabel("Model:");
        JTextField modelTextField = new JTextField(20);
        JLabel yearLabel = new JLabel("Year:");
        JTextField yearTextField = new JTextField(4);
        // Add GUI controls to content pane
        JPanel contentPane = new JPanel(new FlowLayout());
        contentPane.add(makeLabel);
        contentPane.add(makeTextField);
        contentPane.add(modelLabel);
        contentPane.add(modelTextField);
        contentPane.add(yearLabel);
        contentPane.add(yearTextField);
        setContentPane(contentPane);*/
        //chooseButton = new JButton("Choose");
        //chooseButton.setBounds(0,0,50,50);
        //chooseButton.setVisible(true);
        //chooseButton.addActionListener(this);
        //this.add(chooseButton);
        //this.pack();

    }


}
