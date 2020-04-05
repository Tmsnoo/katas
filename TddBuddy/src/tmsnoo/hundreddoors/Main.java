package tmsnoo.hundreddoors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String... args) {
        List<Integer> noOfDoors = IntStream.rangeClosed(1, 100)
                .boxed().collect(Collectors.toList());
        List<Door> doors = noOfDoors.stream().map(i -> new Door(i)).collect(Collectors.toList());

        for (Door d : doors) {
            System.out.println(d.toString());
        }
    }
}
