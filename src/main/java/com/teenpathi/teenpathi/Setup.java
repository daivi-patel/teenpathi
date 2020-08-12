package com.teenpathi.teenpathi;

import com.teenpathi.teenpathi.objects.Card;
import com.teenpathi.teenpathi.objects.Deck;
import com.teenpathi.teenpathi.objects.Game;
import com.teenpathi.teenpathi.objects.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Setup {

    Deck deck = new Deck();

    @GetMapping("/setup")
    public String setupForm(Model model) {
        model.addAttribute("game", new Game());
        return "setup";
    }

    @PostMapping("/setup")
    public String setupForm(@ModelAttribute Game game, Model model, @RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("game", game);
        model.addAttribute("name", name);
        Player[] playerList = new Player[game.getNumPeople()]; // contains all players
        int dealer = -1;
        for (int np = 0; np < game.getNumPeople(); np++) {
            Player p = new Player(np); // instantiated player
            List<Card> temp = new ArrayList<>(); // temp hand
            for (int i = 0; i < 3; i++) { // adds the cards in order of shuffled list
                temp.add(deck.getCards().get(++dealer));
            }
            p.setHand(temp); // temp hand is set to player's hand
            System.out.println(p.getHand().toString());
            playerList[np] = p; //player added to the list
        }
        for (Player p: playerList) {
            System.out.println(p.toString());
        }
        return "startgame";
    }
}
