import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteoro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meteoro extends target
{
    /**
     * Act - do whatever the meteoro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveTarget();
        if (getY()>590)
        {
            getWorld().removeObject(this);
        }
    }
}
