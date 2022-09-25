package dagger.p5294a;

import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.a.e */
/* compiled from: PG */
public final class C68219e implements C69464a, C68214a {

    /* renamed from: a */
    private static final Object f184579a = new Object();

    /* renamed from: b */
    private volatile C69464a f184580b;

    /* renamed from: c */
    private volatile Object f184581c = f184579a;

    private C68219e(C69464a aVar) {
        this.f184580b = aVar;
    }

    /* renamed from: a */
    public static C68214a m98518a(C69464a aVar) {
        if (aVar instanceof C68214a) {
            return (C68214a) aVar;
        }
        aVar.getClass();
        return new C68219e(aVar);
    }

    /* renamed from: b */
    public final Object mo17428b() {
        Object obj = this.f184581c;
        Object obj2 = f184579a;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f184581c;
                if (obj == obj2) {
                    obj = this.f184580b.mo17428b();
                    Object obj3 = this.f184581c;
                    if (obj3 != obj2) {
                        if (obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                    }
                    this.f184581c = obj;
                    this.f184580b = null;
                }
            }
        }
        return obj;
    }

    /* renamed from: c */
    public static C69464a m98519c(C69464a aVar) {
        aVar.getClass();
        if (aVar instanceof C68219e) {
            return aVar;
        }
        return new C68219e(aVar);
    }
}
