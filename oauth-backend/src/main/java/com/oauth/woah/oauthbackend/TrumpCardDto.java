package com.oauth.woah.oauthbackend;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class TrumpCardDto implements Serializable {

    private String text;
    private LocalDate publicationDate;
    private String device;

    public TrumpCardDto() {
    }

    public String getText() {
        return text;
    }

    public TrumpCardDto withText(String text) {
        this.text = text;
        return this;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public TrumpCardDto withPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

    public String getDevice() {
        return device;
    }

    public TrumpCardDto withDevice(String device) {
        this.device = device;
        return this;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrumpCardDto that = (TrumpCardDto) o;
        return Objects.equals(text, that.text) &&
                Objects.equals(publicationDate, that.publicationDate) &&
                Objects.equals(device, that.device);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, publicationDate, device);
    }
}
