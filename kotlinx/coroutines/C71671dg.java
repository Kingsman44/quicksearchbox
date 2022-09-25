package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p5462h.p5466c.C69553a;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5482l.C69724d;
import p5462h.p5482l.C69731k;

/* renamed from: kotlinx.coroutines.dg */
/* compiled from: PG */
public final class C71671dg extends C69553a implements C71643cp {

    /* renamed from: a */
    public static final C71671dg f191128a = new C71671dg();

    private C71671dg() {
        super(C71643cp.f191083c);
    }

    /* renamed from: mj */
    public final boolean mo62867mj() {
        return true;
    }

    /* renamed from: mk */
    public final boolean mo62868mk() {
        return false;
    }

    /* renamed from: o */
    public final Object mo62869o(C69577g gVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    /* renamed from: p */
    public final CancellationException mo62870p() {
        throw new IllegalStateException("This job is always active");
    }

    /* renamed from: q */
    public final C69731k mo62871q() {
        return C69724d.f186090a;
    }

    /* renamed from: r */
    public final C71813w mo62872r(C71815y yVar) {
        return C71672dh.f191129a;
    }

    /* renamed from: s */
    public final C71615bp mo62873s(C69626l lVar) {
        return C71672dh.f191129a;
    }

    /* renamed from: t */
    public final C71615bp mo62874t(boolean z, boolean z2, C69626l lVar) {
        return C71672dh.f191129a;
    }

    public final String toString() {
        return "NonCancellable";
    }

    /* renamed from: u */
    public final void mo62723u(CancellationException cancellationException) {
    }

    /* renamed from: x */
    public final boolean mo62875x() {
        return false;
    }

    /* renamed from: y */
    public final boolean mo62876y() {
        return false;
    }
}
