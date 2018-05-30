package com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Util.Event;

import java.util.Random;

public class OverThrowHim extends Event
{
    public OverThrowHim() {
        this.name = "thetruecalling";
        this.description = "Your mission is to remove the developer of this bug-infested game from his position of vocation.";

        this.Option1Text = "This will take some finesse, fetch me my spellbook.";
        this.Option2Text = "This is below my pay-grade";
        this.Option3Text = "I know this hacker dude who could help.";
        this.Option4Text = "This is ridiculous.";

        this.Option1Pointer = "thisismodernday";
        this.Option2Pointer = "outsourcing";
        this.Option3Pointer = "noyoudont";
        this.Option4Pointer = "";
        Main.events.add(this);
    }

    @Override
    public void Option1Event() {
        super.Option1Event();
    }

    @Override
    public void Option2Event() {
        super.Option2Event();
    }

    @Override
    public void Option3Event() {
        Random random = new Random();
        if (random.nextBoolean()) {
            this.Option3Pointer = "youdoknowthishackerdude";
        }
    }

    @Override
    public void Option4Event() {
        super.Option4Event();
    }
}
