import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
                
        if(getX() >= 590){
            resetRocket();
        }
        
        if(isTouching(Seal.class)){
            //Add a game over
            Skull skull = new Skull();
            getWorld().addObject(skull, 300, 200); 
            getWorld().removeObject(this);
        }
    }
    
    public void resetRocket(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0){
            setLocation(50,100);

        }else{
            setLocation(50,300);
        }
    }
}
