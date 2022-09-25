package com.google.android.apps.search.googleapp.discover.p10173aa;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$enqueuePeriodicJobWithRefreshSchedule$2", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {104, 105, 109, 112, 117})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.aa */
/* compiled from: PG */
final class C134008aa extends C69572j implements C69630p {

    /* renamed from: a */
    Object f365028a;

    /* renamed from: b */
    int f365029b;

    /* renamed from: c */
    final /* synthetic */ C134018ak f365030c;

    /* renamed from: d */
    private /* synthetic */ Object f365031d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134008aa(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365030c = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134008aa) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01f5 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f365029b
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r1 == 0) goto L_0x003c
            if (r1 == r4) goto L_0x0030
            if (r1 == r3) goto L_0x0024
            if (r1 == r5) goto L_0x001b
            if (r1 == r2) goto L_0x0018
            p5462h.C69714l.m101134b(r12)
            goto L_0x01f6
        L_0x0018:
            java.lang.Object r1 = r11.f365031d
            goto L_0x001d
        L_0x001b:
            java.lang.Object r1 = r11.f365031d
        L_0x001d:
            com.google.android.apps.search.googleapp.discover.aa.d r1 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134060d) r1
            p5462h.C69714l.m101134b(r12)
            goto L_0x01e4
        L_0x0024:
            java.lang.Object r1 = r11.f365028a
            com.google.android.apps.search.googleapp.discover.s.i r1 = (com.google.android.apps.search.googleapp.discover.p10214s.C134591i) r1
            java.lang.Object r3 = r11.f365031d
            com.google.android.apps.search.googleapp.discover.aa.e r3 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134061e) r3
            p5462h.C69714l.m101134b(r12)
            goto L_0x007e
        L_0x0030:
            java.lang.Object r1 = r11.f365028a
            com.google.android.apps.search.googleapp.discover.aa.e r1 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134061e) r1
            java.lang.Object r4 = r11.f365031d
            kotlinx.coroutines.be r4 = (kotlinx.coroutines.C71604be) r4
            p5462h.C69714l.m101134b(r12)
            goto L_0x006c
        L_0x003c:
            p5462h.C69714l.m101134b(r12)
            java.lang.Object r12 = r11.f365031d
            kotlinx.coroutines.aw r12 = (kotlinx.coroutines.C71422aw) r12
            com.google.android.apps.search.googleapp.discover.aa.z r1 = new com.google.android.apps.search.googleapp.discover.aa.z
            com.google.android.apps.search.googleapp.discover.aa.ak r7 = r11.f365030c
            r1.<init>(r7, r6)
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r12, r6, r6, r1, r5)
            com.google.android.apps.search.googleapp.discover.aa.y r7 = new com.google.android.apps.search.googleapp.discover.aa.y
            com.google.android.apps.search.googleapp.discover.aa.ak r8 = r11.f365030c
            r7.<init>(r8, r6)
            kotlinx.coroutines.be r12 = kotlinx.coroutines.C71803m.m105042c(r12, r6, r6, r7, r5)
            com.google.android.apps.search.googleapp.discover.aa.ak r7 = r11.f365030c
            com.google.android.apps.search.googleapp.discover.aa.e r7 = r7.f365056e
            r11.f365031d = r12
            r11.f365028a = r7
            r11.f365029b = r4
            java.lang.Object r1 = r1.mo62825a(r11)
            if (r1 == r0) goto L_0x01f9
            r4 = r12
            r12 = r1
            r1 = r7
        L_0x006c:
            com.google.android.apps.search.googleapp.discover.s.i r12 = (com.google.android.apps.search.googleapp.discover.p10214s.C134591i) r12
            r11.f365031d = r1
            r11.f365028a = r12
            r11.f365029b = r3
            java.lang.Object r3 = r4.mo62825a(r11)
            if (r3 == r0) goto L_0x01f9
            r10 = r1
            r1 = r12
            r12 = r3
            r3 = r10
        L_0x007e:
            com.google.android.apps.search.googleapp.discover.s.e r12 = (com.google.android.apps.search.googleapp.discover.p10214s.C134587e) r12
            java.lang.String r4 = "eligibilityStatus"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            java.lang.String r4 = "backgroundRefreshSchedule"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r4)
            com.google.android.apps.search.googleapp.discover.s.e r4 = com.google.android.apps.search.googleapp.discover.p10214s.C134587e.f366522e
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L_0x00b5
            com.google.common.f.e r12 = com.google.android.apps.search.googleapp.discover.p10173aa.C134061e.f365172a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r4 = new com.google.common.f.n
            r7 = 40549(0x9e65, float:5.6821E-41)
            r4.<init>(r7)
            r12.mo56379ah(r4)
            java.lang.String r4 = "#scheduledRefresh: enable_prod_refresh is true but we have no valid refresh schedule"
            r12.mo56386p(r4)
        L_0x00aa:
            j$.time.Duration r12 = r3.mo111547d(r1)
        L_0x00ae:
            com.google.android.apps.search.googleapp.discover.aa.d r12 = r3.mo111546c(r12)
        L_0x00b2:
            r1 = r12
            goto L_0x01af
        L_0x00b5:
            boolean r4 = r3.f365177f
            if (r4 == 0) goto L_0x00ba
            goto L_0x00aa
        L_0x00ba:
            boolean r4 = r3.f365176e
            java.lang.String r7 = "backgroundRefreshSchedule.creationTimestamp"
            java.lang.String r8 = "timeSource.now()"
            if (r4 == 0) goto L_0x013c
            com.google.common.v.i r1 = r3.f365173b
            j$.time.Instant r1 = r1.mo57444a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            com.google.protobuf.fg r4 = r12.f366525b
            if (r4 != 0) goto L_0x00d1
            com.google.protobuf.fg r4 = com.google.protobuf.C63042fg.f170152c
        L_0x00d1:
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)
            j$.time.Instant r4 = com.google.protobuf.p4750c.p4751a.C62949a.m95469d(r4)
            com.google.protobuf.cq r12 = r12.f366526c
            java.lang.String r7 = "backgroundRefreshSchedule.refreshDurationList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = p5462h.p5463a.C69540x.m100804k(r12, r8)
            r7.<init>(r8)
            java.util.Iterator r12 = r12.iterator()
        L_0x00ee:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x010f
            java.lang.Object r8 = r12.next()
            com.google.protobuf.ar r8 = (com.google.protobuf.C62910ar) r8
            java.lang.String r9 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            j$.time.Duration r8 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r8)
            j$.time.Instant r8 = r4.plus(r8)
            j$.time.Duration r8 = p3186j$.time.Duration.between(r1, r8)
            r7.add(r8)
            goto L_0x00ee
        L_0x010f:
            java.util.Iterator r12 = r7.iterator()
        L_0x0113:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L_0x0129
            java.lang.Object r4 = r12.next()
            r7 = r4
            j$.time.Duration r7 = (p3186j$.time.Duration) r7
            j$.time.Duration r8 = p3186j$.time.Duration.ZERO
            int r7 = r7.compareTo((p3186j$.time.Duration) r8)
            if (r7 <= 0) goto L_0x0113
            goto L_0x012a
        L_0x0129:
            r4 = r6
        L_0x012a:
            j$.time.Duration r4 = (p3186j$.time.Duration) r4
            if (r4 == 0) goto L_0x0138
            j$.time.Duration r12 = r3.mo111548e(r4)
            com.google.android.apps.search.googleapp.discover.aa.b r12 = r3.mo111545b(r1, r12)
            goto L_0x00b2
        L_0x0138:
            j$.time.Duration r12 = r3.f365179h
            goto L_0x00ae
        L_0x013c:
            com.google.protobuf.cq r4 = r12.f366526c
            int r4 = r4.size()
            int r9 = r12.f366527d
            if (r4 > r9) goto L_0x014a
            j$.time.Duration r12 = r3.f365179h
            goto L_0x00ae
        L_0x014a:
            com.google.common.v.i r4 = r3.f365173b
            j$.time.Instant r4 = r4.mo57444a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r8)
            int r8 = r12.f366527d
            com.google.protobuf.cq r9 = r12.f366526c
            java.lang.Object r8 = r9.get(r8)
            com.google.protobuf.ar r8 = (com.google.protobuf.C62910ar) r8
            java.lang.String r9 = "backgroundRefreshSchedul…dRefreshSchedule.attempt)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            j$.time.Duration r8 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r8)
            com.google.protobuf.fg r12 = r12.f366525b
            if (r12 != 0) goto L_0x016c
            com.google.protobuf.fg r12 = com.google.protobuf.C63042fg.f170152c
        L_0x016c:
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            j$.time.Instant r12 = com.google.protobuf.p4750c.p4751a.C62949a.m95469d(r12)
            j$.time.Duration r12 = p3186j$.time.Duration.between(r12, r4)
            java.lang.String r7 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r7)
            boolean r7 = com.google.common.p4580v.C60944c.m93094g(r8)
            if (r7 == 0) goto L_0x0195
            j$.time.Duration r12 = r8.minus(r12)
            java.lang.String r1 = "refreshDuration.minus(timeSinceCreation)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)
            j$.time.Duration r12 = r3.mo111548e(r12)
            com.google.android.apps.search.googleapp.discover.aa.b r12 = r3.mo111545b(r4, r12)
            goto L_0x00b2
        L_0x0195:
            com.google.common.f.e r12 = com.google.android.apps.search.googleapp.discover.p10173aa.C134061e.f365172a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r4 = new com.google.common.f.n
            r7 = 40548(0x9e64, float:5.682E-41)
            r4.<init>(r7)
            r12.mo56379ah(r4)
            java.lang.String r4 = "#scheduledRefresh: enable_prod_refresh is true but refresh schedule has duration <= 0"
            r12.mo56386p(r4)
            goto L_0x00aa
        L_0x01af:
            boolean r12 = r1 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134034b
            java.lang.String r3 = "feed_sync_watchdog_worker"
            if (r12 == 0) goto L_0x01c5
            com.google.android.apps.search.googleapp.discover.aa.ak r12 = r11.f365030c
            r11.f365031d = r1
            r11.f365028a = r6
            r11.f365029b = r5
            java.lang.Object r12 = r12.mo111519h(r3, r11)
            if (r12 == r0) goto L_0x01c4
            goto L_0x01e4
        L_0x01c4:
            return r0
        L_0x01c5:
            boolean r12 = r1 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134059c
            if (r12 == 0) goto L_0x01e2
            java.lang.String r12 = r1.f365162b
            boolean r12 = p5462h.p5473f.p5475b.C69664n.m101066l(r12, r3)
            if (r12 == 0) goto L_0x01e4
            com.google.android.apps.search.googleapp.discover.aa.ak r12 = r11.f365030c
            r11.f365031d = r1
            r11.f365028a = r6
            r11.f365029b = r2
            java.lang.String r2 = "feed_sync_worker"
            java.lang.Object r12 = r12.mo111519h(r2, r11)
            if (r12 != r0) goto L_0x01e4
            return r0
        L_0x01e2:
            boolean r12 = r1 instanceof com.google.android.apps.search.googleapp.discover.p10173aa.C134005a
        L_0x01e4:
            com.google.android.apps.search.googleapp.discover.aa.ak r12 = r11.f365030c
            com.google.apps.tiktok.contrib.work.t r1 = r1.f365163c
            r11.f365031d = r6
            r11.f365028a = r6
            r2 = 5
            r11.f365029b = r2
            java.lang.Object r12 = r12.mo111522k(r1, r11)
            if (r12 != r0) goto L_0x01f6
            return r0
        L_0x01f6:
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x01f9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134008aa.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C134008aa aaVar = new C134008aa(this.f365030c, gVar);
        aaVar.f365031d = obj;
        return aaVar;
    }
}
