package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VehicleEntryWindow extends JFrame implements ActionListener
{

    JButton addVehicleBtn, currentVehiclesBtn, ClearBtn, ChangeFlagBtn, ExitBtn;
    JComboBox comboBox;
    JLabel chooseLabel;
    JPanel vehiclePanel;


    public VehicleEntryWindow()
    {

        super("Vehicle Agency");
        this.vehiclePanel=new JPanel();
        vehiclePanel.setLayout(new BoxLayout(vehiclePanel,BoxLayout.LINE_AXIS));
        addVehicleBtn =new JButton("Add Vehicle");
        addVehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddVehicle addVehicle=new AddVehicle();

            }
        });
        currentVehiclesBtn =new JButton("Current Vehicles");
        /*currentVehiclesBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
        ClearBtn =new JButton("Clear");
        /*ClearBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
        ChangeFlagBtn =new JButton("Change Flag");
        /*ChangeFlagBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
        ExitBtn =new JButton("Exit");
        ExitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        vehiclePanel.add(addVehicleBtn);
        vehiclePanel.add(currentVehiclesBtn);
        vehiclePanel.add(ClearBtn);
        vehiclePanel.add(ChangeFlagBtn);
        vehiclePanel.add(ExitBtn);
        this.add(vehiclePanel,BorderLayout.SOUTH);



        this.setResizable(true);
        this.setBounds(110,90,600,400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


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

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==comboBox)
        {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
