package com.google.common.p4526f;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.p4528b.C59011af;
import com.google.common.p4526f.p4528b.C59015aj;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59036k;
import com.google.common.p4526f.p4528b.C59037l;
import com.google.common.p4526f.p4533e.C59076d;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.common.f.l */
/* compiled from: PG */
public abstract class C59092l implements C59104x, C59031f {

    /* renamed from: a */
    private static final String f157056a = new String();

    /* renamed from: b */
    public final long f157057b;

    /* renamed from: c */
    public C59091k f157058c = null;

    /* renamed from: d */
    private final Level f157059d;

    /* renamed from: e */
    private C59095o f157060e = null;

    /* renamed from: f */
    private C59015aj f157061f = null;

    /* renamed from: g */
    private Object[] f157062g = null;

    protected C59092l(Level level, boolean z, long j) {
        C59081b.m91349a(level, "level");
        this.f157059d = level;
        this.f157057b = j;
        if (z) {
            mo56383m(C59090j.f157051e, Boolean.TRUE);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00ad */
    /* renamed from: aj */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m91366aj(java.lang.String r7, java.lang.Object... r8) {
        /*
            r6 = this;
            r6.f157062g = r8
            r0 = 0
            r1 = 0
        L_0x0004:
            int r2 = r8.length
            if (r1 >= r2) goto L_0x0018
            r2 = r8[r1]
            boolean r3 = r2 instanceof com.google.common.p4526f.C59087g
            if (r3 == 0) goto L_0x0015
            com.google.common.f.g r2 = (com.google.common.p4526f.C59087g) r2
            java.lang.Object r2 = r2.mo20520a()
            r8[r1] = r2
        L_0x0015:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0018:
            java.lang.String r8 = f157056a
            if (r7 == r8) goto L_0x0027
            com.google.common.f.b.aj r8 = new com.google.common.f.b.aj
            com.google.common.f.e.d r1 = r6.mo56244a()
            r8.<init>(r1, r7)
            r6.f157061f = r8
        L_0x0027:
            com.google.common.f.c.l r7 = com.google.common.p4526f.p4528b.C59011af.m91229k()
            com.google.common.f.c.j r8 = r7.f156996c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0067
            com.google.common.f.b.l r8 = r6.mo56305h()
            com.google.common.f.aa r1 = com.google.common.p4526f.C59090j.f157052f
            java.lang.Object r8 = r8.mo56312d(r1)
            com.google.common.f.c.l r8 = (com.google.common.p4526f.p4531c.C59064l) r8
            if (r8 == 0) goto L_0x0062
            com.google.common.f.c.j r1 = r8.f156996c
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0062
            com.google.common.f.c.j r1 = r7.f156996c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0053
            r7 = r8
            goto L_0x0062
        L_0x0053:
            com.google.common.f.c.l r1 = new com.google.common.f.c.l
            com.google.common.f.c.j r2 = new com.google.common.f.c.j
            com.google.common.f.c.j r7 = r7.f156996c
            com.google.common.f.c.j r8 = r8.f156996c
            r2.<init>(r7, r8)
            r1.<init>(r2)
            r7 = r1
        L_0x0062:
            com.google.common.f.aa r8 = com.google.common.p4526f.C59090j.f157052f
            r6.mo56383m(r8, r7)
        L_0x0067:
            com.google.common.f.a r7 = r6.mo56228c()
            java.lang.ThreadLocal r8 = com.google.common.p4526f.p4534f.C59083d.f157045a     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.Object r8 = r8.get()     // Catch:{ RuntimeException -> 0x00b6 }
            com.google.common.f.f.d r8 = (com.google.common.p4526f.p4534f.C59083d) r8     // Catch:{ RuntimeException -> 0x00b6 }
            int r1 = r8.f157046b     // Catch:{ RuntimeException -> 0x00b6 }
            r2 = 1
            int r1 = r1 + r2
            r8.f157046b = r1     // Catch:{ RuntimeException -> 0x00b6 }
            if (r1 == 0) goto L_0x00ae
            r3 = 100
            if (r1 > r3) goto L_0x0085
            com.google.common.f.b.h r1 = r7.f156823a     // Catch:{ all -> 0x0090 }
            r1.mo36921a(r6)     // Catch:{ all -> 0x0090 }
            goto L_0x008a
        L_0x0085:
            java.lang.String r1 = "unbounded recursion in log statement"
            com.google.common.p4526f.C58969a.m91127e(r1, r6)     // Catch:{ all -> 0x0090 }
        L_0x008a:
            if (r8 == 0) goto L_0x008f
            r8.close()     // Catch:{ RuntimeException -> 0x00b6 }
        L_0x008f:
            return
        L_0x0090:
            r1 = move-exception
            if (r8 == 0) goto L_0x00ad
            r8.close()     // Catch:{ all -> 0x0097 }
            goto L_0x00ad
        L_0x0097:
            r8 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00ad }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r3[r0] = r4     // Catch:{ Exception -> 0x00ad }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x00ad }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ad }
            r2[r0] = r8     // Catch:{ Exception -> 0x00ad }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            throw r1     // Catch:{ RuntimeException -> 0x00b6 }
        L_0x00ae:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ RuntimeException -> 0x00b6 }
            java.lang.String r0 = "Overflow of RecursionDepth (possible error in core library)"
            r8.<init>(r0)     // Catch:{ RuntimeException -> 0x00b6 }
            throw r8     // Catch:{ RuntimeException -> 0x00b6 }
        L_0x00b6:
            r8 = move-exception
            com.google.common.f.b.h r7 = r7.f156823a     // Catch:{ i -> 0x00e7, RuntimeException -> 0x00bd }
            r7.mo36923c(r8, r6)     // Catch:{ i -> 0x00e7, RuntimeException -> 0x00bd }
            return
        L_0x00bd:
            r7 = move-exception
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = r7.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r8 = ": "
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            com.google.common.p4526f.C58969a.m91127e(r8, r6)
            java.io.PrintStream r8 = java.lang.System.err     // Catch:{ RuntimeException -> 0x00e6 }
            r7.printStackTrace(r8)     // Catch:{ RuntimeException -> 0x00e6 }
        L_0x00e6:
            return
        L_0x00e7:
            r7 = move-exception
            goto L_0x00ea
        L_0x00e9:
            throw r7
        L_0x00ea:
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4526f.C59092l.m91366aj(java.lang.String, java.lang.Object[]):void");
    }

    /* renamed from: ak */
    private final boolean m91367ak() {
        if (this.f157060e == null) {
            C59095o a = C59011af.m91227g().mo56252a(C59092l.class, 1);
            C59081b.m91349a(a, "logger backend must not return a null LogSite");
            this.f157060e = a;
        }
        C59096p pVar = this.f157060e;
        if (pVar != C59095o.f157068a) {
            C59091k kVar = this.f157058c;
            if (kVar != null && kVar.f157055b > 0) {
                C59081b.m91349a(pVar, "logSiteKey");
                int i = kVar.f157055b;
                for (int i2 = 0; i2 < i; i2++) {
                    if (C59090j.f157050d.equals(kVar.mo56311c(i2))) {
                        Object e = kVar.mo56313e(i2);
                        if (e instanceof C59105y) {
                            pVar = ((C59105y) e).mo56406b();
                        } else {
                            pVar = new C58977ab(pVar, e);
                        }
                    }
                }
            }
        } else {
            pVar = null;
        }
        return mo56245b(pVar);
    }

    /* renamed from: A */
    public final void mo56348A(String str, long j, char c) {
        if (m91367ak()) {
            m91366aj(str, Long.valueOf(j), Character.valueOf(c));
        }
    }

    /* renamed from: B */
    public final void mo56349B(String str, long j, int i) {
        if (m91367ak()) {
            m91366aj(str, Long.valueOf(j), Integer.valueOf(i));
        }
    }

    /* renamed from: C */
    public final void mo56350C(String str, long j, long j2) {
        if (m91367ak()) {
            m91366aj(str, Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: D */
    public final void mo56351D(String str, long j, Object obj) {
        if (m91367ak()) {
            m91366aj(str, Long.valueOf(j), obj);
        }
    }

    /* renamed from: E */
    public final void mo56352E(String str, Object obj, int i) {
        if (m91367ak()) {
            m91366aj(str, obj, Integer.valueOf(i));
        }
    }

    /* renamed from: F */
    public final void mo56353F(String str, Object obj, long j) {
        if (m91367ak()) {
            m91366aj(str, obj, Long.valueOf(j));
        }
    }

    /* renamed from: G */
    public final void mo56354G(String str, Object obj, Object obj2) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2);
        }
    }

    /* renamed from: H */
    public final void mo56355H(String str, Object obj, boolean z) {
        if (m91367ak()) {
            m91366aj(str, obj, Boolean.valueOf(z));
        }
    }

    /* renamed from: I */
    public final void mo56356I(String str, boolean z, int i) {
        if (m91367ak()) {
            m91366aj(str, Boolean.valueOf(z), Integer.valueOf(i));
        }
    }

    /* renamed from: J */
    public final void mo56357J(String str, boolean z, Object obj) {
        if (m91367ak()) {
            m91366aj(str, Boolean.valueOf(z), obj);
        }
    }

    /* renamed from: K */
    public final void mo56358K(String str, boolean z, boolean z2) {
        if (m91367ak()) {
            m91366aj(str, Boolean.valueOf(z), Boolean.valueOf(z2));
        }
    }

    /* renamed from: L */
    public final void mo56359L(String str, Object obj, Object obj2, Object obj3) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3);
        }
    }

