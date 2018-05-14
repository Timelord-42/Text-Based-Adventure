package com.example.klugiewicza.textbasedadventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.klugiewicza.textbasedadventure.Util.Event;
import com.example.klugiewicza.textbasedadventure.Util.WrittenEvents;

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
        events = WrittenEvents.InitializeEvents();
    }

    public void Button1click()
    {

    }

    public void Button2click()
    {

    }

    public void Button3click()
    {

    }

    public void Button4click()
    {

    }
}
