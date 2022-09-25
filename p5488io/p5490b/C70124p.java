package p5488io.p5490b;

import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5510g.C70067t;

/* renamed from: io.b.p */
/* compiled from: PG */
final class C70124p implements Runnable, C69803b {

    /* renamed from: a */
    final Runnable f186888a;

    /* renamed from: b */
    final C70127s f186889b;

    /* renamed from: c */
    Thread f186890c;

    public C70124p(Runnable runnable, C70127s sVar) {
        this.f186888a = runnable;
        this.f186889b = sVar;
    }

    public final void dispose() {
        if (this.f186890c == Thread.currentThread()) {
            C70127s sVar = this.f186889b;
            if (sVar instanceof C70067t) {
                C70067t tVar = (C70067t) sVar;
                if (!tVar.f186783c) {
                    tVar.f186783c = true;
                    tVar.f186782b.shutdown();
                    return;
                }
                return;
            }
        }
        this.f186889b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final void run() {
        this.f186890c = Thread.currentThread();
        try {
            this.f186888a.run();
        } finally {
            dispose();
            this.f186890c = null;
        }
    }
}
