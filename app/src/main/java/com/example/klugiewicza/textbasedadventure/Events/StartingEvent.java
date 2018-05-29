package com.example.klugiewicza.textbasedadventure.Events;

import android.content.Intent;
import android.os.Bundle;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class StartingEvent extends Event
{

    public StartingEvent()
    {
        this.name = "startingevent";
        this.description = "Beat This!";

        this.Option1Text = "Click This";
        this.Option2Text = "Don't click";
        this.Option3Text = "Don't click";
        this.Option4Text = "Don't click";

        this.Option1Pointer = "volcano";
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
