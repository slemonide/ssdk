package model;

import javafx.scene.paint.Color;
import org.jetbrains.annotations.Contract;

/**
 * An entity that can occupy world position
 */
public enum Entity {
    CORRIDOR(true, Color.BEIGE),
    PLAYER(true, Color.DARKGOLDENROD),
    WALL(false, Color.DARKBLUE);

    private boolean isWalkable;
    private Color color;

    Entity(boolean isWalkable, Color color) {
        this.isWalkable = isWalkable;
        this.color = color;
    }

    @Contract(pure = true)
    public Color getColor() {
        return color;
    }

    @Contract(pure = true)
    public boolean isWalkable() {
        return isWalkable;
    }
}
