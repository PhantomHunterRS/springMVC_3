package com.phantom.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private int id;
    private String title;
    private double cost;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }
}
