package kotlinx.coroutines.p5583i;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71396ac;
import kotlinx.coroutines.C71400ag;
import kotlinx.coroutines.C71417ar;
import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.C71615bp;
import kotlinx.coroutines.C71641cn;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71809s;
import kotlinx.coroutines.p5579e.C71693aa;
import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71703ak;
import kotlinx.coroutines.p5579e.C71707ao;
import kotlinx.coroutines.p5579e.C71719b;
import kotlinx.coroutines.p5579e.C71721c;
import kotlinx.coroutines.p5579e.C71722d;
import kotlinx.coroutines.p5579e.C71740v;
import kotlinx.coroutines.p5579e.C71741w;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.C69692j;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.i.f */
/* compiled from: PG */
public final class C71780f extends C71740v implements C71775a, C71783i, C69577g, C69566d {

    /* renamed from: a */
    public final C71342e f191298a = new C71342e(C71784j.f191302a, C71343f.f190534a);

    /* renamed from: b */
    private final C69577g f191299b;

    /* renamed from: c */
    private final C71342e f191300c = new C71342e(C71784j.f191304c, C71343f.f190534a);

    /* renamed from: d */
    private final C71342e f191301d = new C71342e((Object) null, C71343f.f190534a);

    public C71780f(C69577g gVar) {
        this.f191299b = gVar;
    }

    /* renamed from: A */
    public final boolean mo63015A() {
        Object u = mo63018u((C71693aa) null);
        if (u == C71809s.f191342a) {
            return true;
        }
        if (u == null) {
            return false;
        }
        new StringBuilder("Unexpected trySelectIdempotent result ").append(u);
        throw new IllegalStateException("Unexpected trySelectIdempotent result ".concat(u.toString()));
    }

    /* renamed from: a */
    public final void mo63014a(C71781g gVar, C69630p pVar) {
        C69664n.m101061g(gVar, "<this>");
        gVar.mo62739h(this, pVar);
    }

    /* renamed from: eL */
    public final StackTraceElement mo61335eL() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [h.c.g, h.c.b.a.d] */
    /* renamed from: eM */
    public final C69566d mo61336eM() {
        ? r0 = this.f191299b;
        if (r0 instanceof C69566d) {
            return r0;
        }
        return null;
    }

