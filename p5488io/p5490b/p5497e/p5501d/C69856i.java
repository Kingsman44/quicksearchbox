package p5488io.p5490b.p5497e.p5501d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69819a;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.d.i */
/* compiled from: PG */
public final class C69856i implements C70123o, C69803b {

    /* renamed from: a */
    final C70123o f186228a;

    /* renamed from: b */
    final C69821c f186229b;

    /* renamed from: c */
    final C69819a f186230c;

    /* renamed from: d */
    C69803b f186231d;

    public C69856i(C70123o oVar, C69821c cVar, C69819a aVar) {
        this.f186228a = oVar;
        this.f186229b = cVar;
        this.f186230c = aVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (this.f186231d != C69828d.f186198a) {
            this.f186231d = C69828d.f186198a;
            this.f186228a.mo25986a();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186231d != C69828d.f186198a) {
            this.f186231d = C69828d.f186198a;
            this.f186228a.mo25987b(th);
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        try {
            this.f186229b.mo25818a(bVar);
            if (C69828d.m101308d(this.f186231d, bVar)) {
                this.f186231d = bVar;
                this.f186228a.mo26850d(this);
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            bVar.dispose();
            this.f186231d = C69828d.f186198a;
            C69829e.m101316g(th, this.f186228a);
        }
    }

    public final void dispose() {
        C69803b bVar = this.f186231d;
        if (bVar != C69828d.f186198a) {
            this.f186231d = C69828d.f186198a;
            try {
                this.f186230c.mo25795a();
            } catch (Throwable th) {
                C69813f.m101292a(th);
                C70101a.m102023e(th);
            }
            bVar.dispose();
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        this.f186228a.mo25988lL(obj);
    }
}
