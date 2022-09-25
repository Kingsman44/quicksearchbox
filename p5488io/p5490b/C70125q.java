package p5488io.p5490b;

import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5513j.C70085f;

/* renamed from: io.b.q */
/* compiled from: PG */
final class C70125q implements Runnable, C69803b {

    /* renamed from: a */
    final Runnable f186891a;

    /* renamed from: b */
    final C70127s f186892b;

    /* renamed from: c */
    volatile boolean f186893c;

    public C70125q(Runnable runnable, C70127s sVar) {
        this.f186891a = runnable;
        this.f186892b = sVar;
    }

    public final void dispose() {
        this.f186893c = true;
        this.f186892b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final void run() {
        if (!this.f186893c) {
            try {
                this.f186891a.run();
            } catch (Throwable th) {
                C69813f.m101292a(th);
                this.f186892b.dispose();
                throw C70085f.m101984a(th);
            }
        }
    }
}
