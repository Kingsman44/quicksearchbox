package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5579e.C71707ao;
import kotlinx.coroutines.p5579e.C71708ap;
import kotlinx.coroutines.p5579e.C71728j;
import kotlinx.coroutines.p5579e.C71729k;
import kotlinx.p5572a.C71340c;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.C69702k;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.r */
/* compiled from: PG */
public class C71808r extends C71611bl implements C71807q, C69566d {

    /* renamed from: a */
    public final C69577g f191337a;

    /* renamed from: b */
    public final C69585o f191338b;

    /* renamed from: c */
    public final C71340c f191339c = new C71340c(0, C71343f.f190534a);

    /* renamed from: d */
    public final C71342e f191340d = new C71342e(C71426b.f190635a, C71343f.f190534a);

    /* renamed from: e */
    public C71615bp f191341e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71808r(C69577g gVar, int i) {
        super(i);
        C69664n.m101061g(gVar, "delegate");
        this.f191337a = gVar;
        boolean z = C71600ba.f191036a;
        this.f191338b = gVar.mo61340lY();
    }

    /* renamed from: D */
    private final C71615bp m105056D() {
        C71643cp cpVar = (C71643cp) this.f191338b.get(C71643cp.f191083c);
        if (cpVar == null) {
            return null;
        }
        C71615bp b = C71641cn.m104622b(cpVar, true, new C71812v(this), 2);
        this.f191341e = b;
        return b;
    }

    /* renamed from: E */
    private final C71708ap m105057E(Object obj, Object obj2, C69626l lVar) {
        Object obj3;
        C71342e eVar = this.f191340d;
        do {
            obj3 = eVar.f190532a;
            if (obj3 instanceof C71673di) {
            } else if (!(obj3 instanceof C71395ab) || obj2 == null || ((C71395ab) obj3).f190602d != obj2) {
                return null;
            } else {
                boolean z = C71600ba.f191036a;
                return C71809s.f191342a;
            }
        } while (!this.f191340d.mo62679d(obj3, m105062J((C71673di) obj3, obj, this.f191046f, lVar, obj2)));
        mo63048y();
        return C71809s.f191342a;
    }

    /* renamed from: F */
    private final void m105058F(C69626l lVar, Throwable th) {
        try {
            lVar.mo5761a(th);
        } catch (Throwable th2) {
            C69585o oVar = this.f191338b;
            new StringBuilder("Exception in invokeOnCancellation handler for ").append(this);
            C71417ar.m104192b(oVar, new C71399af("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    /* renamed from: G */
    private final void m105059G() {
        C69577g gVar = this.f191337a;
        Throwable th = null;
        C71728j jVar = gVar instanceof C71728j ? (C71728j) gVar : null;
        if (jVar != null) {
            C71342e eVar = jVar.f191206e;
            while (true) {
                Object obj = eVar.f190532a;
                Object obj2 = C71729k.f191208b;
                if (obj == obj2) {
                    if (jVar.f191206e.mo62679d(obj2, this)) {
                        break;
                    }
                } else if (!(obj instanceof Throwable)) {
                    new StringBuilder("Inconsistent state ").append(obj);
                    throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)));
                } else if (jVar.f191206e.mo62679d(obj, (Object) null)) {
                    th = (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            if (th != null) {
                mo63047x();
                mo63039l(th);
            }
        }
    }

    /* renamed from: H */
    private final void m105060H(Object obj, int i, C69626l lVar) {
        Object obj2;
        C71342e eVar = this.f191340d;
        do {
            obj2 = eVar.f190532a;
            if (obj2 instanceof C71673di) {
            } else {
                if (obj2 instanceof C71811u) {
                    C71811u uVar = (C71811u) obj2;
                    if (uVar.f191343a.mo62670b()) {
                        if (lVar != null) {
                            mo63046v(lVar, uVar.f190604b);
                            return;
                        }
                        return;
                    }
                }
                new StringBuilder("Already resumed, but proposed with update ").append(obj);
                throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)));
            }
        } while (!this.f191340d.mo62679d(obj2, m105062J((C71673di) obj2, obj, i, lVar, (Object) null)));
        mo63048y();
        mo63049z(i);
    }

    /* renamed from: I */
    private static final void m105061I(C69626l lVar, Object obj) {
        throw new IllegalStateException("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj);
    }

    /* renamed from: J */
    private static final Object m105062J(C71673di diVar, Object obj, int i, C69626l lVar, Object obj2) {
        if (obj instanceof C71396ac) {
            boolean z = C71600ba.f191036a;
            return obj;
        } else if (!C71612bm.m104562b(i) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && ((!(diVar instanceof C71805o) || (diVar instanceof C71774i)) && obj2 == null)) {
                return obj;
            }
            return new C71395ab(obj, diVar instanceof C71805o ? (C71805o) diVar : null, lVar, obj2, (Throwable) null, 16);
        }
    }

    /* renamed from: A */
    public final void mo63041A() {
        C71615bp D = m105056D();
        if (D != null && mo63038k()) {
            D.mo62732lT();
            this.f191341e = C71672dh.f191129a;
        }
    }

    /* renamed from: B */
    public final boolean mo63042B() {
        if (this.f191046f != 2) {
            return false;
        }
        C69577g gVar = this.f191337a;
        C69664n.m101059e(gVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C71728j) gVar).f191206e.f190532a != null;
    }

