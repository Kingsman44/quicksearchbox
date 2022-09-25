package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70156at;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.c */
/* compiled from: PG */
public abstract class C70411c extends C70573i {

    /* renamed from: a */
    private boolean f187640a;

    /* renamed from: b */
    private boolean f187641b = false;

    /* renamed from: c */
    private Runnable f187642c;

    /* renamed from: d */
    private boolean f187643d;

    /* renamed from: j */
    public final C70670lp f187644j;

    /* renamed from: k */
    public C70374aq f187645k;

    /* renamed from: l */
    public C70156at f187646l = C70156at.f187007b;

    /* renamed from: m */
    public volatile boolean f187647m;

    /* renamed from: n */
    public boolean f187648n;

    protected C70411c(int i, C70670lp lpVar, C70679ly lyVar) {
        super(i, lpVar, lyVar);
        this.f187644j = lpVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final /* synthetic */ C70673ls mo62128g() {
        return this.f187645k;
    }

    /* renamed from: h */
    public final void mo62129h(Status status, C70373ap apVar, C70334de deVar) {
        if (!this.f187640a) {
            this.f187640a = true;
            this.f187644j.mo62423n();
            this.f187645k.mo62080a(status, apVar, deVar);
            C70679ly lyVar = this.f188142q;
            if (status.mo61679g()) {
                lyVar.f188410d++;
            } else {
                lyVar.f188411e++;
            }
        }
    }

    /* renamed from: i */
    public void mo62130i(boolean z) {
        C58838bb.m90884s(this.f187648n, "status should have been reported on deframer closed");
        this.f187641b = true;
        if (this.f187643d && z) {
            mo62131j(Status.f186915m.withDescription("Encountered end-of-stream mid-frame"), C70373ap.PROCESSED, true, new C70334de());
        }
        Runnable runnable = this.f187642c;
        if (runnable != null) {
            runnable.run();
            this.f187642c = null;
        }
    }

    /* renamed from: j */
    public final void mo62131j(Status status, C70373ap apVar, boolean z, C70334de deVar) {
        C58838bb.m90866a(status, "status");
        C58838bb.m90866a(deVar, "trailers");
        if (!this.f187648n || z) {
            this.f187648n = true;
            this.f187643d = status.mo61679g();
            synchronized (this.f188141p) {
                this.f188144s = true;
            }
            if (this.f187641b) {
                this.f187642c = null;
                mo62129h(status, apVar, deVar);
                return;
            }
            this.f187642c = new C70384b(this, status, apVar, deVar);
            if (z) {
                this.f188140o.close();
                return;
            }
            C70560hn hnVar = (C70560hn) this.f188140o;
            if (!hnVar.mo62312b()) {
                if (hnVar.mo62313c()) {
                    hnVar.close();
                } else {
                    hnVar.f188092f = true;
                }
            }
        }
    }
}
