package com.company.Overview;

import com.company.Resource.IResource;

public class ShortView implements IView{
    private IResource iResource;

    public ShortView(IResource iResource) {
        this.iResource = iResource;
    }

    @Override
    public String show() {
        return "Short view\n"+iResource.title()+"\n"+iResource.snippet()+"\n";
    }
}
