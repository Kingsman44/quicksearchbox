package com.google.android.apps.search.googleapp.discover.p10173aa;

import androidx.work.WorkerParameters;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.sync.FeedSyncWorker$startWorkSuspend$2", mo61344c = "FeedSyncWorker.kt", mo61345d = "invokeSuspend", mo61346e = {133})
/* renamed from: com.google.android.apps.search.googleapp.discover.aa.bp */
/* compiled from: PG */
final class C134050bp extends C69572j implements C69630p {

    /* renamed from: a */
    Object f365133a;

    /* renamed from: b */
    int f365134b;

    /* renamed from: c */
    final /* synthetic */ WorkerParameters f365135c;

    /* renamed from: d */
    final /* synthetic */ C134053bs f365136d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134050bp(WorkerParameters workerParameters, C134053bs bsVar, C69577g gVar) {
        super(2, gVar);
        this.f365135c = workerParameters;
        this.f365136d = bsVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134050bp) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        if (r2 == null) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0190  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f365134b
            if (r1 == 0) goto L_0x000d
            java.lang.Object r0 = r13.f365133a
            p5462h.C69714l.m101134b(r14)     // Catch:{ Exception -> 0x017c }
            goto L_0x016f
        L_0x000d:
            p5462h.C69714l.m101134b(r14)
            androidx.work.WorkerParameters r14 = r13.f365135c
            androidx.work.m r14 = r14.f13989b
            java.lang.String r1 = "workerParameters.inputData"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)
            java.lang.String r1 = "data"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r1)
            java.lang.String r1 = "params"
            byte[] r14 = r14.mo9569d(r1)
            r1 = 0
            if (r14 == 0) goto L_0x0053
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x0034 }
            com.google.android.apps.search.googleapp.discover.aa.i r3 = com.google.android.apps.search.googleapp.discover.p10173aa.C134065i.f365197e     // Catch:{ Exception -> 0x0034 }
            com.google.protobuf.bv r14 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (byte[]) r14, (com.google.protobuf.C62921ba) r2)     // Catch:{ Exception -> 0x0034 }
            com.google.android.apps.search.googleapp.discover.aa.i r14 = (com.google.android.apps.search.googleapp.discover.p10173aa.C134065i) r14     // Catch:{ Exception -> 0x0034 }
            goto L_0x0054
        L_0x0034:
            r14 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.search.googleapp.discover.p10173aa.C134060d.f365161a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r14 = r2.mo56382g(r14)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 40543(0x9e5f, float:5.6813E-41)
            r2.<init>(r3)
            r14.mo56379ah(r2)
            java.lang.String r2 = "Couldn't decode BackgroundRefreshParameters"
            r14.mo56386p(r2)
        L_0x0053:
            r14 = r1
        L_0x0054:
            if (r14 == 0) goto L_0x0062
            int r2 = r14.f365200b
            com.google.android.apps.search.googleapp.discover.aa.h r2 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.m217476a(r2)
            if (r2 != 0) goto L_0x0060
            com.google.android.apps.search.googleapp.discover.aa.h r2 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.UNKNOWN
        L_0x0060:
            if (r2 != 0) goto L_0x0064
        L_0x0062:
            com.google.android.apps.search.googleapp.discover.aa.h r2 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.UNKNOWN
        L_0x0064:
            java.lang.String r3 = "backgroundRefreshParamet…pe ?: RefreshType.UNKNOWN"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            com.google.android.apps.search.googleapp.discover.aa.h r3 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.UNKNOWN
            if (r2 != r3) goto L_0x0085
            com.google.common.f.e r3 = com.google.android.apps.search.googleapp.discover.p10173aa.C134053bs.f365142a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 40557(0x9e6d, float:5.6832E-41)
            r4.<init>(r5)
            r3.mo56379ah(r4)
            java.lang.String r4 = "Unknown refresh type"
            r3.mo56386p(r4)
        L_0x0085:
            com.google.android.apps.search.googleapp.discover.aa.bs r3 = r13.f365136d
            com.google.android.apps.search.googleapp.discover.aa.r r3 = r3.f365148g
            r4 = 1
            r3.mo111516e(r4)
            com.google.android.apps.search.googleapp.discover.aa.bs r3 = r13.f365136d
            com.google.android.apps.search.googleapp.discover.aa.av r3 = r3.f365150i
            java.lang.String r5 = "refreshType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            com.google.common.v.i r5 = r3.f365084a
            j$.time.Instant r5 = r5.mo57444a()
            java.lang.String r6 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.protobuf.fg r5 = com.google.protobuf.p4750c.p4751a.C62949a.m95467b(r5)
            com.google.android.libraries.storage.protostore.ab r6 = r3.f365085b
            com.google.android.apps.search.googleapp.discover.aa.at r7 = new com.google.android.apps.search.googleapp.discover.aa.at
            r7.<init>(r5, r2)
            java.util.concurrent.Executor r3 = r3.f365086c
            com.google.common.util.concurrent.cx r3 = r6.mo46039a(r7, r3)
            java.lang.String r5 = "Failed to append onSyncTaskStarted"
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r3, r5, r7)
            if (r14 == 0) goto L_0x015a
            com.google.android.apps.search.googleapp.discover.aa.bs r3 = r13.f365136d
            boolean r5 = r3.f365153l
            if (r5 == 0) goto L_0x015a
            com.google.android.apps.search.googleapp.discover.aa.i r5 = com.google.android.apps.search.googleapp.discover.p10173aa.C134065i.f365197e
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r14, r5)
            if (r5 == 0) goto L_0x00cc
            goto L_0x015a
        L_0x00cc:
            long r7 = r3.f365154m
            r9 = 0
            r11 = 100
            long r7 = p5462h.p5480j.C69699g.m101120b(r7, r9, r11)
            h.i.e r5 = p5462h.p5479i.C69691f.f186056a
            h.i.f r5 = p5462h.p5479i.C69691f.f186057b
            r9 = 100
            long r9 = r5.mo61406f(r9)
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x015a
            int r5 = r14.f365200b
            com.google.android.apps.search.googleapp.discover.aa.h r5 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.m217476a(r5)
            if (r5 != 0) goto L_0x00ee
            com.google.android.apps.search.googleapp.discover.aa.h r5 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.UNKNOWN
        L_0x00ee:
            int r5 = r5.ordinal()
            r7 = 3
            r8 = 2
            if (r5 == r4) goto L_0x0103
            if (r5 == r8) goto L_0x0101
            if (r5 == r7) goto L_0x00ff
            r9 = 4
            if (r5 == r9) goto L_0x0104
            r9 = 0
            goto L_0x0104
        L_0x00ff:
            r9 = 3
            goto L_0x0104
        L_0x0101:
            r9 = 2
            goto L_0x0104
        L_0x0103:
            r9 = 1
        L_0x0104:
            if (r9 == 0) goto L_0x015a
            com.google.protobuf.fg r5 = r14.f365201c
            if (r5 != 0) goto L_0x010c
            com.google.protobuf.fg r5 = com.google.protobuf.C63042fg.f170152c
        L_0x010c:
            java.lang.String r10 = "backgroundRefreshParameters.timestampCreated"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r10)
            j$.time.Instant r5 = com.google.protobuf.p4750c.p4751a.C62949a.m95469d(r5)
            com.google.protobuf.ar r14 = r14.f365202d
            if (r14 != 0) goto L_0x011b
            com.google.protobuf.ar r14 = com.google.protobuf.C62910ar.f169858c
        L_0x011b:
            java.lang.String r10 = "backgroundRefreshParameters.scheduledOffset"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r10)
            j$.time.Duration r14 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r14)
            j$.time.Instant r14 = r5.plus(r14)
            com.google.common.v.i r5 = r3.f365145d
            j$.time.Instant r5 = r5.mo57444a()
            j$.time.Duration r14 = p3186j$.time.Duration.between(r14, r5)
            com.google.android.libraries.search.logging.d.kr r3 = r3.f365155n
            com.google.android.libraries.search.logging.d.lw r3 = r3.f103056a
            double r10 = com.google.common.p4580v.C60944c.m93088a(r14)
            if (r9 == r4) goto L_0x0149
            if (r9 == r8) goto L_0x0146
            if (r9 == r7) goto L_0x0143
            java.lang.String r14 = "EAGER"
            goto L_0x014b
        L_0x0143:
            java.lang.String r14 = "APP_CLOSE"
            goto L_0x014b
        L_0x0146:
            java.lang.String r14 = "WATCHDOG"
            goto L_0x014b
        L_0x0149:
            java.lang.String r14 = "SCHEDULED"
        L_0x014b:
            com.google.common.base.cr r3 = r3.f103097f
            java.lang.Object r3 = r3.mo6453a()
            com.google.android.libraries.au.f r3 = (com.google.android.libraries.p1635au.C19569f) r3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r6] = r14
            r3.mo24824b(r10, r5)
        L_0x015a:
            com.google.android.apps.search.googleapp.discover.aa.bs r14 = r13.f365136d     // Catch:{ Exception -> 0x017b }
            r13.f365133a = r2     // Catch:{ Exception -> 0x017b }
            r13.f365134b = r4     // Catch:{ Exception -> 0x017b }
            h.c.o r3 = r14.f365152k     // Catch:{ Exception -> 0x017b }
            com.google.android.apps.search.googleapp.discover.aa.bo r4 = new com.google.android.apps.search.googleapp.discover.aa.bo     // Catch:{ Exception -> 0x017b }
            r4.<init>(r2, r14, r1)     // Catch:{ Exception -> 0x017b }
            java.lang.Object r14 = kotlinx.coroutines.C71803m.m105040a(r3, r4, r13)     // Catch:{ Exception -> 0x017b }
            if (r14 != r0) goto L_0x016e
            return r0
        L_0x016e:
            r0 = r2
        L_0x016f:
            androidx.work.aa r14 = (androidx.work.C4377aa) r14     // Catch:{ Exception -> 0x017c }
            com.google.android.apps.search.googleapp.discover.aa.bs r1 = r13.f365136d     // Catch:{ Exception -> 0x017c }
            com.google.android.apps.search.googleapp.discover.aa.av r1 = r1.f365150i     // Catch:{ Exception -> 0x017c }
            com.google.android.apps.search.googleapp.discover.aa.ap r2 = com.google.android.apps.search.googleapp.discover.p10173aa.C134023ap.SUCCESS     // Catch:{ Exception -> 0x017c }
            r1.mo111528b(r2)     // Catch:{ Exception -> 0x017c }
            goto L_0x018c
        L_0x017b:
            r0 = r2
        L_0x017c:
            com.google.android.apps.search.googleapp.discover.aa.bs r14 = r13.f365136d
            com.google.android.apps.search.googleapp.discover.aa.av r14 = r14.f365150i
            com.google.android.apps.search.googleapp.discover.aa.ap r1 = com.google.android.apps.search.googleapp.discover.p10173aa.C134023ap.FAILURE
            r14.mo111528b(r1)
            androidx.work.x r14 = new androidx.work.x
            androidx.work.m r1 = androidx.work.C4632m.f14549a
            r14.<init>(r1)
        L_0x018c:
            com.google.android.apps.search.googleapp.discover.aa.h r1 = com.google.android.apps.search.googleapp.discover.p10173aa.C134064h.APP_CLOSE
            if (r0 != r1) goto L_0x01a7
            boolean r0 = r14 instanceof androidx.work.C4645z
            if (r0 == 0) goto L_0x019e
            com.google.android.apps.search.googleapp.discover.aa.bs r0 = r13.f365136d
            com.google.android.libraries.search.logging.d.kr r0 = r0.f365155n
            java.lang.String r1 = "SUCCESS"
            r0.mo41715d(r1)
            goto L_0x01a7
        L_0x019e:
            com.google.android.apps.search.googleapp.discover.aa.bs r0 = r13.f365136d
            com.google.android.libraries.search.logging.d.kr r0 = r0.f365155n
            java.lang.String r1 = "FAILURE"
            r0.mo41715d(r1)
        L_0x01a7:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.discover.p10173aa.C134050bp.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134050bp(this.f365135c, this.f365136d, gVar);
    }
}
