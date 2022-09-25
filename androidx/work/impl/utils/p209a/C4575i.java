package androidx.work.impl.utils.p209a;

/* renamed from: androidx.work.impl.utils.a.i */
/* compiled from: PG */
final class C4575i extends C4567a {
    /* renamed from: a */
    public final void mo9522a(C4576j jVar, C4576j jVar2) {
        jVar.f14439c = jVar2;
    }

    /* renamed from: b */
    public final void mo9523b(C4576j jVar, Thread thread) {
        jVar.f14438b = thread;
    }

    /* renamed from: c */
    public final boolean mo9524c(C4577k kVar, C4571e eVar, C4571e eVar2) {
        synchronized (kVar) {
            if (kVar.f14445e != eVar) {
                return false;
            }
            kVar.f14445e = eVar2;
            return true;
        }
    }

    /* renamed from: d */
    public final boolean mo9525d(C4577k kVar, Object obj, Object obj2) {
        synchronized (kVar) {
            if (kVar.f14444d != obj) {
                return false;
            }
            kVar.f14444d = obj2;
            return true;
        }
    }

    /* renamed from: e */
    public final boolean mo9526e(C4577k kVar, C4576j jVar, C4576j jVar2) {
        synchronized (kVar) {
            if (kVar.f14446f != jVar) {
                return false;
            }
            kVar.f14446f = jVar2;
            return true;
        }
    }
}
