package com.example.president;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.List;

public class GameController {
    List<Card> cards = new List<Card>();

    @Override
    public void onClick(View v) {
        PresidentMainActivity firstInstance = new PresidentMainActivity(1, cards, true);
        PresidentMainActivity secondInstance = new PresidentMainActivity(firstInstance, 1);
        //
        PresidentMainActivity thirdInstance = new PresidentMainActivity(1, cards, true);
        PresidentMainActivity fourthInstance = new PresidentMainActivity(firstInstance, 1);
        println(secondInstance.toString());
        println(fourth.toString());
    }
}