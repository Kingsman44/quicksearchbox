package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5579e.C71696ad;
import kotlinx.coroutines.p5579e.C71703ak;
import kotlinx.coroutines.p5579e.C71741w;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.C69465a;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69581k;
import p5462h.p5466c.C69582l;
import p5462h.p5466c.C69583m;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5482l.C69731k;
import p5462h.p5482l.C69735o;

/* renamed from: kotlinx.coroutines.da */
/* compiled from: PG */
public class C71665da implements C71643cp, C71815y, C71674dj {

    /* renamed from: a */
    private final C71342e f191117a;

    /* renamed from: d */
    public final C71342e f191118d;

    public C71665da(boolean z) {
        C71618bs bsVar;
        if (z) {
            bsVar = C71666db.f191125g;
        } else {
            bsVar = C71666db.f191124f;
        }
        this.f191118d = new C71342e(bsVar, C71343f.f190534a);
        this.f191117a = new C71342e((Object) null, C71343f.f190534a);
    }

    /* renamed from: R */
    public static final C71814x m104693R(C71696ad adVar) {
        while (adVar.mo62945lX()) {
            adVar = adVar.mo62943l();
        }
        while (true) {
            adVar = C71741w.m104908a(adVar.mo62941j());
            if (!adVar.mo62945lX()) {
                if (adVar instanceof C71814x) {
                    return (C71814x) adVar;
                }
                if (adVar instanceof C71670df) {
                    return null;
                }
            }
        }
    }

    /* renamed from: S */
    private final void m104694S(C71648cu cuVar) {
        C71670df dfVar = new C71670df();
        dfVar.f191160f.mo62677b(cuVar);
        dfVar.f191159e.mo62677b(cuVar);
        while (true) {
            if (cuVar.mo62941j() == cuVar) {
                if (cuVar.f191159e.mo62679d(cuVar, dfVar)) {
                    dfVar.mo62949p(cuVar);
                    break;
                }
            } else {
                break;
            }
        }
        this.f191118d.mo62679d(cuVar, C71741w.m104908a(cuVar.mo62941j()));
    }

    /* renamed from: T */
    private final boolean m104695T(Object obj, C71670df dfVar, C71648cu cuVar) {
        int i;
        C71652cy cyVar = new C71652cy(cuVar, this, obj);
        do {
            i = dfVar.mo62943l().mo62940i(cuVar, dfVar, cyVar);
            if (i == 1) {
                return true;
            }
        } while (i != 2);
        return false;
    }

