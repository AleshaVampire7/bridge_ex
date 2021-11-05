package com.company.Overview;

import com.company.Resource.IResource;

public class LongView implements IView {
private IResource iResource;

    public LongView(IResource iResource) {
        this.iResource = iResource;
    }

    @Override
    public String show() {
        return "Long view\n"+iResource.title()+"\n"+iResource.snippet()+"\n"+iResource.description();
    }
}
