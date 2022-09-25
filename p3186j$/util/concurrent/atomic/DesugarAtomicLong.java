package p3186j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.function.LongUnaryOperator;

/* renamed from: j$.util.concurrent.atomic.DesugarAtomicLong */
public class DesugarAtomicLong {
    public static long getAndUpdate(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, longUnaryOperator.applyAsLong(j)));
        return j;
    }

    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        long applyAsLong;
        do {
            j = atomicLong.get();
            applyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, applyAsLong));
        return applyAsLong;
    }
}
