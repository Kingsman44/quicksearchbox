package com.google.android.apps.gsa.staticplugins.chime;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.staticplugins.chime.p7665g.C97718a;
import com.google.android.libraries.notifications.p2293h.C30017j;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.p */
/* compiled from: PG */
public final class C97734p implements C30017j {

    /* renamed from: a */
    private final C97730l f272891a;

    /* renamed from: b */
    private final C39141kp f272892b;

    /* renamed from: c */
    private final C97665ah f272893c;

    /* renamed from: d */
    private final C86124t f272894d;

    /* renamed from: e */
    private final C88483e f272895e;

    /* renamed from: f */
    private final C97659ab f272896f;

    /* renamed from: g */
    private final C97718a f272897g;

    public C97734p(C97730l lVar, C97718a aVar, C39141kp kpVar, C97665ah ahVar, C86124t tVar, C88483e eVar, C97659ab abVar) {
        this.f272891a = lVar;
        this.f272897g = aVar;
        this.f272892b = kpVar;
        this.f272893c = ahVar;
        this.f272894d = tVar;
        this.f272895e = eVar;
        this.f272896f = abVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.location.Location} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.notifications.p2293h.C30016i mo35341a(com.google.android.libraries.notifications.data.C29820k r21, com.google.android.libraries.notifications.data.C29827r r22) {
        /*
            r20 = this;
            r1 = r20
            com.google.common.base.ax r0 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162004a(r22)
            boolean r2 = r0.mo56113h()
            r3 = 1
            if (r2 != 0) goto L_0x0026
            com.google.android.apps.gsa.staticplugins.chime.g.a r0 = r1.f272897g
            java.lang.String r2 = r22.mo35063j()
            java.lang.String r4 = "ChimeThreadInterceptor"
            java.lang.String r5 = "Invalid/Missing Payload"
            r0.mo90797a(r2, r4, r5)
            java.lang.String r0 = "NO_PAYLOAD"
            r1.m162002b(r0, r3)
            com.google.android.libraries.notifications.h.h r0 = com.google.android.libraries.notifications.p2293h.C30015h.INVALID_PAYLOAD
            com.google.android.libraries.notifications.h.i r0 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r0)
            return r0
        L_0x0026:
            com.google.android.apps.gsa.staticplugins.chime.l r2 = r1.f272891a
            java.lang.Long r4 = r22.mo35056e()
            long r4 = r4.longValue()
            r6 = 0
            r10 = 1
            java.lang.String r12 = "ChimeFilter"
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x006d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.Long r5 = r22.mo35056e()
            long r5 = r5.longValue()
            long r4 = r4.toMillis(r5)
            com.google.android.libraries.f.a r6 = r2.f272869a
            long r6 = r6.mo26870b()
            int r13 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r13 >= 0) goto L_0x006d
            com.google.android.apps.gsa.staticplugins.chime.g.a r2 = r2.f272880l
            java.lang.String r4 = r22.mo35063j()
            java.lang.String r5 = "Expired"
            r2.mo90797a(r4, r12, r5)
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.INVALID_TARGET_STATE
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x006d:
            com.google.common.base.ax r4 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162004a(r22)
            java.lang.Object r5 = r4.mo56107c()
            com.google.bv.d.b.a.d r5 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r5
            boolean r5 = r5.f152046i
            if (r5 == 0) goto L_0x008b
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.SILENT_NOTIFICATION
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x008b:
            java.lang.Object r5 = r4.mo56107c()
            com.google.bv.d.b.a.d r5 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r5
            boolean r5 = r5.f152043f
            r6 = 3
            r7 = 0
            if (r5 != 0) goto L_0x0102
            com.google.android.apps.gsa.shared.m.c r5 = r2.f272873e
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249856y
            boolean r5 = r5.mo79746e(r13)
            if (r5 == 0) goto L_0x00a2
            goto L_0x0102
        L_0x00a2:
            com.google.android.apps.search.googleapp.notifications.a.b.z r14 = r2.f272876h
            com.google.android.apps.gsa.search.core.google.gaia.c.a.c r5 = r2.f272877i
            com.google.common.util.concurrent.cx r15 = r5.mo79697b()
            java.lang.String r5 = r22.mo35063j()
            com.google.android.libraries.f.a r13 = r2.f272869a
            long r16 = r13.mo26870b()
            j$.time.Duration r13 = p3186j$.time.Duration.ofMillis(r16)
            long r17 = r13.getSeconds()
            java.lang.String r13 = "threadId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)
            kotlinx.coroutines.aw r13 = r14.f372245b
            com.google.android.apps.search.googleapp.notifications.a.b.ab r9 = new com.google.android.apps.search.googleapp.notifications.a.b.ab
            r19 = 0
            r8 = r13
            r13 = r9
            r16 = r5
            r13.<init>(r14, r15, r16, r17, r19)
            kotlinx.coroutines.be r5 = kotlinx.coroutines.C71803m.m105042c(r8, r7, r7, r9, r6)
            com.google.common.util.concurrent.cx r5 = kotlinx.coroutines.p5578d.C71663i.m104688a(r5)
            java.lang.Object r5 = com.google.common.util.concurrent.C60856cj.m92910s(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.chime.g.a r2 = r2.f272880l
            java.lang.String r4 = r22.mo35063j()
            java.lang.String r5 = "User Suppressed"
            r2.mo90797a(r4, r12, r5)
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.USER_SUPPRESSED
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            r4 = r2
            com.google.android.apps.gsa.staticplugins.chime.a r4 = (com.google.android.apps.gsa.staticplugins.chime.C97643a) r4
            r4.f272723b = r6
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x0102:
            java.lang.Object r5 = r4.mo56107c()
            com.google.bv.d.b.a.d r5 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r5
            com.google.bv.d.b.a.k r5 = r5.f152042e
            if (r5 != 0) goto L_0x010e
            com.google.bv.d.b.a.k r5 = com.google.p4283bv.p4345d.p4350b.p4351a.C56975k.f152090f
        L_0x010e:
            com.google.android.apps.gsa.search.core.bb r8 = r2.f272874f
            dagger.a r9 = r2.f272879k
            java.lang.Object r9 = r9.mo27525b()
            com.google.android.apps.gsa.search.core.ag.b.a r9 = (com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a) r9
            boolean r9 = r9.mo78205l()
            boolean r8 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162008e(r8, r9)
            if (r8 != 0) goto L_0x0143
            int r5 = r5.f152093b
            r8 = 9
            if (r5 != r8) goto L_0x0143
            com.google.android.apps.gsa.staticplugins.chime.g.a r2 = r2.f272880l
            java.lang.String r4 = r22.mo35063j()
            java.lang.String r5 = "Discover Disabled"
            r2.mo90797a(r4, r12, r5)
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.INVALID_TARGET_STATE
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x0143:
            java.lang.Object r5 = r4.mo56107c()
            com.google.bv.d.b.a.d r5 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r5
            int r5 = r5.f152038a
            r5 = r5 & 32
            if (r5 == 0) goto L_0x01d7
            com.google.android.apps.gsa.staticplugins.chime.d r5 = r2.f272870b
            java.lang.Object r4 = r4.mo56107c()
            com.google.bv.d.b.a.d r4 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r4
            com.google.bv.d.b.b.f r4 = r4.f152044g
            if (r4 != 0) goto L_0x015d
            com.google.bv.d.b.b.f r4 = com.google.p4283bv.p4345d.p4350b.p4352b.C56996f.f152143d
        L_0x015d:
            boolean r8 = com.google.android.apps.gsa.staticplugins.chime.C97682e.m161926a(r4)
            if (r8 != 0) goto L_0x0165
            r4 = 4
            goto L_0x01a3
        L_0x0165:
            r8 = r5
            com.google.android.apps.gsa.staticplugins.chime.e r8 = (com.google.android.apps.gsa.staticplugins.chime.C97682e) r8
            com.google.android.apps.gsa.search.core.google.bd r8 = r8.f272781b
            boolean r8 = r8.mo79513d(r3)
            if (r8 == 0) goto L_0x019b
            com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.m148680c()
            com.google.android.apps.gsa.staticplugins.chime.e r5 = (com.google.android.apps.gsa.staticplugins.chime.C97682e) r5     // Catch:{ all -> 0x0199 }
            com.google.android.apps.gsa.location.ae r5 = r5.f272780a     // Catch:{ all -> 0x0199 }
            com.google.android.libraries.search.m.b.b r8 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_SERVICES_CHIME_LO     // Catch:{ all -> 0x0199 }
            com.google.android.libraries.search.location.y r8 = com.google.android.libraries.search.location.C38726z.m68011d(r8)     // Catch:{ all -> 0x0199 }
            j$.time.Duration r9 = p3186j$.time.Duration.ofDays(r10)     // Catch:{ all -> 0x0199 }
            r8.mo41493b(r9)     // Catch:{ all -> 0x0199 }
            com.google.android.libraries.search.location.z r8 = r8.mo41492a()     // Catch:{ all -> 0x0199 }
            com.google.common.util.concurrent.cx r5 = r5.mo71020c(r8)     // Catch:{ all -> 0x0199 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0199 }
            com.google.android.apps.gsa.shared.util.p7159c.C90933cc.m148547b(r5, r8)     // Catch:{ all -> 0x0199 }
            java.lang.Object r5 = com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148475i(r5, r7)     // Catch:{ all -> 0x0199 }
            r7 = r5
            android.location.Location r7 = (android.location.Location) r7     // Catch:{ all -> 0x0199 }
            goto L_0x019b
        L_0x0199:
            r0 = move-exception
            throw r0
        L_0x019b:
            if (r7 != 0) goto L_0x019f
            r4 = 5
            goto L_0x01a3
        L_0x019f:
            int r4 = com.google.android.apps.gsa.staticplugins.chime.C97682e.m161927b(r4, r7)
        L_0x01a3:
            if (r4 == r3) goto L_0x01d7
            com.google.android.apps.gsa.staticplugins.chime.g.a r2 = r2.f272880l
            java.lang.String r5 = r22.mo35063j()
            r7 = 2
            if (r4 == r7) goto L_0x01bc
            if (r4 == r6) goto L_0x01b9
            r6 = 4
            if (r4 == r6) goto L_0x01b6
            java.lang.String r4 = "NO_LOCATION_AVAILABLE"
            goto L_0x01be
        L_0x01b6:
            java.lang.String r4 = "NO_SUPPORTED_FENCE_TYPE"
            goto L_0x01be
        L_0x01b9:
            java.lang.String r4 = "INVALID_CONTEXT_FENCE"
            goto L_0x01be
        L_0x01bc:
            java.lang.String r4 = "OUT"
        L_0x01be:
            java.lang.String r6 = "Context Fence - "
            java.lang.String r4 = r6.concat(r4)
            r2.mo90797a(r5, r12, r4)
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.INVALID_TARGET_STATE
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x01d7:
            android.content.Context r4 = r2.f272871c
            com.google.android.apps.gsa.shared.util.UserHandleCompat r5 = com.google.android.apps.gsa.shared.util.UserHandleCompat.m148154a()
            boolean r4 = com.google.android.apps.gsa.shared.util.C90771bo.m148273b(r4, r5)
            if (r4 == 0) goto L_0x01f3
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.WORK_PROFILE
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x01f3:
            com.google.android.apps.gsa.search.core.google.gaia.o r4 = r2.f272875g
            java.lang.String r4 = r4.mo79659F()
            if (r21 == 0) goto L_0x023f
            java.lang.String r5 = r21.mo35009h()
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0206
            goto L_0x023f
        L_0x0206:
            com.google.android.libraries.search.k.m r4 = r2.f272872d
            com.google.common.util.concurrent.cx r4 = r4.mo41486b()
            java.lang.Object r4 = com.google.common.util.concurrent.C60856cj.m92910s(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0232
            com.google.android.apps.gsa.staticplugins.chime.g.a r2 = r2.f272880l
            java.lang.String r4 = r22.mo35063j()
            java.lang.String r5 = "User Incognito"
            r2.mo90797a(r4, r12, r5)
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.INVALID_TARGET_STATE
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x0232:
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55671d()
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
            goto L_0x0267
        L_0x023f:
            com.google.android.libraries.search.logging.d.kp r2 = r2.f272878j
            int r4 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162009f(r22)
            com.google.common.base.cr r2 = r2.f102842aZ
            java.lang.Object r2 = r2.mo6453a()
            com.google.android.libraries.au.d r2 = (com.google.android.libraries.p1635au.C19567d) r2
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r6 = 0
            java.lang.String r4 = com.google.p4283bv.p4345d.p4346a.p4347a.C56952b.m88241a(r4)
            r5[r6] = r4
            r2.mo24822a(r10, r5)
            com.google.android.libraries.notifications.h.h r2 = com.google.android.libraries.notifications.p2293h.C30015h.INVALID_TARGET_STATE
            com.google.android.libraries.notifications.h.i r2 = com.google.android.libraries.notifications.p2293h.C30016i.m55670c(r2)
            com.google.android.apps.gsa.staticplugins.chime.i r2 = com.google.android.apps.gsa.staticplugins.chime.C97729k.m161982c(r2)
            com.google.android.apps.gsa.staticplugins.chime.k r2 = r2.mo90781a()
        L_0x0267:
            com.google.android.libraries.notifications.h.i r4 = r2.mo90785a()
            com.google.android.libraries.notifications.h.i r5 = com.google.android.libraries.notifications.p2293h.C30016i.m55671d()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x029d
            java.lang.Object r4 = r0.mo56107c()
            com.google.bv.d.b.a.d r4 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r4
            com.google.android.apps.gsa.staticplugins.chime.ab r5 = r1.f272896f
            com.google.bv.d.b.b.j r6 = r4.f152041d
            if (r6 != 0) goto L_0x0283
            com.google.bv.d.b.b.j r6 = com.google.p4283bv.p4345d.p4350b.p4352b.C57000j.f152155i
        L_0x0283:
            int r6 = r6.f152157a
            r3 = r3 & r6
            if (r3 == 0) goto L_0x029a
            com.google.android.apps.gsa.sidekick.main.entry.ak r3 = r5.f272744a
            com.google.bv.d.b.b.j r4 = r4.f152041d
            if (r4 != 0) goto L_0x0290
            com.google.bv.d.b.b.j r4 = com.google.p4283bv.p4345d.p4350b.p4352b.C57000j.f152155i
        L_0x0290:
            com.google.ai.b.fo r4 = r4.f152158b
            if (r4 != 0) goto L_0x0296
            com.google.ai.b.fo r4 = com.google.p375ai.p378b.C7669fo.f26633e
        L_0x0296:
            r3.mo85599l(r4)
            goto L_0x02ac
        L_0x029a:
            com.google.android.apps.gsa.x.c r3 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            goto L_0x02ac
        L_0x029d:
            int r3 = r2.mo90786b()
            int r4 = com.google.android.apps.gsa.staticplugins.chime.C97735q.m162009f(r22)
            java.lang.String r4 = com.google.p4283bv.p4345d.p4346a.p4347a.C56952b.m88241a(r4)
            r1.m162002b(r4, r3)
        L_0x02ac:
            com.google.android.apps.gsa.search.core.i.t r3 = r1.f272894d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90081ef.f249828A
            boolean r3 = r3.mo79746e(r4)
            if (r3 != 0) goto L_0x02d1
            com.google.android.apps.gsa.staticplugins.chime.ah r3 = r1.f272893c
            java.lang.Object r4 = r0.mo56107c()
            com.google.bv.d.b.a.d r4 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r4
            com.google.protobuf.cq r4 = r4.f152054q
            java.lang.String r5 = r22.mo35063j()
            if (r21 == 0) goto L_0x02d1
            java.lang.String r6 = r21.mo35009h()
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)
            r3.mo90784a(r6, r4, r5)
        L_0x02d1:
            java.lang.Object r3 = r0.mo56107c()
            com.google.bv.d.b.a.d r3 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r3
            int r3 = r3.f152038a
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x034a
            java.lang.Object r0 = r0.mo56107c()
            com.google.bv.d.b.a.d r0 = (com.google.p4283bv.p4345d.p4350b.p4351a.C56968d) r0
            com.google.bv.d.b.b.n r0 = r0.f152050m
            if (r0 != 0) goto L_0x02e9
            com.google.bv.d.b.b.n r0 = com.google.p4283bv.p4345d.p4350b.p4352b.C57004n.f152167g
        L_0x02e9:
            com.google.android.apps.gsa.search.shared.service.j r3 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.GCM_MESSAGE_RECEIVED
            r3.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r4)
            com.google.protobuf.bt r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo.f237662g
            com.google.android.apps.gsa.search.shared.service.b.fo r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo.f237661f
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.fn r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87840fn) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.fo r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo) r6
            int r7 = r6.f237664a
            r8 = 2
            r7 = r7 | r8
            r6.f237664a = r7
            java.lang.String r7 = "gcm"
            r6.f237666c = r7
            com.google.protobuf.z r0 = r0.toByteString()
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.android.apps.gsa.search.shared.service.b.fo r6 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo) r6
            r0.getClass()
            int r7 = r6.f237664a
            r8 = 4
            r7 = r7 | r8
            r6.f237664a = r7
            r6.f237667d = r0
            com.google.protobuf.bv r0 = r5.build()
            com.google.android.apps.gsa.search.shared.service.b.fo r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C87841fo) r0
            r3.mo82014b(r4, r0)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r3.mo82013a()
            com.google.android.apps.gsa.search.shared.service.g r3 = new com.google.android.apps.gsa.search.shared.service.g
            r3.<init>()
            com.google.common.o.amo r4 = com.google.common.p4552o.amo.SNO_CHIME
            r3.f239201c = r4
            r3.f239199a = r10
            java.lang.String r4 = "forwarding"
            r3.f239204f = r4
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = new com.google.android.apps.gsa.search.shared.service.ClientConfig
            r4.<init>(r3)
            com.google.android.apps.gsa.search.shared.service.d.e r3 = r1.f272895e
            r5 = 50000(0xc350, double:2.47033E-319)
            r3.mo82004b(r4, r0, r5)
        L_0x034a:
            com.google.android.libraries.notifications.h.i r0 = r2.mo90785a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.chime.C97734p.mo35341a(com.google.android.libraries.notifications.data.k, com.google.android.libraries.notifications.data.r):com.google.android.libraries.notifications.h.i");
    }

    /* renamed from: b */
    private final void m162002b(String str, int i) {
        C39141kp kpVar = this.f272892b;
        String a = C97728j.m161981a(i);
        if (i != 0) {
            ((C19567d) kpVar.f102840aX.mo6453a()).mo24822a(1, str, a);
            return;
        }
        throw null;
    }
}
