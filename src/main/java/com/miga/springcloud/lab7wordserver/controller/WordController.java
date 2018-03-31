package com.miga.springcloud.lab7wordserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miga.springcloud.lab7wordserver.domain.Word;

@RestController
public class WordController {

    @Value("${words}")
    String words;

    @GetMapping("/")
    @ResponseBody
    public Word getWord() {

        String[] wordArray = words.split(",");
        int i = (int) Math.round(Math.random() * (wordArray.length - 1));
        return new Word(wordArray[i]);
    }
}
