package com.google.apps.p3589d.p3594e;

import com.evernote.android.state.BuildConfig;
import com.google.apps.p3589d.p3590a.C45682aa;
import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45698o;
import com.google.apps.p3589d.p3590a.C45701r;
import com.google.apps.p3589d.p3590a.C45702s;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3590a.C45705v;
import com.google.apps.p3589d.p3590a.C45707x;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45721l;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3591b.C45724o;
import com.google.apps.p3589d.p3592c.C45728d;
import com.google.apps.p3589d.p3592c.C45731g;
import com.google.apps.p3589d.p3593d.C45732a;
import com.google.apps.p3589d.p3593d.C45737ae;
import com.google.apps.p3589d.p3593d.C45740ah;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45745d;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45760s;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3597h.C45869aj;
import com.google.apps.p3589d.p3597h.C45875ap;
import com.google.apps.p3589d.p3597h.C45880f;
import com.google.apps.p3589d.p3599j.C45909ag;
import com.google.apps.p3589d.p3599j.C45912c;
import com.google.apps.p3589d.p3599j.C45913d;
import com.google.apps.p3589d.p3599j.C45915f;
import com.google.apps.p3589d.p3599j.C45916g;
import com.google.apps.p3589d.p3599j.C45917h;
import com.google.apps.p3589d.p3600k.C45945j;
import java.util.Collections;

/* renamed from: com.google.apps.d.e.y */
/* compiled from: PG */
public abstract class C45795y implements C45705v {

    /* renamed from: a */
    private static final C45917h f120404a;

    /* renamed from: b */
    private static final C45917h f120405b;

    /* renamed from: l */
    public static final /* synthetic */ int f120406l = 0;

    /* renamed from: c */
    public C45749h f120407c;

    /* renamed from: d */
    public boolean f120408d = false;

    /* renamed from: e */
    public boolean f120409e = false;

    /* renamed from: f */
    public final C45721l f120410f;

    /* renamed from: g */
    public String f120411g;

    /* renamed from: h */
    public C45703t f120412h;

    /* renamed from: i */
    public final C45707x f120413i;

    /* renamed from: j */
    public final C45723n f120414j;

    /* renamed from: k */
    public final C45723n f120415k;

    /* renamed from: m */
    private final C45819v f120416m;

    /* renamed from: n */
    private C45880f f120417n;

    /* renamed from: o */
    private boolean f120418o = false;

    /* renamed from: p */
    private final C45723n f120419p;

    static {
        C45917h hVar = C45909ag.f120675g;
        C45917h hVar2 = C45915f.f120698a;
        C45913d dVar = new C45913d(hVar, hVar2);
        C45917h hVar3 = C45909ag.f120679k;
        C45912c cVar = new C45912c(dVar, hVar3);
        C45917h hVar4 = C45909ag.f120675g;
        f120404a = new C45913d(cVar, hVar4);
        f120405b = new C45913d(new C45912c(hVar3, new C45913d(hVar4, hVar2)), hVar4);
    }

    protected C45795y(C45819v vVar, C45749h hVar, C45707x xVar) {
        C45724o d = C45724o.m81498d();
        d.f120221a.put(C45702s.CURSOR_UPDATED, new C45723n(0));
        d.f120221a.put(C45702s.MATH_UPDATED, new C45723n(0));
        d.f120221a.put(C45702s.MOVED_PAST_END, new C45723n(0));
        d.f120221a.put(C45702s.MOVED_PAST_START, new C45723n(0));
        this.f120410f = d.mo49834c();
        this.f120411g = BuildConfig.FLAVOR;
        this.f120412h = new C45685b(0, 0);
        C45723n nVar = new C45723n(0);
        this.f120414j = nVar;
        C45723n nVar2 = new C45723n(0);
        this.f120415k = nVar2;
        C45723n nVar3 = new C45723n(0);
        this.f120419p = nVar3;
        this.f120416m = vVar;
        this.f120407c = hVar;
        this.f120413i = xVar;
        this.f120417n = C45880f.m81890p(vVar);
        this.f120411g = C45728d.m81507a(hVar, nVar2, nVar3, nVar);
        this.f120418o = true;
    }

