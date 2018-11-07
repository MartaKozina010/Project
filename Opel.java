package com.company;

public class Opel extends Car {
    public Opel(int cylinder, String name) {
        super(cylinder, name);
    }


    @Override
    public String startEngine() {
        return getClass().getSimpleName()+"Ford -> startEngine";
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("fordzik brumbrum");
        //return "Ford -> accelerate";
    }

}
