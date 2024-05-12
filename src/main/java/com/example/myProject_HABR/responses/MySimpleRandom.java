package com.example.myProject_HABR.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;


                                                   //Удобная аннотация, которая генерирует геттеры и сеттеры для частных полей.
@JsonPropertyOrder({"random"})
@Data //Аннотация @JsonPropertyOrder используется для указания порядка свойств при сериализации объекта в JSON.
public class MySimpleRandom {                            //Создаем класс MySimpleRandom.
    @JsonProperty("random")
    private Integer random = (int) (Math.random()*100);  //Объявляем random в формате Integer в который генерируется случайное число от 0 до 100.
}

