import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Rocket rocket = new Rocket();
        addObject(rocket, 600, 100);
    }
}
