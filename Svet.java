import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Svet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Svet extends World
{

    /**
     * Constructor for objects of class Svet.
     * 
     */
    public Svet()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000,500, 1); 
        addObject(new Pavuk(), 400, 400);
         addObject(new Pavuk(), 500, 500);
         addObject(new Pavuk(), 100, 500);
         addObject(new Pavuk(), 200, 500);
         addObject(new Pavuk(), 300, 500);
         addObject(new Pavuk(), 500, 100);
         addObject(new Pavuk(), 500, 200);
         addObject(new Pavuk(), 500, 300);
    }
}
