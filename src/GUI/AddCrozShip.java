package GUI;
import Vehicle.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class AddCrozShip extends JDialog {

    JPanel south,north;


    public AddCrozShip(VehiclePanel panel)
    {
        north = new JPanel();
        this.setTitle("Add Croz Ship");
        this.setPreferredSize(new Dimension(500, 300));
        north.setLayout(new FlowLayout());
        this.setVisible(true);

        JLabel abilityL =new JLabel("Ability");
        abilityL.setBounds(10,20,80,25);
        north.add(abilityL);

        JTextField abilitT=new JTextField(20);
        abilitT.setBounds(10,20,165,25);
        north.add(abilitT);

        JLabel modelL =new JLabel("Model");
        abilityL.setBounds(10,40,80,25);
        north.add(modelL);

        JTextField modelT=new JTextField(20);
        abilitT.setBounds(10,40,165,25);
        north.add(modelT);

        JLabel maxPassengersL =new JLabel("max Passengers");
        abilityL.setBounds(10,60,80,25);
        north.add(maxPassengersL);

        JTextField maxPassengersT=new JTextField(20);
        abilitT.setBounds(10,60,165,25);
        north.add(maxPassengersT);


        JLabel Max_speedL =new JLabel("max Speed");
        abilityL.setBounds(10,80,80,25);
        north.add(Max_speedL);

        JTextField Max_speedT=new JTextField(20);
        abilitT.setBounds(10,80,165,25);
        north.add(Max_speedT);

        JLabel avr_fuelL =new JLabel("Average fuel");
        abilityL.setBounds(10,100,80,25);
        north.add(avr_fuelL);

        JTextField avr_fuelT=new JTextField(20);
        abilitT.setBounds(10,100,165,25);
        north.add(avr_fuelT);

        JLabel avr_life_engineL =new JLabel("Average life engine");
        abilityL.setBounds(10,120,80,25);
        north.add(avr_life_engineL);

        JTextField avr_life_engineT=new JTextField(20);
        abilitT.setBounds(10,120,165,25);
        north.add(avr_life_engineT);



        this.setPreferredSize(new Dimension(240,500));
        this.setResizable(false);


        this.add(north);
        this.pack();





    }
}
