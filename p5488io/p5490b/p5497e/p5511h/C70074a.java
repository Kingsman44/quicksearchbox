package p5488io.p5490b.p5497e.p5511h;

import org.p5649d.C72640c;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5500c.C69842a;
import p5488io.p5490b.p5497e.p5500c.C69845d;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.h.a */
/* compiled from: PG */
public abstract class C70074a implements C69842a, C69845d {

    /* renamed from: b */
    protected final C69842a f186792b;

    /* renamed from: c */
    protected C72640c f186793c;

    /* renamed from: d */
    protected C69845d f186794d;

    /* renamed from: e */
    protected boolean f186795e;

    /* renamed from: f */
    protected int f186796f;

    public C70074a(C69842a aVar) {
        this.f186792b = aVar;
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101977h(this.f186793c, cVar)) {
            this.f186793c = cVar;
            if (cVar instanceof C69845d) {
                this.f186794d = (C69845d) cVar;
            }
            this.f186792b.mo61494a(this);
        }
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186794d.mo61475c();
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
        this.f186793c.mo61489e(j);
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        if (this.f186795e) {
            C70101a.m102023e(th);
            return;
        }
        this.f186795e = true;
        this.f186792b.mo61497f(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo61621h(Throwable th) {
        C69813f.m101292a(th);
        this.f186793c.mo61490lP();
        mo61497f(th);
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186794d.mo61476i();
    }

    /* renamed from: j */
    public final boolean mo61477j(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        if (!this.f186795e) {
            this.f186795e = true;
            this.f186792b.mo61499lK();
        }
    }

    /* renamed from: lP */
    public final void mo61490lP() {
        this.f186793c.mo61490lP();
    }
}
