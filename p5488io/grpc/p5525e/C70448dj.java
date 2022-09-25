package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import p5488io.grpc.C70334de;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.dj */
/* compiled from: PG */
abstract class C70448dj implements C70374aq {
    /* renamed from: a */
    public void mo62080a(Status status, C70373ap apVar, C70334de deVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C70374aq mo62166b();

    /* renamed from: c */
    public final void mo62082c(C70334de deVar) {
        mo62166b().mo62082c(deVar);
    }

    /* renamed from: d */
    public final void mo62083d(C70672lr lrVar) {
        mo62166b().mo62083d(lrVar);
    }

    /* renamed from: e */
    public final void mo62084e() {
        mo62166b().mo62084e();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("delegate", mo62166b());
        return b.toString();
    }
}
