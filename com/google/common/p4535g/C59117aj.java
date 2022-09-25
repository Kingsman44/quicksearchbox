package com.google.common.p4535g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.common.g.aj */
/* compiled from: PG */
public final class C59117aj {

    /* renamed from: a */
    public static final C59112ae f157104a = new C59111ad();

    /* renamed from: b */
    public final C59203do f157105b;

    /* renamed from: c */
    public final List f157106c = new ArrayList();

    /* renamed from: d */
    private final C59126as f157107d;

    public C59117aj(C59203do doVar) {
        this.f157105b = doVar;
        this.f157107d = doVar.mo56570a();
    }

    /* renamed from: b */
    private final void m91569b(C59215i iVar, double d, int i, C59135ba baVar, C59216j jVar, C59216j jVar2) {
        C59215i iVar2 = iVar;
        int i2 = i;
        C59135ba baVar2 = baVar;
        C59216j jVar3 = jVar;
        C59216j jVar4 = jVar2;
        C59214h hVar = iVar2.f157292b;
        if (hVar.f157290b < d) {
            m91570c(baVar2.mo56495c(i2, 0), iVar, jVar3, jVar4);
        } else if (hVar.f157289a >= d) {
            m91570c(baVar2.mo56495c(i2, 1), iVar2, jVar3, jVar4);
        } else {
            C59215i[] iVarArr = new C59215i[2];
            m91571d(iVar, ((jVar3.f157293a > jVar4.f157293a ? 1 : (jVar3.f157293a == jVar4.f157293a ? 0 : -1)) > 0) != ((jVar3.f157294b > jVar4.f157294b ? 1 : (jVar3.f157294b == jVar4.f157294b ? 0 : -1)) > 0) ? 1 : 0, iVar2.f157291a.mo56586a(C59123ap.m91583c(d, jVar3.f157294b, jVar4.f157294b, jVar3.f157293a, jVar4.f157293a)), 0, d, iVarArr);
            m91570c(baVar2.mo56495c(i2, 0), iVarArr[0], jVar3, jVar4);
            m91570c(baVar2.mo56495c(i2, 1), iVarArr[1], jVar3, jVar4);
        }
    }

    /* renamed from: c */
    private final void m91570c(C59135ba baVar, C59215i iVar, C59216j jVar, C59216j jVar2) {
        C59135ba baVar2 = baVar;
        C59215i iVar2 = iVar;
        C59216j jVar3 = jVar;
        C59216j jVar4 = jVar2;
        C59226t tVar = baVar2.f157150a;
        this.f157107d.mo56443e(tVar.mo56678y());
        if (!this.f157107d.mo56446g() && this.f157107d.mo56439a(tVar.mo56677x()) <= 0) {
            if (this.f157107d.mo56439a(tVar) == 0) {
                this.f157106c.add((C59176co) this.f157107d.mo56441c());
                return;
            }
            C59216j c = baVar.mo56493a().mo56596c();
            C59214h hVar = iVar2.f157291a;
            double d = hVar.f157290b;
            double d2 = c.f157293a;
            if (d < d2) {
                m91569b(iVar, c.f157294b, 0, baVar, jVar, jVar2);
            } else if (hVar.f157289a >= d2) {
                m91569b(iVar, c.f157294b, 1, baVar, jVar, jVar2);
            } else {
                C59215i[] iVarArr = new C59215i[2];
                C59215i[] iVarArr2 = iVarArr;
                m91571d(iVar, 0, d2, ((jVar3.f157293a > jVar4.f157293a ? 1 : (jVar3.f157293a == jVar4.f157293a ? 0 : -1)) > 0) != ((jVar3.f157294b > jVar4.f157294b ? 1 : (jVar3.f157294b == jVar4.f157294b ? 0 : -1)) > 0) ? 1 : 0, iVar2.f157292b.mo56586a(C59123ap.m91583c(d2, jVar3.f157293a, jVar4.f157293a, jVar3.f157294b, jVar4.f157294b)), iVarArr2);
                C59214h hVar2 = iVar2.f157292b;
                double d3 = hVar2.f157290b;
                double d4 = c.f157294b;
                if (d3 < d4) {
                    m91570c(baVar2.mo56495c(0, 0), iVarArr2[0], jVar3, jVar4);
                    m91570c(baVar2.mo56495c(1, 0), iVarArr2[1], jVar3, jVar4);
                } else if (hVar2.f157289a >= d4) {
                    m91570c(baVar2.mo56495c(0, 1), iVarArr2[0], jVar3, jVar4);
                    m91570c(baVar2.mo56495c(1, 1), iVarArr2[1], jVar3, jVar4);
                } else {
                    C59135ba baVar3 = baVar;
                    C59216j jVar5 = jVar;
                    C59216j jVar6 = jVar2;
                    m91569b(iVarArr2[0], d4, 0, baVar3, jVar5, jVar6);
                    m91569b(iVarArr2[1], c.f157294b, 1, baVar3, jVar5, jVar6);
                }
            }
        }
    }

