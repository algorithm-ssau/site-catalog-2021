package com.su.pets.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "dogs")
public class Dog {

    @Id
    private String id;
    private String name;
    private String breed;
    private String size;
    private String type;
    private String age;
    private String gender;
    private String imgUrl;
}
