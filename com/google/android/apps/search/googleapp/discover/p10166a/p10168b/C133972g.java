package com.google.android.apps.search.googleapp.discover.p10166a.p10168b;

import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10169a.C133947g;
import com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b.C133963k;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.a.b.g */
/* compiled from: PG */
public final class C133972g {

    /* renamed from: a */
    public final C133963k f364919a;

    /* renamed from: b */
    public final C133947g f364920b;

    /* renamed from: c */
    private final C69585o f364921c;

    public C133972g(C133963k kVar, C133947g gVar, C69585o oVar, C71422aw awVar) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f364919a = kVar;
        this.f364920b = gVar;
        this.f364921c = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111480a(com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b.C133967o r7, java.util.List r8, p5462h.p5466c.C69577g r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133970e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.discover.a.b.e r0 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133970e) r0
            int r1 = r0.f364907e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f364907e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.discover.a.b.e r0 = new com.google.android.apps.search.googleapp.discover.a.b.e
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f364905c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f364907e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r9)
            goto L_0x00a8
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            java.lang.Object r7 = r0.f364904b
            java.lang.Object r8 = r0.f364903a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0058
        L_0x003b:
            p5462h.C69714l.m101134b(r9)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0049
            h.a.am r8 = p5462h.p5463a.C69496am.f185918a
            r9 = r8
            r8 = r6
            goto L_0x005a
        L_0x0049:
            com.google.android.apps.search.googleapp.discover.a.b.b.k r9 = r6.f364919a
            r0.f364903a = r6
            r0.f364904b = r7
            r0.f364907e = r4
            java.lang.Object r9 = r9.mo111472d(r8, r0)
            if (r9 == r1) goto L_0x00ab
            r8 = r6
        L_0x0058:
            java.util.List r9 = (java.util.List) r9
        L_0x005a:
            if (r7 == 0) goto L_0x0089
            com.google.android.apps.search.googleapp.discover.a.b.b.o r7 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b.C133967o) r7
            com.google.common.b.gu r7 = r7.f364889a
            if (r7 == 0) goto L_0x0089
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = p5462h.p5463a.C69540x.m100804k(r7, r4)
            r2.<init>(r4)
            r4 = 0
            com.google.common.b.sm r7 = r7.listIterator(r4)
        L_0x0072:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x008b
            java.lang.Object r4 = r7.next()
            com.google.android.apps.search.googleapp.discover.a.b.b.n r4 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.p10170b.C133966n) r4
            int r4 = r4.f364886a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r2.add(r5)
            goto L_0x0072
        L_0x0089:
            h.a.am r2 = p5462h.p5463a.C69496am.f185918a
        L_0x008b:
            com.google.android.apps.search.googleapp.discover.a.b.g r8 = (com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133972g) r8
            com.google.android.apps.search.googleapp.discover.a.b.b.k r7 = r8.f364919a
            java.util.List r8 = p5462h.p5463a.C69540x.m100831M(r9, r2)
            r9 = 0
            r0.f364903a = r9
            r0.f364904b = r9
            r0.f364907e = r3
            com.google.android.apps.search.googleapp.discover.a.b.b.h r9 = new com.google.android.apps.search.googleapp.discover.a.b.b.h
            r9.<init>(r8)
            java.lang.String r8 = "ActionStore#incrementUploadAttemptCount"
            java.lang.Object r7 = r7.mo111469a(r9, r8, r0)
            if (r7 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10166a.p10168b.C133972g.mo111480a(com.google.android.apps.search.googleapp.discover.a.b.b.o, java.util.List, h.c.g):java.lang.Object");
    }

    /* renamed from: b */
    public final Object mo111481b(int i, List list, boolean z, C69577g gVar) {
        return C71803m.m105040a(this.f364921c, new C133971f(this, i, list, z, (C69577g) null), gVar);
    }
}
