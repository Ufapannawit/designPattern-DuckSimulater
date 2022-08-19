package love.duck.adapters;

import love.duck.animals.Quackable;
import love.duck.animals.Goose;

public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