    /* renamed from: M */
    public final void mo56360M(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3, obj4);
        }
    }

    /* renamed from: N */
    public final void mo56361N(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3, obj4, obj5);
        }
    }

    /* renamed from: O */
    public final void mo56362O(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3, obj4, obj5, obj6);
        }
    }

    /* renamed from: P */
    public final void mo56363P(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3, obj4, obj5, obj6, obj7);
        }
    }

    /* renamed from: Q */
    public final void mo56364Q(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        }
    }

    /* renamed from: R */
    public final void mo56365R(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
        }
    }

    /* renamed from: S */
    public final void mo56366S(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        if (m91367ak()) {
            m91366aj(str, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
        }
    }

    /* renamed from: T */
    public final void mo56367T(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object... objArr) {
        if (m91367ak()) {
            int length = objArr.length;
            Object[] objArr2 = new Object[(length + 10)];
            objArr2[0] = obj;
            objArr2[1] = obj2;
            objArr2[2] = obj3;
            objArr2[3] = obj4;
            objArr2[4] = obj5;
            objArr2[5] = obj6;
            objArr2[6] = obj7;
            objArr2[7] = obj8;
            objArr2[8] = obj9;
            objArr2[9] = obj10;
            System.arraycopy(objArr, 0, objArr2, 10, length);
            m91366aj(str, objArr2);
        }
    }

    /* renamed from: U */
    public final void mo56368U(String str, Object[] objArr) {
        if (m91367ak()) {
            m91366aj(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: V */
    public final boolean mo56369V() {
        return mo56301W() || mo56228c().mo56227f(this.f157059d);
    }

    /* renamed from: W */
    public final boolean mo56301W() {
        return this.f157058c != null && Boolean.TRUE.equals(this.f157058c.mo56312d(C59090j.f157051e));
    }

    /* renamed from: X */
    public final Object[] mo56302X() {
        if (this.f157061f != null) {
            return this.f157062g;
        }
        throw new IllegalStateException("cannot get arguments unless a template context exists");
    }

    /* renamed from: Y */
    public final void mo56370Y(char c, long j) {
        if (m91367ak()) {
            m91366aj("Pushing %c: No request state info available for %d", Character.valueOf(c), Long.valueOf(j));
        }
    }

    /* renamed from: Z */
    public final void mo56371Z(long j, float f) {
        if (m91367ak()) {
            m91366aj("CSL topcandidate: %d, probability: %f", Long.valueOf(j), Float.valueOf(f));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C59076d mo56244a();

    /* renamed from: aa */
    public final C59104x mo56372aa(int i) {
        mo56379ah(new C59094n(i));
        return this;
    }

    /* renamed from: ab */
    public final void mo56373ab(double d, Object obj) {
        if (m91367ak()) {
            m91366aj("Csl event probability: %f, threshold: %f", Double.valueOf(d), obj);
        }
    }

    /* renamed from: ac */
    public final void mo56374ac(int i, TimeUnit timeUnit) {
        if (!mo56301W()) {
            mo56383m(C59090j.f157049c, C59102v.m91441a(i, timeUnit));
        }
    }

    /* renamed from: ad */
    public final void mo56375ad() {
        if (!mo56301W()) {
            mo56383m(C59090j.f157048b, 10);
        }
    }

    /* renamed from: ae */
    public final void mo56376ae(Object obj, float f) {
        if (m91367ak()) {
            m91366aj("<%s, %s>", obj, Float.valueOf(f));
        }
    }

    /* renamed from: af */
    public final void mo56377af(boolean z, long j) {
        if (m91367ak()) {
            m91366aj("Is entry valid: %b. ExpirationTime %d", Boolean.valueOf(z), Long.valueOf(j));
        }
    }

    /* renamed from: ag */
    public final void mo56378ag(C58976aa aaVar, Object obj) {
        C59081b.m91349a(aaVar, "metadata key");
        if (obj != null) {
            mo56383m(aaVar, obj);
        }
    }

    /* renamed from: ah */
    public final void mo56379ah(C59095o oVar) {
        if (this.f157060e == null) {
            this.f157060e = oVar;
        }
    }

    /* renamed from: ai */
    public final void mo56380ai(C58979ad adVar) {
        C59081b.m91349a(adVar, "stack size");
        if (adVar != C58979ad.NONE) {
            mo56383m(C59090j.f157053g, adVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo56245b(C59096p pVar) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract C58969a mo56228c();

    /* renamed from: d */
    public final long mo56303d() {
        return this.f157057b;
    }

    /* renamed from: e */
    public final C59095o mo56304e() {
        C59095o oVar = this.f157060e;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("cannot request log site information prior to postProcess()");
    }

    /* renamed from: f */
    public final C59104x mo56381f(C58976aa aaVar) {
        mo56378ag(aaVar, Boolean.TRUE);
        return this;
    }

    /* renamed from: g */
    public final C59104x mo56382g(Throwable th) {
        mo56378ag(C59090j.f157047a, th);
        return this;
    }

    /* renamed from: h */
    public final C59037l mo56305h() {
        C59091k kVar = this.f157058c;
        return kVar != null ? kVar : C59036k.f156958a;
    }

    /* renamed from: i */
    public final C59015aj mo56306i() {
        return this.f157061f;
    }

    /* renamed from: j */
    public final Object mo56307j() {
        if (this.f157061f == null) {
            return this.f157062g[0];
        }
        throw new IllegalStateException("cannot get literal argument if a template context exists");
    }

    /* renamed from: k */
    public final String mo56308k() {
        return mo56228c().f156823a.mo56247d();
    }

    /* renamed from: l */
    public final Level mo56309l() {
        return this.f157059d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo56383m(C58976aa aaVar, Object obj) {
        int a;
        if (this.f157058c == null) {
            this.f157058c = new C59091k();
        }
        C59091k kVar = this.f157058c;
        if (aaVar.f156829c || (a = kVar.mo56346a(aaVar)) == -1) {
            int i = kVar.f157055b + 1;
            Object[] objArr = kVar.f157054a;
            int length = objArr.length;
            if (i + i > length) {
                kVar.f157054a = Arrays.copyOf(objArr, length + length);
            }
            Object[] objArr2 = kVar.f157054a;
            int i2 = kVar.f157055b;
            C59081b.m91349a(aaVar, "metadata key");
            objArr2[i2 + i2] = aaVar;
            Object[] objArr3 = kVar.f157054a;
            int i3 = kVar.f157055b;
            C59081b.m91349a(obj, "metadata value");
            objArr3[i3 + i3 + 1] = obj;
            kVar.f157055b++;
            return;
        }
        Object[] objArr4 = kVar.f157054a;
        C59081b.m91349a(obj, "metadata value");
        objArr4[a + a + 1] = obj;
    }

    /* renamed from: n */
    public final void mo56384n() {
        if (m91367ak()) {
            m91366aj(f157056a, BuildConfig.FLAVOR);
        }
    }

    /* renamed from: o */
    public final void mo56385o(Object obj) {
        if (m91367ak()) {
            m91366aj("%s", obj);
        }
    }

    /* renamed from: p */
    public final void mo56386p(String str) {
        if (m91367ak()) {
            m91366aj(f157056a, str);
        }
    }

    /* renamed from: q */
    public final void mo56387q(String str, int i) {
        if (m91367ak()) {
            m91366aj(str, Integer.valueOf(i));
        }
    }

    /* renamed from: r */
    public final void mo56388r(String str, long j) {
        if (m91367ak()) {
            m91366aj(str, Long.valueOf(j));
        }
    }

    /* renamed from: s */
    public final void mo56389s(String str, Object obj) {
        if (m91367ak()) {
            m91366aj(str, obj);
        }
    }

    /* renamed from: t */
    public final void mo56390t(String str, float f, float f2) {
        if (m91367ak()) {
            m91366aj(str, Float.valueOf(f), Float.valueOf(f2));
        }
    }

    /* renamed from: u */
    public final void mo56391u(String str, float f, Object obj) {
        if (m91367ak()) {
            m91366aj(str, Float.valueOf(f), obj);
        }
    }

    /* renamed from: v */
    public final void mo56392v(String str, int i, float f) {
        if (m91367ak()) {
            m91366aj(str, Integer.valueOf(i), Float.valueOf(f));
        }
    }

    /* renamed from: w */
    public final void mo56393w(String str, int i, int i2) {
        if (m91367ak()) {
            m91366aj(str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: x */
    public final void mo56394x(String str, int i, long j) {
        if (m91367ak()) {
            m91366aj(str, Integer.valueOf(i), Long.valueOf(j));
        }
    }

    /* renamed from: y */
    public final void mo56395y(String str, int i, Object obj) {
        if (m91367ak()) {
            m91366aj(str, Integer.valueOf(i), obj);
        }
    }

    /* renamed from: z */
    public final void mo56396z(String str, int i, boolean z) {
        if (m91367ak()) {
            m91366aj(str, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }
}
