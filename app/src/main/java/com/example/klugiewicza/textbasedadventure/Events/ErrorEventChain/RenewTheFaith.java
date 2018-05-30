package com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class RenewTheFaith extends Event
{
    public RenewTheFaith()
    {
        this.name = "renewthefaith";
        this.description = "Your Faith in Humanity has been lost.";

        this.Option1Text = "Restore it.";
        this.Option2Text = "Empty recycling bin.";
        this.Option3Text = "";
        this.Option4Text = "";

        this.Option1Pointer = "";
        this.Option2Pointer = "turntothedarksidemodernday";
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
