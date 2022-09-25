package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5500c.C69843b;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5509f.C70038d;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.x */
/* compiled from: PG */
final class C69994x extends AtomicReference implements C70123o {
    private static final long serialVersionUID = -4606175640614850599L;

    /* renamed from: a */
    final long f186553a;

    /* renamed from: b */
    final C69996z f186554b;

    /* renamed from: c */
    volatile boolean f186555c;

    /* renamed from: d */
    volatile C69847f f186556d;

    /* renamed from: e */
    int f186557e;

    public C69994x(C69996z zVar, long j) {
        this.f186553a = j;
        this.f186554b = zVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        this.f186555c = true;
        this.f186554b.mo61557f();
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (C70085f.m101987d(this.f186554b.f186566i, th)) {
            C69996z zVar = this.f186554b;
            boolean z = zVar.f186561d;
            zVar.mo61562k();
            this.f186555c = true;
            this.f186554b.mo61557f();
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101307c(this, bVar) && (bVar instanceof C69843b)) {
            C69843b bVar2 = (C69843b) bVar;
            int lM = bVar2.mo61478lM(7);
            if (lM == 1) {
                this.f186557e = 1;
                this.f186556d = bVar2;
                this.f186555c = true;
                this.f186554b.mo61557f();
            } else if (lM == 2) {
                this.f186557e = 2;
                this.f186556d = bVar2;
            }
        }
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (this.f186557e == 0) {
            C69996z zVar = this.f186554b;
            if (zVar.get() != 0 || !zVar.compareAndSet(0, 1)) {
                C69847f fVar = this.f186556d;
                if (fVar == null) {
                    fVar = new C70038d(zVar.f186563f);
                    this.f186556d = fVar;
                }
                fVar.mo61477j(obj);
                if (zVar.getAndIncrement() != 0) {
                    return;
                }
            } else {
                zVar.f186560c.mo25988lL(obj);
                if (zVar.decrementAndGet() == 0) {
                    return;
                }
            }
            zVar.mo61558g();
            return;
        }
        this.f186554b.mo61557f();
    }
}
