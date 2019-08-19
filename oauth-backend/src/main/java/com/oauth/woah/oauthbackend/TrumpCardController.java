package com.oauth.woah.oauthbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/trumpcard")
public class TrumpCardController {

    @Autowired
    private TrumpCardService service;

    @PostMapping()
    public TrumpCardDto addCard(TrumpCardDto trumpCardDto) {
        return service.addCard(trumpCardDto);
    }

    @GetMapping()
    public List<TrumpCardDto> getAllCards() {
        return service.getAllCards();
    }

    @GetMapping("/{device}")
    public List<TrumpCardDto> getAllCardsForDeviceType(@PathVariable("device") String device) {
        return service.getAllCardsForDevice(device);
    }
}
