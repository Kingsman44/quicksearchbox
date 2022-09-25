package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5500c.C69843b;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5501d.C69849b;
import p5488io.p5490b.p5497e.p5509f.C70038d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.at */
/* compiled from: PG */
final class C69939at extends C69849b implements Runnable, C70123o {
    private static final long serialVersionUID = 6576896619930983584L;

    /* renamed from: a */
    final C70123o f186409a;

    /* renamed from: b */
    final C70127s f186410b;

    /* renamed from: c */
    final int f186411c;

    /* renamed from: d */
    C69847f f186412d;

    /* renamed from: e */
    C69803b f186413e;

    /* renamed from: f */
    Throwable f186414f;

    /* renamed from: g */
    volatile boolean f186415g;

    /* renamed from: h */
    volatile boolean f186416h;

    /* renamed from: i */
    int f186417i;

    /* renamed from: j */
    boolean f186418j;

    public C69939at(C70123o oVar, C70127s sVar, int i) {
        this.f186409a = oVar;
        this.f186410b = sVar;
        this.f186411c = i;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186415g) {
            this.f186415g = true;
            mo61525f();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186415g) {
            C70101a.m102023e(th);
            return;
        }
        this.f186414f = th;
        this.f186415g = true;
        mo61525f();
    }

    /* renamed from: c */
    public final void mo61475c() {
        this.f186412d.mo61475c();
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186413e, bVar)) {
            this.f186413e = bVar;
            if (bVar instanceof C69843b) {
                C69843b bVar2 = (C69843b) bVar;
                int lM = bVar2.mo61478lM(7);
                if (lM == 1) {
                    this.f186417i = 1;
                    this.f186412d = bVar2;
                    this.f186415g = true;
                    this.f186409a.mo26850d(this);
                    mo61525f();
                    return;
                } else if (lM == 2) {
                    this.f186417i = 2;
                    this.f186412d = bVar2;
                    this.f186409a.mo26850d(this);
                    return;
                }
            }
            this.f186412d = new C70038d(this.f186411c);
            this.f186409a.mo26850d(this);
        }
    }

    public final void dispose() {
        if (!this.f186416h) {
            this.f186416h = true;
            this.f186413e.dispose();
            this.f186410b.dispose();
            if (getAndIncrement() == 0) {
                this.f186412d.mo61475c();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61525f() {
        if (getAndIncrement() == 0) {
            this.f186410b.mo61591a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo61526g(boolean z, boolean z2, C70123o oVar) {
        if (this.f186416h) {
            this.f186412d.mo61475c();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.f186414f;
            if (th != null) {
                this.f186416h = true;
                this.f186412d.mo61475c();
                oVar.mo25987b(th);
                this.f186410b.dispose();
                return true;
            } else if (!z2) {
                return false;
            } else {
                this.f186416h = true;
                oVar.mo25986a();
                this.f186410b.dispose();
                return true;
            }
        }
    }

    /* renamed from: i */
    public final boolean mo61476i() {
        return this.f186412d.mo61476i();
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186415g) {
            if (this.f186417i != 2) {
                this.f186412d.mo61477j(obj);
            }
            mo61525f();
        }
    }

    /* renamed from: lM */
    public final int mo61478lM(int i) {
        this.f186418j = true;
        return 2;
    }

    /* renamed from: lN */
    public final Object mo61479lN() {
        return this.f186412d.mo61479lN();
    }

    public final void run() {
        if (this.f186418j) {
            int i = 1;
            while (!this.f186416h) {
                boolean z = this.f186415g;
                Throwable th = this.f186414f;
                if (!z || th == null) {
                    this.f186409a.mo25988lL((Object) null);
                    if (z) {
                        this.f186416h = true;
                        Throwable th2 = this.f186414f;
                        if (th2 != null) {
                            this.f186409a.mo25987b(th2);
                        } else {
                            this.f186409a.mo25986a();
                        }
                        this.f186410b.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f186416h = true;
                    this.f186409a.mo25987b(this.f186414f);
                    this.f186410b.dispose();
                    return;
                }
            }
            return;
        }
        C69847f fVar = this.f186412d;
        C70123o oVar = this.f186409a;
        int i2 = 1;
        while (!mo61526g(this.f186415g, fVar.mo61476i(), oVar)) {
            while (true) {
                boolean z2 = this.f186415g;
                try {
                    Object lN = fVar.mo61479lN();
                    boolean z3 = lN == null;
                    if (mo61526g(z2, z3, oVar)) {
                        return;
                    }
                    if (z3) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        oVar.mo25988lL(lN);
                    }
                } catch (Throwable th3) {
                    C69813f.m101292a(th3);
                    this.f186416h = true;
                    this.f186413e.dispose();
                    fVar.mo61475c();
                    oVar.mo25987b(th3);
                    this.f186410b.dispose();
                    return;
                }
            }
        }
    }
}
