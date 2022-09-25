package kotlinx.coroutines.p5573a;

import kotlinx.coroutines.C71808r;
import kotlinx.coroutines.C71810t;
import kotlinx.coroutines.p5579e.C71707ao;
import kotlinx.coroutines.p5579e.C71708ap;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.a.a */
/* compiled from: PG */
final class C71346a implements C71391x {

    /* renamed from: a */
    public final C71377j f190537a;

    /* renamed from: b */
    public Object f190538b = C71378k.f190571d;

    public C71346a(C71377j jVar) {
        this.f190537a = jVar;
    }

    /* renamed from: c */
    private static final boolean m103980c(Object obj) {
        if (!(obj instanceof C71352af)) {
            return true;
        }
        C71352af afVar = (C71352af) obj;
        if (afVar.f190545a == null) {
            return false;
        }
        throw C71707ao.m104841b(afVar.mo62700g());
    }

    /* renamed from: a */
    public final Object mo62689a(C69577g gVar) {
        Object obj = this.f190538b;
        if (obj != C71378k.f190571d) {
            return Boolean.valueOf(m103980c(obj));
        }
        Object a = this.f190537a.mo62707a();
        this.f190538b = a;
        if (a != C71378k.f190571d) {
            return Boolean.valueOf(m103980c(a));
        }
        C71808r a2 = C71810t.m105091a(C69555b.m100961b(gVar));
        C71370c cVar = new C71370c(this, a2);
        while (true) {
            if (!this.f190537a.mo62742l(cVar)) {
                Object a3 = this.f190537a.mo62707a();
                this.f190538b = a3;
                if (!(a3 instanceof C71352af)) {
                    if (a3 != C71378k.f190571d) {
                        a2.mo63036i(true, (C69626l) null);
                        break;
                    }
                } else {
                    C71352af afVar = (C71352af) a3;
                    if (afVar.f190545a == null) {
                        a2.mo61338mb(false);
                    } else {
                        a2.mo61338mb(C69714l.m101133a(afVar.mo62700g()));
                    }
                }
            } else {
                C71377j.m104076q(a2, cVar);
                break;
            }
        }
        Object n = a2.mo63043n();
        if (n == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        return n;
    }

    /* renamed from: b */
    public final Object mo62690b() {
        Object obj = this.f190538b;
        if (!(obj instanceof C71352af)) {
            C71708ap apVar = C71378k.f190571d;
            if (obj != apVar) {
                this.f190538b = apVar;
                return obj;
            }
            throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
        }
        throw C71707ao.m104841b(((C71352af) obj).mo62700g());
    }
}
