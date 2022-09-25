package p5462h.p5465b;

import java.util.Comparator;

/* renamed from: h.b.b */
/* compiled from: PG */
public final class C69545b implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f185952a;

    public C69545b(Comparator comparator) {
        this.f185952a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.f185952a.compare(obj, obj2);
    }
}
