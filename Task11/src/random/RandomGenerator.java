package random;

import java.util.stream.Stream;

public class RandomGenerator {

    private final long a = 25214903917L;
    private final long c = 11L;
    private final long m = (long) Math.pow(2, 48);

    public Stream<Long> generateRandomStream(long seed){
        return Stream.iterate(seed, x->(a * x + c) % m).skip(1);
    }

}
