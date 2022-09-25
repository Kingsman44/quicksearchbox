package p5488io.grpc.p5525e;

import java.util.ArrayList;
import java.util.List;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70897l;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.bv */
/* compiled from: PG */
final class C70406bv extends C70897l {

    /* renamed from: a */
    public final C70897l f187623a;

    /* renamed from: b */
    public volatile boolean f187624b;

    /* renamed from: c */
    public List f187625c = new ArrayList();

    public C70406bv(C70897l lVar) {
        this.f187623a = lVar;
    }

    /* renamed from: e */
    private final void m102732e(Runnable runnable) {
        synchronized (this) {
            if (!this.f187624b) {
                this.f187625c.add(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* renamed from: b */
    public final void mo27484b(Status status, C70334de deVar) {
        m102732e(new C70404bt(this, status, deVar));
    }

    /* renamed from: c */
    public final void mo27485c(C70334de deVar) {
        if (this.f187624b) {
            this.f187623a.mo27485c(deVar);
        } else {
            m102732e(new C70402br(this, deVar));
        }
    }

    /* renamed from: d */
    public final void mo27486d() {
        if (this.f187624b) {
            this.f187623a.mo27486d();
        } else {
            m102732e(new C70405bu(this));
        }
    }

    /* renamed from: i */
    public final void mo27487i(Object obj) {
        if (this.f187624b) {
            this.f187623a.mo27487i(obj);
        } else {
            m102732e(new C70403bs(this, obj));
        }
    }
}
