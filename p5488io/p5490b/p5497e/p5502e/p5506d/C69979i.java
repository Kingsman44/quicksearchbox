package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.Callable;
import p5488io.p5490b.C70120l;
import p5488io.p5490b.C70122n;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.d.i */
/* compiled from: PG */
public final class C69979i extends C70120l {

    /* renamed from: a */
    final Callable f186522a;

    public C69979i(Callable callable) {
        this.f186522a = callable;
    }

    /* renamed from: q */
    public final void mo61493q(C70123o oVar) {
        try {
            C70122n nVar = (C70122n) this.f186522a.call();
            C69841j.m101337b(nVar, "null ObservableSource supplied");
            nVar.mo61539p(oVar);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            C69829e.m101316g(th, oVar);
        }
    }
}
