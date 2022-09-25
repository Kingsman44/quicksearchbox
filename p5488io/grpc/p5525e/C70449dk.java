package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import p5488io.grpc.C70248bs;
import p5488io.grpc.C70256c;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70906u;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.dk */
/* compiled from: PG */
abstract class C70449dk implements C70387bc {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C70387bc mo62168a();

    /* renamed from: c */
    public final C70248bs mo61901c() {
        return mo62168a().mo61901c();
    }

    /* renamed from: e */
    public C70372ao mo61824e(C70338di diVar, C70334de deVar, C70851i iVar, C70906u[] uVarArr) {
        throw null;
    }

    /* renamed from: f */
    public final Runnable mo61825f(C70555hi hiVar) {
        return mo62168a().mo61825f(hiVar);
    }

    /* renamed from: l */
    public void mo61831l(Status status) {
        mo62168a().mo61831l(status);
    }

    /* renamed from: m */
    public void mo61832m(Status status) {
        mo62168a().mo61832m(status);
    }

    /* renamed from: o */
    public final C70256c mo61932o() {
        return mo62168a().mo61932o();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("delegate", mo62168a());
        return b.toString();
    }
}
