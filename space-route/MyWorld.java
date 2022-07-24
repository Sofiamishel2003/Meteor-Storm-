import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 600, 1); 
        comienzo();
    }
    public void act()
    {
        enemigos();
    }
    public void enemigos()
    {
        if (Greenfoot.getRandomNumber(60)<1)
        {
            addObject(new meteoro(), Greenfoot.getRandomNumber(600),0);
        }
    }
    private void comienzo()
    {
        jugador jugador1 = new jugador();
        addObject(jugador1, 10,10);
        jugador1.setLocation(250,530);
    }
    
}