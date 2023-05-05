package Vehicle;

//-------------Documentation-------------
//This code defines an abstract class called "Vehicle".
//The class contains five instance variables:
//Ability_to_move, Model, Total_distance, Max_passengers, and Max_speed, which are all protected.
//The class also has two constructors: a default constructor and a parameterized constructor that takes five arguments.
//Additionally, the class overrides the equals method and provides getters and setters for the Model
//and Ability_to_move instance variables.
//Finally, the class includes a toString method that returns a string representation of the class instance,
// including all five instance variables. The class is designed to be extended by other classes that represent specific types of vehicles.
public abstract class Vehicle {
    protected int Ability_to_move;
    protected String Model;
    protected int Total_distance;
    protected int Max_passengers;
    protected int Max_speed;

    public Vehicle()
    {
        this.Ability_to_move=0;
        this.Model="NoModel";
        this.Total_distance=0;
        this.Max_passengers=0;
        this.Max_speed=0;
    }

    public Vehicle(int Ability_to_move, String Model, int Total_distance, int Max_passengers, int Max_speed)
    {
        this.Ability_to_move=Ability_to_move;
        this.Model=Model;
        this.Total_distance=Total_distance;
        this.Max_passengers=Max_passengers;
        this.Max_speed=Max_speed;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getModel(){return Model;}
    public  void setAbility_to_move(int newAvilability){Ability_to_move=newAvilability;}

    @Override
    public String toString() {
        return  " Ability to move="+Ability_to_move+
                " Model="+Model+
                " Total distance= "+Total_distance+
                " Max passengers= "+Max_passengers+
                " Max speed= "+Max_speed;
    }
}
