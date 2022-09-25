package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70112k;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5513j.C70089j;

/* renamed from: io.b.e.e.d.ar */
/* compiled from: PG */
final class C69937ar implements C70123o, C69803b {

    /* renamed from: a */
    final C70123o f186407a;

    /* renamed from: b */
    C69803b f186408b;

    public C69937ar(C70123o oVar) {
        this.f186407a = oVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        this.f186407a.mo25988lL(C70112k.f186863a);
        this.f186407a.mo25986a();
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        C69841j.m101337b(th, "error is null");
        this.f186407a.mo25988lL(new C70112k(C70089j.m101988a(th)));
        this.f186407a.mo25986a();
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186408b, bVar)) {
            this.f186408b = bVar;
            this.f186407a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186408b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        C70123o oVar = this.f186407a;
        C69841j.m101337b(obj, "value is null");
        oVar.mo25988lL(new C70112k(obj));
    }
}
