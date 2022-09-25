package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.C75911l;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.ab */
/* compiled from: PG */
public final class C75916ab implements C75909j, C75864b {

    /* renamed from: a */
    private final C75910k f210631a;

    /* renamed from: b */
    private final C75866e f210632b;

    /* renamed from: c */
    private final C75911l f210633c;

    public C75916ab(C75910k kVar, C75911l lVar, C75866e eVar) {
        this.f210631a = kVar;
        this.f210632b = eVar;
        this.f210633c = lVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71916c(com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax r7) {
        /*
            r6 = this;
            int r0 = r7.f220049a
            r1 = 5
            if (r0 != r1) goto L_0x007e
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r2 = 1
            int r3 = r7.f220049a     // Catch:{ o -> 0x0078 }
            if (r3 != r1) goto L_0x0014
            java.lang.Object r3 = r7.f220050b     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.at r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80199at) r3     // Catch:{ o -> 0x0078 }
            goto L_0x0016
        L_0x0014:
            com.google.android.apps.gsa.nga.shared.aa.d.a.at r3 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80199at.f220028c     // Catch:{ o -> 0x0078 }
        L_0x0016:
            int r3 = r3.f220030a     // Catch:{ o -> 0x0078 }
            r4 = 2
            if (r3 == 0) goto L_0x0025
            if (r3 == r2) goto L_0x0023
            if (r3 == r4) goto L_0x0021
            r3 = 0
            goto L_0x0026
        L_0x0021:
            r3 = 2
            goto L_0x0026
        L_0x0023:
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 3
        L_0x0026:
            int r5 = r3 + -1
            if (r3 == 0) goto L_0x0076
            r3 = 8
            if (r5 == 0) goto L_0x0063
            if (r5 == r2) goto L_0x0044
            if (r5 == r4) goto L_0x0033
            goto L_0x0068
        L_0x0033:
            com.google.android.apps.gsa.nga.shared.l.a.n r7 = com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81381o.m129461d()     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.t r0 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t.NGA_OPA_PROMO_NOTIFICATION_FLOW_NOT_SPECIFIED     // Catch:{ o -> 0x0078 }
            r7.mo75043b(r0)     // Catch:{ o -> 0x0078 }
            r7.mo75045d(r3)     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.shared.l.a.o r7 = r7.mo75042a()     // Catch:{ o -> 0x0078 }
            throw r7     // Catch:{ o -> 0x0078 }
        L_0x0044:
            com.google.android.apps.gsa.nga.shared.aa.d.a.v r5 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v.GENERIC_TRY_SAYING     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k.m129445c(r0, r5)     // Catch:{ o -> 0x0078 }
            int r5 = r7.f220049a     // Catch:{ o -> 0x0078 }
            if (r5 != r1) goto L_0x0052
            java.lang.Object r7 = r7.f220050b     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.at r7 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80199at) r7     // Catch:{ o -> 0x0078 }
            goto L_0x0054
        L_0x0052:
            com.google.android.apps.gsa.nga.shared.aa.d.a.at r7 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80199at.f220028c     // Catch:{ o -> 0x0078 }
        L_0x0054:
            java.lang.String r1 = ""
            int r5 = r7.f220030a     // Catch:{ o -> 0x0078 }
            if (r5 != r4) goto L_0x005f
            java.lang.Object r7 = r7.f220031b     // Catch:{ o -> 0x0078 }
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ o -> 0x0078 }
        L_0x005f:
            com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75778g.m122142e(r0, r1, r2)     // Catch:{ o -> 0x0078 }
            goto L_0x0068
        L_0x0063:
            com.google.android.apps.gsa.nga.shared.aa.d.a.v r7 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v.SWIPE_EDUCATION     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.shared.p6352l.p6353a.C81377k.m129445c(r0, r7)     // Catch:{ o -> 0x0078 }
        L_0x0068:
            com.google.android.apps.gsa.nga.engine.education.pie.e r7 = r6.f210632b     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.engine.education.pie.m r1 = com.google.android.apps.gsa.nga.engine.education.pie.C75913n.m122414f(r3)     // Catch:{ o -> 0x0078 }
            com.google.android.apps.gsa.nga.engine.education.pie.n r1 = r1.mo71870a()     // Catch:{ o -> 0x0078 }
            r7.mo71904b(r0, r1)     // Catch:{ o -> 0x0078 }
            return
        L_0x0076:
            r7 = 0
            throw r7     // Catch:{ o -> 0x0078 }
        L_0x0078:
            r7 = move-exception
            com.google.android.apps.gsa.nga.engine.education.pie.l r0 = r6.f210633c
            r0.mo71913b(r7, r2)
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.triggering.C75916ab.mo71916c(com.google.android.apps.gsa.nga.shared.aa.d.a.ax):void");
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        this.f210631a.mo71909a(this);
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
        this.f210631a.mo71911c(this);
    }
}
