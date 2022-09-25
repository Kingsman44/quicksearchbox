package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69838g;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.b */
/* compiled from: PG */
final class C69946b implements C70123o, C69803b {

    /* renamed from: a */
    final C70130v f186436a;

    /* renamed from: b */
    final Object f186437b;

    /* renamed from: c */
    C69803b f186438c;

    /* renamed from: d */
    boolean f186439d;

    /* renamed from: e */
    final C69838g f186440e;

    public C69946b(C70130v vVar, Object obj, C69838g gVar) {
        this.f186436a = vVar;
        this.f186440e = gVar;
        this.f186437b = obj;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186439d) {
            this.f186439d = true;
            this.f186436a.mo61488d(this.f186437b);
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186439d) {
            C70101a.m102023e(th);
            return;
        }
        this.f186439d = true;
        this.f186436a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186438c, bVar)) {
            this.f186438c = bVar;
            this.f186436a.mo61460lO(this);
        }
    }

    public final void dispose() {
        this.f186438c.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186439d) {
            try {
                C69838g gVar = this.f186440e;
                this.f186437b.put(gVar.f186207b.mo25875a(obj), gVar.f186206a.mo25875a(obj));
            } catch (Throwable th) {
                this.f186438c.dispose();
                mo25987b(th);
            }
        }
    }
}
