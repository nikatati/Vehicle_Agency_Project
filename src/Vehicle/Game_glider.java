package Vehicle;

import java.awt.image.BufferedImage;

public class Game_glider extends Air_vehicle implements not_motorized
{

    public String power_source;
    public String energy_score;

    public Game_glider(int Ability_to_move, BufferedImage img)
    {
        super(Ability_to_move,"Toy",0,0,10,"Civilian",img);

    }

    public String power_source()
    {
        power_source="manual";
        return power_source;
    }
    public String energy_score()
    {
        energy_score="A";
        return  energy_score;
    }

    @Override
    public String toString() {
        return "~Game gilder~ "+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

}
