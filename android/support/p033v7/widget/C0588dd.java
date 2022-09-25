package android.support.p033v7.widget;

import java.util.Comparator;

/* renamed from: android.support.v7.widget.dd */
/* compiled from: PG */
final class C0588dd implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C0590df dfVar = (C0590df) obj;
        C0590df dfVar2 = (C0590df) obj2;
        RecyclerView recyclerView = dfVar.f2292d;
        if ((recyclerView == null) != (dfVar2.f2292d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = dfVar.f2289a;
        if (z != dfVar2.f2289a) {
            return !z ? 1 : -1;
        }
        int i = dfVar2.f2290b - dfVar.f2290b;
        if (i != 0) {
            return i;
        }
        int i2 = dfVar.f2291c - dfVar2.f2291c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}
