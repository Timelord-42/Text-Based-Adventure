package com.example.klugiewicza.textbasedadventure.Events.ErrorEventChain;

import com.example.klugiewicza.textbasedadventure.Main;
import com.example.klugiewicza.textbasedadventure.Player;
import com.example.klugiewicza.textbasedadventure.Util.Event;

import java.util.Random;

public interface DeveloperEventChain
{
    public class OverthrowTheDeveloper extends Event
    {
        public OverthrowTheDeveloper(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text,
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
            Random random = new Random();
            if(random.nextBoolean())
            {
                this.Option3Pointer = "youdoknowthishackerdude";
            }
        }

        @Override
        public void Option4Event()
        {
            super.Option4Event();
        }

         OverthrowTheDeveloper overthrowthedeveloper = new OverthrowTheDeveloper
                ( "thetruecalling",
                        "Your mission is to remove the developer of this bug-infested game from his position of vocation.",
                        "This will take some finesse, fetch me my spellbook.",
                        "This is below my pay-grade",
                        "I know this hacker dude who could help.",
                        "This is ridiculous.",
                        "thisismodernday",
                        "outsourcing",
                        "noyoudont",
                        ""
                );
    }

    public class ThisIsModerDay extends Event
    {
        public ThisIsModerDay(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text,
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
            Player.Effects.add("VocationalRemovalMagic");
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

        ThisIsModerDay ThisIsModerDay = new ThisIsModerDay
                ("thisismodernday",
                        "You are playing in a modern day campaign magic isn't unlocked presently.",
                        "We should fix that.",
                        "",
                        "",
                        "",
                        "moderndaymagiccampaign",
                        "",
                        "",
                        ""
                );
    }

    public class OutSourcing extends Event
    {
        public OutSourcing(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text,
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

        OutSourcing OutSourcing = new OutSourcing
                ("Outsourcing",
                        "Who should you outsource the vocation removal to?",
                        "The Mob",
                        "Space Aliens",
                        "I'll just cast a spell...",
                        "",
                        "",
                        "",
                        "thisismodernday",
                        ""
                );
    }
}