    /* renamed from: U */
    private final boolean m104696U(Throwable th) {
        if (mo62915ml()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C71813w H = mo62903H();
        if (H == null || H == C71672dh.f191129a) {
            return z;
        }
        if (H.mo62923d(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private static final String m104697V(Object obj) {
        if (obj instanceof C71651cx) {
            C71651cx cxVar = (C71651cx) obj;
            if (cxVar.mo62888e()) {
                return "Cancelling";
            }
            if (cxVar.f191093b.mo62669a()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof C71636ci)) {
            return obj instanceof C71396ac ? "Cancelled" : "Completed";
        } else {
            if (((C71636ci) obj).mo62841lU()) {
                return "Active";
            }
            return "New";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009d, code lost:
        r3 = (java.lang.Throwable) r3.f186027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a1, code lost:
        if (r3 == null) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a3, code lost:
        m104702m(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a8, code lost:
        if ((r8 instanceof kotlinx.coroutines.C71814x) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00aa, code lost:
        r0 = (kotlinx.coroutines.C71814x) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ae, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00af, code lost:
        if (r0 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00b1, code lost:
        r8 = r8.mo62840lS();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b5, code lost:
        if (r8 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b7, code lost:
        r2 = m104693R(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bc, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00bd, code lost:
        if (r2 == null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c3, code lost:
        if (mo62910Q(r1, r2, r9) == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return mo62911mf(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        return kotlinx.coroutines.C71666db.f191120b;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m104698f(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.C71636ci
            if (r0 != 0) goto L_0x0007
            kotlinx.coroutines.e.ap r8 = kotlinx.coroutines.C71666db.f191119a
            return r8
        L_0x0007:
            boolean r0 = r8 instanceof kotlinx.coroutines.C71618bs
            if (r0 != 0) goto L_0x000f
            boolean r0 = r8 instanceof kotlinx.coroutines.C71648cu
            if (r0 == 0) goto L_0x0031
        L_0x000f:
            boolean r0 = r8 instanceof kotlinx.coroutines.C71814x
            if (r0 != 0) goto L_0x0031
            boolean r0 = r9 instanceof kotlinx.coroutines.C71396ac
            if (r0 != 0) goto L_0x0031
            kotlinx.coroutines.ci r8 = (kotlinx.coroutines.C71636ci) r8
            boolean r0 = kotlinx.coroutines.C71600ba.f191036a
            kotlinx.a.e r0 = r7.f191118d
            java.lang.Object r1 = kotlinx.coroutines.C71666db.m104741a(r9)
            boolean r0 = r0.mo62679d(r8, r1)
            if (r0 != 0) goto L_0x002a
            kotlinx.coroutines.e.ap r8 = kotlinx.coroutines.C71666db.f191121c
            return r8
        L_0x002a:
            r7.mo62683l(r9)
            r7.m104701j(r8, r9)
            return r9
        L_0x0031:
            kotlinx.coroutines.ci r8 = (kotlinx.coroutines.C71636ci) r8
            kotlinx.coroutines.df r0 = r7.m104700h(r8)
            if (r0 != 0) goto L_0x003d
            kotlinx.coroutines.e.ap r8 = kotlinx.coroutines.C71666db.f191121c
            goto L_0x00cc
        L_0x003d:
            boolean r1 = r8 instanceof kotlinx.coroutines.C71651cx
            r2 = 0
            if (r1 == 0) goto L_0x0046
            r1 = r8
            kotlinx.coroutines.cx r1 = (kotlinx.coroutines.C71651cx) r1
            goto L_0x0047
        L_0x0046:
            r1 = r2
        L_0x0047:
            if (r1 != 0) goto L_0x004e
            kotlinx.coroutines.cx r1 = new kotlinx.coroutines.cx
            r1.<init>(r0, r2)
        L_0x004e:
            h.f.b.ae r3 = new h.f.b.ae
            r3.<init>()
            monitor-enter(r1)
            kotlinx.a.b r4 = r1.f191093b     // Catch:{ all -> 0x00cd }
            boolean r4 = r4.mo62669a()     // Catch:{ all -> 0x00cd }
            if (r4 == 0) goto L_0x0061
            kotlinx.coroutines.e.ap r8 = kotlinx.coroutines.C71666db.f191119a     // Catch:{ all -> 0x00cd }
            monitor-exit(r1)
            goto L_0x00cc
        L_0x0061:
            kotlinx.a.b r4 = r1.f191093b     // Catch:{ all -> 0x00cd }
            r5 = 1
            r4.f190524c = r5     // Catch:{ all -> 0x00cd }
            if (r1 == r8) goto L_0x0074
            kotlinx.a.e r4 = r7.f191118d     // Catch:{ all -> 0x00cd }
            boolean r4 = r4.mo62679d(r8, r1)     // Catch:{ all -> 0x00cd }
            if (r4 != 0) goto L_0x0074
            kotlinx.coroutines.e.ap r8 = kotlinx.coroutines.C71666db.f191121c     // Catch:{ all -> 0x00cd }
            monitor-exit(r1)
            goto L_0x00cc
        L_0x0074:
            boolean r4 = kotlinx.coroutines.C71600ba.f191036a     // Catch:{ all -> 0x00cd }
            boolean r4 = r1.mo62888e()     // Catch:{ all -> 0x00cd }
            boolean r6 = r9 instanceof kotlinx.coroutines.C71396ac     // Catch:{ all -> 0x00cd }
            if (r6 == 0) goto L_0x0082
            r6 = r9
            kotlinx.coroutines.ac r6 = (kotlinx.coroutines.C71396ac) r6     // Catch:{ all -> 0x00cd }
            goto L_0x0083
        L_0x0082:
            r6 = r2
        L_0x0083:
            if (r6 == 0) goto L_0x008a
            java.lang.Throwable r6 = r6.f190604b     // Catch:{ all -> 0x00cd }
            r1.mo62887d(r6)     // Catch:{ all -> 0x00cd }
        L_0x008a:
            java.lang.Throwable r6 = r1.mo62886c()     // Catch:{ all -> 0x00cd }
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x00cd }
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x00cd }
            if (r5 == r4) goto L_0x009a
            r6 = r2
        L_0x009a:
            r3.f186027a = r6     // Catch:{ all -> 0x00cd }
            monitor-exit(r1)
            java.lang.Object r3 = r3.f186027a
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L_0x00a6
            r7.m104702m(r0, r3)
        L_0x00a6:
            boolean r0 = r8 instanceof kotlinx.coroutines.C71814x
            if (r0 == 0) goto L_0x00ae
            r0 = r8
            kotlinx.coroutines.x r0 = (kotlinx.coroutines.C71814x) r0
            goto L_0x00af
        L_0x00ae:
            r0 = r2
        L_0x00af:
            if (r0 != 0) goto L_0x00bc
            kotlinx.coroutines.df r8 = r8.mo62840lS()
            if (r8 == 0) goto L_0x00bd
            kotlinx.coroutines.x r2 = m104693R(r8)
            goto L_0x00bd
        L_0x00bc:
            r2 = r0
        L_0x00bd:
            if (r2 == 0) goto L_0x00c8
            boolean r8 = r7.mo62910Q(r1, r2, r9)
            if (r8 == 0) goto L_0x00c8
            kotlinx.coroutines.e.ap r8 = kotlinx.coroutines.C71666db.f191120b
            goto L_0x00cc
        L_0x00c8:
            java.lang.Object r8 = r7.mo62911mf(r1, r9)
        L_0x00cc:
            return r8
        L_0x00cd:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71665da.m104698f(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: g */
    private final Throwable m104699g(Object obj) {
        if (obj != null && !(obj instanceof Throwable)) {
            return ((C71674dj) obj).mo62902F();
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        return new C71644cq(mo62686mc(), (Throwable) null, this);
    }

    /* renamed from: h */
    private final C71670df m104700h(C71636ci ciVar) {
        C71670df lS = ciVar.mo62840lS();
        if (lS != null) {
            return lS;
        }
        if (ciVar instanceof C71618bs) {
            return new C71670df();
        }
        if (ciVar instanceof C71648cu) {
            m104694S((C71648cu) ciVar);
            return null;
        }
        new StringBuilder("State should have list: ").append(ciVar);
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(ciVar)));
    }

    /* renamed from: j */
    private final void m104701j(C71636ci ciVar, Object obj) {
        C71813w H = mo62903H();
        if (H != null) {
            H.mo62732lT();
            this.f191117a.mo62678c(C71672dh.f191129a);
        }
        C71399af afVar = null;
        C71396ac acVar = obj instanceof C71396ac ? (C71396ac) obj : null;
        Throwable th = acVar != null ? acVar.f190604b : null;
        if (ciVar instanceof C71648cu) {
            try {
                ((C71648cu) ciVar).mo62762b(th);
            } catch (Throwable th2) {
                mo62688me(new C71399af("Exception in completion handler " + ciVar + " for " + this, th2));
            }
        } else {
            C71670df lS = ciVar.mo62840lS();
            if (lS != null) {
                Object j = lS.mo62941j();
                C69664n.m101059e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                for (C71696ad adVar = (C71696ad) j; !C69664n.m101066l(adVar, lS); adVar = C71741w.m104908a(adVar.mo62941j())) {
                    if (adVar instanceof C71648cu) {
                        C71648cu cuVar = (C71648cu) adVar;
                        try {
                            cuVar.mo62762b(th);
                        } catch (Throwable th3) {
                            if (afVar != null) {
                                C69465a.m100953a(afVar, th3);
                            } else {
                                afVar = new C71399af("Exception in completion handler " + cuVar + " for " + this, th3);
                            }
                        }
                    }
                }
                if (afVar != null) {
                    mo62688me(afVar);
                }
            }
        }
    }

    /* renamed from: m */
    private final void m104702m(C71670df dfVar, Throwable th) {
        Object j = dfVar.mo62941j();
        C69664n.m101059e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C71399af afVar = null;
        for (C71696ad adVar = (C71696ad) j; !C69664n.m101066l(adVar, dfVar); adVar = C71741w.m104908a(adVar.mo62941j())) {
            if (adVar instanceof C71645cr) {
                C71648cu cuVar = (C71648cu) adVar;
                try {
                    cuVar.mo62762b(th);
                } catch (Throwable th2) {
                    if (afVar != null) {
                        C69465a.m100953a(afVar, th2);
                    } else {
                        afVar = new C71399af("Exception in completion handler " + cuVar + " for " + this, th2);
                    }
                }
            }
        }
        if (afVar != null) {
            mo62688me(afVar);
        }
        m104696U(th);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [h.c.g, java.lang.Object, h.c.b.a.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62900A(p5462h.p5466c.C69577g r3) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.mo62913mh()
            boolean r1 = r0 instanceof kotlinx.coroutines.C71636ci
            if (r1 != 0) goto L_0x0024
            boolean r1 = r0 instanceof kotlinx.coroutines.C71396ac
            if (r1 == 0) goto L_0x001f
            kotlinx.coroutines.ac r0 = (kotlinx.coroutines.C71396ac) r0
            java.lang.Throwable r0 = r0.f190604b
            boolean r1 = kotlinx.coroutines.C71600ba.f191037b
            if (r1 == 0) goto L_0x001e
            boolean r1 = r3 instanceof p5462h.p5466c.p5468b.p5469a.C69566d
            if (r1 != 0) goto L_0x0019
            throw r0
        L_0x0019:
            java.lang.Throwable r3 = kotlinx.coroutines.p5579e.C71707ao.m104840a(r0, r3)
            throw r3
        L_0x001e:
            throw r0
        L_0x001f:
            java.lang.Object r3 = kotlinx.coroutines.C71666db.m104742b(r0)
            return r3
        L_0x0024:
            int r0 = r2.mo62918z(r0)
            if (r0 < 0) goto L_0x0000
            kotlinx.coroutines.cv r0 = new kotlinx.coroutines.cv
            h.c.g r1 = p5462h.p5466c.p5467a.C69555b.m100961b(r3)
            r0.<init>(r1, r2)
            r0.mo63041A()
            kotlinx.coroutines.dl r1 = new kotlinx.coroutines.dl
            r1.<init>(r0)
            kotlinx.coroutines.bp r1 = r2.mo62873s(r1)
            kotlinx.coroutines.C71810t.m105092b(r0, r1)
            java.lang.Object r0 = r0.mo63043n()
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            if (r0 != r1) goto L_0x004f
            java.lang.String r1 = "frame"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r1)
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71665da.mo62900A(h.c.g):java.lang.Object");
    }

    /* renamed from: E */
    public final Object mo62901E(Object obj) {
        Object f;
        do {
            f = m104698f(mo62913mh(), obj);
            if (f == C71666db.f191119a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                C71396ac acVar = obj instanceof C71396ac ? (C71396ac) obj : null;
                if (acVar != null) {
                    th = acVar.f190604b;
                }
                throw new IllegalStateException(str, th);
            }
        } while (f == C71666db.f191121c);
        return f;
    }

    /* renamed from: F */
    public final CancellationException mo62902F() {
        Throwable th;
        Object mh = mo62913mh();
        CancellationException cancellationException = null;
        if (mh instanceof C71651cx) {
            th = ((C71651cx) mh).mo62886c();
        } else if (mh instanceof C71396ac) {
            th = ((C71396ac) mh).f190604b;
        } else if (!(mh instanceof C71636ci)) {
            th = null;
        } else {
            new StringBuilder("Cannot be cancelling child in this state: ").append(mh);
            throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(mh)));
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new C71644cq("Parent job is ".concat(m104697V(mh)), th, this) : cancellationException;
    }

    /* renamed from: H */
    public final C71813w mo62903H() {
        return (C71813w) this.f191117a.f190532a;
    }

    /* renamed from: I */
    public void mo62751I(Throwable th) {
        mo62907M(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo62904J(C71643cp cpVar) {
        boolean z = C71600ba.f191036a;
        if (cpVar == null) {
            this.f191117a.mo62678c(C71672dh.f191129a);
            return;
        }
        cpVar.mo62876y();
        C71813w r = cpVar.mo62872r(this);
        this.f191117a.mo62678c(r);
        if (mo62875x()) {
            r.mo62732lT();
            this.f191117a.mo62678c(C71672dh.f191129a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo62905K() {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [kotlinx.coroutines.i.i, h.c.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62906L(kotlinx.coroutines.p5583i.C71783i r3, p5462h.p5473f.p5474a.C69630p r4) {
        /*
            r2 = this;
        L_0x0000:
            java.lang.Object r0 = r2.mo62913mh()
            boolean r1 = r3.mo63023z()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            boolean r1 = r0 instanceof kotlinx.coroutines.C71636ci
            if (r1 != 0) goto L_0x0029
            boolean r1 = r3.mo63015A()
            if (r1 == 0) goto L_0x0028
            boolean r1 = r0 instanceof kotlinx.coroutines.C71396ac
            if (r1 == 0) goto L_0x0021
            kotlinx.coroutines.ac r0 = (kotlinx.coroutines.C71396ac) r0
            java.lang.Throwable r4 = r0.f190604b
            r3.mo63022y(r4)
            return
        L_0x0021:
            java.lang.Object r0 = kotlinx.coroutines.C71666db.m104742b(r0)
            kotlinx.coroutines.p5580f.C71754b.m104943b(r4, r0, r3)
        L_0x0028:
            return
        L_0x0029:
            int r0 = r2.mo62918z(r0)
            if (r0 != 0) goto L_0x0000
            kotlinx.coroutines.do r0 = new kotlinx.coroutines.do
            r0.<init>(r3, r4)
            kotlinx.coroutines.bp r4 = r2.mo62873s(r0)
            r3.mo63019v(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71665da.mo62906L(kotlinx.coroutines.i.i, h.f.a.p):void");
    }

    /* renamed from: M */
    public final boolean mo62907M(Object obj) {
        Object obj2 = C71666db.f191119a;
        if (mo62882lR()) {
            while (true) {
                Object mh = mo62913mh();
                if ((mh instanceof C71636ci) && (!(mh instanceof C71651cx) || !((C71651cx) mh).f191093b.mo62669a())) {
                    obj2 = m104698f(mh, new C71396ac(m104699g(obj), false));
                    if (obj2 != C71666db.f191121c) {
                        break;
                    }
                } else {
                    obj2 = C71666db.f191119a;
                }
            }
            obj2 = C71666db.f191119a;
            if (obj2 == C71666db.f191120b) {
                return true;
            }
        }
        if (obj2 == C71666db.f191119a) {
            Throwable th = null;
            Throwable th2 = null;
            while (true) {
                Object mh2 = mo62913mh();
                if (!(mh2 instanceof C71651cx)) {
                    if (!(mh2 instanceof C71636ci)) {
                        obj2 = C71666db.f191122d;
                        break;
                    }
                    if (th2 == null) {
                        th2 = m104699g(obj);
                    }
                    C71636ci ciVar = (C71636ci) mh2;
                    if (ciVar.mo62841lU()) {
                        boolean z = C71600ba.f191036a;
                        C71670df h = m104700h(ciVar);
                        if (h != null) {
                            if (this.f191118d.mo62679d(ciVar, new C71651cx(h, th2))) {
                                m104702m(h, th2);
                                obj2 = C71666db.f191119a;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Object f = m104698f(mh2, new C71396ac(th2, false));
                        if (f == C71666db.f191119a) {
                            new StringBuilder("Cannot happen in ").append(mh2);
                            throw new IllegalStateException("Cannot happen in ".concat(String.valueOf(mh2)));
                        } else if (f != C71666db.f191121c) {
                            obj2 = f;
                            break;
                        }
                    }
                } else {
                    synchronized (mh2) {
                        C71651cx cxVar = (C71651cx) mh2;
                        if (cxVar.f191094c.f190532a == C71666db.f191123e) {
                            obj2 = C71666db.f191122d;
                        } else {
                            boolean e = cxVar.mo62888e();
                            if (obj != null || !e) {
                                if (th2 == null) {
                                    th2 = m104699g(obj);
                                }
                                cxVar.mo62887d(th2);
                            }
                            Throwable c = cxVar.mo62886c();
                            if (true != e) {
                                th = c;
                            }
                            if (th != null) {
                                m104702m(((C71651cx) mh2).f191092a, th);
                            }
                            obj2 = C71666db.f191119a;
                        }
                    }
                }
            }
        }
        if (obj2 == C71666db.f191119a || obj2 == C71666db.f191120b) {
            return true;
        }
        if (obj2 == C71666db.f191122d) {
            return false;
        }
        mo62830b(obj2);
        return true;
    }

    /* renamed from: N */
    public boolean mo62801N(Throwable th) {
        C69664n.m101061g(th, "cause");
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo62907M(th) || !mo62881lQ()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public boolean mo62908O(Throwable th) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo62909P(java.lang.Object r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo62913mh()
            java.lang.Object r0 = r3.m104698f(r0, r4)
            kotlinx.coroutines.e.ap r1 = kotlinx.coroutines.C71666db.f191119a
            if (r0 != r1) goto L_0x000e
            r4 = 0
            return r4
        L_0x000e:
            kotlinx.coroutines.e.ap r1 = kotlinx.coroutines.C71666db.f191120b
            r2 = 1
            if (r0 == r1) goto L_0x001a
            kotlinx.coroutines.e.ap r1 = kotlinx.coroutines.C71666db.f191121c
            if (r0 == r1) goto L_0x0000
            r3.mo62830b(r0)
        L_0x001a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71665da.mo62909P(java.lang.Object):boolean");
    }

    /* renamed from: Q */
    public final boolean mo62910Q(C71651cx cxVar, C71814x xVar, Object obj) {
        while (C71641cn.m104622b(xVar.f191345a, false, new C71650cw(this, cxVar, xVar, obj), 1) == C71672dh.f191129a) {
            xVar = m104693R(xVar);
            if (xVar == null) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo62830b(Object obj) {
    }

    public final Object fold(Object obj, C69630p pVar) {
        C69664n.m101061g(pVar, "operation");
        return C69581k.m100994a(this, obj, pVar);
    }

    public final C69582l get(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return C69581k.m100995b(this, mVar);
    }

    public final C69583m getKey() {
        return C71643cp.f191083c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo62683l(Object obj) {
    }

    /* renamed from: lQ */
    public boolean mo62881lQ() {
        return true;
    }

    /* renamed from: lR */
    public boolean mo62882lR() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: mc */
    public String mo62686mc() {
        return "Job was cancelled";
    }

    /* renamed from: md */
    public String mo62687md() {
        return C71601bb.m104526a(this);
    }

    /* renamed from: me */
    public void mo62688me(Throwable th) {
        throw th;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b0  */
    /* renamed from: mf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo62911mf(kotlinx.coroutines.C71651cx r10, java.lang.Object r11) {
        /*
            r9 = this;
            java.lang.String r0 = "State is "
            boolean r1 = kotlinx.coroutines.C71600ba.f191036a
            boolean r1 = r11 instanceof kotlinx.coroutines.C71396ac
            r2 = 0
            if (r1 == 0) goto L_0x000d
            r1 = r11
            kotlinx.coroutines.ac r1 = (kotlinx.coroutines.C71396ac) r1
            goto L_0x000e
        L_0x000d:
            r1 = r2
        L_0x000e:
            if (r1 == 0) goto L_0x0013
            java.lang.Throwable r1 = r1.f190604b
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            monitor-enter(r10)
            r10.mo62888e()     // Catch:{ all -> 0x0146 }
            kotlinx.a.e r3 = r10.f191094c     // Catch:{ all -> 0x0146 }
            java.lang.Object r3 = r3.f190532a     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x0023
            java.util.ArrayList r0 = kotlinx.coroutines.C71651cx.m104651f()     // Catch:{ all -> 0x0146 }
            goto L_0x0036
        L_0x0023:
            boolean r4 = r3 instanceof java.lang.Throwable     // Catch:{ all -> 0x0146 }
            if (r4 == 0) goto L_0x002f
            java.util.ArrayList r0 = kotlinx.coroutines.C71651cx.m104651f()     // Catch:{ all -> 0x0146 }
            r0.add(r3)     // Catch:{ all -> 0x0146 }
            goto L_0x0036
        L_0x002f:
            boolean r4 = r3 instanceof java.util.ArrayList     // Catch:{ all -> 0x0146 }
            if (r4 == 0) goto L_0x012e
            r0 = r3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ all -> 0x0146 }
        L_0x0036:
            java.lang.Throwable r3 = r10.mo62886c()     // Catch:{ all -> 0x0146 }
            r4 = 0
            if (r3 == 0) goto L_0x0040
            r0.add(r4, r3)     // Catch:{ all -> 0x0146 }
        L_0x0040:
            if (r1 == 0) goto L_0x004b
            boolean r3 = p5462h.p5473f.p5475b.C69664n.m101066l(r1, r3)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x004b
            r0.add(r1)     // Catch:{ all -> 0x0146 }
        L_0x004b:
            kotlinx.coroutines.e.ap r3 = kotlinx.coroutines.C71666db.f191123e     // Catch:{ all -> 0x0146 }
            kotlinx.a.e r5 = r10.f191094c     // Catch:{ all -> 0x0146 }
            r5.mo62678c(r3)     // Catch:{ all -> 0x0146 }
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x0146 }
            r5 = 1
            if (r3 == 0) goto L_0x006a
            boolean r3 = r10.mo62888e()     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00ae
            kotlinx.coroutines.cq r3 = new kotlinx.coroutines.cq     // Catch:{ all -> 0x0146 }
            java.lang.String r6 = r9.mo62686mc()     // Catch:{ all -> 0x0146 }
            r3.<init>(r6, r2, r9)     // Catch:{ all -> 0x0146 }
        L_0x0068:
            r2 = r3
            goto L_0x00ae
        L_0x006a:
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x0146 }
        L_0x006e:
            boolean r6 = r3.hasNext()     // Catch:{ all -> 0x0146 }
            if (r6 == 0) goto L_0x0081
            java.lang.Object r6 = r3.next()     // Catch:{ all -> 0x0146 }
            r7 = r6
            java.lang.Throwable r7 = (java.lang.Throwable) r7     // Catch:{ all -> 0x0146 }
            boolean r7 = r7 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0146 }
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x006e
            goto L_0x0082
        L_0x0081:
            r6 = r2
        L_0x0082:
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0146 }
            if (r6 != 0) goto L_0x00ad
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0146 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x0146 }
            boolean r6 = r3 instanceof kotlinx.coroutines.C71688dx     // Catch:{ all -> 0x0146 }
            if (r6 == 0) goto L_0x0068
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0146 }
        L_0x0094:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0146 }
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x0146 }
            if (r8 == r3) goto L_0x0094
            boolean r8 = r8 instanceof kotlinx.coroutines.C71688dx     // Catch:{ all -> 0x0146 }
            if (r8 == 0) goto L_0x0094
            r2 = r7
        L_0x00a8:
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0146 }
            if (r2 != 0) goto L_0x00ae
            goto L_0x0068
        L_0x00ad:
            r2 = r6
        L_0x00ae:
            if (r2 == 0) goto L_0x00f8
            int r3 = r0.size()     // Catch:{ all -> 0x0146 }
            if (r3 > r5) goto L_0x00b7
            goto L_0x00f8
        L_0x00b7:
            int r3 = r0.size()     // Catch:{ all -> 0x0146 }
            java.util.IdentityHashMap r5 = new java.util.IdentityHashMap     // Catch:{ all -> 0x0146 }
            r5.<init>(r3)     // Catch:{ all -> 0x0146 }
            java.util.Set r3 = java.util.Collections.newSetFromMap(r5)     // Catch:{ all -> 0x0146 }
            boolean r5 = kotlinx.coroutines.C71600ba.f191037b     // Catch:{ all -> 0x0146 }
            if (r5 != 0) goto L_0x00ca
            r5 = r2
            goto L_0x00ce
        L_0x00ca:
            java.lang.Throwable r5 = kotlinx.coroutines.p5579e.C71707ao.m104842c(r2)     // Catch:{ all -> 0x0146 }
        L_0x00ce:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0146 }
        L_0x00d2:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x0146 }
            if (r6 == 0) goto L_0x00f8
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x0146 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0146 }
            boolean r7 = kotlinx.coroutines.C71600ba.f191037b     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x00e6
            java.lang.Throwable r6 = kotlinx.coroutines.p5579e.C71707ao.m104842c(r6)     // Catch:{ all -> 0x0146 }
        L_0x00e6:
            if (r6 == r2) goto L_0x00d2
            if (r6 == r5) goto L_0x00d2
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0146 }
            if (r7 != 0) goto L_0x00d2
            boolean r7 = r3.add(r6)     // Catch:{ all -> 0x0146 }
            if (r7 == 0) goto L_0x00d2
            p5462h.C69465a.m100953a(r2, r6)     // Catch:{ all -> 0x0146 }
            goto L_0x00d2
        L_0x00f8:
            monitor-exit(r10)
            if (r2 != 0) goto L_0x00fc
            goto L_0x0103
        L_0x00fc:
            if (r2 == r1) goto L_0x0103
            kotlinx.coroutines.ac r11 = new kotlinx.coroutines.ac
            r11.<init>(r2, r4)
        L_0x0103:
            if (r2 == 0) goto L_0x011e
            boolean r0 = r9.m104696U(r2)
            if (r0 != 0) goto L_0x0111
            boolean r0 = r9.mo62908O(r2)
            if (r0 == 0) goto L_0x011e
        L_0x0111:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            p5462h.p5473f.p5475b.C69664n.m101059e(r11, r0)
            r0 = r11
            kotlinx.coroutines.ac r0 = (kotlinx.coroutines.C71396ac) r0
            kotlinx.a.b r0 = r0.f190605c
            r0.mo62670b()
        L_0x011e:
            r9.mo62683l(r11)
            kotlinx.a.e r0 = r9.f191118d
            java.lang.Object r1 = kotlinx.coroutines.C71666db.m104741a(r11)
            r0.mo62679d(r10, r1)
            r9.m104701j(r10, r11)
            return r11
        L_0x012e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0146 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
            r1.<init>(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "State is "
            r1.append(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x0146 }
            r11.<init>(r0)     // Catch:{ all -> 0x0146 }
            throw r11     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x014a
        L_0x0149:
            throw r11
        L_0x014a:
            goto L_0x0149
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71665da.mo62911mf(kotlinx.coroutines.cx, java.lang.Object):java.lang.Object");
    }

    /* renamed from: mg */
    public final Object mo62912mg() {
        Object mh = mo62913mh();
        if (mh instanceof C71636ci) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(mh instanceof C71396ac)) {
            return C71666db.m104742b(mh);
        } else {
            throw ((C71396ac) mh).f190604b;
        }
    }

    /* renamed from: mh */
    public final Object mo62913mh() {
        C71342e eVar = this.f191118d;
        while (true) {
            Object obj = eVar.f190532a;
            if (!(obj instanceof C71703ak)) {
                return obj;
            }
            ((C71703ak) obj).mo62930d(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: mi */
    public final CancellationException mo62914mi(Throwable th, String str) {
        C69664n.m101061g(th, "<this>");
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo62686mc();
            }
            cancellationException = new C71644cq(str, th, this);
        }
        return cancellationException;
    }

    public final C69585o minusKey(C69583m mVar) {
        C69664n.m101061g(mVar, "key");
        return C69581k.m100996c(this, mVar);
    }

    /* renamed from: mj */
    public final boolean mo62867mj() {
        Object mh = mo62913mh();
        return (mh instanceof C71636ci) && ((C71636ci) mh).mo62841lU();
    }

    /* renamed from: mk */
    public final boolean mo62868mk() {
        Object mh = mo62913mh();
        if (!(mh instanceof C71396ac)) {
            return (mh instanceof C71651cx) && ((C71651cx) mh).mo62888e();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ml */
    public boolean mo62915ml() {
        return false;
    }

    /* renamed from: n */
    public final void mo62916n(C71674dj djVar) {
        C69664n.m101061g(djVar, "parentJob");
        mo62907M(djVar);
    }

    /* renamed from: o */
    public final Object mo62869o(C69577g gVar) {
        Object mh;
        do {
            mh = mo62913mh();
            if (!(mh instanceof C71636ci)) {
                C71647ct.m104641e(gVar.mo61340lY());
                return C69788q.f186170a;
            }
        } while (mo62918z(mh) < 0);
        C71808r rVar = new C71808r(C69555b.m100961b(gVar), 1);
        rVar.mo63041A();
        C71810t.m105092b(rVar, mo62873s(new C71677dm(rVar)));
        Object n = rVar.mo63043n();
        if (n == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (n != aVar) {
            n = C69788q.f186170a;
        }
        return n == aVar ? n : C69788q.f186170a;
    }

    /* renamed from: p */
    public final CancellationException mo62870p() {
        Object mh = mo62913mh();
        if (mh instanceof C71651cx) {
            Throwable c = ((C71651cx) mh).mo62886c();
            if (c != null) {
                return mo62914mi(c, String.valueOf(C71601bb.m104526a(this)).concat(" is cancelling"));
            }
            new StringBuilder("Job is still new or active: ").append(this);
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        } else if (mh instanceof C71636ci) {
            new StringBuilder("Job is still new or active: ").append(this);
            throw new IllegalStateException("Job is still new or active: ".concat(toString()));
        } else if (mh instanceof C71396ac) {
            return mo62914mi(((C71396ac) mh).f190604b, (String) null);
        } else {
            return new C71644cq(String.valueOf(C71601bb.m104526a(this)).concat(" has completed normally"), (Throwable) null, this);
        }
    }

    public final C69585o plus(C69585o oVar) {
        return C71641cn.m104621a(this, oVar);
    }

    /* renamed from: q */
    public final C69731k mo62871q() {
        return new C69735o(new C71653cz(this, (C69577g) null));
    }

    /* renamed from: r */
    public final C71813w mo62872r(C71815y yVar) {
        C71615bp b = C71641cn.m104622b(this, true, new C71814x(yVar), 2);
        C69664n.m101059e(b, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C71813w) b;
    }

    /* renamed from: s */
    public final C71615bp mo62873s(C69626l lVar) {
        return mo62874t(false, true, lVar);
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [kotlinx.coroutines.ch] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.coroutines.C71615bp mo62874t(boolean r9, boolean r10, p5462h.p5473f.p5474a.C69626l r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0014
            boolean r1 = r11 instanceof kotlinx.coroutines.C71645cr
            if (r1 == 0) goto L_0x000b
            r1 = r11
            kotlinx.coroutines.cr r1 = (kotlinx.coroutines.C71645cr) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0027
            kotlinx.coroutines.cl r1 = new kotlinx.coroutines.cl
            r1.<init>(r11)
            goto L_0x0027
        L_0x0014:
            boolean r1 = r11 instanceof kotlinx.coroutines.C71648cu
            if (r1 == 0) goto L_0x001c
            r1 = r11
            kotlinx.coroutines.cu r1 = (kotlinx.coroutines.C71648cu) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0022
            boolean r2 = kotlinx.coroutines.C71600ba.f191036a
            goto L_0x0027
        L_0x0022:
            kotlinx.coroutines.cm r1 = new kotlinx.coroutines.cm
            r1.<init>(r11)
        L_0x0027:
            r1.f191086d = r8
        L_0x0029:
            java.lang.Object r2 = r8.mo62913mh()
            boolean r3 = r2 instanceof kotlinx.coroutines.C71618bs
            if (r3 == 0) goto L_0x0056
            r3 = r2
            kotlinx.coroutines.bs r3 = (kotlinx.coroutines.C71618bs) r3
            boolean r4 = r3.f191053a
            if (r4 == 0) goto L_0x0041
            kotlinx.a.e r3 = r8.f191118d
            boolean r2 = r3.mo62679d(r2, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x0041:
            kotlinx.coroutines.df r2 = new kotlinx.coroutines.df
            r2.<init>()
            boolean r4 = r3.f191053a
            if (r4 != 0) goto L_0x0050
            kotlinx.coroutines.ch r4 = new kotlinx.coroutines.ch
            r4.<init>(r2)
            r2 = r4
        L_0x0050:
            kotlinx.a.e r4 = r8.f191118d
            r4.mo62679d(r3, r2)
            goto L_0x0029
        L_0x0056:
            boolean r3 = r2 instanceof kotlinx.coroutines.C71636ci
            if (r3 == 0) goto L_0x00b0
            r3 = r2
            kotlinx.coroutines.ci r3 = (kotlinx.coroutines.C71636ci) r3
            kotlinx.coroutines.df r3 = r3.mo62840lS()
            if (r3 != 0) goto L_0x006e
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            p5462h.p5473f.p5475b.C69664n.m101059e(r2, r3)
            kotlinx.coroutines.cu r2 = (kotlinx.coroutines.C71648cu) r2
            r8.m104694S(r2)
            goto L_0x0029
        L_0x006e:
            kotlinx.coroutines.dh r4 = kotlinx.coroutines.C71672dh.f191129a
            if (r9 == 0) goto L_0x009e
            boolean r5 = r2 instanceof kotlinx.coroutines.C71651cx
            if (r5 == 0) goto L_0x009e
            monitor-enter(r2)
            r5 = r2
            kotlinx.coroutines.cx r5 = (kotlinx.coroutines.C71651cx) r5     // Catch:{ all -> 0x009b }
            java.lang.Throwable r6 = r5.mo62886c()     // Catch:{ all -> 0x009b }
            if (r6 == 0) goto L_0x008c
            boolean r7 = r11 instanceof kotlinx.coroutines.C71814x     // Catch:{ all -> 0x009b }
            if (r7 == 0) goto L_0x0097
            kotlinx.a.b r5 = r5.f191093b     // Catch:{ all -> 0x009b }
            boolean r5 = r5.mo62669a()     // Catch:{ all -> 0x009b }
            if (r5 != 0) goto L_0x0097
        L_0x008c:
            boolean r4 = r8.m104695T(r2, r3, r1)     // Catch:{ all -> 0x009b }
            if (r4 != 0) goto L_0x0094
            monitor-exit(r2)
            goto L_0x0029
        L_0x0094:
            if (r6 == 0) goto L_0x0099
            r4 = r1
        L_0x0097:
            monitor-exit(r2)
            goto L_0x009f
        L_0x0099:
            monitor-exit(r2)
            return r1
        L_0x009b:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L_0x009e:
            r6 = r0
        L_0x009f:
            if (r6 == 0) goto L_0x00a9
            if (r10 == 0) goto L_0x00a6
            r11.mo5761a(r6)
        L_0x00a6:
            kotlinx.coroutines.bp r4 = (kotlinx.coroutines.C71615bp) r4
            return r4
        L_0x00a9:
            boolean r2 = r8.m104695T(r2, r3, r1)
            if (r2 == 0) goto L_0x0029
            return r1
        L_0x00b0:
            if (r10 == 0) goto L_0x00c1
            boolean r9 = r2 instanceof kotlinx.coroutines.C71396ac
            if (r9 == 0) goto L_0x00b9
            kotlinx.coroutines.ac r2 = (kotlinx.coroutines.C71396ac) r2
            goto L_0x00ba
        L_0x00b9:
            r2 = r0
        L_0x00ba:
            if (r2 == 0) goto L_0x00be
            java.lang.Throwable r0 = r2.f190604b
        L_0x00be:
            r11.mo5761a(r0)
        L_0x00c1:
            kotlinx.coroutines.dh r9 = kotlinx.coroutines.C71672dh.f191129a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71665da.mo62874t(boolean, boolean, h.f.a.l):kotlinx.coroutines.bp");
    }

    public final String toString() {
        return (mo62687md() + "{" + m104697V(mo62913mh()) + "}") + "@" + C71601bb.m104527b(this);
    }

    /* renamed from: u */
    public void mo62723u(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C71644cq(mo62686mc(), (Throwable) null, this);
        }
        mo62751I(cancellationException);
    }

    /* renamed from: x */
    public final boolean mo62875x() {
        return !(mo62913mh() instanceof C71636ci);
    }

    /* renamed from: y */
    public final boolean mo62876y() {
        int z;
        do {
            z = mo62918z(mo62913mh());
            if (z == 0) {
                return false;
            }
        } while (z != 1);
        return true;
    }

    /* renamed from: z */
    public final int mo62918z(Object obj) {
        if (obj instanceof C71618bs) {
            if (((C71618bs) obj).f191053a) {
                return 0;
            }
            if (!this.f191118d.mo62679d(obj, C71666db.f191125g)) {
                return -1;
            }
            mo62905K();
            return 1;
        } else if (!(obj instanceof C71635ch)) {
            return 0;
        } else {
            if (!this.f191118d.mo62679d(obj, ((C71635ch) obj).f191076a)) {
                return -1;
            }
            mo62905K();
            return 1;
        }
    }
}
