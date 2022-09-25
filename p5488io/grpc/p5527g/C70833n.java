package p5488io.grpc.p5527g;

import java.util.logging.Level;
import p5488io.grpc.p5525e.C70681m;
import p5488io.grpc.p5525e.C70683n;

/* renamed from: io.grpc.g.n */
/* compiled from: PG */
final class C70833n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70681m f188907a;

    public C70833n(C70681m mVar) {
        this.f188907a = mVar;
    }

    public final void run() {
        C70681m mVar = this.f188907a;
        long j = mVar.f188415a;
        long max = Math.max(j + j, j);
        if (mVar.f188416b.f188419c.compareAndSet(mVar.f188415a, max)) {
            C70683n.f188417a.logp(Level.WARNING, "io.grpc.internal.AtomicBackoff$State", "backoff", "Increased {0} to {1}", new Object[]{mVar.f188416b.f188418b, Long.valueOf(max)});
        }
    }
}
