package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70092f;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5509f.C70038d;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.ae */
/* compiled from: PG */
final class C69924ae extends AtomicReference implements C70130v, C69803b {
    private static final long serialVersionUID = -502562646270949838L;

    /* renamed from: a */
    final /* synthetic */ C69925af f186374a;

    public C69924ae(C69925af afVar) {
        this.f186374a = afVar;
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        C69925af afVar = this.f186374a;
        afVar.f186376b.mo61463c(this);
        if (C70085f.m101987d(afVar.f186378d, th)) {
            afVar.f186381g.dispose();
            afVar.f186376b.dispose();
            afVar.f186377c.decrementAndGet();
            afVar.mo61521g();
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        C70038d dVar;
        C69925af afVar = this.f186374a;
        afVar.f186376b.mo61463c(this);
        if (afVar.get() != 0 || !afVar.compareAndSet(0, 1)) {
            loop0:
            while (true) {
                dVar = (C70038d) afVar.f186380f.get();
                if (dVar != null) {
                    break;
                }
                C70038d dVar2 = new C70038d(C70092f.f186825a);
                AtomicReference atomicReference = afVar.f186380f;
                while (true) {
                    if (atomicReference.compareAndSet((Object) null, dVar2)) {
                        dVar = dVar2;
                        break loop0;
                    } else if (atomicReference.get() != null) {
                    }
                }
            }
            synchronized (dVar) {
                dVar.mo61477j(obj);
            }
            afVar.f186377c.decrementAndGet();
            if (afVar.getAndIncrement() != 0) {
                return;
            }
        } else {
            afVar.f186375a.mo25988lL(obj);
            int decrementAndGet = afVar.f186377c.decrementAndGet();
            C70038d dVar3 = (C70038d) afVar.f186380f.get();
            if (decrementAndGet == 0 && (dVar3 == null || dVar3.mo61476i())) {
                Throwable c = C70085f.m101986c(afVar.f186378d);
                if (c != null) {
                    afVar.f186375a.mo25987b(c);
                    return;
                } else {
                    afVar.f186375a.mo25986a();
                    return;
                }
            } else if (afVar.decrementAndGet() == 0) {
                return;
            }
        }
        afVar.mo61522h();
    }

    public final void dispose() {
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        C69828d.m101307c(this, bVar);
    }
}
