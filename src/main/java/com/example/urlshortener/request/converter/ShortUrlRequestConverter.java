package com.example.urlshortener.request.converter;

import com.example.urlshortener.model.ShortUrl;
import com.example.urlshortener.request.ShotUrlRequest;
import org.springframework.stereotype.Component;

@Component
public class ShortUrlRequestConverter {
    public ShortUrl convertToEntity(ShotUrlRequest shotUrlRequest){
        return ShortUrl.builder()
                .url(shotUrlRequest.getUrl())
                .code(shotUrlRequest.getCode())
                .build();
    }


}
