package com.cardvalidation.app;

import com.cardvalidation.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/card")
public class IRestController
{
    @GetMapping("/get")
    public String test(){
        return "abcd";
    }
    @GetMapping("/cardvalidation")
    public Cards cardValidator(@RequestBody validationRequest request){
        List<CardNumber> cardNumber = request.getCardNumber();
        String regex= "[0-9]+";
        Cards cards = new Cards();
        List<ValidCards> validCardsList = new ArrayList<>();
        List<InvalidCards> invalidCardsList = new ArrayList<>();
        for(int i=0; i<cardNumber.size(); i++){
            if(cardNumber.get(i) == null || cardNumber.get(i).getNumber().length() != 16 || !(cardNumber.get(i).getNumber().matches(regex))){
                InvalidCards invalidCards = new InvalidCards();
                invalidCards.setInvalidCardNumber(cardNumber.get(i).getNumber());
                invalidCardsList.add(invalidCards);

            }
            else{
                ValidCards validCards = new ValidCards();
                validCards.setValidCardNumber(cardNumber.get(i).getNumber());
                validCardsList.add(validCards);
            }
            cards.setInValidCards(invalidCardsList);
            cards.setValidCards(validCardsList);
        }
        return cards;
    }
}
