package com.google.android.apps.search.googleapp.discover.p10173aa;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$enqueueAppCloseRefresh$2", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {131, 132, 134})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.u */
/* compiled from: PG */
final class C134077u extends C69572j implements C69630p {

    /* renamed from: a */
    int f365232a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365233b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134077u(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365233b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134077u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r10 != r0) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r10 != r0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ae, code lost:
        if (r1.mo111522k(r10, r9) == r0) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b0, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f365232a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 == r3) goto L_0x0015
            if (r1 == r2) goto L_0x0011
            p5462h.C69714l.m101134b(r10)
            goto L_0x00b1
        L_0x0011:
            p5462h.C69714l.m101134b(r10)
            goto L_0x003e
        L_0x0015:
            p5462h.C69714l.m101134b(r10)
            goto L_0x002a
        L_0x0019:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.googleapp.discover.aa.ak r10 = r9.f365233b
            boolean r1 = r10.f365063l
            if (r1 == 0) goto L_0x00b1
            r9.f365232a = r3
            java.lang.Object r10 = r10.mo111523l(r9)
            if (r10 == r0) goto L_0x00b0
        L_0x002a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00b1
            com.google.android.apps.search.googleapp.discover.aa.ak r10 = r9.f365233b
            com.google.android.apps.search.googleapp.discover.aa.m r10 = r10.f365057f
            r9.f365232a = r2
            java.lang.Object r10 = r10.mo111550a(r9)
            if (r10 == r0) goto L_0x00b0
        L_0x003e:
            com.google.android.apps.search.googleapp.discover.s.i r10 = (com.google.android.apps.search.googleapp.discover.p10214s.C134591i) r10
            com.google.android.apps.search.googleapp.discover.aa.ak r1 = r9.f365233b
            com.google.android.libraries.search.logging.d.kr r1 = r1.f365064m
            com.google.android.libraries.search.logging.d.lw r1 = r1.f103056a
            com.google.common.base.cr r1 = r1.f103093b
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.libraries.au.d r1 = (com.google.android.libraries.p1635au.C19567d) r1
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 1
            r1.mo24822a(r3, r2)
            com.google.android.apps.search.googleapp.discover.aa.ak r1 = r9.f365233b
            com.google.android.apps.search.googleapp.discover.aa.e r2 = r1.f365056e
            java.lang.String r5 = "eligibilityStatus"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)
            com.google.common.f.e r5 = com.google.android.apps.search.googleapp.discover.p10173aa.C134061e.f365172a
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 40545(0x9e61, float:5.6816E-41)
            r6.<init>(r7)
            r5.mo56379ah(r6)
            java.lang.String r6 = "#appCloseRefresh, eligibility %s"
            r5.mo56389s(r6, r10)
            com.google.android.apps.search.googleapp.discover.aa.a r5 = new com.google.android.apps.search.googleapp.discover.aa.a
            androidx.work.ae r6 = r2.mo111544a()
            com.google.common.v.i r7 = r2.f365173b
            j$.time.Instant r7 = r7.mo57444a()
            java.lang.String r8 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            com.google.android.apps.search.googleapp.discover.s.i r8 = com.google.android.apps.search.googleapp.discover.p10214s.C134591i.ELIGIBLE
            if (r10 != r8) goto L_0x0093
            j$.time.Duration r10 = r2.f365180i
            j$.time.Duration r10 = r10.plusMinutes(r3)
            goto L_0x0095
        L_0x0093:
            j$.time.Duration r10 = r2.f365178g
        L_0x0095:
            java.lang.String r3 = "duration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r3)
            j$.time.Duration r10 = r2.mo111548e(r10)
            j$.time.Duration r10 = r2.mo111548e(r10)
            r5.<init>(r6, r7, r10)
            com.google.apps.tiktok.contrib.work.t r10 = r5.f365163c
            r2 = 3
            r9.f365232a = r2
            java.lang.Object r10 = r1.mo111522k(r10, r9)
            if (r10 != r0) goto L_0x00b1
        L_0x00b0:
            return r0
        L_0x00b1:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134077u.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134077u(this.f365233b, gVar);
    }
}
