package com.example.klugiewicza.textbasedadventure.Util;

import com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain.ErrorEvent;
import com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain.OutSourcing;
import com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain.OverThrowHim;
import com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain.RenewTheFaith;
import com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain.ThisIsModernDay;
import com.example.klugiewicza.textbasedadventure.Events.StartingEvents.BringItOn;
import com.example.klugiewicza.textbasedadventure.Events.StartingEvents.MinMaxxer;
import com.example.klugiewicza.textbasedadventure.Events.StartingEvents.StartingEvent;
import com.example.klugiewicza.textbasedadventure.Events.Volcano;

public class WrittenEvents
{
    public static void InitializeEvents()
    {
        new StartingEvent();
        new Volcano();
        new ErrorEvent();
        new RenewTheFaith();
        new OutSourcing();
        new ThisIsModernDay();
        new OverThrowHim();
        new MinMaxxer();
        new BringItOn();
    }

}
