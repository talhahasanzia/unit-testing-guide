package com.munchies.customer.auth.register.presenters;

public class User {
    private int age;
    private String name;
    private long id;
    private String NSN;
    private Address address;
    private String deviceId;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNSN() {
        return NSN;
    }

    public void setNSN(String NSN) {
        this.NSN = NSN;
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
