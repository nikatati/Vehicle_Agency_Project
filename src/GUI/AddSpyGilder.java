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

public class AddSpyGilder extends JDialog {
    JPanel south,north;


    public AddSpyGilder(VehiclePanel panel)
    { north = new JPanel();
        this.setTitle("Add Spy gilder");
        this.setPreferredSize(new Dimension(500, 300));
        north.setLayout(new FlowLayout());
        this.setVisible(true);

        JLabel abilityL =new JLabel("Ability");
        abilityL.setBounds(10,20,80,25);
        north.add(abilityL);

        JTextField abilitT=new JTextField(20);
        abilitT.setBounds(10,20,165,25);
        north.add(abilitT);


        JLabel power_sourceL =new JLabel("Power source");
        abilityL.setBounds(10,40,80,25);
        north.add(power_sourceL);

        JTextField power_sourceT=new JTextField(20);
        abilitT.setBounds(10,40,165,25);
        north.add(power_sourceT);


        JLabel energy_scoreL =new JLabel("Energy score");
        abilityL.setBounds(10,60,80,25);
        north.add(energy_scoreL);

        JTextField energy_scoreT=new JTextField(20);
        abilitT.setBounds(10,60,165,25);
        north.add(energy_scoreT);



        this.setPreferredSize(new Dimension(240,500));
        this.setResizable(false);


        this.add(north);
        this.pack();


    }
}
