package com.example.klugiewicza.textbasedadventure;

import java.util.ArrayList;
public class Player
{
    //playerproperties
    public String PlayerName = "";
    public int hp = 100;
    public int ac = 10;
    public int str = 10;
    public int dex = 10;
    public int con = 10;
    public int wis = 10;
    public int intl = 10;
    public int luck = 10;
    
    public ArrayList<String> Inventory = new ArrayList<String>();
    public ArrayList<String> StatusEffects = new ArrayList<String>();
}

