package com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class OutSourcing extends Event
{
    public OutSourcing()
    {
        this.name = "outsourcing";
        this.description = "Who should you outsource the vocation removal to?";

        this.Option1Text = "The Mob";
        this.Option2Text = "Space Aliens";
        this.Option3Text = "I'll just cast a spell...";
        this.Option4Text = "";

        this.Option1Pointer = "";
        this.Option2Pointer = "";
        this.Option3Pointer = "thisismodernday";
        this.Option4Pointer = "";
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
        super.Option4Event();
    }
}
