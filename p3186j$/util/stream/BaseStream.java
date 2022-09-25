package p3186j$.util.stream;

import java.util.Iterator;
import p3186j$.util.Spliterator;
import p3186j$.util.stream.BaseStream;

/* renamed from: j$.util.stream.BaseStream */
public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    void close();

    boolean isParallel();

    Iterator<T> iterator();

    BaseStream onClose(Runnable runnable);

    BaseStream sequential();

    Spliterator spliterator();
}
