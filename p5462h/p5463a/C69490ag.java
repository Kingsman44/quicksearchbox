package p5462h.p5463a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69695c;

/* renamed from: h.a.ag */
/* compiled from: PG */
class C69490ag extends C69489af {
    /* renamed from: u */
    public static final int m100814u(List list, int i) {
        if (new C69695c(0, C69540x.m100945c(list)).mo61416c(i)) {
            return C69540x.m100945c(list) - i;
        }
        throw new IndexOutOfBoundsException("Element index " + i + " must be in range [" + new C69695c(0, C69540x.m100945c(list)) + "].");
    }

    /* renamed from: v */
    public static final List m100815v(List list) {
        C69664n.m101061g(list, "<this>");
        return new C69513bc(list);
    }

    /* renamed from: w */
    public static final List m100816w(List list) {
        C69664n.m101061g(list, "<this>");
        return new C69512bb(list);
    }
}
