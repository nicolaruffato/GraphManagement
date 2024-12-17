import java.util.*;

public class Grafo<T, E> implements Iterable<Nodo<T>>{
    protected Collection<Nodo<T>> nodi;
    protected Collection<Arco<E, T>> archi;

    public Grafo() {
        nodi = new HashSet<>();
        archi = new ArrayList<>();
    }

    public boolean inserisciNodo(Nodo<T> nodo) {
        if(nodi.contains(nodo)) {
            return false;
        }
        else {
            nodi.add(nodo);
            return true;
        }
    }

    public boolean rimuoviNodo(Nodo<T> nodo) {
        return nodi.remove(nodo);
    }

    public boolean inserisciArco(Arco<E, T> arco) {
        if(!archi.contains(arco)) {
            return archi.add(arco);
        }
        else {
            return false;
        }
    }

    public boolean rimuoviArco(Arco<T, E> arco) {
        return archi.remove(arco);
    }

    public boolean contieneNodo(Nodo<T> nodo) {
        return nodi.contains(nodo);
    }

    @Override
    public Iterator<Nodo<T>> iterator() {
        return null;
    }
}
