package p5488io.p5490b.p5497e.p5501d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5500c.C69843b;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.d.a */
/* compiled from: PG */
public abstract class C69848a implements C70123o, C69843b {

    /* renamed from: a */
    protected final C70123o f186214a;

    /* renamed from: b */
    protected C69803b f186215b;

    /* renamed from: c */
    protected C69843b f186216c;

    /* renamed from: d */
    protected boolean f186217d;

    public C69848a(C70123o oVar) {
        this.f186214a = oVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186217d) {
            this.f186217d = true;
            this.f186214a.mo25986a();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186217d) {
            C70101a.m102023e(th);
            return;
        }
        this.f186217d = true;
        this.f186214a.mo25987b(th);
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186216c.mo61475c();
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186215b, bVar)) {
            this.f186215b = bVar;
            if (bVar instanceof C69843b) {
                this.f186216c = (C69843b) bVar;
            }
            this.f186214a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186215b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo61487f(Throwable th) {
        C69813f.m101292a(th);
        this.f186215b.dispose();
        mo25987b(th);
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186216c.mo61476i();
    }

    /* renamed from: j */
    public final boolean mo61477j(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