    /* renamed from: d */
    private static final void m91571d(C59215i iVar, int i, double d, int i2, double d2, C59215i[] iVarArr) {
        iVarArr[0] = new C59215i(iVar);
        C59215i iVar2 = new C59215i(iVar);
        iVarArr[1] = iVar2;
        if (i == 0) {
            iVarArr[0].f157291a.f157290b = d;
            iVar2.f157291a.f157289a = d;
        } else {
            iVarArr[0].f157291a.f157289a = d;
            iVar2.f157291a.f157290b = d;
        }
        if (i2 == 0) {
            iVarArr[0].f157292b.f157290b = d2;
            iVar2.f157292b.f157289a = d2;
            return;
        }
        iVarArr[0].f157292b.f157289a = d2;
        iVar2.f157292b.f157290b = d2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        if (r6.mo56440b().mo56677x().mo56658D(r0) != false) goto L_0x009c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56432a(com.google.common.p4535g.C59136bb r12, com.google.common.p4535g.C59136bb r13) {
        /*
            r11 = this;
            java.util.List r0 = r11.f157106c
            r0.clear()
            r0 = 6
            com.google.common.g.am[] r1 = new com.google.common.p4535g.C59120am[r0]
            r2 = 0
            r3 = 0
        L_0x000a:
            if (r3 >= r0) goto L_0x0016
            com.google.common.g.am r4 = new com.google.common.g.am
            r4.<init>()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L_0x000a
        L_0x0016:
            int r12 = com.google.common.p4535g.C59123ap.m91586f(r12, r13, r1)
        L_0x001a:
            if (r2 >= r12) goto L_0x00c7
            r13 = r1[r2]
            com.google.common.g.j r0 = r13.f157120b
            com.google.common.g.j r13 = r13.f157121c
            com.google.common.g.i r3 = new com.google.common.g.i
            double r4 = r0.f157293a
            double r6 = r13.f157293a
            com.google.common.g.h r4 = com.google.common.p4535g.C59214h.m91850d(r4, r6)
            double r5 = r0.f157294b
            double r7 = r13.f157294b
            com.google.common.g.h r13 = com.google.common.p4535g.C59214h.m91850d(r5, r7)
            r3.<init>(r4, r13)
            com.google.common.g.ba r13 = new com.google.common.g.ba
            r0 = r1[r2]
            int r0 = r0.f157119a
            com.google.common.g.t r0 = com.google.common.p4535g.C59226t.m91936q(r0)
            r4 = 0
            r13.<init>(r0, r4)
            com.google.common.g.t r0 = r13.mo56494b(r3)
            com.google.common.g.as r6 = r11.f157107d
            com.google.common.g.t r7 = r0.mo56678y()
            r6.mo56443e(r7)
            boolean r7 = r6.mo56446g()
            r8 = 2
            r9 = 1
            if (r7 != 0) goto L_0x0084
            com.google.common.g.t r7 = r6.mo56440b()
            boolean r7 = r7.mo56658D(r0)
            if (r7 == 0) goto L_0x0074
            com.google.common.g.t r7 = r6.mo56440b()
            com.google.common.g.t r7 = r7.mo56678y()
            boolean r7 = r7.mo56662H(r0)
            if (r7 == 0) goto L_0x0074
            goto L_0x009c
        L_0x0074:
            com.google.common.g.t r7 = r6.mo56440b()
            com.google.common.g.t r10 = r0.mo56677x()
            boolean r7 = r7.mo56662H(r10)
            if (r7 == 0) goto L_0x0084
            r10 = 2
            goto L_0x009d
        L_0x0084:
            boolean r7 = r6.mo56445f()
            r10 = 3
            if (r7 != 0) goto L_0x009d
            r6.mo56451k()
            com.google.common.g.t r6 = r6.mo56440b()
            com.google.common.g.t r6 = r6.mo56677x()
            boolean r6 = r6.mo56658D(r0)
            if (r6 == 0) goto L_0x009d
        L_0x009c:
            r10 = 1
        L_0x009d:
            if (r10 != r9) goto L_0x00ad
            java.util.List r13 = r11.f157106c
            com.google.common.g.as r0 = r11.f157107d
            com.google.common.g.ar r0 = r0.mo56441c()
            com.google.common.g.co r0 = (com.google.common.p4535g.C59176co) r0
            r13.add(r0)
            goto L_0x00c3
        L_0x00ad:
            if (r10 != r8) goto L_0x00c3
            boolean r6 = r0.mo56660F()
            if (r6 != 0) goto L_0x00ba
            com.google.common.g.ba r13 = new com.google.common.g.ba
            r13.<init>(r0, r4)
        L_0x00ba:
            r0 = r1[r2]
            com.google.common.g.j r4 = r0.f157120b
            com.google.common.g.j r0 = r0.f157121c
            r11.m91570c(r13, r3, r4, r0)
        L_0x00c3:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x00c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4535g.C59117aj.mo56432a(com.google.common.g.bb, com.google.common.g.bb):void");
    }
}
