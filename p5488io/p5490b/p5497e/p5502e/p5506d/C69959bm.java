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

/* renamed from: io.b.e.e.d.bm */
/* compiled from: PG */
final class C69959bm extends AtomicReference implements C70123o {
    private static final long serialVersionUID = 3837284832786408377L;

    /* renamed from: a */
    final C69961bo f186461a;

    /* renamed from: b */
    final long f186462b;

    /* renamed from: c */
    final int f186463c;

    /* renamed from: d */
    volatile C69847f f186464d;

    /* renamed from: e */
    volatile boolean f186465e;

    public C69959bm(C69961bo boVar, long j, int i) {
        this.f186461a = boVar;
        this.f186462b = j;
        this.f186463c = i;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (this.f186462b == this.f186461a.f186475j) {
            this.f186465e = true;
            this.f186461a.mo61543g();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        C69961bo boVar = this.f186461a;
        if (this.f186462b != boVar.f186475j || !C70085f.m101987d(boVar.f186470e, th)) {
            C70101a.m102023e(th);
            return;
        }
        boVar.f186473h.dispose();
        boVar.f186471f = true;
        this.f186465e = true;
        boVar.mo61543g();
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101307c(this, bVar)) {
            if (bVar instanceof C69843b) {
                C69843b bVar2 = (C69843b) bVar;
                int lM = bVar2.mo61478lM(7);
                if (lM == 1) {
                    this.f186464d = bVar2;
                    this.f186465e = true;
                    this.f186461a.mo61543g();
                    return;
                } else if (lM == 2) {
                    this.f186464d = bVar2;
                    return;
                }
            }
            this.f186464d = new C70038d(this.f186463c);
        }
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (this.f186462b == this.f186461a.f186475j) {
            if (obj != null) {
                this.f186464d.mo61477j(obj);
            }
            this.f186461a.mo61543g();
        }
    }
}