    /* renamed from: a */
    public final Object mo63032a(Object obj, Object obj2) {
        return m105057E(obj, obj2, (C69626l) null);
    }

    /* renamed from: d */
    public final Object mo63033d(Object obj, Object obj2, C69626l lVar) {
        return m105057E(obj, obj2, lVar);
    }

    /* renamed from: e */
    public final Object mo63034e(Throwable th) {
        return m105057E(new C71396ac(th, false), (Object) null, (C69626l) null);
    }

    /* renamed from: eL */
    public final StackTraceElement mo61335eL() {
        return null;
    }

    /* renamed from: eM */
    public final C69566d mo61336eM() {
        C69577g gVar = this.f191337a;
        if (gVar instanceof C69566d) {
            return (C69566d) gVar;
        }
        return null;
    }

    /* renamed from: f */
    public final void mo63035f(C69626l lVar) {
        C71805o oVar;
        if (lVar instanceof C71805o) {
            oVar = (C71805o) lVar;
        } else {
            oVar = new C71638ck(lVar);
        }
        C71342e eVar = this.f191340d;
        while (true) {
            Object obj = eVar.f190532a;
            if (obj instanceof C71426b) {
                if (this.f191340d.mo62679d(obj, oVar)) {
                    return;
                }
            } else if (obj instanceof C71805o) {
                m105061I(lVar, obj);
            } else {
                Throwable th = null;
                if (obj instanceof C71396ac) {
                    C71396ac acVar = (C71396ac) obj;
                    if (!acVar.f190605c.mo62670b()) {
                        m105061I(lVar, obj);
                    }
                    if (obj instanceof C71811u) {
                        if (acVar != null) {
                            th = acVar.f190604b;
                        }
                        m105058F(lVar, th);
                        return;
                    }
                    return;
                } else if (obj instanceof C71395ab) {
                    C71395ab abVar = (C71395ab) obj;
                    if (abVar.f190600b != null) {
                        m105061I(lVar, obj);
                    }
                    if (!(oVar instanceof C71774i)) {
                        if (abVar.mo62754a()) {
                            m105058F(lVar, abVar.f190603e);
                            return;
                        }
                        if (this.f191340d.mo62679d(obj, C71395ab.m104161b(abVar, oVar, (Throwable) null, 29))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (!(oVar instanceof C71774i)) {
                    if (this.f191340d.mo62679d(obj, new C71395ab(obj, oVar, (C69626l) null, (Object) null, (Throwable) null, 28))) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo63036i(Object obj, C69626l lVar) {
        m105060H(obj, this.f191046f, lVar);
    }

    /* renamed from: j */
    public final void mo63037j(C71414ao aoVar, Object obj) {
        int i;
        C69577g gVar = this.f191337a;
        C71728j jVar = gVar instanceof C71728j ? (C71728j) gVar : null;
        if ((jVar != null ? jVar.f191202a : null) == aoVar) {
            i = 4;
        } else {
            i = this.f191046f;
        }
        m105060H(obj, i, (C69626l) null);
    }

    /* renamed from: k */
    public final boolean mo63038k() {
        return !(this.f191340d.f190532a instanceof C71673di);
    }

    /* renamed from: l */
    public final void mo63039l(Throwable th) {
        Object obj;
        boolean z;
        C71342e eVar = this.f191340d;
        do {
            obj = eVar.f190532a;
            if (obj instanceof C71673di) {
                z = obj instanceof C71805o;
            } else {
                return;
            }
        } while (!this.f191340d.mo62679d(obj, new C71811u(this, th, z)));
        C71805o oVar = z ? (C71805o) obj : null;
        if (oVar != null) {
            mo63045u(oVar, th);
        }
        mo63048y();
        mo63049z(this.f191046f);
    }

    /* renamed from: lY */
    public final C69585o mo61340lY() {
        return this.f191338b;
    }

    /* renamed from: m */
    public final void mo63040m() {
        boolean z = C71600ba.f191036a;
        mo63049z(this.f191046f);
    }

    /* renamed from: mb */
    public final void mo61338mb(Object obj) {
        Throwable a = C69702k.m101124a(obj);
        if (a != null) {
            if (C71600ba.f191037b) {
                a = C71707ao.m104840a(a, this);
            }
            obj = new C71396ac(a, false);
        }
        m105060H(obj, this.f191046f, (C69626l) null);
    }

    /* renamed from: n */
    public final Object mo63043n() {
        C71643cp cpVar;
        boolean B = mo63042B();
        C71340c cVar = this.f191339c;
        do {
            int i = cVar.f190526b;
            if (i != 0) {
                if (i == 2) {
                    if (B) {
                        m105059G();
                    }
                    Object obj = this.f191340d.f190532a;
                    if (obj instanceof C71396ac) {
                        Throwable th = ((C71396ac) obj).f190604b;
                        if (C71600ba.f191037b) {
                            throw C71707ao.m104840a(th, this);
                        }
                        throw th;
                    } else if (!C71612bm.m104562b(this.f191046f) || (cpVar = (C71643cp) this.f191338b.get(C71643cp.f191083c)) == null || cpVar.mo62867mj()) {
                        return mo62832o(obj);
                    } else {
                        CancellationException p = cpVar.mo62870p();
                        mo62837w(obj, p);
                        if (C71600ba.f191037b) {
                            throw C71707ao.m104840a(p, this);
                        }
                        throw p;
                    }
                } else {
                    throw new IllegalStateException("Already suspended");
                }
            }
        } while (!this.f191339c.mo62672a(0, 1));
        if (this.f191341e == null) {
            m105056D();
        }
        if (B) {
            m105059G();
        }
        return C69554a.COROUTINE_SUSPENDED;
    }

    /* renamed from: o */
    public final Object mo62832o(Object obj) {
        return obj instanceof C71395ab ? ((C71395ab) obj).f190599a : obj;
    }

    /* renamed from: p */
    public final Object mo62833p() {
        return this.f191340d.f190532a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo62884q() {
        return "CancellableContinuation";
    }

    /* renamed from: r */
    public Throwable mo62885r(C71643cp cpVar) {
        C69664n.m101061g(cpVar, "parent");
        return cpVar.mo62870p();
    }

    /* renamed from: s */
    public final Throwable mo62835s(Object obj) {
        Throwable s = super.mo62835s(obj);
        if (s == null) {
            return null;
        }
        C69577g gVar = this.f191337a;
        return (!C71600ba.f191037b || !(gVar instanceof C69566d)) ? s : C71707ao.m104840a(s, (C69566d) gVar);
    }

    /* renamed from: t */
    public final C69577g mo62836t() {
        return this.f191337a;
    }

    public final String toString() {
        String str;
        String q = mo62884q();
        String c = C71601bb.m104528c(this.f191337a);
        Object obj = this.f191340d.f190532a;
        if (obj instanceof C71673di) {
            str = "Active";
        } else {
            str = obj instanceof C71811u ? "Cancelled" : "Completed";
        }
        String b = C71601bb.m104527b(this);
        return q + "(" + c + "){" + str + "}@" + b;
    }

    /* renamed from: u */
    public final void mo63045u(C71805o oVar, Throwable th) {
        try {
            oVar.mo62733c(th);
        } catch (Throwable th2) {
            C69585o oVar2 = this.f191338b;
            new StringBuilder("Exception in invokeOnCancellation handler for ").append(this);
            C71417ar.m104192b(oVar2, new C71399af("Exception in invokeOnCancellation handler for ".concat(toString()), th2));
        }
    }

    /* renamed from: v */
    public final void mo63046v(C69626l lVar, Throwable th) {
        C69664n.m101061g(th, "cause");
        try {
            lVar.mo5761a(th);
        } catch (Throwable th2) {
            C69585o oVar = this.f191338b;
            new StringBuilder("Exception in resume onCancellation handler for ").append(this);
            C71417ar.m104192b(oVar, new C71399af("Exception in resume onCancellation handler for ".concat(toString()), th2));
        }
    }

    /* renamed from: w */
    public final void mo62837w(Object obj, Throwable th) {
        C69664n.m101061g(th, "cause");
        C71342e eVar = this.f191340d;
        while (true) {
            Object obj2 = eVar.f190532a;
            if (obj2 instanceof C71673di) {
                throw new IllegalStateException("Not completed");
            } else if (!(obj2 instanceof C71396ac)) {
                if (obj2 instanceof C71395ab) {
                    C71395ab abVar = (C71395ab) obj2;
                    if (!abVar.mo62754a()) {
                        if (this.f191340d.mo62679d(obj2, C71395ab.m104161b(abVar, (C71805o) null, th, 15))) {
                            C69664n.m101061g(th, "cause");
                            C71805o oVar = abVar.f190600b;
                            if (oVar != null) {
                                mo63045u(oVar, th);
                            }
                            C69626l lVar = abVar.f190601c;
                            if (lVar != null) {
                                mo63046v(lVar, th);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once");
                    }
                } else if (this.f191340d.mo62679d(obj2, new C71395ab(obj2, (C71805o) null, (C69626l) null, (Object) null, th, 14))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: x */
    public final void mo63047x() {
        C71615bp bpVar = this.f191341e;
        if (bpVar != null) {
            bpVar.mo62732lT();
            this.f191341e = C71672dh.f191129a;
        }
    }

    /* renamed from: y */
    public final void mo63048y() {
        if (!mo63042B()) {
            mo63047x();
        }
    }

    /* renamed from: z */
    public final void mo63049z(int i) {
        C71340c cVar = this.f191339c;
        do {
            int i2 = cVar.f190526b;
            boolean z = false;
            if (i2 != 0) {
                if (i2 == 1) {
                    boolean z2 = C71600ba.f191036a;
                    C69577g t = mo62836t();
                    if (i == 4) {
                        z = true;
                    }
                    if (z || !(t instanceof C71728j) || C71612bm.m104562b(i) != C71612bm.m104562b(this.f191046f)) {
                        C71612bm.m104561a(this, t, z);
                        return;
                    }
                    C71414ao aoVar = ((C71728j) t).f191202a;
                    C69585o lY = t.mo61340lY();
                    if (!aoVar.mo62768f(lY)) {
                        ThreadLocal threadLocal = C71687dw.f191139a;
                        C71619bt a = C71687dw.m104785a();
                        if (a.mo62847o()) {
                            a.mo62845m(this);
                            return;
                        }
                        a.mo62846n(true);
                        try {
                            C71612bm.m104561a(this, mo62836t(), true);
                            do {
                            } while (a.mo62849q());
                            return;
                        } catch (Throwable th) {
                            mo62831C(th, (Throwable) null);
                            return;
                        } finally {
                            a.mo62844l(true);
                        }
                    } else {
                        aoVar.mo62766d(lY, this);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        } while (!this.f191339c.mo62672a(0, 2));
    }
}
