package GUI;
import Vehicle.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddSpyGilder extends JDialog
{
    JPanel south,north;
    BufferedImage img=null;

    public AddSpyGilder(VehiclePanel panel)
    { north = new JPanel();
        this.setTitle("Add Spy gilder");
        this.setPreferredSize(new Dimension(500, 300));
        north.setLayout(new FlowLayout());
        this.setVisible(true);

        JLabel abilityL =new JLabel("Ability");
        abilityL.setBounds(10,20,80,25);
        north.add(abilityL);

        JTextField abilityT=new JTextField(20);
        abilityT.setBounds(10,20,165,25);
        north.add(abilityT);


        JLabel power_sourceL =new JLabel("Power source");
        power_sourceL.setBounds(10,40,80,25);
        north.add(power_sourceL);

        JTextField power_sourceT=new JTextField(20);
        power_sourceT.setBounds(10,40,165,25);
        north.add(power_sourceT);


        JLabel energy_scoreL =new JLabel("Energy score");
        energy_scoreL.setBounds(10,60,80,25);
        north.add(energy_scoreL);

        JTextField energy_scoreT=new JTextField(20);
        energy_scoreT.setBounds(10,60,165,25);
        north.add(energy_scoreT);

        JLabel choosePictureL =new JLabel("Choose picture");
        choosePictureL.setBounds(10,80,80,25);
        north.add(choosePictureL);

        JButton choosePictureB =new JButton("Choose");
        choosePictureB.setBounds(10,80,80,25);
        choosePictureB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser=new JFileChooser();
                fileChooser.setCurrentDirectory(new File("."));
                int responseFile=fileChooser.showSaveDialog(null);

                if (responseFile==JFileChooser.APPROVE_OPTION)
                {
                    File filePic =new File(fileChooser.getSelectedFile().getAbsolutePath());
                    try{
                        img= ImageIO.read(filePic);
                    }
                    catch (IOException ex)
                    {
                        System.out.println("Cannot load img");
                        return;
                    }
                    System.out.println(filePic);
                }
            }
        });
        north.add(choosePictureB);


        JButton addB =new JButton("Add");
        addB.setBounds(10,100,80,25);
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Spy_glider spy_glider=new Spy_glider(Integer.parseInt(abilityT.getText()),power_sourceT.getText(),energy_scoreT.getText(),img);

                panel.getDealership().add(spy_glider);
                JOptionPane.showMessageDialog(null,"Spy glider added !");
                System.out.println(spy_glider.toString());
            }
        });
        north.add(addB);

        this.setPreferredSize(new Dimension(240,500));
        this.setResizable(false);


        this.add(north);
        this.pack();


    }
}
