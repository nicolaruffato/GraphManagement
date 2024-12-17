import java.util.Objects;

public class ArcoDirezionale<T, E> extends Arco<T, E> {
    // start = nodo1 , end = nodo2
    public ArcoDirezionale(T label, Nodo<E> start, Nodo<E> end) {
        super(label, start, end);
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Arco<?, ?> arco)) return false;
        return Objects.equals(getLabel(), arco.getLabel())
                && Objects.equals(getNodes().getFirst(), arco.getNodes().getFirst())
                && Objects.equals(getNodes().getSecond(), arco.getNodes().getSecond());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
