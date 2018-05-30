package com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Player;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class ThisIsModernDay extends Event
{
    public ThisIsModernDay()
    {
        this.name = "thisismodernday";
        this.description = "The dev is in a modern day campaign, magic isn't unlocked presently.";

        this.Option1Text = "We should fix that.";
        this.Option2Text = "";
        this.Option3Text = "";
        this.Option4Text = "";

        this.Option1Pointer = "moderndaymagicstartercampaign";
        this.Option2Pointer = "";
        this.Option3Pointer = "";
        this.Option4Pointer = "";
        Main.events.add(this);
    }

    @Override
    public void Option1Event()
    {
        Player.Effects.add("VocationalRemovalMagic");
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
