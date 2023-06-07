package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("cat")
    private Animal animal1;

    @Autowired
    @Qualifier("dog")
    private Animal animal2;

    @Autowired
    private Timer timer;

    public AnimalsCage(Timer timer) {
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal1.toString() + ", " + animal2.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return this.timer;
    }
}