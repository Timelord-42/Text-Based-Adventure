package com.example.klugiewicza.textbasedadventure.Events;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Player;
import com.example.klugiewicza.textbasedadventure.Util.Event;

import static com.example.klugiewicza.textbasedadventure.Player.cha;
import static com.example.klugiewicza.textbasedadventure.Player.dex;
import static com.example.klugiewicza.textbasedadventure.Player.wealth;

public class StealSomething extends Event
{
    public StealSomething()
    {
        this.name = "stealsomething";
        this.description = "You find yourself in a bustling dwarven tavern in the depths of the Azure Mines. Like the bastard you are, you decide to go right ahead and steal something. Oh, you thieving little [INSERT GENDER HERE], you. So, what do you want to 'borrow' from these kind gentlemen today?";

        this.Option1Text = "Money behind the counter";
        this.Option2Text = "Alcohol";
        this.Option3Text = "A patron's dagger";
        this.Option4Text = "What? I would never steal!";

        this.Option1Pointer = "walkoutcash";
        this.Option2Pointer = "walkoutbooze";
        this.Option3Pointer = "walkoutwep";
        this.Option4Pointer = "walkoutwimp";
        Main.events.add(this);
    }

    @Override
    public void Option1Event()
    {
        wealth += 50.00;
        dex += 2;
    }

    @Override
    public void Option2Event()
    {
        Player.Inventory.add("Barrel of Booze");
        dex += 1;
        cha += 1;
    }

    @Override
    public void Option3Event()
    {
        Player.Inventory.add("Dulled Dwarven Dagger");
        dex +=1;
    }

    @Override
    public void Option4Event()
    {
        cha -=2;
    }
}
