package com.example.klugiewicza.textbasedadventure.Util;

import com.example.klugiewicza.textbasedadventure.Events.StartingEvent;
import com.example.klugiewicza.textbasedadventure.Events.Volcano;

import java.util.ArrayList;

public class WrittenEvents
{
    public static void InitializeEvents()
    {
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
                        ""
                );
    }
}
