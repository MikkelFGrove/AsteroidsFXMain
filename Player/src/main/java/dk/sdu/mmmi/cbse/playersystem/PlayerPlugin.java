package dk.sdu.mmmi.cbse.playersystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.GameData;
import dk.sdu.mmmi.cbse.common.data.World;
import dk.sdu.mmmi.cbse.common.services.IGamePluginService;

public class PlayerPlugin implements IGamePluginService {
    private Entity player;

    @Override
    public void start(GameData gameData, World world) {
        player = createPlayer(gameData);
    }

    @Override
    public void stop(GameData gameData, World world) {
        world.removeEntity(player);
    }

    private Entity createPlayer(GameData gameData) {
        Entity playerShip = new Entity();
        playerShip.setPolygonCoordinates(-5,-5,10,0,-5,5);
        playerShip.setX(0);
        playerShip.setY(0);
        playerShip.setRadius(8);
        return playerShip;
    }


}
