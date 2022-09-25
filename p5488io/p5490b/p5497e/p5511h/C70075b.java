package p5488io.p5490b.p5497e.p5511h;

import org.p5649d.C72639b;
import org.p5649d.C72640c;
import p5488io.p5490b.C70094g;
import p5488io.p5490b.p5497e.p5500c.C69845d;
import p5488io.p5490b.p5497e.p5512i.C70079c;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.h.b */
/* compiled from: PG */
public abstract class C70075b implements C70094g, C69845d {

    /* renamed from: b */
    protected final C72639b f186797b;

    /* renamed from: c */
    protected C72640c f186798c;

    /* renamed from: d */
    protected C69845d f186799d;

    /* renamed from: e */
    protected boolean f186800e;

    /* renamed from: f */
    protected int f186801f;

    public C70075b(C72639b bVar) {
        this.f186797b = bVar;
    }

    /* renamed from: a */
    public final void mo61494a(C72640c cVar) {
        if (C70079c.m101977h(this.f186798c, cVar)) {
            this.f186798c = cVar;
            if (cVar instanceof C69845d) {
                this.f186799d = (C69845d) cVar;
            }
            this.f186797b.mo61494a(this);
        }
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186799d.mo61475c();
    }

    /* renamed from: e */
    public final void mo61489e(long j) {
        this.f186798c.mo61489e(j);
    }

    /* renamed from: f */
    public final void mo61497f(Throwable th) {
        if (this.f186800e) {
            C70101a.m102023e(th);
            return;
        }
        this.f186800e = true;
        this.f186797b.mo61497f(th);
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186799d.mo61476i();
    }

    /* renamed from: j */
    public final boolean mo61477j(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    /* renamed from: lK */
    public final void mo61499lK() {
        if (!this.f186800e) {
            this.f186800e = true;
            this.f186797b.mo61499lK();
        }
    }

    /* renamed from: lP */
    public final void mo61490lP() {
        this.f186798c.mo61490lP();
    }
}
