package io.cucumber.skeleton;

public class Belly {
    public void eat(int cukes) {
        if (cukes%2==0)
           throw new IllegalArgumentException("Hata");
    }
}
