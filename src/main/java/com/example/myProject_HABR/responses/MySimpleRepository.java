package com.example.myProject_HABR.responses;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;



@Data                                                    //Удобная аннотация, которая генерирует геттеры и сеттеры для частных полей.
@Component                                               //Аннотация, которая позволяет Spring автоматически определять ваши пользовательские компоненты.
public class MySimpleRepository {                        //Создаем класс MySimpleRepository.
    public static List<String> ids = new ArrayList<>();  //Объявляем массив ids в формате String который будем заполнять ID из POST запроса

}

