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

public class AddGameGilder extends JDialog {
    JPanel south,north;

    public AddGameGilder(VehiclePanel panel)
    {
        north = new JPanel();
        this.setTitle("Add Game gilder");
        this.setPreferredSize(new Dimension(500, 300));
        north.setLayout(new FlowLayout());
        this.setVisible(true);

        JLabel abilityL =new JLabel("Ability");
        abilityL.setBounds(10,20,80,25);
        north.add(abilityL);

        JTextField abilitT=new JTextField(20);
        abilitT.setBounds(10,20,165,25);
        north.add(abilitT);



        this.setPreferredSize(new Dimension(240,500));
        this.setResizable(false);


        this.add(north);
        this.pack();

    }
}

