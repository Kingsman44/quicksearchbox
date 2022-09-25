package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71700ah;
import kotlinx.coroutines.p5579e.C71717ay;
import kotlinx.p5572a.C71339b;
import kotlinx.p5572a.C71342e;
import kotlinx.p5572a.C71343f;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.by */
/* compiled from: PG */
public abstract class C71624by extends C71625bz implements C71606bg {

    /* renamed from: e */
    public final C71342e f191063e = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: f */
    public final C71342e f191064f = new C71342e((Object) null, C71343f.f190534a);

    /* renamed from: g */
    public final C71339b f191065g = new C71339b(false, C71343f.f190534a);

    /* renamed from: u */
    private final boolean m104587u(Runnable runnable) {
        C71342e eVar = this.f191063e;
        while (true) {
            Object obj = eVar.f190532a;
            if (this.f191065g.mo62669a()) {
                return false;
            }
            if (obj == null) {
                if (this.f191063e.mo62679d((Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C71700ah) {
                C71700ah ahVar = (C71700ah) obj;
                int a = ahVar.mo62957a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a != 1) {
                    return false;
                }
                this.f191063e.mo62679d(obj, ahVar.mo62960d(ahVar.mo62958b()));
            } else if (obj == C71628ca.f191072b) {
                return false;
            } else {
                C71700ah ahVar2 = new C71700ah(8, true);
                ahVar2.mo62957a((Runnable) obj);
                ahVar2.mo62957a(runnable);
                if (this.f191063e.mo62679d(obj, ahVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62765a(long j, C71807q qVar) {
        long a = C71628ca.m104601a(j);
        if (a < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            C71620bu buVar = new C71620bu(this, a + nanoTime, qVar);
            mo62859r(nanoTime, buVar);
            C71810t.m105092b(qVar, buVar);
        }
    }

    /* renamed from: d */
    public final void mo62766d(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(runnable, "block");
        mo62821h(runnable);
    }

    /* renamed from: g */
    public C71615bp mo62769g(long j, Runnable runnable, C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return C71603bd.f191041a.mo62769g(j, runnable, oVar);
    }

    /* renamed from: h */
    public void mo62821h(Runnable runnable) {
        C69664n.m101061g(runnable, "task");
        if (m104587u(runnable)) {
            mo62861t();
        } else {
            C71602bc.f191039c.mo62821h(runnable);
        }
    }

    /* renamed from: j */
    public void mo62823j() {
        C71717ay b;
        ThreadLocal threadLocal = C71687dw.f191139a;
        C71687dw.f191139a.set((Object) null);
        this.f191065g.f190524c = 1;
        boolean z = C71600ba.f191036a;
        C71342e eVar = this.f191063e;
        while (true) {
            Object obj = eVar.f190532a;
            if (obj == null) {
                if (this.f191063e.mo62679d((Object) null, C71628ca.f191072b)) {
                    break;
                }
            } else if (obj instanceof C71700ah) {
                ((C71700ah) obj).mo62961e();
                break;
            } else if (obj == C71628ca.f191072b) {
                break;
            } else {
                C71700ah ahVar = new C71700ah(8, true);
                ahVar.mo62957a((Runnable) obj);
                if (this.f191063e.mo62679d(obj, ahVar)) {
                    break;
                }
            }
        }
        do {
        } while (mo62843k() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            C71623bx bxVar = (C71623bx) this.f191064f.f190532a;
            if (bxVar != null) {
                synchronized (bxVar) {
                    b = bxVar.f191186c.f190526b > 0 ? bxVar.mo62969b(0) : null;
                }
                C71622bw bwVar = (C71622bw) b;
                if (bwVar != null) {
                    mo62822i(nanoTime, bwVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x007e A[EDGE_INSN: B:80:0x007e->B:41:0x007e ?: BREAK  , SYNTHETIC] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo62843k() {
        /*
            r10 = this;
            boolean r0 = r10.mo62849q()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            kotlinx.a.e r0 = r10.f191064f
            java.lang.Object r0 = r0.f190532a
            kotlinx.coroutines.bx r0 = (kotlinx.coroutines.C71623bx) r0
            r3 = 0
            if (r0 == 0) goto L_0x0046
            boolean r4 = r0.mo62971d()
            if (r4 != 0) goto L_0x0046
            long r4 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.e.ay r6 = r0.mo62968a()     // Catch:{ all -> 0x0043 }
            if (r6 != 0) goto L_0x0026
            monitor-exit(r0)
            r6 = r3
            goto L_0x003e
        L_0x0026:
            kotlinx.coroutines.bw r6 = (kotlinx.coroutines.C71622bw) r6     // Catch:{ all -> 0x0043 }
            long r7 = r6.f191061b     // Catch:{ all -> 0x0043 }
            long r7 = r4 - r7
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x003c
            boolean r6 = r10.m104587u(r6)     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x003c
            r6 = 0
            kotlinx.coroutines.e.ay r6 = r0.mo62969b(r6)     // Catch:{ all -> 0x0043 }
            goto L_0x003d
        L_0x003c:
            r6 = r3
        L_0x003d:
            monitor-exit(r0)
        L_0x003e:
            kotlinx.coroutines.bw r6 = (kotlinx.coroutines.C71622bw) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0046
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0046:
            kotlinx.a.e r0 = r10.f191063e
        L_0x0048:
            java.lang.Object r4 = r0.f190532a
            if (r4 != 0) goto L_0x004d
            goto L_0x007e
        L_0x004d:
            boolean r5 = r4 instanceof kotlinx.coroutines.p5579e.C71700ah
            if (r5 == 0) goto L_0x006e
            r5 = r4
            kotlinx.coroutines.e.ah r5 = (kotlinx.coroutines.p5579e.C71700ah) r5
            java.lang.Object r6 = r5.mo62959c()
            kotlinx.coroutines.e.ap r7 = kotlinx.coroutines.p5579e.C71700ah.f191164a
            if (r6 == r7) goto L_0x0060
            r3 = r6
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            goto L_0x007e
        L_0x0060:
            kotlinx.a.e r6 = r10.f191063e
            long r7 = r5.mo62958b()
            kotlinx.coroutines.e.ah r5 = r5.mo62960d(r7)
            r6.mo62679d(r4, r5)
            goto L_0x0048
        L_0x006e:
            kotlinx.coroutines.e.ap r5 = kotlinx.coroutines.C71628ca.f191072b
            if (r4 != r5) goto L_0x0073
            goto L_0x007e
        L_0x0073:
            kotlinx.a.e r5 = r10.f191063e
            boolean r5 = r5.mo62679d(r4, r3)
            if (r5 == 0) goto L_0x0048
            r3 = r4
            java.lang.Runnable r3 = (java.lang.Runnable) r3
        L_0x007e:
            if (r3 != 0) goto L_0x00d5
            kotlinx.coroutines.e.a r0 = r10.f191055d
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto L_0x008b
        L_0x0089:
            r5 = r3
            goto L_0x0093
        L_0x008b:
            boolean r0 = r0.mo62929a()
            if (r0 == 0) goto L_0x0092
            goto L_0x0089
        L_0x0092:
            r5 = r1
        L_0x0093:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0098
            goto L_0x00d4
        L_0x0098:
            kotlinx.a.e r0 = r10.f191063e
            java.lang.Object r0 = r0.f190532a
            if (r0 == 0) goto L_0x00b1
            boolean r5 = r0 instanceof kotlinx.coroutines.p5579e.C71700ah
            if (r5 == 0) goto L_0x00ab
            kotlinx.coroutines.e.ah r0 = (kotlinx.coroutines.p5579e.C71700ah) r0
            boolean r0 = r0.mo62962f()
            if (r0 != 0) goto L_0x00b1
            goto L_0x00d4
        L_0x00ab:
            kotlinx.coroutines.e.ap r5 = kotlinx.coroutines.C71628ca.f191072b
            if (r0 != r5) goto L_0x00b0
            goto L_0x00d3
        L_0x00b0:
            return r1
        L_0x00b1:
            kotlinx.a.e r0 = r10.f191064f
            java.lang.Object r0 = r0.f190532a
            kotlinx.coroutines.bx r0 = (kotlinx.coroutines.C71623bx) r0
            if (r0 == 0) goto L_0x00d3
            monitor-enter(r0)
            kotlinx.coroutines.e.ay r5 = r0.mo62968a()     // Catch:{ all -> 0x00d0 }
            monitor-exit(r0)
            kotlinx.coroutines.bw r5 = (kotlinx.coroutines.C71622bw) r5
            if (r5 != 0) goto L_0x00c4
            goto L_0x00d3
        L_0x00c4:
            long r3 = r5.f191061b
            long r5 = java.lang.System.nanoTime()
            long r3 = r3 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d0:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d3:
            r1 = r3
        L_0x00d4:
            return r1
        L_0x00d5:
            r3.run()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71624by.mo62843k():long");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [kotlinx.coroutines.e.ay] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62859r(long r4, kotlinx.coroutines.C71622bw r6) {
        /*
            r3 = this;
            kotlinx.a.b r0 = r3.f191065g
            boolean r0 = r0.mo62669a()
            if (r0 == 0) goto L_0x0009
            goto L_0x002f
        L_0x0009:
            kotlinx.a.e r0 = r3.f191064f
            java.lang.Object r0 = r0.f190532a
            kotlinx.coroutines.bx r0 = (kotlinx.coroutines.C71623bx) r0
            r1 = 0
            if (r0 != 0) goto L_0x0025
            kotlinx.a.e r0 = r3.f191064f
            kotlinx.coroutines.bx r2 = new kotlinx.coroutines.bx
            r2.<init>(r4)
            r0.mo62679d(r1, r2)
            kotlinx.a.e r0 = r3.f191064f
            java.lang.Object r0 = r0.f190532a
            p5462h.p5473f.p5475b.C69664n.m101058d(r0)
            kotlinx.coroutines.bx r0 = (kotlinx.coroutines.C71623bx) r0
        L_0x0025:
            int r0 = r6.mo62854c(r4, r0, r3)
            if (r0 == 0) goto L_0x0033
            r1 = 1
            if (r0 == r1) goto L_0x002f
            goto L_0x004d
        L_0x002f:
            r3.mo62822i(r4, r6)
            return
        L_0x0033:
            kotlinx.a.e r4 = r3.f191064f
            java.lang.Object r4 = r4.f190532a
            kotlinx.coroutines.bx r4 = (kotlinx.coroutines.C71623bx) r4
            if (r4 == 0) goto L_0x0048
            monitor-enter(r4)
            kotlinx.coroutines.e.ay r5 = r4.mo62968a()     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            r1 = r5
            kotlinx.coroutines.bw r1 = (kotlinx.coroutines.C71622bw) r1
            goto L_0x0048
        L_0x0045:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0048:
            if (r1 != r6) goto L_0x004d
            r3.mo62861t()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C71624by.mo62859r(long, kotlinx.coroutines.bw):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final boolean mo62860s() {
        if (!mo62848p()) {
            return false;
        }
        C71623bx bxVar = (C71623bx) this.f191064f.f190532a;
        if (bxVar != null && !bxVar.mo62971d()) {
            return false;
        }
        Object obj = this.f191063e.f190532a;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C71700ah) {
            return ((C71700ah) obj).mo62962f();
        }
        if (obj != C71628ca.f191072b) {
            return false;
        }
        return true;
    }
}
