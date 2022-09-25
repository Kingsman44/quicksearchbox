package p5488io.grpc.p5525e;

import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ct */
/* compiled from: PG */
final class C70431ct implements C70374aq {

    /* renamed from: a */
    public final C70374aq f187695a;

    /* renamed from: b */
    public volatile boolean f187696b;

    /* renamed from: c */
    public List f187697c = new ArrayList();

    public C70431ct(C70374aq aqVar) {
        this.f187695a = aqVar;
    }

    /* renamed from: b */
    private final void m102764b(Runnable runnable) {
        synchronized (this) {
            if (!this.f187696b) {
                this.f187697c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: a */
    public final void mo62080a(Status status, C70373ap apVar, C70334de deVar) {
        m102764b(new C70430cs(this, status, apVar, deVar));
    }

    /* renamed from: c */
    public final void mo62082c(C70334de deVar) {
        m102764b(new C70429cr(this, deVar));
    }

    /* renamed from: d */
    public final void mo62083d(C70672lr lrVar) {
        if (this.f187696b) {
            this.f187695a.mo62083d(lrVar);
        } else {
            m102764b(new C70427cp(this, lrVar));
        }
    }

    /* renamed from: e */
    public final void mo62084e() {
        if (this.f187696b) {
            this.f187695a.mo62084e();
        } else {
            m102764b(new C70428cq(this));
        }
    }
}
