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
    public String setupSubmit(@ModelAttribute Game game, Model model, @RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        model.addAttribute("game", game);
        model.addAttribute("name", name);
        Player[] playerList = new Player[game.getNumPeople()];
        int dealer = -1;
        for (int np = 0; np < game.getNumPeople(); np++) {
            Player p = new Player(np);
            List<Card> temp = new ArrayList<>();
            temp.add(deck.getCards().get(++dealer));
            temp.add(deck.getCards().get(++dealer));
            temp.add(deck.getCards().get(++dealer));
            p.setHand(temp);
            System.out.println(p.getHand().toString());
            playerList[np] = p;
        }
        return "startgame";
    }
}
