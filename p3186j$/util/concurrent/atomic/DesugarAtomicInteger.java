package p3186j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.function.IntUnaryOperator;

/* renamed from: j$.util.concurrent.atomic.DesugarAtomicInteger */
public class DesugarAtomicInteger {
    public static int getAndUpdate(AtomicInteger atomicInteger, IntUnaryOperator intUnaryOperator) {
        int i;
        do {
            i = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i, intUnaryOperator.applyAsInt(i)));
        return i;
    }
}
