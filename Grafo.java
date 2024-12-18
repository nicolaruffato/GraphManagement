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

    //da revisionare
    public boolean rimuoviNodo(Nodo<T> nodo) {
        for(var a : archi) {
            if(a.getNodes().getFirst().equals(nodo) || a.getNodes().getSecond().equals(nodo)) {
                rimuoviArco(a);
            }
        }
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

    public boolean rimuoviArco(Arco<E, T> arco) {
        return archi.remove(arco);
    }

    public boolean contieneNodo(Nodo<T> nodo) {
        return nodi.contains(nodo);
    }

    // da revisionare
    public Collection<Arco<E, T>> getArchi(Nodo<T> nodo) {
        if(!contieneNodo(nodo)) {
            return null;
        }
        Collection<Arco<E, T>> ret = new ArrayList<>();
        for(var a : archi) {
            if(a.getNodes().getFirst().equals(nodo) || a.getNodes().getSecond().equals(nodo)) {
                ret.add(a);
            }
        }
        return ret;
    }


    @Override
    public Iterator<Nodo<T>> iterator() {
        return null;
    }
}
