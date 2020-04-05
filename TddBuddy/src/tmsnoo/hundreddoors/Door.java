package tmsnoo.hundreddoors;

import java.util.StringJoiner;

public class Door {

    public Door() {};

    public Door(int number) {
        this.number = number;
    }

    int number = 0 ;

    private boolean open = false;

    @Override
    public String toString() {
        return new StringJoiner(", ", Door.class.getSimpleName() + "[", "]")
                .add("number=" + number)
                .add("open=" + open)
                .toString();
    }
}
