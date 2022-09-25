package p3186j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import p3186j$.util.Comparator;
import p3186j$.util.Objects;
import p3186j$.util.Spliterator;
import p3186j$.util.function.IntFunction;

/* renamed from: j$.util.stream.T1 */
final class C41202T1 extends C41135C1 {

    /* renamed from: s */
    private final boolean f107809s;

    /* renamed from: t */
    private final Comparator f107810t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41202T1(C41232c cVar) {
        super(cVar, C41259i2.f107933q | C41259i2.f107931o);
        C41263j2 j2Var = C41263j2.REFERENCE;
        this.f107809s = true;
        this.f107810t = Comparator.CC.naturalOrder();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C41202T1(C41232c cVar, java.util.Comparator comparator) {
        super(cVar, C41259i2.f107933q | C41259i2.f107932p);
        C41263j2 j2Var = C41263j2.REFERENCE;
        this.f107809s = false;
        this.f107810t = (java.util.Comparator) Objects.requireNonNull(comparator);
    }

    /* renamed from: i0 */
    public final C41277n0 mo43779i0(Spliterator spliterator, IntFunction intFunction, C41232c cVar) {
        if (C41259i2.SORTED.mo43855g(cVar.mo43815P()) && this.f107809s) {
            return cVar.mo43818Z(spliterator, false, intFunction);
        }
        Object[] m = cVar.mo43818Z(spliterator, true, intFunction).mo43652m(intFunction);
        Arrays.sort(m, this.f107810t);
        return new C41293r0(m);
    }

    /* renamed from: l0 */
    public final C41171L1 mo43658l0(int i, C41171L1 l1) {
        Objects.requireNonNull(l1);
        if (C41259i2.SORTED.mo43855g(i) && this.f107809s) {
            return l1;
        }
        boolean g = C41259i2.SIZED.mo43855g(i);
        java.util.Comparator comparator = this.f107810t;
        return g ? new C41210V1(l1, comparator) : new C41206U1(l1, comparator);
    }
}
