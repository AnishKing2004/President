package com.example.GameFramework;

import java.util.ArrayList;
import java.util.List;

public class PresidentMainActivity {
    public int playerId; // the player
    public List<Card> cards; //cards array
    final int maxCardsHand = 13;
    final int numCardsDeck = 52;
    public int currentHand; //how many players the card has on his turn
    public boolean isCardCorrect; //check if the card is playable
    public boolean isCardVisible;
    public boolean is3Spade; // dictates which player starts first
    public int rankings; //numbers corresponds to a stage
   // public Object card;

    public PresidentMainActivity (int playerId, List<Card> cards, boolean is3Spade) { // basic constructor intializing the variables
        this.playerId = playerId;
        this.cards = cards;
        this.is3Spade = is3Spade;
    }

    public PresidentMainActivity(PresidentMainActivity president, int playerId){ // copy costructor that makes deep copies
        this.playerId = playerId;
         // cards;
          this.currentHand = president.currentHand;
          this.isCardCorrect = president.isCardCorrect;
          this.isCardVisible = president.isCardVisible;
          this.is3Spade = president.is3Spade;
          this.rankings = president.rankings;
        // Object card;



        //going through each indvisual index to make sure all the values are copied
        this.cards = new ArrayList<>();
        for (Card card : president.cards){
            if(card.isVisibleToPlayer(playerId)){
                cards.add(card.copy());
            }
        }



    }



    public class Player {
        private int id; // players unique id
        private String name; // name of player

        public Player(int id, String name) { //intializing the variables
            this.id = id;
            this.name = name;
        }

        public Player(Player player) { //copy constructor making a deep copy
            this.id = player.id;
            this.name = player.name;
        }

        public Player copyForPlayer(int playerID) { // creates a copy of the current player
            if (id == playerID) {
                return new Player(this); //if the id doesn't match the given playerID,
                // the method creates a new Player object with the same attributes as the current object
            } else {
                return new Player(id, "BRO"); // if id doesn't match the give playerID create new player object with deafult name
            }
        }

        public int getId() { //retrieves ID
            return id;
        }

        public String getName() { // retrieves name
            return name;
        }
    }

    public class Card{
        private int number;
        private String name;
        private boolean visible;

        public Card(int number, String name, boolean visible){ //basic constructor
            this.number = number;
            this.name = name;
            this.visible = visible;
        }
        public Card(Card card){ // copy constructor creating deep copy
            this.number = card.number;
            this.name = card.name;
            this.visible = card.visible;
        }

        public Card copy(){ //copy method
            return new Card(this);
        }

        public boolean isVisibleToPlayer (int playerId){ //checks if cards should be shown
            return true;
        }



    }

}
