package p5488io.grpc.p5525e;

import java.util.Collection;

/* renamed from: io.grpc.e.go */
/* compiled from: PG */
final class C70534go implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70535gp f187931a;

    public C70534go(C70535gp gpVar) {
        this.f187931a = gpVar;
    }

    public final void run() {
        C70535gp gpVar = this.f187931a;
        Collection collection = gpVar.f187935f.f187938c.f188020y;
        if (collection != null) {
            collection.remove(gpVar);
            if (this.f187931a.f187935f.f187938c.f188020y.isEmpty()) {
                C70542gw gwVar = this.f187931a.f187935f.f187938c;
                gwVar.f187987V.mo62188c(gwVar.f188021z, false);
                C70542gw gwVar2 = this.f187931a.f187935f.f187938c;
                gwVar2.f188020y = null;
                if (gwVar2.f187968C.get()) {
                    this.f187931a.f187935f.f187938c.f187967B.mo62274a(C70542gw.f187961d);
                }
            }
        }
    }
}
