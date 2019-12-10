package com.cardvalidation.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CardNumber {
    @JsonProperty("number")
    public String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "CardNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
