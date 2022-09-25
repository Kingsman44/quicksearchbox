package dagger.p5295b.p5296a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import dagger.p5295b.C68283d;
import dagger.p5295b.C68285f;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.b.a.af */
/* compiled from: PG */
public final class C68236af {

    /* renamed from: a */
    private static final C58817ah f184595a = new C68231aa();

    /* renamed from: b */
    private static final C60931s f184596b = new C68232ab();

    static {
        C68285f.m98628a(C58729pv.f156485a);
    }

    /* renamed from: a */
    public static C60870cx m98546a(C60870cx cxVar) {
        return C60846c.m92879h(C60922j.m93044g(cxVar, f184595a, C60826bg.f164896a), Throwable.class, f184596b, C60826bg.f164896a);
    }

    /* renamed from: b */
    public static C60870cx m98547b(C60870cx cxVar) {
        return C60922j.m93044g(cxVar, new C68233ac(), C60826bg.f164896a);
    }

    /* renamed from: c */
    public static C68283d m98548c(C68283d dVar, C68249j jVar) {
        if (dVar instanceof C68248i) {
            return ((C68248i) dVar).mo60298c(jVar);
        }
        new StringBuilder("entryPointViewOf called with non-CancellableProducer: ").append(dVar);
        throw new IllegalArgumentException("entryPointViewOf called with non-CancellableProducer: ".concat(String.valueOf(dVar)));
    }

    /* renamed from: d */
    public static C68283d m98549d(C68283d dVar) {
        if (dVar instanceof C68248i) {
            return ((C68248i) dVar).mo60300gr();
        }
        new StringBuilder("nonCancellationPropagatingViewOf called with non-CancellableProducer: ").append(dVar);
        throw new IllegalArgumentException("nonCancellationPropagatingViewOf called with non-CancellableProducer: ".concat(String.valueOf(dVar)));
    }

    /* renamed from: e */
    public static C68283d m98550e(C69464a aVar) {
        aVar.getClass();
        return new C68234ad(aVar);
    }

    /* renamed from: f */
    public static void m98551f(C68283d dVar, boolean z) {
        if (dVar instanceof C68248i) {
            ((C68248i) dVar).mo60299d(z);
        } else {
            new StringBuilder("cancel called with non-CancellableProducer: ").append(dVar);
            throw new IllegalArgumentException("cancel called with non-CancellableProducer: ".concat(String.valueOf(dVar)));
        }
    }
}
