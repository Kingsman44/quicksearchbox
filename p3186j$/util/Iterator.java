package p3186j$.util;

import p3186j$.util.function.Consumer;

/* renamed from: j$.util.Iterator */
public interface Iterator<E> {

    /* renamed from: j$.util.Iterator$-CC  reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static void $default$forEachRemaining(java.util.Iterator it, Consumer consumer) {
            Objects.requireNonNull(consumer);
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    /* renamed from: j$.util.Iterator$-EL  reason: invalid class name */
    public final /* synthetic */ class EL {
        public static /* synthetic */ void forEachRemaining(java.util.Iterator it, Consumer consumer) {
            if (it instanceof Iterator) {
                ((Iterator) it).forEachRemaining(consumer);
            } else {
                CC.$default$forEachRemaining(it, consumer);
            }
        }
    }

    void forEachRemaining(Consumer<? super E> consumer);

    boolean hasNext();

    E next();

    void remove();
}
