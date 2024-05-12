package com.example.myProject_HABR.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import java.util.UUID;



                                //Удобная аннотация, которая генерирует геттеры и сеттеры для частных полей.
@JsonPropertyOrder({"id",
        "paramA"})         //Аннотация @JsonPropertyOrder используется для указания порядка свойств при сериализации объекта в JSON.
@Data
public class MySimpleRequest {       //Создаем класс MySimpleRequest.
    @JsonProperty("id")
    private UUID id = UUID.randomUUID(); //Объявляем ID в формате UUID.
    @JsonProperty("letter")
    private String letter;              //Объявляем paramA в формате Integer//Объявляем paramB в формате Integer.
}

