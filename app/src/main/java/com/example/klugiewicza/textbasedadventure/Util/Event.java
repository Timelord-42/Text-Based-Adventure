package com.example.klugiewicza.textbasedadventure.Util;

public class Event
{
    //created for all events, has properties to control events that lead into it, what cna happen.
    public String name;
    public String description;

    public String Option1Text;
    public String Option2Text;
    public String Option3Text;
    public String Option4Text;

    public String Option1Name;
    public String Option2Name;
    public String Option3Name;
    public String Option4Name;

    public String Option1Pointer;
    public String Option2Pointer;
    public String Option3Pointer;
    public String Option4Pointer;

    public Event(){}

    public Event(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text,
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

    public void SetOptionTexts(String Option1Text, String Option2Text, String Option3Text, String Option4Text)
    {
        this.Option1Text = Option1Text;
        this.Option2Text = Option2Text;
        this.Option3Text = Option3Text;
        this.Option4Text = Option4Text;
    }

    public void SetOptionNames( String Option1Name, String Option2Name, String Option3Name, String Option4Name)
    {
        this.Option1Name = Option1Name;
        this.Option2Name = Option2Name;
        this.Option3Name = Option3Name;
        this.Option4Name = Option4Name;
    }

    public void SetOptionPointers( String Option1Pointer, String Option2Pointer, String Option3Pointer, String Option4Pointer)
    {
        this.Option1Pointer = Option1Pointer;
        this.Option2Pointer = Option2Pointer;
        this.Option3Pointer = Option3Pointer;
        this.Option4Pointer = Option4Pointer;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Event(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void Option1Event(){}
    public void Option2Event(){}
    public void Option3Event(){}
    public void Option4Event(){}

}
