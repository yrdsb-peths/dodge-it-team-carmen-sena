import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Seal seal = new Seal(); 
        addObject(seal, 500, 100);
        
        Rocket rocket = new Rocket();
        addObject(rocket, 50, 100);
    }
}
