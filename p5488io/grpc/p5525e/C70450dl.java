package p5488io.grpc.p5525e;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import java.util.concurrent.TimeUnit;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70898m;

/* renamed from: io.grpc.e.dl */
/* compiled from: PG */
class C70450dl extends C70286co {

    /* renamed from: a */
    public final C70286co f187761a;

    public C70450dl(C70286co coVar) {
        this.f187761a = coVar;
    }

    /* renamed from: a */
    public final C70898m mo39510a(C70338di diVar, C70851i iVar) {
        return ((C70542gw) this.f187761a).f188013r.mo39510a(diVar, iVar);
    }

    /* renamed from: b */
    public final String mo39511b() {
        return ((C70542gw) this.f187761a).f188013r.mo39511b();
    }

    /* renamed from: d */
    public final boolean mo61972d(long j, TimeUnit timeUnit) {
        return ((C70542gw) this.f187761a).f187972G.await(j, timeUnit);
    }

    /* renamed from: e */
    public final boolean mo61973e() {
        return ((C70542gw) this.f187761a).f187968C.get();
    }

    /* renamed from: f */
    public void mo61974f() {
        throw null;
    }

    /* renamed from: g */
    public void mo61975g() {
        throw null;
    }

    /* renamed from: h */
    public final void mo61976h() {
        ((C70542gw) this.f187761a).f188012q.mo62107b();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("delegate", this.f187761a);
        return b.toString();
    }
}
