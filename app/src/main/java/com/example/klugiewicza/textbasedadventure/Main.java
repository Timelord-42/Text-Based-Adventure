package com.example.klugiewicza.textbasedadventure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.example.klugiewicza.textbasedadventure.Util.Event;
import com.example.klugiewicza.textbasedadventure.Util.WrittenEvents;
import java.util.ArrayList;

public class Main extends AppCompatActivity
{


    public ArrayList<Event> events;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;

    public Event activeevent;

    public TextView maintext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void Main()
    {
        button1 = (Button) findViewById(R.id.Action_1);
        button2 = (Button) findViewById(R.id.Action_2);
        button3 = (Button) findViewById(R.id.Action_3);
        button4 = (Button) findViewById(R.id.Action_4);

        maintext = (TextView) findViewById(R.id.MainText);


        events = WrittenEvents.InitializeEvents();
        int x = 0;
FindandloadEvent("startingevent");
    }

    public void LoadEvent(Event e)
    {
        maintext.setText(e.description);
        button1.setText(e.Option1Text);
        button2.setText(e.Option2Text);
        button3.setText(e.Option3Text);
        button4.setText(e.Option4Text);
    }

    public void OnClick1(View v)
    {
        FindandloadEvent(activeevent.Option1Pointer);
    }

    public void OnClick2(View v)
    {
        FindandloadEvent(activeevent.Option2Pointer);
    }

    public void OnClick3(View v)
    {
        FindandloadEvent(activeevent.Option3Pointer);
    }

    public void OnClick4(View v)
    {
        FindandloadEvent(activeevent.Option4Pointer);
    }

    public void FindandloadEvent(String s)
    {
        int x = 0;
        while( x < events.size())
        {
            if(events.get(x).name.equals(s))
            {
                x = (events.size() - 1);
                activeevent = events.get(x);
                LoadEvent(events.get(x));
            }
            x += 1;
        }
    }
}
