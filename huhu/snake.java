import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snake extends Actor
{
    public void act() 
    {
    if(Greenfoot.isKeyDown("up")){
            move(2);
    }
    if(Greenfoot.isKeyDown("A")){
         turn(-5);
    }
    if(Greenfoot.isKeyDown("D")){
        turn(5);
    }
    Actor food = getOneObjectAtOffset(0,0, food.class);
    if(food !=null){
        getWorld().removeObject(food);
        score.food++;
}
if(score.food == 3){
    getWorld().addObject(new smile(),300,200);
    Greenfoot.stop();
}           
}
}
