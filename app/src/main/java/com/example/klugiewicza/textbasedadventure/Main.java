package com.example.klugiewicza.textbasedadventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.klugiewicza.textbasedadventure.Util.Event;
import com.example.klugiewicza.textbasedadventure.Util.WrittenEvents;

import java.nio.file.attribute.BasicFileAttributeView;
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
        int x = 0;
        while( x < events.size())
        {
            if(events.get(x).name.equals("startingevent"))
            {
                x = (events.size() - 1);
                LoadEvent(events.get(x));
            }
            x += 1;
        }
    }

    public void LoadEvent(Event e)
    {

    }

    public void OnClick1(View v)
    {

    }

    public void OnClick2(View v)
    {

    }

    public void OnClick3(View v)
    {

    }

    public void OnClick4(View v)
    {

    }
}
