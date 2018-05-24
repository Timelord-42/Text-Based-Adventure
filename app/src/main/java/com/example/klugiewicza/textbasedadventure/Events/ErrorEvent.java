package com.example.klugiewicza.textbasedadventure.Events;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

public class ErrorEvent extends Event
{
    public ErrorEvent(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text,
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

    ErrorEvent error = new ErrorEvent
            ("errorevent",
                    "Something somewhere just went terribly and horribly wrong.",
                    "I hope a developer just lost a job.",
                    "This is why we can't have nice things.",
                    "Eh, still a better story hook than the last campaign I played.",
                    "ERROR: Cannot find file faith.txt in folder C:/Users/Humanity/, are you sure you didn't lose it?",
                    "thetruecalling",
                    "thetruecalling",
                    "amightyquestunfolds",
                    "renewthefaith"
            );
}
