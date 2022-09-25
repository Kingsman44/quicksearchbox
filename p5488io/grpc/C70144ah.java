package p5488io.grpc;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* renamed from: io.grpc.ah */
/* compiled from: PG */
final class C70144ah implements Runnable {

    /* renamed from: a */
    final C70142af f186985a;

    /* renamed from: b */
    public final C70148al f186986b;

    /* renamed from: c */
    private final Executor f186987c;

    public C70144ah(Executor executor, C70142af afVar, C70148al alVar) {
        this.f186987c = executor;
        this.f186985a = afVar;
        this.f186986b = alVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61709a() {
        try {
            this.f186987c.execute(this);
        } catch (Throwable th) {
            C70148al.f186991c.logp(Level.INFO, "io.grpc.Context$ExecutableListener", "deliver", "Exception notifying context listener", th);
        }
    }

    public final void run() {
        this.f186985a.mo23210a(this.f186986b);
    }
}