    /* renamed from: f */
    public final Object mo63016f() {
        C71643cp cpVar;
        if (!mo63023z() && (cpVar = (C71643cp) mo61340lY().get(C71643cp.f191083c)) != null) {
            C71615bp b = C71641cn.m104622b(cpVar, true, new C71779e(this), 2);
            this.f191301d.mo62678c(b);
            if (mo63023z()) {
                b.mo62732lT();
            }
        }
        Object obj = this.f191300c.f190532a;
        if (obj == C71784j.f191304c) {
            if (this.f191300c.mo62679d(C71784j.f191304c, C69554a.COROUTINE_SUSPENDED)) {
                return C69554a.COROUTINE_SUSPENDED;
            }
            obj = this.f191300c.f190532a;
        }
        if (obj == C71784j.f191305d) {
            throw new IllegalStateException("Already resumed");
        } else if (!(obj instanceof C71396ac)) {
            return obj;
        } else {
            throw ((C71396ac) obj).f190604b;
        }
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        return this.f191299b.mo61340lY();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [h.c.g, h.c.b.a.d] */
    /* renamed from: mb */
    public final void mo61338mb(Object obj) {
        boolean z = C71600ba.f191036a;
        C71342e eVar = this.f191300c;
        while (true) {
            Object obj2 = eVar.f190532a;
            if (obj2 == C71784j.f191304c) {
                if (this.f191300c.mo62679d(C71784j.f191304c, C71400ag.m104165b(obj, (C69626l) null))) {
                    return;
                }
            } else {
                C69554a aVar = C69554a.COROUTINE_SUSPENDED;
                if (obj2 != aVar) {
                    throw new IllegalStateException("Already resumed");
                } else if (this.f191300c.mo62679d(aVar, C71784j.f191305d)) {
                    if (obj instanceof C69692j) {
                        ? r0 = this.f191299b;
                        Throwable a = C69702k.m101124a(obj);
                        C69664n.m101058d(a);
                        if (C71600ba.f191037b && (r0 instanceof C69566d)) {
                            a = C71707ao.m104840a(a, r0);
                        }
                        r0.mo61338mb(C69714l.m101133a(a));
                        return;
                    }
                    this.f191299b.mo61338mb(obj);
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    public final Object mo63017t(C71719b bVar) {
        C69664n.m101061g(bVar, "desc");
        return new C71776b(this, bVar).mo62930d((Object) null);
    }

    public final String toString() {
        Object obj = this.f191298a.f190532a;
        Object obj2 = this.f191300c.f190532a;
        return "SelectInstance(state=" + obj + ", result=" + obj2 + ")";
    }

    /* renamed from: u */
    public final Object mo63018u(C71693aa aaVar) {
        C71342e eVar = this.f191298a;
        while (true) {
            Object obj = eVar.f190532a;
            if (obj == C71784j.f191302a) {
                if (aaVar != null) {
                    C71778d dVar = new C71778d(aaVar);
                    if (this.f191298a.mo62679d(C71784j.f191302a, dVar)) {
                        Object d = dVar.mo62930d(this);
                        if (d != null) {
                            return d;
                        }
                    }
                } else if (this.f191298a.mo62679d(C71784j.f191302a, (Object) null)) {
                    break;
                }
            } else if (obj instanceof C71703ak) {
                if (aaVar != null) {
                    C71722d e = aaVar.f191154c.mo62973e();
                    if ((e instanceof C71776b) && ((C71776b) e).f191292a == this) {
                        throw new IllegalStateException("Cannot use matching select clauses on the same object");
                    } else if (e.mo62963h((C71703ak) obj)) {
                        return C71721c.f191196b;
                    }
                }
                ((C71703ak) obj).mo62930d(this);
            } else if (aaVar != null && obj == aaVar.f191154c) {
                return C71809s.f191342a;
            } else {
                return null;
            }
        }
        mo63020w();
        return C71809s.f191342a;
    }

    /* renamed from: v */
    public final void mo63019v(C71615bp bpVar) {
        C71777c cVar = new C71777c(bpVar);
        if (!mo63023z()) {
            mo62948o(cVar);
            if (!mo63023z()) {
                return;
            }
        }
        bpVar.mo62732lT();
    }

    /* renamed from: w */
    public final void mo63020w() {
        C71615bp bpVar = (C71615bp) this.f191301d.f190532a;
        if (bpVar != null) {
            bpVar.mo62732lT();
        }
        Object j = mo62941j();
        C69664n.m101059e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        for (C71696ad adVar = (C71696ad) j; !C69664n.m101066l(adVar, this); adVar = C71741w.m104908a(adVar.mo62941j())) {
            if (adVar instanceof C71777c) {
                ((C71777c) adVar).f191295a.mo62732lT();
            }
        }
    }

    /* renamed from: x */
    public final void mo63021x(Throwable th) {
        if (mo63015A()) {
            mo61338mb(C69714l.m101133a(th));
        } else if (!(th instanceof CancellationException)) {
            Object f = mo63016f();
            if (f instanceof C71396ac) {
                Throwable th2 = ((C71396ac) f).f190604b;
                if (C71600ba.f191037b) {
                    th2 = C71707ao.m104842c(th2);
                }
                if (th2 == (!C71600ba.f191037b ? th : C71707ao.m104842c(th))) {
                    return;
                }
            }
            C71417ar.m104192b(mo61340lY(), th);
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [h.c.g, h.c.b.a.d] */
    /* renamed from: y */
    public final void mo63022y(Throwable th) {
        C69664n.m101061g(th, "exception");
        boolean z = C71600ba.f191036a;
        C71342e eVar = this.f191300c;
        while (true) {
            Object obj = eVar.f190532a;
            if (obj == C71784j.f191304c) {
                ? r2 = this.f191299b;
                if (this.f191300c.mo62679d(C71784j.f191304c, new C71396ac((!C71600ba.f191037b || !(r2 instanceof C69566d)) ? th : C71707ao.m104840a(th, r2), false))) {
                    return;
                }
            } else {
                C69554a aVar = C69554a.COROUTINE_SUSPENDED;
                if (obj != aVar) {
                    throw new IllegalStateException("Already resumed");
                } else if (this.f191300c.mo62679d(aVar, C71784j.f191305d)) {
                    C69555b.m100961b(this.f191299b).mo61338mb(C69714l.m101133a(th));
                    return;
                }
            }
        }
    }

    /* renamed from: z */
    public final boolean mo63023z() {
        C71342e eVar = this.f191298a;
        while (true) {
            Object obj = eVar.f190532a;
            if (obj == C71784j.f191302a) {
                return false;
            }
            if (!(obj instanceof C71703ak)) {
                return true;
            }
            ((C71703ak) obj).mo62930d(this);
        }
    }
}
