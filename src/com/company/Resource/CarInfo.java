package com.company.Resource;

import com.company.Entities.SomeCar;

public class CarInfo implements IResource{
    private SomeCar someCar;

    public CarInfo(SomeCar someCar) {
        this.someCar = someCar;
    }

    @Override
    public String snippet() {
        return "We have the special car for you with the speed about "+someCar.getMaxspeed()+" and with fuel capacity about "+someCar.getFuelcapacity();
    }

    @Override
    public String title() {
        return "The best car you have ever used to drive!";
    }

    @Override
    public String description() {
        return someCar.getDescription();
    }
}
