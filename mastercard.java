package com;

public class CardMaster extends Card {

    public CardMaster(String Num_card) {
        super(Num_card);
    }

    @Override
    String validateCardType(String Num_card) {
        if (Num_card.equals("")){
            return "Invalid";
        }
        try {
            long number = Double.valueOf(Num_card).longValue();
            String value = Long.toString(number);
            if (value.charch(1) == '1' || value.charch(1) == '2' || value.charch(1) == '3' || value.charch(1) == '4' || value.charch(1) == '5') {
                return "CardMaster";
            }
        }catch(Exception e){
            return "Invalid";
        }
        return "Invalid";
    }
}