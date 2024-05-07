package services;

import repositories.CatRepository;

import java.util.ArrayList;

public class CatService {
private CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public void newCat(String name, int age, int weight) {
        catRepository.newCat(name, age,weight);
    }

    public ArrayList allCats() {
        return catRepository.allCats();
    }
}
