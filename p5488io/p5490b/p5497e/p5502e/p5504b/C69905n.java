package p5488io.p5490b.p5497e.p5502e.p5504b;

import org.p5649d.C72639b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5500c.C69845d;
import p5488io.p5490b.p5497e.p5511h.C70075b;

/* renamed from: io.b.e.e.b.n */
/* compiled from: PG */
final class C69905n extends C70075b {

    /* renamed from: a */
    final C69822d f186339a;

    public C69905n(C72639b bVar, C69822d dVar) {
        super(bVar);
        this.f186339a = dVar;
    }

    /* renamed from: g */
    public final void mo61498g(Object obj) {
        if (!this.f186800e) {
            if (this.f186801f != 0) {
                this.f186797b.mo61498g((Object) null);
                return;
            }
            try {
                Object a = this.f186339a.mo25875a(obj);
                C69841j.m101337b(a, "The mapper function returned a null value.");
                this.f186797b.mo61498g(a);
            } catch (Throwable th) {
                C69813f.m101292a(th);
                this.f186798c.mo61490lP();
                mo61497f(th);
            }
        }
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        C69845d dVar = this.f186799d;
        int i2 = 0;
        if (!(dVar == null || (i & 4) != 0 || (i2 = dVar.mo61478lM(i)) == 0)) {
            this.f186801f = i2;
        }
        return i2;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        Object lN = this.f186799d.mo61479lN();
        if (lN == null) {
            return null;
        }
        Object a = this.f186339a.mo25875a(lN);
        C69841j.m101337b(a, "The mapper function returned a null value.");
        return a;
    }
}
