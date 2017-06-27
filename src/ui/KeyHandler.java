package ui;

import javafx.scene.Group;
import javafx.scene.Scene;
import model.Player;

import static com.sun.javafx.scene.traversal.Direction.*;

/**
 * Handles keys
 */
class KeyHandler {
    private final Player player;

    KeyHandler(Player player) {
        this.player = player;
    }

    /**
     * Add the key handler to the given scene
     * @param scene scene to which to add a key handler
     */
    void registerScene(Scene scene) {
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case UP:
                    player.move(UP);
                    break;
                case LEFT:
                    player.move(LEFT);
                    break;
                case DOWN:
                    player.move(DOWN);
                    break;
                case RIGHT:
                    player.move(RIGHT);
                    break;
                default:
                    break;
            }
        });
    }
}
