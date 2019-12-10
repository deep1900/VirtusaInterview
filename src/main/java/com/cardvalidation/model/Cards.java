package com.cardvalidation.model;

import java.util.List;

public class Cards
{
    public List<ValidCards> validCards;
    public List<InvalidCards> inValidCards;

    public List<ValidCards> getValidCards() {
        return validCards;
    }

    public void setValidCards(List<ValidCards> validCards) {
        this.validCards = validCards;
    }

    public List<InvalidCards> getInValidCards() {
        return inValidCards;
    }

    public void setInValidCards(List<InvalidCards> inValidCards) {
        this.inValidCards = inValidCards;
    }

    @Override
    public String toString() {
        return "Cards{" +
                "validCards=" + validCards +
                ", inValidCards=" + inValidCards +
                '}';
    }
}
