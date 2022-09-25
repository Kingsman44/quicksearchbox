package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.Callable;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5501d.C69855h;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.aj */
/* compiled from: PG */
public final class C69929aj extends C70120l implements Callable {

    /* renamed from: a */
    final Callable f186390a;

    public C69929aj(Callable callable) {
        this.f186390a = callable;
    }

    public final Object call() {
        Object call = this.f186390a.call();
        C69841j.m101337b(call, "The callable returned a null value");
        return call;
    }

    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        C69855h hVar = new C69855h(oVar);
        oVar.mo26850d(hVar);
        if (!hVar.mo25859e()) {
            try {
                Object call = this.f186390a.call();
                C69841j.m101337b(call, "Callable returned null");
                int i = hVar.get();
                if ((i & 54) == 0) {
                    C70123o oVar2 = hVar.f186226a;
                    if (i == 8) {
                        hVar.f186227b = call;
                        hVar.lazySet(16);
                        oVar2.mo25988lL((Object) null);
                    } else {
                        hVar.lazySet(2);
                        oVar2.mo25988lL(call);
                    }
                    if (hVar.get() != 4) {
                        oVar2.mo25986a();
                    }
                }
            } catch (Throwable th) {
                C69813f.m101292a(th);
                if (!hVar.mo25859e()) {
                    oVar.mo25987b(th);
                } else {
                    C70101a.m102023e(th);
                }
            }
        }
    }
}
