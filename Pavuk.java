import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pavuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pavuk extends Actor
{
    /**
     * Act - do whatever the Pavuk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        
        
        if(Greenfoot.isKeyDown("right")){
            turn(20);
            move(50);
        }
        else if(Greenfoot.isKeyDown("left")){
            turn(-20);
            move(-50);
        }
        
        // Add your action code here.
    }
}
