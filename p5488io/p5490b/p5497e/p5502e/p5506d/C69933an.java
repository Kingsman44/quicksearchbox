package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.TimeUnit;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5510g.C70048ai;

/* renamed from: io.b.e.e.d.an */
/* compiled from: PG */
public final class C69933an extends C70120l {

    /* renamed from: a */
    final C70128t f186400a;

    /* renamed from: b */
    final long f186401b;

    /* renamed from: c */
    final long f186402c;

    /* renamed from: d */
    final TimeUnit f186403d;

    public C69933an(long j, long j2, TimeUnit timeUnit, C70128t tVar) {
        this.f186401b = j;
        this.f186402c = j2;
        this.f186403d = timeUnit;
        this.f186400a = tVar;
    }

    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        C69932am amVar = new C69932am(oVar);
        oVar.mo26850d(amVar);
        C70128t tVar = this.f186400a;
        if (tVar instanceof C70048ai) {
            C70127s a = tVar.mo61458a();
            C69828d.m101307c(amVar, a);
            a.mo61662c(amVar, this.f186401b, this.f186402c, this.f186403d);
            return;
        }
        C69828d.m101307c(amVar, tVar.mo61587d(amVar, this.f186401b, this.f186402c, this.f186403d));
    }
}
