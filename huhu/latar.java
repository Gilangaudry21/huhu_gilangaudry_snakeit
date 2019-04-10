
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar extends World
{

    /**
     * Constructor for objects of class latar.
     * 
     */
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        
        addObject(new score(),100,40);
        addObject(new snake(),20,100);
        addObject(new food(),20,200);
        addObject(new food(),100,750);
        addObject(new food(),750,200);
        
        prepare();
    }
    private void prepare()
    {
        TRAP TRAP = new TRAP();
        addObject(TRAP,218,26);
        TRAP.setRotation(90);
}
}
