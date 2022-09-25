package p3186j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.C41076m;
import p3186j$.util.function.BinaryOperator;
import p3186j$.util.function.UnaryOperator;

/* renamed from: j$.util.concurrent.atomic.DesugarAtomicReference */
public class DesugarAtomicReference {
    public static <V> V accumulateAndGet(AtomicReference<V> atomicReference, V v, BinaryOperator<V> binaryOperator) {
        V v2;
        V apply;
        do {
            v2 = atomicReference.get();
            apply = binaryOperator.apply(v2, v);
        } while (!C41076m.m71700a(atomicReference, v2, apply));
        return apply;
    }

    public static <V> V getAndUpdate(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        do {
            v = atomicReference.get();
        } while (!C41076m.m71700a(atomicReference, v, unaryOperator.apply(v)));
        return v;
    }

    public static <V> V updateAndGet(AtomicReference<V> atomicReference, UnaryOperator<V> unaryOperator) {
        V v;
        V apply;
        do {
            v = atomicReference.get();
            apply = unaryOperator.apply(v);
        } while (!C41076m.m71700a(atomicReference, v, apply));
        return apply;
    }
}
