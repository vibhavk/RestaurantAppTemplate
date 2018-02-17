package com.hfad.bitsandpizzas;

/**
 * Created by vibhav on 17/2/18.
 */

public class Pizza {
    private String name;
    private int imageResourceId;

    public static final Pizza[] pizzas = {
      new Pizza("Diavolo", R.drawable.diavolo),
      new Pizza("Funghi", R.drawable.funghi)
    };

    private Pizza(String name, int imageResourceId){
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }
}
