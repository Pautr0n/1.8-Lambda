package level3;

import java.util.List;

@FunctionalInterface
public interface StudentFilter<T> {

    List<T> filter(T... args);

}
