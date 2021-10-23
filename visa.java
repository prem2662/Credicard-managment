package com;

public class CardVisa extends Card {

    public CardVisa(String num_card) {
        super(num_card);
    }

    @Override
    String validateCardType(String num_card) {
        if (num_card.equals("")){
            return "Invalid";
        }
        try {
            long num = Double.valueOf(num_card).longValue();
            String value = Long.toString(num);
            if ((value.length()==13 || value.length()==16) && value.charAt(0)=='4'){
                return "CardVisa";
            }
        }catch(Exception e) {
            return "Invalid";
        }
        return "Invalid";
    }
}