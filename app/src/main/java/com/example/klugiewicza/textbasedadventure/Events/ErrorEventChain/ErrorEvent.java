package com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class ErrorEvent extends Event
{
    public ErrorEvent()
    {
        this.name = "errorevent";
        this.description = "Something somewhere just went terribly and horribly wrong.";

        this.Option1Text = "I hope a developer just lost a job.";
        this.Option2Text = "This is why we can't have nice things.";
        this.Option3Text = "Eh, still a better story hook than the last campaign I played.";
        this.Option4Text = "ERROR: Cannot find file faith.txt in folder C:/Users/Humanity/, are you sure you didn't lose it?";

        this.Option1Pointer = "thetruecalling";
        this.Option2Pointer = "thetruecalling";
        this.Option3Pointer = "amightyquestunfolds";
        this.Option4Pointer = "renewthefaith";
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
