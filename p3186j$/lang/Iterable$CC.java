package p3186j$.lang;

import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-CC  reason: invalid class name */
public final /* synthetic */ class Iterable$CC<T> {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        Objects.requireNonNull(consumer);
        for (Object accept : iterable) {
            consumer.accept(accept);
        }
    }
}
