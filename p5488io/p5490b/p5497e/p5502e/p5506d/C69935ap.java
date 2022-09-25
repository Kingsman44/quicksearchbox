package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5501d.C69848a;

/* renamed from: io.b.e.e.d.ap */
/* compiled from: PG */
final class C69935ap extends C69848a {

    /* renamed from: e */
    final C69822d f186405e;

    public C69935ap(C70123o oVar, C69822d dVar) {
        super(oVar);
        this.f186405e = dVar;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186217d) {
            try {
                Object a = this.f186405e.mo25875a(obj);
                C69841j.m101337b(a, "The mapper function returned a null value.");
                this.f186214a.mo25988lL(a);
            } catch (Throwable th) {
                mo61487f(th);
            }
        }
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        return 0;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        Object lN = this.f186216c.mo61479lN();
        if (lN == null) {
            return null;
        }
        Object a = this.f186405e.mo25875a(lN);
        C69841j.m101337b(a, "The mapper function returned a null value.");
        return a;
    }
}
