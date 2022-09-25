package p5488io.p5490b.p5497e.p5510g;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.p5490b.C70127s;
import p5488io.p5490b.p5494b.C69802a;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69829e;

/* renamed from: io.b.e.g.p */
/* compiled from: PG */
final class C70063p extends C70127s {

    /* renamed from: a */
    final AtomicBoolean f186767a = new AtomicBoolean();

    /* renamed from: b */
    private final C69802a f186768b;

    /* renamed from: c */
    private final C70062o f186769c;

    /* renamed from: d */
    private final C70064q f186770d;

    public C70063p(C70062o oVar) {
        C70064q qVar;
        this.f186769c = oVar;
        this.f186768b = new C69802a();
        if (!oVar.f186763c.f186192b) {
            while (true) {
                if (oVar.f186762b.isEmpty()) {
                    qVar = new C70064q(oVar.f186764d);
                    oVar.f186763c.mo61462b(qVar);
                    break;
                }
                qVar = (C70064q) oVar.f186762b.poll();
                if (qVar != null) {
                    break;
                }
            }
        } else {
            qVar = C70065r.f186774d;
        }
        this.f186770d = qVar;
    }

    /* renamed from: b */
    public final C69803b mo61456b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f186768b.f186192b) {
            return C69829e.INSTANCE;
        }
        return this.f186770d.mo61613h(runnable, j, timeUnit, this.f186768b);
    }

    public final void dispose() {
        if (this.f186767a.compareAndSet(false, true)) {
            this.f186768b.dispose();
            C70062o oVar = this.f186769c;
            C70064q qVar = this.f186770d;
            qVar.f186771a = System.nanoTime() + oVar.f186761a;
            oVar.f186762b.offer(qVar);
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
