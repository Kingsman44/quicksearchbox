package com.google.android.apps.search.googleapp.discover.p10173aa;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker$makeScheduledRefresh$2", mo61344c = "FeedSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {217, 219, 221, 225})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bh */
/* compiled from: PG */
final class C134042bh extends C69572j implements C69630p {

    /* renamed from: a */
    int f365111a;

    /* renamed from: b */
    int f365112b;

    /* renamed from: c */
    final /* synthetic */ C134053bs f365113c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134042bh(C134053bs bsVar, C69577g gVar) {
        super(2, gVar);
        this.f365113c = bsVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134042bh) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r7 != r0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r7 != r0) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f365112b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 == r4) goto L_0x001d
            if (r1 == r3) goto L_0x0019
            if (r1 == r2) goto L_0x0015
            int r0 = r6.f365111a
            p5462h.C69714l.m101134b(r7)
            goto L_0x0070
        L_0x0015:
            p5462h.C69714l.m101134b(r7)
            goto L_0x004e
        L_0x0019:
            p5462h.C69714l.m101134b(r7)
            goto L_0x0041
        L_0x001d:
            p5462h.C69714l.m101134b(r7)
            goto L_0x002e
        L_0x0021:
            p5462h.C69714l.m101134b(r7)
            com.google.android.apps.search.googleapp.discover.aa.bs r7 = r6.f365113c
            r6.f365112b = r4
            java.lang.Object r7 = r7.mo111535a(r6)
            if (r7 == r0) goto L_0x0094
        L_0x002e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L_0x0042
            com.google.android.apps.search.googleapp.discover.aa.bs r7 = r6.f365113c
            r6.f365112b = r3
            java.lang.Object r7 = r7.mo111538e(r6)
            if (r7 != r0) goto L_0x0041
            return r0
        L_0x0041:
            return r7
        L_0x0042:
            com.google.android.apps.search.googleapp.discover.aa.bs r7 = r6.f365113c
            com.google.android.apps.search.googleapp.discover.f.d r7 = r7.f365147f
            r6.f365112b = r2
            java.lang.Object r7 = r7.mo111662b(r6)
            if (r7 == r0) goto L_0x0094
        L_0x004e:
            com.google.android.apps.search.googleapp.discover.s.e r7 = (com.google.android.apps.search.googleapp.discover.p10214s.C134587e) r7
            int r7 = r7.f366527d
            com.google.android.apps.search.googleapp.discover.aa.bs r1 = r6.f365113c
            com.google.android.apps.search.googleapp.discover.d.d r1 = r1.f365151j
            r1.mo111646a()
            com.google.android.apps.search.googleapp.discover.aa.bs r1 = r6.f365113c
            com.google.android.apps.search.googleapp.discover.u.ff r2 = r1.f365149h
            com.google.bv.e.b.c.a.bn r3 = com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn.SCHEDULED_REFRESH
            com.google.android.apps.search.googleapp.discover.u.dx r2 = r2.mo112120a(r3)
            r6.f365111a = r7
            r3 = 4
            r6.f365112b = r3
            java.lang.Object r1 = r1.mo111537d(r2, r4, r6)
            if (r1 == r0) goto L_0x0094
            r0 = r7
            r7 = r1
        L_0x0070:
            com.google.android.apps.search.googleapp.discover.aa.bs r1 = r6.f365113c
            r2 = r7
            androidx.work.aa r2 = (androidx.work.C4377aa) r2
            com.google.android.libraries.search.logging.d.kr r1 = r1.f365155n
            boolean r2 = r2 instanceof androidx.work.C4645z
            if (r4 == r2) goto L_0x007e
            java.lang.String r2 = "FAILURE"
            goto L_0x0080
        L_0x007e:
            java.lang.String r2 = "SUCCESS"
        L_0x0080:
            com.google.android.libraries.search.logging.d.lw r1 = r1.f103056a
            com.google.common.base.cr r1 = r1.f103095d
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.libraries.au.f r1 = (com.google.android.libraries.p1635au.C19569f) r1
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r4 = 0
            r3[r4] = r2
            double r4 = (double) r0
            r1.mo24824b(r4, r3)
            return r7
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134042bh.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134042bh(this.f365113c, gVar);
    }
}
