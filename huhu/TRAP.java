import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TRAP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TRAP extends Actor
{
    /**
     * Act - do whatever the TRAP wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act() 
    {
    {
        // Add your action code here.
         move(5);
        if(getY()<=5 || getY() >=getWorld().getHeight() -5)
        turn(180);
        Actor snake = getOneObjectAtOffset(0,0,snake.class);
        if(snake!=null){
            removeTouching(snake.class);
            Greenfoot.stop();
            getWorld().addObject(new huhu(),300,200);
        }
    }    
}
}