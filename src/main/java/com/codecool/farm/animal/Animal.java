package com.codecool.farm.animal;


public abstract class Animal {

    protected int size = 0;

    public int getSize() {
        return this.size;
    }

    abstract void feed();

}
