package com.example.klugiewicza.textbasedadventure.Events.StartingEvents;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

import java.util.Random;

public class MinMaxxer extends Event
{
    public MinMaxxer()
    {
        this.name = "minmaxxer";
        this.description = "Your GM looks over at you and makes the connection. He smiles, he prepared for you this time.";

        this.Option1Text = "quickly pull out a more 'appropriate' character";
        this.Option2Text = "Bring it on";
        this.Option3Text = "Return the smile.";
        this.Option4Text = "Turn the table";

        this.Option1Pointer = "begforgiveness";
        this.Option2Pointer = "bringiton";
        this.Option3Pointer = "bringiton";
        this.Option4Pointer = "turntablenope";
        Main.events.add(this);
    }

    @Override
    public void Option1Event()
    {
        super.Option1Event();
    }

    @Override
    public void Option2Event()
    {
        super.Option2Event();
    }

    @Override
    public void Option3Event()
    {
        super.Option3Event();
    }

    @Override
    public void Option4Event()
    {
        Random random = new Random();
        if(random.nextBoolean())
        {
            this.Option4Pointer = "turntablehefellforit";
        }
    }
}
