package com.example.urlshortener.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.Locale;
import java.util.stream.Collectors;

@Component
public class RandomStringGenerator {
    @Value("${codeLength}")
    private int codeLength;

    public String generateRandomString(){
        SecureRandom random = new SecureRandom();
        String generated = "";


       var letters = "abcdefghijklmnprstuvyzqw123456789".toUpperCase(Locale.ROOT)
               .chars()
               .mapToObj(x->(char)x)
               .collect(Collectors.toList());
        Collections.shuffle(letters);
        for (int i = 0; i < codeLength; i++) {
            generated += letters.get(random.nextInt(letters.size()));
        }
       return generated;
    }
}
