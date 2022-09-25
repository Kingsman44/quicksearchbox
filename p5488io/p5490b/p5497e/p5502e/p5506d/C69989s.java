package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.NoSuchElementException;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.s */
/* compiled from: PG */
final class C69989s implements C70123o, C69803b {

    /* renamed from: a */
    final C70130v f186543a;

    /* renamed from: b */
    final Object f186544b;

    /* renamed from: c */
    C69803b f186545c;

    /* renamed from: d */
    long f186546d;

    /* renamed from: e */
    boolean f186547e;

    public C69989s(C70130v vVar, Object obj) {
        this.f186543a = vVar;
        this.f186544b = obj;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186547e) {
            this.f186547e = true;
            Object obj = this.f186544b;
            if (obj != null) {
                this.f186543a.mo61488d(obj);
            } else {
                this.f186543a.mo26091b(new NoSuchElementException());
            }
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186547e) {
            C70101a.m102023e(th);
            return;
        }
        this.f186547e = true;
        this.f186543a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186545c, bVar)) {
            this.f186545c = bVar;
            this.f186543a.mo61460lO(this);
        }
    }

    public final void dispose() {
        this.f186545c.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186547e) {
            long j = this.f186546d;
            if (j == 0) {
                this.f186547e = true;
                this.f186545c.dispose();
                this.f186543a.mo61488d(obj);
                return;
            }
            this.f186546d = j + 1;
        }
    }
}
