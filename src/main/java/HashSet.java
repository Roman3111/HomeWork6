import java.util.ArrayList;

public class HashSet<E> {
    private ArrayList<E> arrayList;

    public HashSet() {
        arrayList = new ArrayList<>();
    }

    public void add(E element) {
        if (!contains(element)) {
            arrayList.add(element);
        }
    }

    public boolean contains(E element) {
        return arrayList.contains(element);
    }

    public E get(int index) {
        return arrayList.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (E element : arrayList) {
            sb.append(element);
            sb.append(", ");
        }
        if (arrayList.size() > 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }
}

