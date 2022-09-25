package p5488io.p5490b.p5497e.p5502e.p5504b;

import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5500c.C69842a;
import p5488io.p5490b.p5497e.p5500c.C69845d;
import p5488io.p5490b.p5497e.p5511h.C70074a;

/* renamed from: io.b.e.e.b.m */
/* compiled from: PG */
final class C69904m extends C70074a {

    /* renamed from: a */
    final C69822d f186338a;

    public C69904m(C69842a aVar, C69822d dVar) {
        super(aVar);
        this.f186338a = dVar;
    }

    /* renamed from: d */
    public final boolean mo61486d(Object obj) {
        if (this.f186795e) {
            return false;
        }
        try {
            Object a = this.f186338a.mo25875a(obj);
            C69841j.m101337b(a, "The mapper function returned a null value.");
            return this.f186792b.mo61486d(a);
        } catch (Throwable th) {
            mo61621h(th);
            return true;
        }
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        if (!this.f186795e) {
            if (this.f186796f != 0) {
                this.f186792b.mo61498g((Object) null);
                return;
            }
            try {
                Object a = this.f186338a.mo25875a(obj);
                C69841j.m101337b(a, "The mapper function returned a null value.");
                this.f186792b.mo61498g(a);
            } catch (Throwable th) {
                mo61621h(th);
            }
        }
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        C69845d dVar = this.f186794d;
        int i2 = 0;
        if (!(dVar == null || (i & 4) != 0 || (i2 = dVar.mo61478lM(i)) == 0)) {
            this.f186796f = i2;
        }
        return i2;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        Object lN = this.f186794d.mo61479lN();
        if (lN == null) {
            return null;
        }
        Object a = this.f186338a.mo25875a(lN);
        C69841j.m101337b(a, "The mapper function returned a null value.");
        return a;
    }
}
