package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.C123939ao;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.p */
/* compiled from: PG */
public final class C123965p implements C123939ao {

    /* renamed from: a */
    public final C58974d f342412a;

    /* renamed from: b */
    private final Context f342413b;

    /* renamed from: c */
    private final C60950i f342414c;

    public C123965p(Context context, C60950i iVar, C130603a aVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(aVar, "loggerFactory");
        this.f342413b = context;
        this.f342414c = iVar;
        this.f342412a = aVar.mo109740b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo106203a(com.google.android.apps.search.assistant.platform.pcp.p9329f.C123730ax r17, com.google.assistant.p3886c.C50818do r18, p5462h.p5466c.C69577g r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b.C123963n
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.n r3 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b.C123963n) r3
            int r4 = r3.f342408e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f342408e = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.n r3 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.n
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f342406c
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f342408e
            r6 = 1
            if (r5 == 0) goto L_0x003d
            if (r5 != r6) goto L_0x0035
            java.lang.Object r0 = r3.f342405b
            java.lang.Object r3 = r3.f342404a
            p5462h.C69714l.m101134b(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x0104
        L_0x0032:
            r0 = move-exception
            goto L_0x010f
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003d:
            p5462h.C69714l.m101134b(r2)
            com.google.common.f.a.d r2 = r1.f342412a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r5 = r17
            com.google.protobuf.cq r7 = r5.f341769a
            int r7 = r7.size()
            r8 = 0
            if (r0 == 0) goto L_0x0055
            r9 = 1
            goto L_0x0056
        L_0x0055:
            r9 = 0
        L_0x0056:
            java.lang.String r10 = "Saving %d onDeviceMediaRecommendations. Has rendered card?: %s"
            r2.mo56396z(r10, r7, r9)
            com.google.common.v.i r2 = r1.f342414c
            j$.time.Instant r2 = r2.mo57444a()
            java.lang.String r7 = "timeSource.now()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            com.google.common.i.o r7 = com.google.common.p4537i.C59294s.m92133c()
            byte[] r9 = r17.toByteArray()
            int r10 = r9.length
            r11 = 100008(0x186a8, float:1.40141E-40)
            java.lang.String r12 = "100008"
            com.google.common.i.b r7 = (com.google.common.p4537i.C59277b) r7
            com.google.common.i.n r7 = r7.mo56761d(r9, r10)
            byte[] r10 = r7.mo56775e()
            byte[] r13 = new byte[r8]
            long r14 = r2.toEpochMilli()
            r7 = r11
            r8 = r12
            r9 = r17
            r11 = r13
            r12 = r14
            android.content.ContentValues r5 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202943b(r7, r8, r9, r10, r11, r12)
            com.google.assistant.s.a.j r7 = com.google.assistant.p3994s.p3995a.C53306j.AMBIENT_ASSISTANT
            if (r0 == 0) goto L_0x00cf
            com.google.assistant.s.a.co r8 = com.google.assistant.p3994s.p3995a.C53132co.f139250l
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.s.a.cl r8 = (com.google.assistant.p3994s.p3995a.C53129cl) r8
            int r9 = r0.f132307d
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.s.a.co r10 = (com.google.assistant.p3994s.p3995a.C53132co) r10
            r9.getClass()
            int r11 = r10.f139252a
            r11 = r11 | 2048(0x800, float:2.87E-42)
            r10.f139252a = r11
            r10.f139262k = r9
            com.google.protobuf.z r0 = r18.toByteString()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.s.a.co r9 = (com.google.assistant.p3994s.p3995a.C53132co) r9
            r0.getClass()
            int r10 = r9.f139252a
            r10 = r10 | 128(0x80, float:1.794E-43)
            r9.f139252a = r10
            r9.f139258g = r0
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.s.a.co r0 = (com.google.assistant.p3994s.p3995a.C53132co) r0
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            r11 = r0
            r8 = 100008(0x186a8, float:1.40141E-40)
            java.lang.String r9 = "100008"
            r10 = 1
            r12 = 0
            long r13 = r2.toEpochMilli()
            android.content.ContentValues r0 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad.m202942a(r7, r8, r9, r10, r11, r12, r13)
            android.content.Context r7 = r1.f342413b     // Catch:{ all -> 0x010d }
            com.google.android.apps.search.assistant.platform.pcp.b.ah r7 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202993b(r7)     // Catch:{ all -> 0x010d }
            com.google.android.libraries.storage.b.e r7 = r7.f341541b     // Catch:{ all -> 0x010d }
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.o r8 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.o     // Catch:{ all -> 0x010d }
            r8.<init>(r5, r1, r0)     // Catch:{ all -> 0x010d }
            com.google.common.util.concurrent.cx r0 = r7.mo45938b(r8)     // Catch:{ all -> 0x010d }
            java.lang.String r5 = "@SuppressWarnings(\"GoodT…sult.Failure(t)\n    }\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r5)     // Catch:{ all -> 0x010d }
            r3.f342404a = r1     // Catch:{ all -> 0x010d }
            r3.f342405b = r2     // Catch:{ all -> 0x010d }
            r3.f342408e = r6     // Catch:{ all -> 0x010d }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r3)     // Catch:{ all -> 0x010d }
            if (r0 == r4) goto L_0x010c
            r3 = r1
            r0 = r2
        L_0x0104:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.am r2 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.am     // Catch:{ all -> 0x0032 }
            j$.time.Instant r0 = (p3186j$.time.Instant) r0     // Catch:{ all -> 0x0032 }
            r2.<init>(r0)     // Catch:{ all -> 0x0032 }
            goto L_0x0129
        L_0x010c:
            return r4
        L_0x010d:
            r0 = move-exception
            r3 = r1
        L_0x010f:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.b.p r3 = (com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b.C123965p) r3
            com.google.common.f.a.d r2 = r3.f342412a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            com.google.common.f.x r2 = r2.mo56382g(r0)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            java.lang.String r3 = "Error saving to PCP database."
            r2.mo56386p(r3)
            com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.al r2 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.al
            r2.<init>(r0)
        L_0x0129:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.p9336b.C123965p.mo106203a(com.google.android.apps.search.assistant.platform.pcp.f.ax, com.google.assistant.c.do, h.c.g):java.lang.Object");
    }
}
