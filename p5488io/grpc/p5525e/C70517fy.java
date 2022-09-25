package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;

/* renamed from: io.grpc.e.fy */
/* compiled from: PG */
final class C70517fy implements Executor {

    /* renamed from: a */
    private final C70567hu f187906a;

    /* renamed from: b */
    private Executor f187907b;

    public C70517fy(C70567hu huVar) {
        this.f187906a = huVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Executor mo62236a() {
        if (this.f187907b == null) {
            Executor executor = (Executor) this.f187906a.mo62162a();
            C58838bb.m90867b(executor, "%s.getObject()", this.f187907b);
            this.f187907b = executor;
        }
        return this.f187907b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo62237b() {
        Executor executor = this.f187907b;
        if (executor != null) {
            this.f187907b = (Executor) this.f187906a.mo62163b(executor);
        }
    }

    public final void execute(Runnable runnable) {
        mo62236a().execute(runnable);
    }
}
