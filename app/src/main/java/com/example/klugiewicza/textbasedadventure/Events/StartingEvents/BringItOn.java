package com.example.klugiewicza.textbasedadventure.Events.StartingEvents;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class BringItOn extends Event
{
    public BringItOn()
    {
        this.name = "BringItOn";
        this.description = "Your GM launches into an adventure about...";

        this.Option1Text = "";
        this.Option2Text = "";
        this.Option3Text = "";
        this.Option4Text = "";

        this.Option1Pointer = "";
        this.Option2Pointer = "";
        this.Option3Pointer = "";
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
