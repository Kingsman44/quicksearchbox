package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70898m;

/* renamed from: io.grpc.e.gp */
/* compiled from: PG */
final class C70535gp extends C70407bw {

    /* renamed from: c */
    final C70148al f187932c;

    /* renamed from: d */
    final C70338di f187933d;

    /* renamed from: e */
    final C70851i f187934e;

    /* renamed from: f */
    final /* synthetic */ C70536gq f187935f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70535gp(C70536gq gqVar, C70148al alVar, C70338di diVar, C70851i iVar) {
        super(gqVar.f187938c.mo62275i(iVar), gqVar.f187938c.f188006k, iVar.f189016b);
        this.f187935f = gqVar;
        this.f187932c = alVar;
        this.f187933d = diVar;
        this.f187934e = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo62120c() {
        C70766ff ffVar = this.f187935f.f187938c.f188009n;
        ffVar.mo62446c(new C70534go(this));
        ffVar.mo62445b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo62252l() {
        C70392bh bhVar;
        C70148al a = this.f187932c.mo61696a();
        try {
            C70898m c = this.f187935f.mo62253c(this.f187933d, this.f187934e);
            synchronized (this) {
                if (this.f187629b != null) {
                    bhVar = null;
                } else {
                    C58838bb.m90866a(c, "call");
                    super.mo62123k(c);
                    bhVar = new C70392bh(this, this.f187628a);
                }
            }
            if (bhVar == null) {
                C70766ff ffVar = this.f187935f.f187938c.f188009n;
                ffVar.mo62446c(new C70534go(this));
                ffVar.mo62445b();
                return;
            }
            this.f187935f.f187938c.mo62275i(this.f187934e).execute(new C70533gn(this, bhVar));
        } finally {
            this.f187932c.mo61702f(a);
        }
    }
}
