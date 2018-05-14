package com.example.klugiewicza.textbasedadventure.Util;

import com.example.klugiewicza.textbasedadventure.Events.StartingEvent;
import com.example.klugiewicza.textbasedadventure.Events.Volcano;

import java.util.ArrayList;

public class WrittenEvents
{
    public static ArrayList<Event> InitializeEvents()
    {
        ArrayList<Event> Events = new ArrayList<Event>();

        StartingEvent startingevent = new StartingEvent
                ("",
                 "",
                 "",
                 "",
                 "",
                 "",
                 "",
                 "",
                 "",
                 ""
                );

        Volcano volcano = new Volcano
                ("",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                );

        Events.add(startingevent);

        return Events;
    }
}
