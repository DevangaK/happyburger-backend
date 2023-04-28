package com.sepals.happyburger.ingredientsservice.model;

import jakarta.persistence.*;
import lombok.*;

//Entity class

//'Ingredient' table is automatically created if there's no table with specified name in the connected DB.
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Ingredient")
public class Ingredient{

    //columns in the Ingredient table = attributes of entity
    @Id //specify primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY -> auto increment id values(Primary Key)
    private long id;
    private String name;
    private String description;
    private double price;
}

//GenerationType.SEQUENCE -> allows Hibernate to decide when to perform the insert statement