package com.codecool.farm;

import com.codecool.farm.animal.Animal;

class Butcher extends Animal {

    private boolean canButcher(Animal animal) {
        if (animal.getSize() > 4) {
            return true;
        } else {
            return false;
        }
    }
}