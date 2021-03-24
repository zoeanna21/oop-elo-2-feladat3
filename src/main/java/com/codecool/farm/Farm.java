package com.codecool.farm;

import com.codecool.farm.animal.Animal;
import java.util.List;
import java.util.ArrayList;

class Farm {

    private List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    private void feedAnimals(){
        for(Animal animal: animals) {

        }
    }

    private boolean isEmpty() {
        int sum = 0;
        for(Animal animal: animals) {
            sum += 1;
        }
        if(sum == 0)
        {
            return true;
        } else {
            return false;
        }
    }

    private List<String> getStatus() {
        List<String> status = new ArrayList<>();
        for(Animal animal: animals) {
            status.add("There is a" + animal.getSize() +  "sized" + animal.getClass().getName() + "in the farm.");
        }
        return status;
    }


}
