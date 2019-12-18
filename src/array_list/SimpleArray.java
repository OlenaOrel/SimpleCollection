package array_list;

import java.util.Iterator;

public class SimpleArray<E> implements Simple<E> {

    private E[] values;

    public SimpleArray() {
        values = (E[]) new  Object[0];
    }

    @Override
    public boolean add(E e) {
        try {
            E[] tmp = values;
            values = (E[]) new Object[values.length +1];
            System.arraycopy(tmp, 0, values, 0, tmp.length);
            values[values.length -1] = e;
            return true;
        }catch (ClassCastException e1) { e1.printStackTrace();}
        return false;
    }

    @Override
    public void delete(int index) {
        try {
            E[] tmp = values;
            values = (E[]) new Object[values.length - 1];
            System.arraycopy(tmp, 0, values, 0, index);
            int lengthArrayAfterIndex = tmp.length - index - 1;
            System.arraycopy(tmp, index + 1, values, index, lengthArrayAfterIndex);
        } catch (ClassCastException e) { e.printStackTrace(); }
    }

    @Override
    public E get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return values.length;
    }

    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }
}
