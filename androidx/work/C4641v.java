package androidx.work;

import androidx.work.impl.utils.p209a.C4579m;
import java.util.concurrent.CancellationException;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: androidx.work.v */
/* compiled from: PG */
final class C4641v extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C4642w f14563a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4641v(C4642w wVar) {
        super(1);
        this.f14563a = wVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            if (!this.f14563a.f14564a.isDone()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (th instanceof CancellationException) {
            this.f14563a.f14564a.cancel(true);
        } else {
            C4579m mVar = this.f14563a.f14564a;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            mVar.mo9538f(th);
        }
        return C69788q.f186170a;
    }
}
