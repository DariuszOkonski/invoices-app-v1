package com.example.invoicesappv1.supplier;

public class Supplier {
    private Long id;
    private String name;
    private String address;

    public Supplier() {
    }

    public Supplier(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Supplier(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
