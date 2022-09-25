package com.google.android.apps.search.googleapp.discover.p10173aa;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncControllerImpl$maybeEnqueueEagerPeriodicFeedSyncSuspend$2", mo61344c = "FeedSyncControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {150, 152, 156})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.af */
/* compiled from: PG */
final class C134013af extends C69572j implements C69630p {

    /* renamed from: a */
    int f365040a;

    /* renamed from: b */
    final /* synthetic */ C134018ak f365041b;

    /* renamed from: c */
    private /* synthetic */ Object f365042c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134013af(C134018ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f365041b = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134013af) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r14 != r0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r14 != r0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d3, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f365040a
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r4) goto L_0x0016
            if (r1 == r3) goto L_0x0012
            p5462h.C69714l.m101134b(r14)
            goto L_0x00d4
        L_0x0012:
            p5462h.C69714l.m101134b(r14)
            goto L_0x006c
        L_0x0016:
            p5462h.C69714l.m101134b(r14)
            goto L_0x004d
        L_0x001a:
            p5462h.C69714l.m101134b(r14)
            java.lang.Object r14 = r13.f365042c
            kotlinx.coroutines.aw r14 = (kotlinx.coroutines.C71422aw) r14
            com.google.android.apps.search.googleapp.discover.aa.ak r1 = r13.f365041b
            com.google.android.apps.gsa.sidekick.main.a.a.b r1 = r1.f365065n
            com.google.android.apps.gsa.search.core.preferences.r r1 = r1.f254659a
            java.lang.String r5 = "first_application_launch_ms"
            r6 = 0
            long r8 = r1.getLong(r5, r6)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            com.google.android.apps.search.googleapp.discover.aa.ae r5 = new com.google.android.apps.search.googleapp.discover.aa.ae
            com.google.android.apps.search.googleapp.discover.aa.ak r6 = r13.f365041b
            r7 = 0
            r5.<init>(r6, r1, r7)
            kotlinx.coroutines.C71803m.m105043d(r14, r7, r7, r5, r2)
            if (r1 == 0) goto L_0x00d4
            com.google.android.apps.search.googleapp.discover.aa.ak r14 = r13.f365041b
            r13.f365040a = r4
            java.lang.Object r14 = r14.mo111523l(r13)
            if (r14 == r0) goto L_0x00d3
        L_0x004d:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00d4
            com.google.android.apps.search.googleapp.discover.aa.ak r14 = r13.f365041b
            com.google.apps.tiktok.contrib.work.a r1 = r14.f365054c
            com.google.apps.tiktok.account.AccountId r14 = r14.f365053b
            com.google.common.util.concurrent.cx r14 = r1.mo50519c(r14)
            java.lang.String r1 = "accountWorkManager.getAc…untId, STANDARD_WORK_TAG)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)
            r13.f365040a = r3
            java.lang.Object r14 = kotlinx.coroutines.p5578d.C71663i.m104690c(r14, r13)
            if (r14 == r0) goto L_0x00d3
        L_0x006c:
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x00d0
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0077
            goto L_0x00d0
        L_0x0077:
            com.google.android.apps.search.googleapp.discover.aa.ak r14 = r13.f365041b
            com.google.android.apps.search.googleapp.discover.aa.e r1 = r14.f365056e
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.discover.p10173aa.C134061e.f365172a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 40546(0x9e62, float:5.6817E-41)
            r4.<init>(r5)
            r3.mo56379ah(r4)
            java.lang.String r4 = "#eagerRefresh"
            r3.mo56386p(r4)
            androidx.work.ae r8 = r1.mo111544a()
            com.google.common.v.i r3 = r1.f365173b
            j$.time.Instant r6 = r3.mo57444a()
            java.lang.String r3 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)
            j$.time.Duration r3 = r1.f365181j
            j$.time.Duration r7 = r1.mo111548e(r3)
            boolean r9 = r1.f365174c
            java.lang.String r1 = "networkType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r1)
            java.lang.String r1 = "timestampCreated"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r1)
            java.lang.String r1 = "scheduledOffset"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r1)
            com.google.android.apps.search.googleapp.discover.aa.h r11 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.EAGER
            androidx.work.o r12 = androidx.work.C4634o.REPLACE
            com.google.android.apps.search.googleapp.discover.aa.d r1 = new com.google.android.apps.search.googleapp.discover.aa.d
            java.lang.String r10 = "feed_sync_worker"
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.google.apps.tiktok.contrib.work.t r1 = r1.f365163c
            r13.f365040a = r2
            java.lang.Object r14 = r14.mo111522k(r1, r13)
            if (r14 != r0) goto L_0x00d4
            return r0
        L_0x00d0:
            h.q r14 = p5462h.C69788q.f186170a
            return r14
        L_0x00d3:
            return r0
        L_0x00d4:
            h.q r14 = p5462h.C69788q.f186170a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134013af.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C134013af afVar = new C134013af(this.f365041b, gVar);
        afVar.f365042c = obj;
        return afVar;
    }
}
