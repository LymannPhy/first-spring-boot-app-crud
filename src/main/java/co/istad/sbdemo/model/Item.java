package co.istad.sbdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Item {
    private Integer id;
    private String name;
    private double price;
    private Integer qty;

    // Getters and setters

}

