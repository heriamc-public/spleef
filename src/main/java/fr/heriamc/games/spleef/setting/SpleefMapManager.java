package fr.heriamc.games.spleef.setting;

import fr.heriamc.api.game.GameState;
import fr.heriamc.games.engine.map.GameMapManager;
import fr.heriamc.games.engine.map.slime.SlimeGameMap;
import fr.heriamc.games.engine.map.slime.SlimeMap;
import fr.heriamc.games.engine.map.slime.SlimeWorldLoader;
import fr.heriamc.games.spleef.SpleefGame;

public class SpleefMapManager extends GameMapManager<SpleefGame, SlimeMap, SlimeWorldLoader> {

    private final SlimeMap waitingMap, arenaMap;

    public SpleefMapManager(SpleefGame game, SlimeWorldLoader mapLoader) {
        super(game, mapLoader);
        this.waitingMap = new SlimeGameMap(getFormattedTypeMapName("waiting"), getFormattedMapTemplateName("waitingroom"));
        this.arenaMap = new SlimeGameMap(getFormattedTypeMapName("arena"), getFormattedMapTemplateName("classic"));
    }

    @Override
    public void setup() {
        addMap(waitingMap);
        addMap(arenaMap);

        getMapLoader().load(waitingMap).whenComplete((slimeMap, throwable) -> {
            slimeMap.getWorld().setGameRuleValue("doFireTick", "false");

        });

        getMapLoader().load(arenaMap).whenComplete((slimeMap, throwable) -> {
            slimeMap.getWorld().setGameRuleValue("doFireTick", "false");

            game.setState(GameState.WAIT);
        });
    }

    @Override
    public void end() {
        delete(waitingMap);
        delete(arenaMap);
    }

}