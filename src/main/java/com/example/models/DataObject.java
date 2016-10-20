package com.example.models;

public class DataObject {
    private double id;

    public DataObject() {
        id = Math.random();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataObject that = (DataObject) o;

        return Double.compare(that.id, id) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(id);
        return (int) (temp ^ (temp >>> 32));
    }
}
