package com.google.apps.p3589d.p3594e;

import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45700q;
import com.google.apps.p3589d.p3590a.C45701r;
import com.google.apps.p3589d.p3590a.C45702s;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3590a.C45707x;
import com.google.apps.p3589d.p3591b.C45712c;
import com.google.apps.p3589d.p3591b.C45719j;
import com.google.apps.p3589d.p3591b.C45723n;
import com.google.apps.p3589d.p3592c.C45729e;
import com.google.apps.p3589d.p3593d.C45737ae;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45749h;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45763v;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3596g.C45833ai;
import com.google.apps.p3589d.p3600k.C45943h;
import com.google.apps.p3589d.p3600k.C45945j;

/* renamed from: com.google.apps.d.e.u */
/* compiled from: PG */
public final class C45791u extends C45795y {

    /* renamed from: b */
    public static final /* synthetic */ int f120394b = 0;

    /* renamed from: a */
    public int f120395a = 0;

    /* renamed from: m */
    private final C45723n f120396m = new C45723n(0);

    /* renamed from: n */
    private boolean f120397n = false;

    public C45791u(C45819v vVar, C45707x xVar) {
        super(vVar, C45749h.f120309a, xVar);
        mo49909k();
    }

    /* renamed from: n */
    public static final int m81640n(C45737ae aeVar, int i) {
        for (int i2 = 0; i2 < aeVar.f120249j.f120220a.size(); i2++) {
            C45712c cVar = new C45712c((C45719j) aeVar.f120249j.mo49815d(i2));
            while (cVar.hasNext()) {
                if (((C45763v) cVar.next()).f120343b.mo49885c(i, i)) {
                    return i2;
                }
            }
        }
        return aeVar.f120249j.f120220a.size() - 1;
    }

    /* renamed from: t */
    private final C45755n m81641t(int i) {
        C45737ae aeVar = this.f120407c.f120310b;
        C45712c cVar = new C45712c(this.f120415k);
        C45755n nVar = null;
        while (cVar.hasNext()) {
            C45755n nVar2 = (C45755n) cVar.next();
            if (nVar2 != aeVar && nVar2.f120318g.mo49861d(i)) {
                if (nVar != null) {
                    C45743b bVar = (C45743b) nVar.f120318g;
                    int i2 = bVar.f120262d - bVar.f120260b;
                    C45743b bVar2 = (C45743b) nVar2.f120318g;
                    if (i2 <= bVar2.f120262d - bVar2.f120260b) {
                    }
                }
                nVar = nVar2;
            }
        }
        return nVar;
    }

    /* renamed from: a */
    public final void mo49800a(C45700q qVar) {
        boolean z = this.f120397n;
        this.f120397n = true;
        C45749h hVar = this.f120407c;
        qVar.mo49795a();
        if (!z) {
            C45789s sVar = (C45789s) this.f120396m.mo49815d(this.f120395a);
            if (hVar != sVar.f120390a) {
                C45703t tVar = sVar.f120391b;
            }
            C45703t tVar2 = this.f120412h;
            if (((C45789s) this.f120396m.mo49815d(this.f120395a)).f120390a != this.f120407c) {
                int i = this.f120395a + 1;
                this.f120395a = i;
                this.f120396m.mo49831j(i);
                C45723n nVar = this.f120396m;
                nVar.f120220a.add(new C45789s(this.f120407c, tVar2));
            }
            this.f120397n = false;
            if (this.f120408d) {
                C45712c cVar = new C45712c((C45723n) this.f120410f.mo49822a(C45702s.MATH_UPDATED));
                while (cVar.hasNext()) {
                    ((C45701r) cVar.next()).mo49796a();
                }
            }
            if (this.f120408d || this.f120409e) {
                C45712c cVar2 = new C45712c((C45723n) this.f120410f.mo49822a(C45702s.CURSOR_UPDATED));
                while (cVar2.hasNext()) {
                    ((C45701r) cVar2.next()).mo49796a();
                }
            }
            this.f120408d = false;
            this.f120409e = false;
        }
    }

