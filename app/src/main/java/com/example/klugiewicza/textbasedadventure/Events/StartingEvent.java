package com.example.klugiewicza.textbasedadventure.Events;

import com.example.klugiewicza.textbasedadventure.Util.Event;

public class StartingEvent extends Event
{
    public StartingEvent(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text,
                 String Option1Name, String Option2Name, String Option3Name, String Option4Name,
                 String Option1Pointer, String Option2Pointer, String Option3Pointer, String Option4Pointer)
    {
        this.name = name;
        this.description = description;

        this.Option1Text = Option1Text;
        this.Option2Text = Option2Text;
        this.Option3Text = Option3Text;
        this.Option4Text = Option4Text;

        this.Option1Name = Option1Name;
        this.Option2Name = Option2Name;
        this.Option3Name = Option3Name;
        this.Option4Name = Option4Name;

        this.Option1Pointer = Option1Pointer;
        this.Option2Pointer = Option2Pointer;
        this.Option3Pointer = Option3Pointer;
        this.Option4Pointer = Option4Pointer;
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
