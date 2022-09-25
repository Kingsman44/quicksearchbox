package p5488io.grpc;

import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* renamed from: io.grpc.ad */
/* compiled from: PG */
public final class C70140ad implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70141ae f186975a;

    public C70140ad(C70141ae aeVar) {
        this.f186975a = aeVar;
    }

    public final void run() {
        try {
            this.f186975a.mo61706j(new TimeoutException("context timed out"));
        } catch (Throwable th) {
            C70148al.f186991c.logp(Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
        }
    }
}
