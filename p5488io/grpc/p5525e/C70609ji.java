package p5488io.grpc.p5525e;

import java.util.concurrent.TimeUnit;
import p5488io.grpc.Status;

/* renamed from: io.grpc.e.ji */
/* compiled from: PG */
final class C70609ji implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70610jj f188200a;

    public C70609ji(C70610jj jjVar) {
        this.f188200a = jjVar;
    }

    public final void run() {
        C70608jh jhVar;
        C70624jx jxVar;
        C70625jy jyVar = this.f188200a.f188202b;
        boolean z = false;
        C70623jw s = jyVar.mo62366s(jyVar.f188266v.f188208e, false);
        synchronized (this.f188200a.f188202b.f188260p) {
            C70610jj jjVar = this.f188200a;
            jhVar = null;
            if (jjVar.f188201a.f188199c) {
                z = true;
            } else {
                C70625jy jyVar2 = jjVar.f188202b;
                jyVar2.f188266v = jyVar2.f188266v.mo62351a(s);
                C70625jy jyVar3 = this.f188200a.f188202b;
                if (!jyVar3.mo62372y(jyVar3.f188266v) || ((jxVar = this.f188200a.f188202b.f188264t) != null && !jxVar.mo62362a())) {
                    C70625jy jyVar4 = this.f188200a.f188202b;
                    jyVar4.f188266v = jyVar4.f188266v.mo62352b();
                    this.f188200a.f188202b.f188248B = null;
                } else {
                    C70625jy jyVar5 = this.f188200a.f188202b;
                    jhVar = new C70608jh(jyVar5.f188260p);
                    jyVar5.f188248B = jhVar;
                }
            }
        }
        if (z) {
            s.f188235a.mo61757c(Status.f186904b.withDescription("Unneeded hedging"));
            return;
        }
        if (jhVar != null) {
            C70625jy jyVar6 = this.f188200a.f188202b;
            jhVar.mo62348b(jyVar6.f188256l.schedule(new C70610jj(jyVar6, jhVar), jyVar6.f188258n.f187803b, TimeUnit.NANOSECONDS));
        }
        this.f188200a.f188202b.mo62370w(s);
    }
}
