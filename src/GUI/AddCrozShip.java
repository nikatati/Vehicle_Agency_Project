package GUI;
import Vehicle.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
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

        JTextField abilityT=new JTextField(20);
        abilityT.setBounds(10,20,165,25);
        north.add(abilityT);

        JLabel modelL =new JLabel("Model");
        modelL.setBounds(10,40,80,25);
        north.add(modelL);

        JTextField modelT=new JTextField(20);
        modelT.setBounds(10,40,165,25);
        north.add(modelT);

        JLabel maxPassengersL =new JLabel("max Passengers");
        maxPassengersL.setBounds(10,60,80,25);
        north.add(maxPassengersL);

        JTextField maxPassengersT=new JTextField(20);
        maxPassengersT.setBounds(10,60,165,25);
        north.add(maxPassengersT);


        JLabel Max_speedL =new JLabel("max Speed");
        Max_speedL.setBounds(10,80,80,25);
        north.add(Max_speedL);

        JTextField Max_speedT=new JTextField(20);
        Max_speedT.setBounds(10,80,165,25);
        north.add(Max_speedT);

        JLabel avr_fuelL =new JLabel("Average fuel");
        avr_fuelL.setBounds(10,100,80,25);
        north.add(avr_fuelL);

        JTextField avr_fuelT=new JTextField(20);
        avr_fuelT.setBounds(10,100,165,25);
        north.add(avr_fuelT);

        JLabel avr_life_engineL =new JLabel("Average life engine");
        avr_life_engineL.setBounds(10,120,80,25);
        north.add(avr_life_engineL);

        JTextField avr_life_engineT=new JTextField(20);
        avr_life_engineT.setBounds(10,120,165,25);
        north.add(avr_life_engineT);

        JLabel choosePictureL =new JLabel("Choose picture");
        choosePictureL.setBounds(10,140,80,25);
        north.add(choosePictureL);

        JButton choosePictureB =new JButton("Choose");
        choosePictureB.setBounds(10,140,80,25);
        choosePictureB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser=new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                int responseFile=fileChooser.showSaveDialog(null);

                if (responseFile==JFileChooser.APPROVE_OPTION)
                {
                    File filePic =new File(fileChooser.getSelectedFile().getAbsolutePath());
                    System.out.println(filePic);
                }
            }
        });
        north.add(choosePictureB);

        JButton addB =new JButton("Add");
        addB.setBounds(10,160,80,25);
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Croz_ship croz_ship=new Croz_ship(  Integer.parseInt(abilityT.getText()),modelT.getText(),Integer.parseInt(maxPassengersT.getText()),
                        Integer.parseInt(Max_speedT.getText()),Integer.parseInt(avr_fuelT.getText()),Integer.parseInt(avr_life_engineT.getText()));


                System.out.println(croz_ship.toString());
                panel.getDealership().add(croz_ship);


            }
        });
        north.add(addB);



        this.setPreferredSize(new Dimension(240,500));
        this.setResizable(false);


        this.add(north);
        this.pack();





    }
}
