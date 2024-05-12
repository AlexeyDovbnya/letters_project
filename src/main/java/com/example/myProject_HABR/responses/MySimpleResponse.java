package com.example.myProject_HABR.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;



                              //Удобная аннотация, которая генерирует геттеры и сеттеры для частных полей.
@JsonPropertyOrder({"id", "sum"})  //Аннотация @JsonPropertyOrder используется для указания порядка свойств при сериализации объекта в JSON.
@Data
public class MySimpleResponse {    //Создаем класс MySimpleResponse.
    @JsonProperty("id")
    private String id;                 //Объявляем ID в формате UUID.
    @JsonProperty("revetseletter")
    private String reverseletter ;               //Объявляем sum в формате Integer в который будет записываться сумма paramA + paramB.
}

