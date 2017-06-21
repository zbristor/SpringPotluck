package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Potluck {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private String food;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Potluck{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", food='" + food + '\'' +
                '}';
    }
}
