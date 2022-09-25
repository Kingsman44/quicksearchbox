package p3186j$.util;

import java.util.Comparator;
import p3186j$.util.function.Consumer;

/* renamed from: j$.util.Spliterator */
public interface Spliterator<T> {

    /* renamed from: j$.util.Spliterator$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static void $default$forEachRemaining(Spliterator spliterator, Consumer consumer) {
            do {
            } while (spliterator.tryAdvance(consumer));
        }

        public static Comparator $default$getComparator(Spliterator spliterator) {
            throw new IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(Spliterator spliterator, int i) {
            return (spliterator.characteristics() & i) == i;
        }
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer<? super T> consumer);

    Spliterator trySplit();
}
