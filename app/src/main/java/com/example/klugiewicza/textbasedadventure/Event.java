package com.example.klugiewicza.textbasedadventure;

public class Event
{
    //created for all events, has properties to control events that lead into it, what cna happen.
    public String name;
    public String description;

    public String Option_1_Text;
    public String Option_2_Text;
    public String Option_3_Text;
    public String Option_4_Text;

    public String Option_1_Event;
    public String Option_2_Event;
    public String Option_3_Event;
    public String Option_4_Event;

    public Event(String name, String description, String Option_1_Text, String Option_2_Text, String Option_3_Text, String Option_4_Text
            , String Option_1_Event, String Option_2_Event, String Option_3_Event, String Option_4_Event)
    {
        this.name = name;
        this.description = description;
        this.Option_1_Text = Option_1_Text;
        this.Option_2_Text = Option_2_Text;
        this.Option_3_Text = Option_3_Text;
        this.Option_4_Text = Option_4_Text;

        this.Option_1_Event = Option_1_Event;
        this.Option_2_Event = Option_2_Event;
        this.Option_3_Event = Option_3_Event;
        this.Option_4_Event = Option_4_Event;
    }
}
