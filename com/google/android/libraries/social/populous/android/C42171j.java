package com.google.android.libraries.social.populous.android;

import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.android.libraries.social.populous.p3296e.p3301e.C42514c;
import com.google.android.libraries.social.populous.storage.C42682db;
import com.google.common.p4522b.C58495hd;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.social.populous.android.j */
/* compiled from: PG */
public final /* synthetic */ class C42171j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42181t f110441a;

    /* renamed from: b */
    public final /* synthetic */ ClientVersion f110442b;

    /* renamed from: c */
    public final /* synthetic */ C42682db f110443c;

    /* renamed from: d */
    public final /* synthetic */ ScheduledExecutorService f110444d = null;

    /* renamed from: e */
    public final /* synthetic */ C42514c f110445e;

    /* renamed from: f */
    public final /* synthetic */ C58495hd f110446f;

    /* renamed from: g */
    public final /* synthetic */ C42211b f110447g;

    public /* synthetic */ C42171j(C42181t tVar, C42211b bVar, ClientVersion clientVersion, C42682db dbVar, ScheduledExecutorService scheduledExecutorService, C42514c cVar, C58495hd hdVar) {
        this.f110441a = tVar;
        this.f110447g = bVar;
        this.f110442b = clientVersion;
        this.f110443c = dbVar;
        this.f110445e = cVar;
        this.f110446f = hdVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r29 = this;
            r0 = r29
            com.google.android.libraries.social.populous.android.t r1 = r0.f110441a
            com.google.android.libraries.social.populous.c.b r13 = r0.f110447g
            com.google.android.libraries.social.populous.core.ClientVersion r14 = r0.f110442b
            com.google.android.libraries.social.populous.storage.db r11 = r0.f110443c
            com.google.android.libraries.social.populous.e.e.c r15 = r0.f110445e
            com.google.common.b.hd r12 = r0.f110446f
            com.google.common.util.concurrent.cx r2 = r1.f110473g
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            r10 = r2
            com.google.android.libraries.social.populous.core.m r10 = (com.google.android.libraries.social.populous.core.C42352m) r10
            com.google.common.util.concurrent.cx r2 = r1.f110484r
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            r25 = r2
            com.google.common.base.ax r25 = (com.google.common.base.C58833ax) r25
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.android.libraries.social.populous.e.g.o r8 = new com.google.android.libraries.social.populous.e.g.o
            com.google.android.libraries.f.a r2 = r13.f110538c
            com.google.android.libraries.social.populous.storage.v r3 = r1.f110480n
            com.google.common.util.concurrent.da r4 = r1.f110470d
            r8.<init>(r2, r3, r4)
            com.google.android.libraries.social.populous.e.g.m r7 = new com.google.android.libraries.social.populous.e.g.m
            com.google.android.libraries.social.populous.core.p r4 = r1.f110481o
            com.google.android.libraries.social.populous.core.ClientConfigInternal r5 = r1.f110469c
            com.google.android.libraries.social.populous.storage.v r6 = r1.f110480n
            com.google.common.util.concurrent.da r3 = r1.f110470d
            com.google.android.libraries.social.populous.logging.z r2 = r1.f110478l
            r16 = r2
            r2 = r7
            r17 = r3
            r3 = r10
            r18 = r6
            r6 = r14
            r0 = r7
            r7 = r18
            r18 = r8
            r8 = r13
            r26 = r15
            r15 = r9
            r9 = r17
            r27 = r10
            r10 = r16
            r28 = r12
            r12 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.f110482p = r0
            com.google.android.libraries.social.populous.e.a.p r0 = new com.google.android.libraries.social.populous.e.a.p
            com.google.android.libraries.social.populous.storage.v r3 = r1.f110480n
            com.google.common.util.concurrent.da r4 = r1.f110470d
            com.google.android.libraries.social.populous.core.ClientConfigInternal r5 = r1.f110469c
            com.google.android.libraries.social.populous.logging.z r8 = r1.f110478l
            com.google.android.libraries.social.populous.core.p r9 = r1.f110481o
            com.google.android.libraries.social.populous.e.b.l r11 = r1.f110482p
            r2 = r0
            r6 = r13
            r7 = r27
            r10 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.concurrent.atomic.AtomicReference r2 = r1.f110483q
            r2.set(r0)
            com.google.android.libraries.social.populous.e.c.an r2 = new com.google.android.libraries.social.populous.e.c.an
            android.content.Context r3 = r1.f110468b
            com.google.android.libraries.social.populous.core.ClientConfigInternal r4 = r1.f110469c
            com.google.android.libraries.social.populous.e.b.a r5 = r1.f110479m
            com.google.android.libraries.social.populous.logging.z r6 = r1.f110478l
            com.google.common.util.concurrent.da r7 = r1.f110470d
            com.google.android.libraries.social.populous.core.p r8 = r1.f110481o
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r27
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r25
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            e.a.a.w.a.p r3 = p5304e.p5305a.p5306a.p5442w.p5443a.C69308p.f185454a
            e.a.a.w.a.q r3 = r3.mo6453a()
            boolean r3 = r3.mo60995f()
            if (r3 == 0) goto L_0x00d8
            com.google.android.libraries.social.populous.core.ClientConfigInternal r3 = r1.f110469c
            e.a.a.w.a.g r4 = p5304e.p5305a.p5306a.p5442w.p5443a.C69299g.f185427a
            e.a.a.w.a.h r4 = r4.mo6453a()
            boolean r4 = r4.mo60970e()
            if (r4 == 0) goto L_0x00c2
            e.a.a.w.a.g r3 = p5304e.p5305a.p5306a.p5442w.p5443a.C69299g.f185427a
            e.a.a.w.a.h r3 = r3.mo6453a()
            boolean r3 = r3.mo60968c()
            goto L_0x00c4
        L_0x00c2:
            boolean r3 = r3.f110740z
        L_0x00c4:
            if (r3 == 0) goto L_0x00d8
            com.google.android.libraries.social.populous.e.f.e r3 = new com.google.android.libraries.social.populous.e.f.e
            com.google.android.libraries.social.populous.logging.z r4 = r1.f110478l
            r3.<init>(r4)
            com.google.android.libraries.social.populous.e.f.g r4 = new com.google.android.libraries.social.populous.e.f.g
            com.google.common.util.concurrent.da r5 = r1.f110470d
            r4.<init>(r5, r3, r0, r2)
            r15.add(r4)
            goto L_0x00de
        L_0x00d8:
            r15.add(r0)
            r15.add(r2)
        L_0x00de:
            e.a.a.w.a.p r0 = p5304e.p5305a.p5306a.p5442w.p5443a.C69308p.f185454a
            e.a.a.w.a.q r0 = r0.mo6453a()
            boolean r0 = r0.mo60994e()
            if (r0 == 0) goto L_0x010b
            r0 = r27
            java.lang.String r2 = r0.f111090b
            java.lang.String r3 = "com.google.android.gm.exchange"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x010d
            com.google.android.libraries.social.populous.core.ClientConfigInternal r2 = r1.f110469c
            boolean r2 = r2.f110712N
            if (r2 == 0) goto L_0x010d
            com.google.android.libraries.social.populous.e.c.aw r2 = new com.google.android.libraries.social.populous.e.c.aw
            android.content.Context r3 = r1.f110468b
            com.google.common.util.concurrent.da r4 = r1.f110470d
            com.google.android.libraries.social.populous.logging.z r5 = r1.f110478l
            r2.<init>(r3, r0, r4, r5)
            r15.add(r2)
            goto L_0x010d
        L_0x010b:
            r0 = r27
        L_0x010d:
            com.google.android.libraries.social.populous.e.d.j r10 = new com.google.android.libraries.social.populous.e.d.j
            com.google.common.util.concurrent.da r3 = r1.f110470d
            com.google.android.libraries.social.populous.core.ClientConfigInternal r4 = r1.f110469c
            com.google.android.libraries.social.populous.logging.z r8 = r1.f110478l
            r2 = r10
            r5 = r13
            r6 = r0
            r7 = r14
            r9 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r15.add(r10)
            com.google.android.libraries.social.populous.e.l r0 = new com.google.android.libraries.social.populous.e.l
            com.google.android.libraries.social.populous.logging.z r4 = r1.f110478l
            com.google.common.util.concurrent.da r5 = r1.f110470d
            r6 = 0
            r2 = r0
            r3 = r15
            r7 = r26
            r8 = r28
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.android.C42171j.call():java.lang.Object");
    }
}
