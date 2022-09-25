package p3186j$.util.stream;

import p3186j$.util.C41038F;
import p3186j$.util.C41039G;
import p3186j$.util.C41040H;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;

/* renamed from: j$.util.stream.StreamSupport */
public final class StreamSupport {
    /* renamed from: a */
    public static DoubleStream m71937a(C41038F f) {
        return new C41312w(f, C41259i2.m72151e(f));
    }

    /* renamed from: b */
    public static IntStream m71938b(C41039G g) {
        return new C41189Q(g, C41259i2.m72151e(g));
    }

    /* renamed from: c */
    public static LongStream m71939c(C41040H h) {
        return new C41212W(h, C41259i2.m72151e(h));
    }

    public static <T> Stream<T> stream(Spliterator<T> spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new C41131B1(spliterator, C41259i2.m72151e(spliterator), z);
    }
}
