package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70246bq;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70766ff;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70898m;

/* renamed from: io.grpc.e.gq */
/* compiled from: PG */
final class C70536gq extends C70888j {

    /* renamed from: a */
    public final AtomicReference f187936a = new AtomicReference(C70542gw.f187964g);

    /* renamed from: b */
    public final String f187937b;

    /* renamed from: c */
    final /* synthetic */ C70542gw f187938c;

    /* renamed from: d */
    private final C70888j f187939d = new C70527gh(this);

    public C70536gq(C70542gw gwVar, String str) {
        this.f187938c = gwVar;
        C58838bb.m90866a(str, "authority");
        this.f187937b = str;
    }

    /* renamed from: a */
    public final C70898m mo39510a(C70338di diVar, C70851i iVar) {
        if (this.f187936a.get() != C70542gw.f187964g) {
            return mo62253c(diVar, iVar);
        }
        C70766ff ffVar = this.f187938c.f188009n;
        ffVar.mo62446c(new C70530gk(this));
        ffVar.mo62445b();
        if (this.f187936a.get() != C70542gw.f187964g) {
            return mo62253c(diVar, iVar);
        }
        if (this.f187938c.f187968C.get()) {
            return new C70531gl();
        }
        C70535gp gpVar = new C70535gp(this, C70148al.m102135m(), diVar, iVar);
        C70766ff ffVar2 = this.f187938c.f188009n;
        ffVar2.mo62446c(new C70532gm(this, gpVar));
        ffVar2.mo62445b();
        return gpVar;
    }

    /* renamed from: b */
    public final String mo39511b() {
        return this.f187937b;
    }

    /* renamed from: c */
    public final C70898m mo62253c(C70338di diVar, C70851i iVar) {
        C70246bq bqVar = (C70246bq) this.f187936a.get();
        if (bqVar == null) {
            return this.f187939d.mo39510a(diVar, iVar);
        }
        if (!(bqVar instanceof C70553hg)) {
            return new C70514fv(bqVar, this.f187939d, this.f187938c.f188007l, diVar, iVar);
        }
        C70552hf b = ((C70553hg) bqVar).f188074b.mo62301b(diVar);
        if (b != null) {
            iVar = iVar.mo62569e(C70552hf.f188067a, b);
        }
        return this.f187939d.mo39510a(diVar, iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo62254d(C70246bq bqVar) {
        Collection<C70535gp> collection;
        C70246bq bqVar2 = (C70246bq) this.f187936a.get();
        this.f187936a.set(bqVar);
        if (bqVar2 == C70542gw.f187964g && (collection = this.f187938c.f188020y) != null) {
            for (C70535gp l : collection) {
                l.mo62252l();
            }
        }
    }
}
