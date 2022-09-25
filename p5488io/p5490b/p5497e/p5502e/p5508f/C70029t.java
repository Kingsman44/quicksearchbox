package p5488io.p5490b.p5497e.p5502e.p5508f;

import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.f.t */
/* compiled from: PG */
final class C70029t implements C70130v {

    /* renamed from: a */
    final C70130v f186666a;

    /* renamed from: b */
    final C69822d f186667b;

    public C70029t(C70130v vVar, C69822d dVar) {
        this.f186666a = vVar;
        this.f186667b = dVar;
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186666a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        try {
            Object a = this.f186667b.mo25875a(obj);
            C69841j.m101337b(a, "The mapper function returned a null value.");
            this.f186666a.mo61488d(a);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            mo26091b(th);
        }
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        this.f186666a.mo61460lO(bVar);
    }
}
