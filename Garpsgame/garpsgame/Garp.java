import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Garp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Garp extends Actor
{
    /**
     * Act - do whatever the Garp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage imageLeft = new GreenfootImage("GarpLeft.png");
    private GreenfootImage imageRight = new GreenfootImage("GarpRight.png");
    
    public void act() 
    {
     if(Greenfoot.isKeyDown("right")) {
         setImage(imageRight);
         setRotation(0);
         move(5);
     } 
        if(Greenfoot.isKeyDown("left")) {
          setImage(imageLeft);
          setRotation(0);
          move(-5);
        }    
            if(Greenfoot.isKeyDown("up")) {
                setRotation(-90);
                move(5);
            }
                if(Greenfoot.isKeyDown("down")) {
                    setRotation(90);
                        move(5);
                }

     }
}
    
