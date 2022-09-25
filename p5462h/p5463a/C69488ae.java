package p5462h.p5463a;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.ae */
/* compiled from: PG */
class C69488ae extends C69487ad {
    /* renamed from: o */
    public static final void m100808o(List list) {
        C69664n.m101061g(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    /* renamed from: p */
    public static final void m100809p(List list, Comparator comparator) {
        C69664n.m101061g(list, "<this>");
        C69664n.m101061g(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