    /* renamed from: f */
    private final int m81653f(boolean z) {
        C45763v h = m81655h(this.f120412h);
        int a = this.f120412h.mo49743a();
        if (h == null) {
            return a;
        }
        C45917h hVar = z ? f120404a : f120405b;
        C45916g c = hVar.mo50034c(h, 0, h.f120342a.f120220a.size());
        while (c != null) {
            int b = c.mo50019a().mo49837b();
            C45731g a2 = c.mo50019a();
            C45945j.m82040b(b < a2.mo49837b() + a2.mo49836a(), "false");
            C45731g a3 = c.mo50019a();
            int i = ((C45743b) h.mo49895a((a3.mo49837b() + a3.mo49836a()) - 1).f120318g).f120262d;
            if (z && a < i) {
                return i;
            }
            if (!z && a <= i) {
                return ((C45743b) h.mo49895a(c.mo50019a().mo49837b()).f120318g).f120260b;
            }
            C45731g a4 = c.mo50019a();
            c = hVar.mo50034c(h, a4.mo49837b() + a4.mo49836a(), h.f120342a.f120220a.size());
        }
        return ((C45745d) h.f120343b).f120266b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0128 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m81654g(int r12, boolean r13) {
        /*
            r11 = this;
            com.google.apps.d.e.x r0 = r11.m81656i(r12)
            com.google.apps.d.d.n r1 = r0.f120403c
            r2 = 0
            if (r1 == 0) goto L_0x000e
            java.lang.Integer r1 = m81661n(r1, r13, r12)
            goto L_0x000f
        L_0x000e:
            r1 = r2
        L_0x000f:
            if (r1 != 0) goto L_0x0019
            com.google.apps.d.d.n r3 = r0.f120402b
            if (r3 == 0) goto L_0x0019
            java.lang.Integer r1 = m81661n(r3, r13, r12)
        L_0x0019:
            if (r1 == 0) goto L_0x0020
            int r12 = r1.intValue()
            return r12
        L_0x0020:
            com.google.apps.d.b.n r0 = r0.f120401a
            com.google.apps.d.b.c r1 = new com.google.apps.d.b.c
            r1.<init>(r0)
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r1.next()
            com.google.apps.d.d.n r0 = (com.google.apps.p3589d.p3593d.C45755n) r0
            com.google.apps.d.d.a r3 = r0.f120318g
            com.google.apps.d.d.b r3 = (com.google.apps.p3589d.p3593d.C45743b) r3
            int r3 = r3.f120261c
            if (r12 <= r3) goto L_0x0081
            if (r13 == 0) goto L_0x0040
            com.google.apps.d.d.v r3 = r0.f120316e
            goto L_0x0042
        L_0x0040:
            com.google.apps.d.d.v r3 = r0.f120315d
        L_0x0042:
            if (r3 == 0) goto L_0x0081
            com.google.apps.d.d.j r4 = r3.f120343b
            boolean r4 = r4.mo49885c(r12, r12)
            if (r4 == 0) goto L_0x0081
            boolean r3 = m81659l(r3, r12)
            if (r13 == 0) goto L_0x0055
            com.google.apps.d.d.v r4 = r0.f120315d
            goto L_0x0057
        L_0x0055:
            com.google.apps.d.d.v r4 = r0.f120316e
        L_0x0057:
            if (r4 == 0) goto L_0x0063
            int r0 = m81658k(r4, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0126
        L_0x0063:
            if (r3 == 0) goto L_0x0075
            boolean r3 = com.google.apps.p3589d.p3592c.C45728d.m81508b(r0)
            com.google.apps.d.d.a r0 = r0.f120318g
            com.google.apps.d.d.b r0 = (com.google.apps.p3589d.p3593d.C45743b) r0
            if (r3 == 0) goto L_0x0072
            int r0 = r0.f120261c
            goto L_0x007b
        L_0x0072:
            int r0 = r0.f120260b
            goto L_0x007b
        L_0x0075:
            com.google.apps.d.d.a r0 = r0.f120318g
            com.google.apps.d.d.b r0 = (com.google.apps.p3589d.p3593d.C45743b) r0
            int r0 = r0.f120262d
        L_0x007b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0126
        L_0x0081:
            boolean r3 = r0 instanceof com.google.apps.p3589d.p3593d.C45760s
            if (r3 == 0) goto L_0x00ac
            r3 = r0
            com.google.apps.d.d.s r3 = (com.google.apps.p3589d.p3593d.C45760s) r3
            if (r13 == 0) goto L_0x008d
            com.google.apps.d.d.v r4 = r3.f120334j
            goto L_0x008f
        L_0x008d:
            com.google.apps.d.d.v r4 = r3.f120333i
        L_0x008f:
            com.google.apps.d.d.j r5 = r4.f120343b
            boolean r5 = r5.mo49885c(r12, r12)
            if (r5 == 0) goto L_0x010a
            boolean r0 = m81659l(r4, r12)
            if (r13 == 0) goto L_0x00a0
            com.google.apps.d.d.v r3 = r3.f120333i
            goto L_0x00a2
        L_0x00a0:
            com.google.apps.d.d.v r3 = r3.f120334j
        L_0x00a2:
            int r0 = m81658k(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0126
        L_0x00ac:
            boolean r3 = r0 instanceof com.google.apps.p3589d.p3593d.C45737ae
            if (r3 == 0) goto L_0x010a
            r3 = r0
            com.google.apps.d.d.ae r3 = (com.google.apps.p3589d.p3593d.C45737ae) r3
            com.google.apps.d.b.j r4 = r3.f120249j
            java.util.ArrayList r4 = r4.f120220a
            int r4 = r4.size()
            com.google.apps.d.b.j r5 = r3.f120249j
            int r5 = com.google.apps.p3589d.p3593d.C45737ae.m81534n(r5)
            r6 = 0
            r7 = 0
        L_0x00c3:
            if (r7 >= r4) goto L_0x010a
            r8 = 0
        L_0x00c6:
            if (r8 >= r5) goto L_0x0107
            com.google.apps.d.b.j r9 = r3.f120249j
            java.lang.Object r9 = r9.mo49815d(r7)
            com.google.apps.d.b.j r9 = (com.google.apps.p3589d.p3591b.C45719j) r9
            java.lang.Object r9 = r9.mo49815d(r8)
            com.google.apps.d.d.v r9 = (com.google.apps.p3589d.p3593d.C45763v) r9
            com.google.apps.d.d.j r10 = r9.f120343b
            boolean r10 = r10.mo49885c(r12, r12)
            if (r10 == 0) goto L_0x0104
            if (r13 == 0) goto L_0x00e3
            int r10 = r7 + -1
            goto L_0x00e5
        L_0x00e3:
            int r10 = r7 + 1
        L_0x00e5:
            if (r10 < 0) goto L_0x0107
            if (r10 >= r4) goto L_0x0107
            boolean r0 = m81659l(r9, r12)
            com.google.apps.d.b.j r3 = r3.f120249j
            java.lang.Object r3 = r3.mo49815d(r10)
            com.google.apps.d.b.j r3 = (com.google.apps.p3589d.p3591b.C45719j) r3
            java.lang.Object r3 = r3.mo49815d(r8)
            com.google.apps.d.d.v r3 = (com.google.apps.p3589d.p3593d.C45763v) r3
            int r0 = m81658k(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0126
        L_0x0104:
            int r8 = r8 + 1
            goto L_0x00c6
        L_0x0107:
            int r7 = r7 + 1
            goto L_0x00c3
        L_0x010a:
            if (r13 == 0) goto L_0x010f
            com.google.apps.d.d.v r0 = r0.f120315d
            goto L_0x0111
        L_0x010f:
            com.google.apps.d.d.v r0 = r0.f120316e
        L_0x0111:
            if (r0 == 0) goto L_0x0125
            com.google.apps.d.d.j r3 = r0.f120343b
            boolean r3 = r3.mo49885c(r12, r12)
            if (r3 != 0) goto L_0x0125
            r3 = 1
            int r0 = m81658k(r0, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0126
        L_0x0125:
            r0 = r2
        L_0x0126:
            if (r0 == 0) goto L_0x0027
            int r12 = r0.intValue()
        L_0x012c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3594e.C45795y.m81654g(int, boolean):int");
    }

    /* renamed from: h */
    private final C45763v m81655h(C45703t tVar) {
        C45712c cVar = new C45712c(this.f120419p);
        C45763v vVar = null;
        while (cVar.hasNext()) {
            C45763v vVar2 = (C45763v) cVar.next();
            if (vVar2.f120343b.mo49885c(tVar.mo49798d(), tVar.mo49797c())) {
                if (vVar != null) {
                    C45745d dVar = (C45745d) vVar.f120343b;
                    int i = dVar.f120266b - dVar.f120265a;
                    C45745d dVar2 = (C45745d) vVar2.f120343b;
                    if (i <= dVar2.f120266b - dVar2.f120265a) {
                    }
                }
                vVar = vVar2;
            }
        }
        return vVar;
    }

    /* renamed from: i */
    private final C45794x m81656i(int i) {
        C45794x xVar = new C45794x();
        C45712c cVar = new C45712c(this.f120415k);
        while (cVar.hasNext()) {
            C45755n nVar = (C45755n) cVar.next();
            if (!(nVar instanceof C45737ae) || ((C45737ae) nVar).f120246a != C45740ah.LINES) {
                C45732a aVar = nVar.f120318g;
                C45743b bVar = (C45743b) aVar;
                if (bVar.f120262d == i || bVar.f120261c == i) {
                    xVar.f120402b = nVar;
                } else if (bVar.f120260b == i) {
                    xVar.f120403c = nVar;
                } else if (aVar.mo49861d(i)) {
                    xVar.f120401a.f120220a.add(nVar);
                }
            }
        }
        C45723n nVar2 = xVar.f120401a;
        Collections.sort(nVar2.f120220a, C45793w.f120400a);
        return xVar;
    }

    /* renamed from: j */
    private final boolean m81657j(int i) {
        int o = mo49913o(i);
        return o >= 0 && ((Integer) this.f120414j.mo49815d(o)).intValue() == i;
    }

    /* renamed from: k */
    private static final int m81658k(C45763v vVar, boolean z) {
        C45745d dVar = (C45745d) vVar.f120343b;
        return z ? dVar.f120265a : dVar.f120266b;
    }

    /* renamed from: l */
    private static final boolean m81659l(C45763v vVar, int i) {
        return i < ((C45745d) vVar.f120343b).f120266b;
    }

    /* renamed from: m */
    private final int m81660m(int i) {
        int a = this.f120412h.mo49743a();
        switch (i - 1) {
            case 0:
                return mo49914p(a, -1);
            case 1:
                return mo49914p(a, 1);
            case 2:
                int f = m81653f(false);
                if (f != a) {
                    return f;
                }
                return mo49914p(a, -1);
            case 3:
                int f2 = m81653f(true);
                if (f2 != a) {
                    return f2;
                }
                return mo49914p(a, 1);
            case 4:
                return m81654g(this.f120412h.mo49743a(), true);
            case 5:
                return m81654g(this.f120412h.mo49743a(), false);
            case 7:
                C45763v h = m81655h(this.f120412h);
                if (h == null) {
                    return 0;
                }
                return ((C45745d) h.f120343b).f120265a;
            case 8:
                C45763v h2 = m81655h(this.f120412h);
                return h2 == null ? this.f120411g.length() : ((C45745d) h2.f120343b).f120266b;
            case 9:
                return 0;
            case 10:
                return this.f120411g.length();
            default:
                C45755n nVar = (C45755n) m81656i(a).f120401a.mo49816e(0);
                return nVar == null ? a : ((C45743b) nVar.f120318g).f120262d;
        }
    }

    /* renamed from: n */
    private static final Integer m81661n(C45755n nVar, boolean z, int i) {
        int i2;
        C45763v vVar;
        C45743b bVar = (C45743b) nVar.f120318g;
        int i3 = 0;
        C45945j.m82040b(bVar.f120260b == i || bVar.f120262d == i || bVar.f120261c == i, "false");
        C45743b bVar2 = (C45743b) nVar.f120318g;
        int i4 = bVar2.f120262d;
        boolean z2 = i == bVar2.f120260b;
        C45763v vVar2 = z ? nVar.f120315d : nVar.f120316e;
        if (i == i4 && vVar2 != null) {
            return Integer.valueOf(m81658k(vVar2, false));
        }
        if (nVar instanceof C45760s) {
            C45760s sVar = (C45760s) nVar;
            if (z) {
                vVar = sVar.f120333i;
            } else {
                vVar = sVar.f120334j;
            }
            return Integer.valueOf(m81658k(vVar, z2));
        } else if (nVar instanceof C45737ae) {
            C45737ae aeVar = (C45737ae) nVar;
            C45719j jVar = aeVar.f120249j;
            if (z) {
                i2 = 0;
            } else {
                i2 = jVar.f120220a.size() - 1;
            }
            C45719j jVar2 = (C45719j) jVar.mo49815d(i2);
            if (!z2) {
                i3 = C45737ae.m81534n(aeVar.f120249j) - 1;
            }
            return Integer.valueOf(m81658k((C45763v) jVar2.mo49815d(i3), z2));
        } else if (vVar2 != null) {
            return Integer.valueOf(m81658k(vVar2, true));
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo49801b(C45703t tVar) {
        C45945j.m82040b(mo49915q(tVar).equals(tVar), "Cursors must be valid and selection must be complete.");
        int a = tVar.mo49743a();
        if (m81657j(a)) {
            mo49800a(new C45792v(this, tVar));
            return;
        }
        String str = this.f120411g;
        throw new IllegalArgumentException(a + " is not a valid cursor position in " + str);
    }

    /* renamed from: d */
    public final void mo49803d(int i) {
        int i2;
        int i3 = 0;
        if (i == 7) {
            m81655h(this.f120412h);
            this.f120412h.mo49743a();
            int m = m81660m(7);
            if (m == this.f120412h.mo49743a()) {
                mo49801b(new C45685b(0, this.f120411g.length()));
            } else {
                mo49801b(mo49915q(new C45685b(this.f120412h.mo49744b(), m)));
            }
        } else {
            if (!this.f120412h.mo49799e()) {
                int i4 = i - 1;
                if (i4 == 0) {
                    int d = this.f120412h.mo49798d();
                    mo49801b(new C45685b(d, d));
                    return;
                } else if (i4 != 1) {
                    i2 = -1;
                } else {
                    int c = this.f120412h.mo49797c();
                    mo49801b(new C45685b(c, c));
                    return;
                }
            } else {
                i2 = this.f120412h.mo49743a();
            }
            int m2 = m81660m(i);
            mo49801b(new C45685b(m2, m2));
            if (i2 != 0) {
                i3 = i2;
            } else if (i == 1) {
                C45712c cVar = new C45712c((C45723n) this.f120410f.mo49822a(C45702s.MOVED_PAST_START));
                while (cVar.hasNext()) {
                    ((C45701r) cVar.next()).mo49796a();
                }
                return;
            }
            if (i3 == this.f120411g.length() && i == 2) {
                C45712c cVar2 = new C45712c((C45723n) this.f120410f.mo49822a(C45702s.MOVED_PAST_END));
                while (cVar2.hasNext()) {
                    ((C45701r) cVar2.next()).mo49796a();
                }
            }
        }
    }

    /* renamed from: e */
    public final C45682aa mo49742e(C45698o oVar) {
        return C45869aj.m81860a(mo49916r(), oVar, this.f120413i.mo49757b());
    }

    /* renamed from: o */
    public final int mo49913o(int i) {
        int size = this.f120414j.f120220a.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = (i2 + size) / 2;
            int intValue = ((Integer) this.f120414j.mo49815d(i3)).intValue();
            if (i == intValue) {
                return i3;
            }
            if (i >= intValue) {
                i2 = i3 + 1;
            } else {
                size = i3;
            }
        }
        return size - 1;
    }

    /* renamed from: p */
    public final int mo49914p(int i, int i2) {
        int o;
        if (this.f120414j.f120220a.size() == 0 || (o = mo49913o(i) + i2) < 0) {
            return 0;
        }
        if (o < this.f120414j.f120220a.size()) {
            return ((Integer) this.f120414j.mo49815d(o)).intValue();
        }
        C45723n nVar = this.f120414j;
        return ((Integer) nVar.mo49815d(nVar.f120220a.size() - 1)).intValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final C45703t mo49915q(C45703t tVar) {
        int i;
        int i2;
        if (tVar.mo49799e() && m81657j(tVar.mo49743a())) {
            return tVar;
        }
        C45763v h = m81655h(tVar);
        int c = tVar.mo49797c();
        int a = tVar.mo49743a();
        int i3 = 0;
        boolean z = c == a;
        if (h == null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = this.f120411g.length();
            }
            if (z) {
                i3 = this.f120411g.length();
            }
            return new C45685b(i2, i3);
        }
        int d = tVar.mo49798d();
        int c2 = tVar.mo49797c();
        C45745d dVar = (C45745d) h.f120343b;
        int i4 = dVar.f120265a;
        int i5 = dVar.f120266b;
        C45712c cVar = new C45712c(h.f120342a);
        while (cVar.hasNext()) {
            C45755n nVar = (C45755n) cVar.next();
            C45743b bVar = (C45743b) nVar.f120318g;
            int i6 = bVar.f120260b;
            if (i6 <= d) {
                i4 = i6;
            }
            int i7 = bVar.f120262d;
            if (c2 <= i7 && i7 < i5) {
                i5 = i7;
            }
            if (C45728d.m81508b(nVar) && c2 <= (i = bVar.f120261c) && i < i5) {
                i5 = i;
            }
        }
        int i8 = c == a ? i4 : i5;
        if (c != a) {
            i5 = i4;
        }
        return new C45685b(i8, i5);
    }

    /* renamed from: r */
    public final C45880f mo49916r() {
        if (this.f120418o) {
            this.f120417n = C45875ap.m81868a(this.f120407c, this.f120416m, this.f120413i);
            this.f120418o = false;
        }
        return this.f120417n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo49917s(C45749h hVar) {
        this.f120407c = hVar;
        this.f120411g = C45728d.m81507a(hVar, this.f120415k, this.f120419p, this.f120414j);
        this.f120418o = true;
        this.f120408d = true;
    }
}
