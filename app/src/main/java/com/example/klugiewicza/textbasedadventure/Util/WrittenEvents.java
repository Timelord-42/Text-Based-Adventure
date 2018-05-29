package com.example.klugiewicza.textbasedadventure.Util;

import com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain.ErrorEventChain;
import com.example.klugiewicza.textbasedadventure.Events.StartingEvent;
import com.example.klugiewicza.textbasedadventure.Events.Volcano;

public class WrittenEvents
{
    public static void InitializeEvents()
    {
        new StartingEvent();
        new Volcano();
        new ErrorEventChain.ErrorEvent();
    }

}
