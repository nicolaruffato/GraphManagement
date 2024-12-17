import java.util.Objects;

public class Arco<T, E> {
    private T label;
    private Nodo<E> nodo1;
    private Nodo<E> nodo2;

    public Arco(T label, Nodo<E> nodo1, Nodo<E> nodo2) {
        this.label = label;
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
    }

    public T getLabel() {
        return label;
    }

    public Pair<Nodo<E>> getNodes() {
        return new Pair<>(nodo1, nodo2);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Arco<?, ?> arco)) return false;
        return Objects.equals(label, arco.label)
                && (Objects.equals(nodo1, arco.nodo1) || Objects.equals(nodo1, arco.nodo2))
                && (Objects.equals(nodo2, arco.nodo2) || Objects.equals(nodo2, arco.nodo1));
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, nodo1, nodo2);
    }


}
