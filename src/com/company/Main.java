package com.company;

import com.company.Entities.SomeBlender;
import com.company.Entities.SomeCar;
import com.company.Overview.LongView;
import com.company.Overview.ShortView;
import com.company.Resource.BlenderInfo;
import com.company.Resource.CarInfo;

public class Main {

    public static void main(String[] args) {
        LongView blender = new LongView(new BlenderInfo(new SomeBlender()));
        System.out.println(blender.show());
        LongView car = new LongView(new CarInfo(new SomeCar()));
        System.out.println(car.show());
        ShortView blenderS=new ShortView(new BlenderInfo(new SomeBlender()));
        System.out.println(blenderS.show());
        ShortView carS=new ShortView(new CarInfo(new SomeCar()));
        System.out.println(carS.show());
    }
}
