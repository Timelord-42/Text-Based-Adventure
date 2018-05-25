package com.example.klugiewicza.textbasedadventure.Events;

import android.content.Intent;
import android.os.Bundle;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;
import com.example.klugiewicza.textbasedadventure.Util.MyReciever;

public class StartingEvent extends Event
{


    public Intent blarg;

    public StartingEvent(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text,
                 String Option1Pointer, String Option2Pointer, String Option3Pointer, String Option4Pointer)
    {
        this.name = name;
        this.description = description;

        this.Option1Text = Option1Text;
        this.Option2Text = Option2Text;
        this.Option3Text = Option3Text;
        this.Option4Text = Option4Text;

        this.Option1Pointer = Option1Pointer;
        this.Option2Pointer = Option2Pointer;
        this.Option3Pointer = Option3Pointer;
        this.Option4Pointer = Option4Pointer;
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

    protected void onRecieve(blarg)
    {
        StartingEvent startingevent = new StartingEvent
                ("startingevent",
                        "How difficult a campaign are you interested in?",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                );
    }
}
