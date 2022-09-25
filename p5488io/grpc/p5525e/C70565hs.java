package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70356e;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.hs */
/* compiled from: PG */
public final class C70565hs extends C70356e {

    /* renamed from: a */
    public final C70375ar f188119a;

    /* renamed from: b */
    public final C70338di f188120b;

    /* renamed from: c */
    public final C70334de f188121c;

    /* renamed from: d */
    public final C70851i f188122d;

    /* renamed from: e */
    public final C70148al f188123e;

    /* renamed from: f */
    public final C70906u[] f188124f;

    /* renamed from: g */
    public final Object f188125g = new Object();

    /* renamed from: h */
    public C70372ao f188126h;

    /* renamed from: i */
    public boolean f188127i;

    /* renamed from: j */
    C70432cu f188128j;

    /* renamed from: k */
    private final C70691v f188129k;

    public C70565hs(C70375ar arVar, C70338di diVar, C70334de deVar, C70851i iVar, C70691v vVar, C70906u[] uVarArr) {
        this.f188119a = arVar;
        this.f188120b = diVar;
        this.f188121c = deVar;
        this.f188122d = iVar;
        this.f188123e = C70148al.m102135m();
        this.f188129k = vVar;
        this.f188124f = uVarArr;
    }

    /* renamed from: a */
    public final void mo62072a(Status status) {
        C58838bb.m90869d(!status.mo61679g(), "Cannot fail with OK status");
        C58838bb.m90884s(!this.f188127i, "apply() or fail() already called");
        mo62319b(new C70444df(C70460dv.m102874b(status), C70373ap.PROCESSED, this.f188124f));
    }

    /* renamed from: b */
    public final void mo62319b(C70372ao aoVar) {
        boolean z;
        boolean z2 = true;
        C58838bb.m90884s(!this.f188127i, "already finalized");
        this.f188127i = true;
        synchronized (this.f188125g) {
            if (this.f188126h == null) {
                this.f188126h = aoVar;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            this.f188129k.mo62427a();
            return;
        }
        if (this.f188128j == null) {
            z2 = false;
        }
        C58838bb.m90884s(z2, "delayedStream is null");
        Runnable q = this.f188128j.mo62152q(aoVar);
        if (q != null) {
            ((C70422ck) q).f187679a.mo62153r();
        }
        this.f188129k.mo62427a();
    }
}
