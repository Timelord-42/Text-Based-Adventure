package com.example.klugiewicza.textbasedadventure.Events.StartingEvents;

import android.content.Intent;
import android.os.Bundle;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class StartingEvent extends Event
{

    public StartingEvent()
    {
        this.name = "startingevent";
        this.description = "Your GM presides over the table and looks around to see if everyone is ready to begin. What do you do?";

        this.Option1Text = "Launch into your dedicated character backstory for several minutes...";
        this.Option2Text = "Quickly scramble to finish the character you havn't finished yet";
        this.Option3Text = "Sit quietly becuase you have no idea what is going on.";
        this.Option4Text = "Smirk, becuase you min-maxed to shit and nothing's going to touch your character.";

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
