package games.battleship.battleship3;

public class RandomEnemy extends Battleship implements IEnemy {

    @Override
    public GridLocation target() {
        int x = (int) (Math.random() * getSize());
        int y = (int) (Math.random() * getSize());
        while (getCell(x, y).isHit()) {
            x = (int) (Math.random() * getSize());
            y = (int) (Math.random() * getSize());
        }
        return new GridLocation(x, y);
    }
}
