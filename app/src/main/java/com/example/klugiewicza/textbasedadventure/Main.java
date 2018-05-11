package com.example.klugiewicza.textbasedadventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.klugiewicza.textbasedadventure.Util.Event;
import java.util.ArrayList;

public class Main extends AppCompatActivity
{

    public ArrayList<Event> events;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void Main()
    {
        events = initializeEvents();
    }

    public ArrayList<Event> initializeEvents()
    {
    ArrayList<Event> Events = null;

    return Events;
    }

}
