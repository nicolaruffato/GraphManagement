import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

public class Nodo<T> {
    private T value;

    public Nodo(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
