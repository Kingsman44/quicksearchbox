package p5488io.grpc.p5525e;

import java.util.LinkedHashSet;

/* renamed from: io.grpc.e.gm */
/* compiled from: PG */
final class C70532gm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70535gp f187927a;

    /* renamed from: b */
    final /* synthetic */ C70536gq f187928b;

    public C70532gm(C70536gq gqVar, C70535gp gpVar) {
        this.f187928b = gqVar;
        this.f187927a = gpVar;
    }

    public final void run() {
        if (this.f187928b.f187936a.get() == C70542gw.f187964g) {
            C70542gw gwVar = this.f187928b.f187938c;
            if (gwVar.f188020y == null) {
                gwVar.f188020y = new LinkedHashSet();
                C70542gw gwVar2 = this.f187928b.f187938c;
                gwVar2.f187987V.mo62188c(gwVar2.f188021z, true);
            }
            this.f187928b.f187938c.f188020y.add(this.f187927a);
            return;
        }
        this.f187927a.mo62252l();
    }
}
