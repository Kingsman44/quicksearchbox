package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71728j;
import kotlinx.coroutines.p5579e.C71729k;
import kotlinx.p5572a.C71342e;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.v */
/* compiled from: PG */
public final class C71812v extends C71645cr {

    /* renamed from: a */
    public final C71808r f191344a;

    public C71812v(C71808r rVar) {
        this.f191344a = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        mo62762b((Throwable) obj);
        return C69788q.f186170a;
    }

    /* renamed from: b */
    public final void mo62762b(Throwable th) {
        C71808r rVar = this.f191344a;
        Throwable r = rVar.mo62885r(mo62883e());
        C69664n.m101061g(r, "cause");
        if (rVar.mo63042B()) {
            C69577g gVar = rVar.f191337a;
            C69664n.m101059e(gVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            C71728j jVar = (C71728j) gVar;
            C69664n.m101061g(r, "cause");
            C71342e eVar = jVar.f191206e;
            while (true) {
                Object obj = eVar.f190532a;
                if (C69664n.m101066l(obj, C71729k.f191208b)) {
                    if (jVar.f191206e.mo62679d(C71729k.f191208b, r)) {
                        return;
                    }
                } else if (obj instanceof Throwable) {
                    return;
                } else {
                    if (jVar.f191206e.mo62679d(obj, (Object) null)) {
                        break;
                    }
                }
            }
        }
        rVar.mo63039l(r);
        rVar.mo63048y();
    }
}
