package p3186j$.util;

import p3186j$.util.function.Consumer;
import p3186j$.util.function.DoubleConsumer;
import p3186j$.util.function.IntConsumer;
import p3186j$.util.function.LongConsumer;

/* renamed from: j$.util.y */
public abstract /* synthetic */ class C41333y {
    /* renamed from: c */
    public static void m72295c(C41038F f, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f.mo43448l((DoubleConsumer) consumer);
        } else if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            f.mo43448l(new C41332x(consumer));
        } else {
            C41063c0.m71673a(f.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: d */
    public static void m72296d(C41039G g, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g.mo43450g((IntConsumer) consumer);
        } else if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            g.mo43450g(new C41033A(consumer));
        } else {
            C41063c0.m71673a(g.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: e */
    public static void m72297e(C41040H h, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            h.mo43451a((LongConsumer) consumer);
        } else if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            h.mo43451a(new C41035C(consumer));
        } else {
            C41063c0.m71673a(h.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
            throw null;
        }
    }

    /* renamed from: h */
    public static boolean m72298h(C41038F f, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return f.mo43447i((DoubleConsumer) consumer);
        }
        if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            return f.mo43447i(new C41332x(consumer));
        }
        C41063c0.m71673a(f.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
        throw null;
    }

    /* renamed from: j */
    public static boolean m72299j(C41039G g, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return g.mo43449f((IntConsumer) consumer);
        }
        if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            return g.mo43449f(new C41033A(consumer));
        }
        C41063c0.m71673a(g.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
        throw null;
    }

    /* renamed from: k */
    public static boolean m72300k(C41040H h, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return h.mo43452b((LongConsumer) consumer);
        }
        if (!C41063c0.f107569a) {
            Objects.requireNonNull(consumer);
            return h.mo43452b(new C41035C(consumer));
        }
        C41063c0.m71673a(h.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
        throw null;
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
