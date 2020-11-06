package Adaptor;

public interface FileReader<T> {
    public T readFile();
    public void updateFile(T t);
}
