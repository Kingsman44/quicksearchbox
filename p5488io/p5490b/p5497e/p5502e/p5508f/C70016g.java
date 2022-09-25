package p5488io.p5490b.p5497e.p5502e.p5508f;

import java.util.concurrent.atomic.AtomicInteger;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69819a;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.f.g */
/* compiled from: PG */
final class C70016g extends AtomicInteger implements C70130v, C69803b {
    private static final long serialVersionUID = 4109457741734051389L;

    /* renamed from: a */
    final C70130v f186641a;

    /* renamed from: b */
    final C69819a f186642b;

    /* renamed from: c */
    C69803b f186643c;

    public C70016g(C70130v vVar, C69819a aVar) {
        this.f186641a = vVar;
        this.f186642b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61580a() {
        if (compareAndSet(0, 1)) {
            try {
                this.f186642b.mo25795a();
            } catch (Throwable th) {
                C69813f.m101292a(th);
                C70101a.m102023e(th);
            }
        }
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186641a.mo26091b(th);
        mo61580a();
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        this.f186641a.mo61488d(obj);
        mo61580a();
    }

    public final void dispose() {
        this.f186643c.dispose();
        mo61580a();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        if (C69828d.m101308d(this.f186643c, bVar)) {
            this.f186643c = bVar;
            this.f186641a.mo61460lO(this);
        }
    }
}
