package com.company.Resource;

import com.company.Entities.SomeBlender;

public class BlenderInfo implements IResource {
    private SomeBlender someBlender;

    public BlenderInfo(SomeBlender someBlender) {
        this.someBlender = someBlender;
    }

    @Override
    public String snippet() {
        return "We have special blender for you with the workspeed"+someBlender.getWorkspeed()+" and voltage about "+someBlender.getVoltage();
    }

    @Override
    public String title() {
        return "The best blender for everyone!";
    }

    @Override
    public String description() {
        return someBlender.getDescription();
    }
}
