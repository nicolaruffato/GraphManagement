public class Albero<T>{
    protected Nodo<T> radice;
    protected Grafo<T, Boolean> albero;

    public Albero() {
        radice = null;
        albero = new Grafo<>();
    }

    public boolean add(Nodo<T> nodo, Nodo<T> padre) {
        if(padre == null) {
            if(radice == null) {
                radice = nodo;
                albero.inserisciNodo(nodo);
            }
            else {
                var tmp = radice;
                radice = nodo;
                albero.inserisciNodo(nodo);
                albero.inserisciArco(new Arco<>(Boolean.TRUE, radice, tmp));
            }
        }
        else {
            if(!albero.contieneNodo(padre)) {
                return false;
            }
            albero.inserisciNodo(nodo);
            albero.inserisciArco(new Arco<>(Boolean.TRUE, padre, nodo));
        }
        return true;
    }

    public boolean remove(Nodo<T> nodo) {

    }


}
