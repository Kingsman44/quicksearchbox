package dagger.p5294a;

import p5460g.p5461a.C69464a;

/* renamed from: dagger.a.n */
/* compiled from: PG */
public final class C68228n implements C69464a {

    /* renamed from: a */
    private static final Object f184589a = new Object();

    /* renamed from: b */
    private volatile C69464a f184590b;

    /* renamed from: c */
    private volatile Object f184591c = f184589a;

    private C68228n(C69464a aVar) {
        this.f184590b = aVar;
    }

    /* renamed from: a */
    public static C69464a m98538a(C69464a aVar) {
        if ((aVar instanceof C68228n) || (aVar instanceof C68219e)) {
            return aVar;
        }
        aVar.getClass();
        return new C68228n(aVar);
    }

    /* renamed from: b */
    public final Object mo17428b() {
        Object obj = this.f184591c;
        if (obj != f184589a) {
            return obj;
        }
        C69464a aVar = this.f184590b;
        if (aVar == null) {
            return this.f184591c;
        }
        Object b = aVar.mo17428b();
        this.f184591c = b;
        this.f184590b = null;
        return b;
    }
}
