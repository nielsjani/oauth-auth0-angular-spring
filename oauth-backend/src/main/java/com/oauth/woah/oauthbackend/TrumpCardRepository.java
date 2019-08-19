package com.oauth.woah.oauthbackend;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;

@Component
public class TrumpCardRepository {

    private List<TrumpCardDto> cards = newArrayList(
            new TrumpCardDto()
                    .withDevice("ANDROID")
                    .withPublicationDate(LocalDate.now().minusYears(2))
                    .withText("\"I will build a great, great wall on our southern border, and I will have Mexico pay for that wall. Mark my words.\""),
            new TrumpCardDto()
                    .withDevice("WIN_PHONE")
                    .withPublicationDate(LocalDate.now().minusYears(2))
                    .withText("\"I have a great relationship with African Americans, as you possibly have heard. I just have great respect for them. And they like me. I like them.\""),
            new TrumpCardDto()
                    .withDevice("ANDROID")
                    .withPublicationDate(LocalDate.now().minusYears(3))
                    .withText("\"It's really cold outside, they are calling it a major freeze, weeks ahead of normal. Man, we could use a big fat dose of global warming!\""),
            new TrumpCardDto()
                    .withDevice("APPLE")
                    .withPublicationDate(LocalDate.now().minusYears(3))
                    .withText("\"Our country is in serious trouble. We don't have victories any more. We used to have victories but [now] we don't have them. When was the last time anybody saw us beating, let's say, China, in a trade deal? They kill us. I beat China all the time. All the time.\""),
            new TrumpCardDto()
                    .withDevice("ANDROID")
                    .withPublicationDate(LocalDate.now().minusYears(1))
                    .withText("\"When you see the other side chopping off heads, waterboarding doesn't sound very severe.\""),
            new TrumpCardDto()
                    .withDevice("ORAL_CAVITY")
                    .withPublicationDate(LocalDate.now().minusYears(7))
                    .withText("\"The concept of global warming was created by and for the Chinese in order to make U.S. manufacturing non-competitive.\""),
            new TrumpCardDto()
                    .withDevice("ORAL_CAVITY")
                    .withPublicationDate(LocalDate.now().minusYears(20))
                    .withText("\"To be blunt, people would vote for me. They just would. Why? Maybe because I'm so good looking.\""),
            new TrumpCardDto()
                    .withDevice("APPLE")
                    .withPublicationDate(LocalDate.now().minusYears(4))
                    .withText("\"I'm the most successful person ever to run for the presidency, by far. Nobody's ever been more successful than me. I'm the most successful person ever to run. Ross Perot isn't successful like me. Romney - I have a Gucci store that's worth more than Romney.\"")
    );

    public TrumpCardDto addCard(TrumpCardDto trumpCardDto) {
        cards.add(trumpCardDto);
        return trumpCardDto;
    }

    public List<TrumpCardDto> findAll() {
        return cards;
    }

    public List<TrumpCardDto> findByDevice(String device) {
        return cards.stream()
                .filter(card -> card.getDevice().equals(device))
                .collect(Collectors.toList());
    }
}
