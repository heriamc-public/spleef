package fr.heriamc.games.spleef.player;

import fr.heriamc.games.engine.team.GameTeam;
import fr.heriamc.games.engine.team.GameTeamColor;

public class SpleefTeam extends GameTeam<SpleefPlayer> {

    public SpleefTeam(int maxSize, GameTeamColor color) {
        super(maxSize, color);
    }

}