package com.example.myProject_HABR.responses;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;



@Data                                                        //Удобная аннотация, которая генерирует геттеры и сеттеры для частных полей.
@Component                                                   //Аннотация, которая позволяет Spring автоматически определять ваши пользовательские компоненты.
public class MySimpleMap {                                   //Создаем класс MySimpleMap.
    public static Map<UUID, String> map = new HashMap<>();   //Объявляем HashMap map в формате <UUID, String> которую будем заполнять ID из POST запроса и временем, когда запрос пришел
}

