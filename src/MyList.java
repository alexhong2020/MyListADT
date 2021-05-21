import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<E>{

    private static final int INITIAL_CAPACITY = 2;
    private int size;
    //private int capacity;
    private E[] theData;

    //String[] = new String[length];

    @SuppressWarnings("unchecked")
    public MyList(){
        //capacity = INITIAL_CAPACITY;
        size = 0;
        theData = (E[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public int size(){

        return size;
    }

    @Override
    public boolean isEmpty(){

        return (size == 0);
    }

    @Override
    public boolean contains(Object o) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public Iterator<E> iterator() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public Object[] toArray() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public boolean add(E e){
        if (size == theData.length){
            reallocate();
        }
        theData[size] = e;
        size++;
        return true;
    }

    private void reallocate() {
        E[] theData1 = (E[]) new Object[theData.length * 2];
        for(int i = 0; i < theData.length; i++) {
            theData1[i] = theData[i];
        }
        theData = theData1;
    }

    @Override
    public boolean remove(Object o) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public void clear() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public E get(int index) {
        return theData[index];
    }

    @Override
    public E set(int index, E element) {
        theData[index] = element;
        return theData[index];
    }

    @Override
    public void add(int index, E element) {
        if(size == theData.length){
            reallocate();
        }
        for(int i = theData.length; i > index; i--){
            theData[i] = theData[i-1];
        }
        theData[index] = element;
        size++;

    }

    @Override
    public E remove(int index) {
        E removed = theData[index];

        for(int i = index + 1; i < theData.length; i++){
            theData[i - 1] = theData[i];
        }
        size--;
        return removed;
    }

    @Override
    public int indexOf(Object o) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public int lastIndexOf(Object o) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public ListIterator<E> listIterator() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[0].getMethodName();
        throw new UnsupportedOperationException("Method '" + methodName + "' not implemented!");
    }




}
