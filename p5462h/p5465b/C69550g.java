package p5462h.p5465b;

import java.util.Comparator;
import p3186j$.util.Comparator;
import p3186j$.util.function.Function;
import p3186j$.util.function.ToDoubleFunction;
import p3186j$.util.function.ToIntFunction;
import p3186j$.util.function.ToLongFunction;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.b.g */
/* compiled from: PG */
public final class C69550g implements Comparator, p3186j$.util.Comparator {

    /* renamed from: a */
    public static final C69550g f185954a = new C69550g();

    private C69550g() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        C69664n.m101061g(comparable, "a");
        C69664n.m101061g(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator reversed() {
        return C69551h.f185955a;
    }

    public final /* synthetic */ Comparator thenComparing(Function function) {
        return Comparator.CC.$default$thenComparing((java.util.Comparator) this, function);
    }

    public final /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing(this, function, comparator);
    }

    public final /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
        return Comparator.CC.$default$thenComparing((java.util.Comparator) this, comparator);
    }

    public final /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
    }

    public final /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
    }

    public final /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
    }
}
