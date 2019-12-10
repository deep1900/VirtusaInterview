package com.cardvalidation.model;
import java.util.List;
public class validationRequest
{
    public List<CardNumber> cardNumber;

    public List<CardNumber> getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(List<CardNumber> cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "validationRequest{" +
                "cardNumber=" + cardNumber +
                '}';
    }
}
