public class MultiGrafo<T, E> extends Grafo<T, E> {

    @Override
    public boolean inserisciArco(Arco<E, T> arco) {
        return archi.add(arco);
    }
}
