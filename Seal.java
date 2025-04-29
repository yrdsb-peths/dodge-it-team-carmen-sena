import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seal extends Actor
{
    boolean atTop = true;
    
    public Seal(){
        setImage("images/seal.png"); 
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null)) {
            atTop = !atTop;
        }
        
        if(atTop){
            setLocation(500, 100);
        } else {
            setLocation(500, 300); 
        }
    }
}
