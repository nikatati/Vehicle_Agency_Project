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

public class AddJeep extends JDialog {

    JPanel south,north;
    private JTextField abilityMoveTF,modelTF,maxPassengersTF,
            Max_speedTF, road_typeTF, avr_fuelTF, avr_life_engineTF;



    public AddJeep(VehiclePanel panel)
    {

        north = new JPanel();
        this.setTitle("Add Jeep");
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


        JLabel Max_speedL =new JLabel("max Passengers");
        abilityL.setBounds(10,80,80,25);
        north.add(Max_speedL);

        JTextField Max_speedT=new JTextField(20);
        abilitT.setBounds(10,80,165,25);
        north.add(Max_speedT);

        JLabel road_typeL =new JLabel("max Speed");
        abilityL.setBounds(10,100,80,25);
        north.add(road_typeL);

        JTextField road_typeT=new JTextField(20);
        abilitT.setBounds(10,100,165,25);
        north.add(road_typeT);

        JLabel avr_fuelL =new JLabel("Average fuel");
        abilityL.setBounds(10,120,80,25);
        north.add(avr_fuelL);

        JTextField avr_fuelT=new JTextField(20);
        abilitT.setBounds(10,120,165,25);
        north.add(avr_fuelT);

        JLabel avr_life_engineL =new JLabel("Average life engine");
        abilityL.setBounds(10,140,80,25);
        north.add(avr_life_engineL);

        JTextField avr_life_engineT=new JTextField(20);
        abilitT.setBounds(10,140,165,25);
        north.add(avr_life_engineT);

        this.setPreferredSize(new Dimension(240,500));
        this.setResizable(false);


        /*abilityMoveTF=new JTextField();
        abilityMoveTF.setPreferredSize(new Dimension(170,40));
        modelTF=new JTextField();
        modelTF.setPreferredSize(new Dimension(170,40));
        maxPassengersTF=new JTextField();
        maxPassengersTF.setPreferredSize(new Dimension(170,40));
        Max_speedTF=new JTextField();
        Max_speedTF.setPreferredSize(new Dimension(170,40));
        road_typeTF=new JTextField();
        road_typeTF.setPreferredSize(new Dimension(170,40));
        avr_fuelTF=new JTextField();
        avr_fuelTF.setPreferredSize(new Dimension(170,40));
        avr_life_engineTF=new JTextField();
        avr_life_engineTF.setPreferredSize(new Dimension(170,40));*/

        /*north.add(abilityMoveTF);
        north.add(modelTF);
        north.add(maxPassengersTF);
        north.add(Max_speedTF);
        north.add(road_typeTF);
        north.add(avr_fuelTF);
        north.add(avr_life_engineTF);*/

        /*south.add(new JTextArea());
        south.add(new JTextArea());
        south.add(new JTextArea());
        south.add(new JTextArea());
        south.add(new JTextArea());
        south.add(new JTextArea());
        south.add(new JTextArea());*/

        //this.setLayout(null);
        this.add(north);
        //this.add(south,BorderLayout.SOUTH);
        this.pack();


        //panel.getDealership().add()

    }
}
