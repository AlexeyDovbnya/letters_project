package com.example.myProject_HABR.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.myProject_HABR.responses.MySimpleMap;
import com.example.myProject_HABR.responses.MySimpleRepository;
import com.example.myProject_HABR.responses.MySimpleRandom;
import com.example.myProject_HABR.requests.MySimpleRequest;
import com.example.myProject_HABR.responses.MySimpleResponse;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.HashMap;



@RestController                                                          //Аннотация которая возвращает объект, и данные объекта напрямую записываются в HTTP-ответ в виде JSON или XML.
    @RequestMapping("/simple-mock")                                          //Аннотация @RequestMapping используется для мапинга(связывания) с URL для всего класса.
    public class MySimpleController {                                        //Создаем класс MySimpleController, он будет отвечать за все наши запросы.
    @PostMapping("/post")                                                    //POST запрос.
    public ResponseEntity<MySimpleResponse> post (@RequestBody MySimpleRequest request){
        MySimpleResponse response = new MySimpleResponse();
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("a", "z");
        myHashMap.put("b", "y");
        myHashMap.put("c", "x");
        myHashMap.put("d", "u");
        myHashMap.put("e", "t");
        myHashMap.put("f", "s");
        myHashMap.put("g", "r");
        myHashMap.put("h", "q");
        myHashMap.put("i", "p");
        myHashMap.put("j", "o");
        myHashMap.put("k", "n");
        myHashMap.put("l", "m");
        myHashMap.put("m", "l");
        myHashMap.put("n", "k");
        myHashMap.put("o", "j");
        myHashMap.put("p", "i");
        myHashMap.put("q", "h");
        myHashMap.put("r", "g");
        myHashMap.put("s", "f");
        myHashMap.put("t", "e");
        myHashMap.put("u", "d");
        myHashMap.put("x", "c");
        myHashMap.put("y", "b");
        myHashMap.put("z", "a");
        String result = myHashMap.get(request.getLetter());//Объявляем переменную response.
        response.setId(String.valueOf(request.getId()));                        //Присваиваем response значение ID.
        response.setReverseletter(result);               //Присваиваем response значение Sum = paramA + paramB.
        LocalDateTime now = LocalDateTime.now();                                //Объявляем переменную now и присваиваем ей значение текущего времени
        MySimpleRepository.ids.add(String.valueOf(request.getId()));            //Заполняем наш массив ids значениям ID.
        MySimpleMap.map.put(request.getId(), String.valueOf(now));              //Заполняем HashMap map значениями ID и now.
        return ResponseEntity.ok(response);                                     //Возвращаем в ответе response(ID и sum).
    }

    @GetMapping("/get_random")                                               //GET запрос случайное число

    public ResponseEntity<MySimpleRandom> get_random (){
        MySimpleRandom random = new MySimpleRandom();
        random.setRandom(random.getRandom());                                   //Присваиваем random значение случайного числа от 0 до 100
        return ResponseEntity.ok(random);                                       //Возвращаем в ответе random(случайное число от 0 до 100)
    }

    @GetMapping("/get_repository")                                           //GET запрос возвращающий все id

    public List<String> get_repository (){
        return MySimpleRepository.ids;                                           //Возвращаем в ответе наш массив ids
    }

    @GetMapping("/get_map")                                                  //GET возвращающий все id и время когда запрос пришел

    public Map<UUID, String> get_map (){
        return MySimpleMap.map;                                                  //Возвращаем в ответе нашу HashMap map
    }

    @GetMapping("/get_letter_reverse")

    public String RevLetter(String letter) {
        HashMap<String, String> myHashMap = new HashMap<String, String>();
        myHashMap.put("a", "z");
        myHashMap.put("b", "y");
        myHashMap.put("c", "x");
        myHashMap.put("d", "u");
        myHashMap.put("e", "t");
        myHashMap.put("f", "s");
        myHashMap.put("g", "r");
        myHashMap.put("h", "q");
        myHashMap.put("i", "p");
        myHashMap.put("j", "o");
        myHashMap.put("k", "n");
        myHashMap.put("l", "m");
        myHashMap.put("m", "l");
        myHashMap.put("n", "k");
        myHashMap.put("o", "j");
        myHashMap.put("p", "i");
        myHashMap.put("q", "h");
        myHashMap.put("r", "g");
        myHashMap.put("s", "f");
        myHashMap.put("t", "e");
        myHashMap.put("u", "d");
        myHashMap.put("x", "c");
        myHashMap.put("y", "b");
        myHashMap.put("z", "a");
        String result = myHashMap.get(letter);
        return result;
    }
}