    /* renamed from: c */
    public final void mo49802c() {
        mo49800a(new C45785o(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo49904f(C45729e eVar) {
        C45774d dVar = new C45774d(eVar);
        mo49917s(this.f120407c.mo49881c(dVar));
        return dVar.f120364a.mo49845a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a0  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.apps.p3589d.p3591b.C45719j mo49905g(com.google.apps.p3589d.p3590a.C45703t r10, boolean r11) {
        /*
            r9 = this;
            boolean r0 = r10.mo49799e()
            if (r0 == 0) goto L_0x01a3
            int r10 = r10.mo49743a()
            com.google.apps.d.d.h r0 = r9.f120407c
            com.google.apps.d.d.ae r0 = r0.f120310b
            int r1 = m81640n(r0, r10)
            r2 = 2
            r3 = 1
            r4 = 0
            r5 = 0
            if (r1 < 0) goto L_0x0092
            com.google.apps.d.b.j r6 = r0.f120249j
            java.lang.Object r6 = r6.mo49815d(r1)
            com.google.apps.d.b.j r6 = (com.google.apps.p3589d.p3591b.C45719j) r6
            java.lang.Object r6 = r6.mo49816e(r4)
            com.google.apps.d.d.v r6 = (com.google.apps.p3589d.p3593d.C45763v) r6
            if (r6 == 0) goto L_0x0092
            com.google.apps.d.d.j r6 = r6.f120343b
            com.google.apps.d.d.d r6 = (com.google.apps.p3589d.p3593d.C45745d) r6
            int r6 = r6.f120265a
            if (r10 != r6) goto L_0x0092
            com.google.apps.d.b.j r6 = r0.f120249j
            java.lang.Object r6 = r6.mo49815d(r1)
            com.google.apps.d.b.j r6 = (com.google.apps.p3589d.p3591b.C45719j) r6
            r7 = 0
        L_0x0039:
            java.util.ArrayList r8 = r6.f120220a
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0055
            java.lang.Object r8 = r6.mo49815d(r7)
            com.google.apps.d.d.v r8 = (com.google.apps.p3589d.p3593d.C45763v) r8
            com.google.apps.d.b.j r8 = r8.f120342a
            java.util.ArrayList r8 = r8.f120220a
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0052
            goto L_0x0092
        L_0x0052:
            int r7 = r7 + 1
            goto L_0x0039
        L_0x0055:
            com.google.apps.d.b.j r10 = r0.f120249j
            java.util.ArrayList r10 = r10.f120220a
            int r10 = r10.size()
            if (r10 >= r2) goto L_0x0061
            goto L_0x00c9
        L_0x0061:
            com.google.apps.d.b.n r10 = new com.google.apps.d.b.n
            r10.<init>(r4)
            com.google.apps.d.b.j r2 = r0.f120249j
            com.google.apps.d.b.j r2 = r2.mo49813b(r4, r1)
            r10.mo49832k(r2)
            com.google.apps.d.b.j r0 = r0.f120249j
            int r2 = r1 + 1
            java.util.ArrayList r6 = r0.f120220a
            int r6 = r6.size()
            com.google.apps.d.b.j r0 = r0.mo49813b(r2, r6)
            r10.mo49832k(r0)
            if (r1 <= 0) goto L_0x0085
            int r0 = r1 + -1
            goto L_0x0086
        L_0x0085:
            r0 = 0
        L_0x0086:
            if (r1 != 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r3 = 0
        L_0x008a:
            com.google.apps.d.b.j r10 = r10.mo49829f()
            r9.mo49911m(r10, r0, r3)
            goto L_0x00c9
        L_0x0092:
            com.google.apps.d.d.h r0 = r9.f120407c
            com.google.apps.d.d.ae r0 = r0.f120310b
            com.google.apps.d.b.n r1 = r9.f120415k
            com.google.apps.d.b.c r6 = new com.google.apps.d.b.c
            r6.<init>(r1)
        L_0x009d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x00b8
            java.lang.Object r1 = r6.next()
            com.google.apps.d.d.n r1 = (com.google.apps.p3589d.p3593d.C45755n) r1
            if (r1 == r0) goto L_0x009d
            com.google.apps.d.d.a r7 = r1.f120318g
            com.google.apps.d.d.b r7 = (com.google.apps.p3589d.p3593d.C45743b) r7
            int r8 = r7.f120262d
            if (r8 == r10) goto L_0x00b9
            int r7 = r7.f120261c
            if (r7 != r10) goto L_0x009d
            goto L_0x00b9
        L_0x00b8:
            r1 = r5
        L_0x00b9:
            if (r1 != 0) goto L_0x00c4
            com.google.apps.d.d.n r6 = r9.m81641t(r10)
            if (r6 == 0) goto L_0x00c4
            if (r6 == r0) goto L_0x00c4
            r1 = r6
        L_0x00c4:
            if (r1 != 0) goto L_0x00cc
            r9.mo49803d(r3)
        L_0x00c9:
            r10 = r5
            goto L_0x019d
        L_0x00cc:
            com.google.apps.d.d.v r0 = r1.f120315d
        L_0x00ce:
            if (r4 >= r2) goto L_0x00ff
            if (r0 == 0) goto L_0x00fa
            com.google.apps.d.d.j r6 = r0.f120343b
            com.google.apps.d.d.d r6 = (com.google.apps.p3589d.p3593d.C45745d) r6
            int r6 = r6.f120265a
            if (r6 != r10) goto L_0x00fa
            r1 = -1
            int r1 = super.mo49914p(r10, r1)
            com.google.apps.d.b.j r0 = r0.f120342a
            java.util.ArrayList r0 = r0.f120220a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f2
            com.google.apps.d.a.b r10 = new com.google.apps.d.a.b
            r10.<init>(r1, r1)
            r9.mo49801b(r10)
            goto L_0x00c9
        L_0x00f2:
            com.google.apps.d.a.b r0 = new com.google.apps.d.a.b
            r0.<init>(r1, r10)
            r10 = r0
            goto L_0x019d
        L_0x00fa:
            com.google.apps.d.d.v r0 = r1.f120316e
            int r4 = r4 + 1
            goto L_0x00ce
        L_0x00ff:
            com.google.apps.d.d.v r0 = r1.f120315d
            if (r0 != 0) goto L_0x0107
            com.google.apps.d.d.v r0 = r1.f120316e
            if (r0 == 0) goto L_0x0113
        L_0x0107:
            com.google.apps.d.d.a r0 = r1.f120318g
            com.google.apps.d.d.b r0 = (com.google.apps.p3589d.p3593d.C45743b) r0
            int r0 = r0.f120262d
            if (r0 != r10) goto L_0x0113
            r9.mo49803d(r3)
            goto L_0x00c9
        L_0x0113:
            boolean r0 = r1 instanceof com.google.apps.p3589d.p3593d.C45761t
            if (r0 == 0) goto L_0x0139
            r0 = r1
            com.google.apps.d.d.t r0 = (com.google.apps.p3589d.p3593d.C45761t) r0
            com.google.apps.d.d.v r0 = r0.f120344i
            com.google.apps.d.d.j r0 = r0.f120343b
            com.google.apps.d.d.d r0 = (com.google.apps.p3589d.p3593d.C45745d) r0
            int r2 = r0.f120265a
            if (r2 != r10) goto L_0x0130
            com.google.apps.d.d.a r0 = r1.f120318g
            com.google.apps.d.d.b r0 = (com.google.apps.p3589d.p3593d.C45743b) r0
            int r0 = r0.f120260b
            com.google.apps.d.a.b r1 = new com.google.apps.d.a.b
            r1.<init>(r0, r10)
            goto L_0x0137
        L_0x0130:
            int r0 = r0.f120266b
            com.google.apps.d.a.b r1 = new com.google.apps.d.a.b
            r1.<init>(r0, r10)
        L_0x0137:
            r10 = r1
            goto L_0x019d
        L_0x0139:
            boolean r0 = r1 instanceof com.google.apps.p3589d.p3593d.C45765x
            if (r0 == 0) goto L_0x0184
            r0 = r1
            com.google.apps.d.d.x r0 = (com.google.apps.p3589d.p3593d.C45765x) r0
            com.google.apps.d.d.v r2 = r0.f120345a
            if (r2 == 0) goto L_0x0184
            com.google.apps.d.b.j r4 = r2.f120342a
            java.util.ArrayList r4 = r4.f120220a
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0184
            com.google.apps.d.d.j r2 = r2.f120343b
            com.google.apps.d.d.d r2 = (com.google.apps.p3589d.p3593d.C45745d) r2
            int r2 = r2.f120265a
            if (r2 != r10) goto L_0x0184
            com.google.apps.d.d.v r10 = r0.f120345a
            if (r10 != 0) goto L_0x015c
            r10 = r0
            goto L_0x0164
        L_0x015c:
            com.google.apps.d.d.n r10 = r0.mo49887e()
            com.google.apps.d.d.x r10 = (com.google.apps.p3589d.p3593d.C45765x) r10
            r10.f120345a = r5
        L_0x0164:
            com.google.apps.d.e.b r1 = new com.google.apps.d.e.b
            r1.<init>(r0, r10)
            com.google.apps.d.d.h r0 = r9.f120407c
            com.google.apps.d.d.h r0 = r0.mo49881c(r1)
            r9.mo49917s(r0)
            com.google.apps.d.d.v r10 = r10.f120346b
            com.google.apps.d.d.j r10 = r10.f120343b
            com.google.apps.d.d.d r10 = (com.google.apps.p3589d.p3593d.C45745d) r10
            int r10 = r10.f120265a
            com.google.apps.d.a.b r0 = new com.google.apps.d.a.b
            r0.<init>(r10, r10)
            r9.mo49801b(r0)
            goto L_0x00c9
        L_0x0184:
            boolean r10 = r1.mo49864i()
            if (r10 == 0) goto L_0x0198
            com.google.apps.d.d.a r10 = r1.f120318g
            com.google.apps.d.d.b r10 = (com.google.apps.p3589d.p3593d.C45743b) r10
            int r0 = r10.f120260b
            int r10 = r10.f120261c
            com.google.apps.d.a.b r1 = new com.google.apps.d.a.b
            r1.<init>(r0, r10)
            goto L_0x0137
        L_0x0198:
            r9.mo49803d(r3)
            goto L_0x00c9
        L_0x019d:
            if (r10 == 0) goto L_0x01a0
            goto L_0x01a3
        L_0x01a0:
            com.google.apps.d.b.j r10 = com.google.apps.p3589d.p3591b.C45719j.f120222b
            return r10
        L_0x01a3:
            com.google.apps.d.e.ab r0 = new com.google.apps.d.e.ab
            r0.<init>(r10, r11)
            com.google.apps.d.d.h r10 = r9.f120407c
            com.google.apps.d.d.h r10 = r10.mo49881c(r0)
            r9.mo49917s(r10)
            boolean r10 = r0.f120354a
            if (r10 == 0) goto L_0x01bf
            com.google.apps.d.c.e r10 = r0.f120355b
            com.google.apps.p3589d.p3600k.C45945j.m82042d(r10)
            int r10 = r9.mo49904f(r10)
            goto L_0x01c8
        L_0x01bf:
            com.google.apps.d.c.e r10 = r0.f120355b
            com.google.apps.p3589d.p3600k.C45945j.m82042d(r10)
            int r10 = r10.mo49845a()
        L_0x01c8:
            com.google.apps.d.a.b r11 = new com.google.apps.d.a.b
            r11.<init>(r10, r10)
            r9.mo49801b(r11)
            com.google.apps.d.b.n r10 = r0.f120356c
            com.google.apps.d.b.j r10 = com.google.apps.p3589d.p3591b.C45719j.m81475f(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3594e.C45791u.mo49905g(com.google.apps.d.a.t, boolean):com.google.apps.d.b.j");
    }

    /* renamed from: h */
    public final C45763v mo49906h() {
        C45703t tVar = this.f120412h;
        if (tVar.mo49799e()) {
            return C45763v.m81596d();
        }
        return new C45763v(mo49905g(tVar, false));
    }

    /* renamed from: i */
    public final C45768a mo49907i(C45763v vVar, C45729e eVar) {
        C45768a aVar = new C45768a(this.f120412h.mo49743a(), vVar, eVar);
        mo49917s(this.f120407c.mo49881c(aVar));
        int a = aVar.mo49900c().mo49845a();
        mo49801b(new C45685b(a, a));
        return aVar;
    }

    /* renamed from: j */
    public final void mo49908j(int i, boolean z) {
        C45755n nVar;
        C45763v vVar;
        if (!this.f120412h.mo49799e()) {
            mo49802c();
        }
        int a = this.f120412h.mo49743a();
        C45737ae aeVar = this.f120407c.f120310b;
        C45712c cVar = new C45712c(this.f120415k);
        while (true) {
            if (!cVar.hasNext()) {
                nVar = null;
                break;
            }
            nVar = (C45755n) cVar.next();
            if (nVar != aeVar && ((C45743b) nVar.f120318g).f120262d == a) {
                break;
            }
        }
        int i2 = 0;
        while (nVar != null) {
            a = ((C45743b) nVar.f120318g).f120262d;
            if (z) {
                vVar = nVar.f120315d;
            } else {
                vVar = nVar.f120316e;
            }
            if (vVar == null) {
                break;
            }
            nVar = vVar.mo49897c();
            i2++;
        }
        mo49801b(new C45685b(a, a));
        boolean z2 = true;
        C45945j.m82041c(mo49910l(true != z ? "{}_{\\selection}" : "{}^{\\selection}"));
        C45755n d = C45833ai.m81765d(i);
        if (d == null) {
            z2 = false;
        } else {
            mo49800a(new C45783m(this, d));
        }
        C45945j.m82041c(z2);
        for (int i3 = 0; i3 < i2; i3++) {
            mo49803d(2);
        }
        C45755n t = m81641t(this.f120412h.mo49743a());
        if (t != null) {
            int i4 = ((C45743b) t.f120318g).f120262d;
            mo49801b(new C45685b(i4, i4));
        }
    }

    /* renamed from: k */
    public final void mo49909k() {
        this.f120396m.f120220a.clear();
        C45723n nVar = this.f120396m;
        nVar.f120220a.add(new C45789s(this.f120407c, this.f120412h));
        this.f120395a = 0;
    }

    /* renamed from: l */
    public final boolean mo49910l(String str) {
        C45943h hVar = new C45943h(false);
        mo49800a(new C45778h(this, str, hVar));
        return ((Boolean) hVar.f120733a).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.apps.d.d.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.apps.d.d.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49911m(com.google.apps.p3589d.p3591b.C45719j r4, int r5, boolean r6) {
        /*
            r3 = this;
            com.google.apps.d.d.ah r0 = com.google.apps.p3589d.p3593d.C45740ah.LINES
            r1 = 0
            com.google.apps.d.d.ae r4 = com.google.apps.p3589d.p3593d.C45737ae.m81535o(r0, r1, r4)
            com.google.apps.d.d.h r0 = com.google.apps.p3589d.p3593d.C45749h.m81558a(r4)
            r3.mo49917s(r0)
            com.google.apps.d.b.j r0 = r4.f120249j
            java.util.ArrayList r0 = r0.f120220a
            int r0 = r0.size()
            r2 = 0
            if (r0 > r5) goto L_0x001a
            goto L_0x004b
        L_0x001a:
            if (r6 == 0) goto L_0x002c
            com.google.apps.d.b.j r4 = r4.f120249j
            java.lang.Object r4 = r4.mo49815d(r5)
            com.google.apps.d.b.j r4 = (com.google.apps.p3589d.p3591b.C45719j) r4
            java.lang.Object r4 = r4.mo49815d(r2)
            r1 = r4
            com.google.apps.d.d.v r1 = (com.google.apps.p3589d.p3593d.C45763v) r1
            goto L_0x004b
        L_0x002c:
            com.google.apps.d.b.j r0 = r4.f120249j
            java.lang.Object r0 = r0.mo49815d(r5)
            com.google.apps.d.b.j r0 = (com.google.apps.p3589d.p3591b.C45719j) r0
            com.google.apps.d.b.j r4 = r4.f120249j
            java.lang.Object r4 = r4.mo49815d(r5)
            com.google.apps.d.b.j r4 = (com.google.apps.p3589d.p3591b.C45719j) r4
            java.util.ArrayList r4 = r4.f120220a
            int r4 = r4.size()
            int r4 = r4 + -1
            java.lang.Object r4 = r0.mo49815d(r4)
            r1 = r4
            com.google.apps.d.d.v r1 = (com.google.apps.p3589d.p3593d.C45763v) r1
        L_0x004b:
            if (r1 != 0) goto L_0x004e
            goto L_0x0059
        L_0x004e:
            com.google.apps.d.d.j r4 = r1.f120343b
            com.google.apps.d.d.d r4 = (com.google.apps.p3589d.p3593d.C45745d) r4
            if (r6 == 0) goto L_0x0057
            int r2 = r4.f120265a
            goto L_0x0059
        L_0x0057:
            int r2 = r4.f120266b
        L_0x0059:
            com.google.apps.d.a.b r4 = new com.google.apps.d.a.b
            r4.<init>(r2, r2)
            r3.mo49801b(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.p3589d.p3594e.C45791u.mo49911m(com.google.apps.d.b.j, int, boolean):void");
    }
}
