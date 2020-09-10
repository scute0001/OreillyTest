package com.test.java;

import com.sun.istack.internal.NotNull;

public class CustomerJava {
    private int id;
    private String name;
    private String email;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void prettyPrint() {
        System.out.printf("Id: %d - Name: %s\n", id, name);
    }

//    test @NotNull function
    public @NotNull String neverNull() {
        return "A String";
    }
    public String sometimesNull() {
        return "A String";
    }


    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + "\'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerJava that = (CustomerJava) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return email != null ? email.equals(that.email) : that.email == null;

    }
}
