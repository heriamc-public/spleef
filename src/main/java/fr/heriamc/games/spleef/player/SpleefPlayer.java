package fr.heriamc.games.spleef.player;

import fr.heriamc.games.engine.player.GamePlayer;

import java.util.UUID;

public class SpleefPlayer extends GamePlayer<SpleefTeam> {

    public SpleefPlayer(UUID uuid, int kills, int deaths, boolean spectator) {
        super(uuid, kills, deaths, spectator);
    }

}