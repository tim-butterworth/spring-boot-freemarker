package com.example.models;

public class ObjectContainerImplOne implements ObjectContainer<DataObject> {

    private DataObject dataObject;

    public ObjectContainerImplOne(DataObject dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public DataObject getContents() {
        return dataObject;
    }
}
