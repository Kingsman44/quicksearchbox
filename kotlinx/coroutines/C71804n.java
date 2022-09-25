package kotlinx.coroutines;

import java.util.concurrent.Future;
import p5462h.C69788q;

/* renamed from: kotlinx.coroutines.n */
/* compiled from: PG */
final class C71804n extends C71805o {

    /* renamed from: a */
    private final Future f191336a;

    public C71804n(Future future) {
        this.f191336a = future;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        mo62733c((Throwable) obj);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final void mo62733c(Throwable th) {
        if (th != null) {
            this.f191336a.cancel(false);
        }
    }

    public final String toString() {
        Future future = this.f191336a;
        return "CancelFutureOnCancel[" + future + "]";
    }
}
