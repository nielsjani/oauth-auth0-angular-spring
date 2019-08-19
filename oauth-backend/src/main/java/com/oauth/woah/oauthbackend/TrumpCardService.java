package com.oauth.woah.oauthbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrumpCardService {

    @Autowired
    private TrumpCardRepository repository;

    public TrumpCardDto addCard(TrumpCardDto trumpCardDto) {
        return repository.addCard(trumpCardDto);
    }

    public List<TrumpCardDto> getAllCards() {
        return repository.findAll();
    }

    public List<TrumpCardDto> getAllCardsForDevice(String device) {
        return repository.findByDevice(device);
    }
}
