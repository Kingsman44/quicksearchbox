package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69819a;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5500c.C69843b;
import p5488io.p5490b.p5497e.p5501d.C69849b;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.l */
/* compiled from: PG */
final class C69982l extends C69849b implements C70123o {
    private static final long serialVersionUID = 4109457741734051389L;

    /* renamed from: a */
    final C70123o f186526a;

    /* renamed from: b */
    final C69819a f186527b;

    /* renamed from: c */
    C69803b f186528c;

    /* renamed from: d */
    C69843b f186529d;

    public C69982l(C70123o oVar, C69819a aVar) {
        this.f186526a = oVar;
        this.f186527b = aVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        this.f186526a.mo25986a();
        mo61555f();
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        this.f186526a.mo25987b(th);
        mo61555f();
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186529d.mo61475c();
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186528c, bVar)) {
            this.f186528c = bVar;
            if (bVar instanceof C69843b) {
                this.f186529d = (C69843b) bVar;
            }
            this.f186526a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186528c.dispose();
        mo61555f();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61555f() {
        if (compareAndSet(0, 1)) {
            try {
                this.f186527b.mo25795a();
            } catch (Throwable th) {
                C69813f.m101292a(th);
                C70101a.m102023e(th);
            }
        }
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186529d.mo61476i();
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        this.f186526a.mo25988lL(obj);
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        return 0;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        return this.f186529d.mo61479lN();
    }
}
