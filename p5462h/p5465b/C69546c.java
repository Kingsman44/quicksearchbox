package p5462h.p5465b;

import java.util.Comparator;

/* renamed from: h.b.c */
/* compiled from: PG */
public final class C69546c implements Comparator {

    /* renamed from: a */
    final /* synthetic */ Comparator f185953a;

    public C69546c(Comparator comparator) {
        this.f185953a = comparator;
    }

    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.f185953a.compare(obj, obj2);
    }
}
