package com.example.klugiewicza.textbasedadventure;

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

    public Event(){}

    public Event(String name, String description, String Option1Text, String Option2Text, String Option3Text, String Option4Text
            , String Option1Name, String Option2Name, String Option3Name, String Option4Name)
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
    }

    public void SetOptionTexts(String Option1Text, String Option2Text, String Option3Text, String Option4Text)
    {
        this.Option1Text = Option1Text;
        this.Option2Text = Option2Text;
        this.Option3Text = Option3Text;
        this.Option4Text = Option4Text;
    }

    public voud SetOptionNames( String Option1Name, String Option2Name, String Option3Name, String Option4Name)
    {
        this.Option1Name = Option1Name;
        this.Option2Name = Option2Name;
        this.Option3Name = Option3Name;
        this.Option4Name = Option4Name;
    }

    public void setName(String name)
    {
        this.name = name;
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
