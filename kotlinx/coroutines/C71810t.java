package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71728j;
import kotlinx.coroutines.p5579e.C71729k;
import kotlinx.p5572a.C71342e;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.t */
/* compiled from: PG */
public final class C71810t {
    /* renamed from: a */
    public static final C71808r m105091a(C69577g gVar) {
        C71808r rVar;
        C71808r rVar2;
        C69664n.m101061g(gVar, "delegate");
        if (!(gVar instanceof C71728j)) {
            return new C71808r(gVar, 1);
        }
        C71728j jVar = (C71728j) gVar;
        C71342e eVar = jVar.f191206e;
        while (true) {
            Object obj = eVar.f190532a;
            rVar = null;
            if (obj == null) {
                jVar.f191206e.mo62678c(C71729k.f191208b);
                rVar2 = null;
                break;
            } else if (obj instanceof C71808r) {
                if (jVar.f191206e.mo62679d(obj, C71729k.f191208b)) {
                    rVar2 = (C71808r) obj;
                    break;
                }
            } else if (obj != C71729k.f191208b && !(obj instanceof Throwable)) {
                new StringBuilder("Inconsistent state ").append(obj);
                throw new IllegalStateException("Inconsistent state ".concat(obj.toString()));
            }
        }
        if (rVar2 != null) {
            boolean z = C71600ba.f191036a;
            Object obj2 = rVar2.f191340d.f190532a;
            if (!(obj2 instanceof C71395ab) || ((C71395ab) obj2).f190602d == null) {
                rVar2.f191339c.f190526b = 0;
                rVar2.f191340d.mo62678c(C71426b.f190635a);
                rVar = rVar2;
            } else {
                rVar2.mo63047x();
            }
            if (rVar != null) {
                return rVar;
            }
        }
        return new C71808r(gVar, 2);
    }

    /* renamed from: b */
    public static final void m105092b(C71807q qVar, C71615bp bpVar) {
        qVar.mo63035f(new C71616bq(bpVar));
    }

    /* renamed from: c */
    public static final void m105093c(C71807q qVar, C71696ad adVar) {
        qVar.mo63035f(new C71675dk(adVar));
    }
}
