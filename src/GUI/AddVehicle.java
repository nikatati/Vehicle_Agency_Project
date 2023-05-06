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
public class AddVehicle extends JDialog
{
    JButton chooseBtn;
    JPanel addVehiclePanel;
    JComboBox comboBox;
    String[] Vehicles={"Jeep","Bicycle","Croz_ship","Frigate","Game_gilder","Spy_gilder","Amphibious"};


    public AddVehicle()
    {
        this.setTitle("Add Vehicle");
        this.addVehiclePanel=new JPanel();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setBounds(170,140,400,200);
        chooseBtn=new JButton("Choose");
        /*chooseBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
        addVehiclePanel.add(chooseBtn);
        this.add(addVehiclePanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }

}
