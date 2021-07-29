package br.com.boardgame;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GameManager {

    public static final Map<Integer, Integer> LADDERS;
    public static final Map<Integer, Integer> SNAKES;

    static {
        LADDERS = new HashMap<>();
        LADDERS.put(1, 38);
        LADDERS.put(4, 14);
        LADDERS.put(8, 10);
        LADDERS.put(21, 42);
        LADDERS.put(28, 76);
        LADDERS.put(50, 67);
        LADDERS.put(80, 99);
        LADDERS.put(71, 92);

        SNAKES = new HashMap<>();
        SNAKES.put(97, 78);
        SNAKES.put(95, 56);
        SNAKES.put(88, 24);
        SNAKES.put(62, 18);
        SNAKES.put(48, 26);
        SNAKES.put(36, 6);
        SNAKES.put(32, 10);
    }

    private Player client;
    private int positionClient;

    private Player server;
    private int serverPosition;



}
