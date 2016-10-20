package com.example.models;

public class ObjectContainerImplTwo implements ObjectContainer<DataObject> {

    private DataObject dataObject;

    public ObjectContainerImplTwo(DataObject dataObject) {
        this.dataObject = dataObject;
    }

    @Override
    public DataObject getContents() {
        return dataObject;
    }
}
