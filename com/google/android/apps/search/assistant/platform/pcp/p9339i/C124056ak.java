package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.libraries.storage.p3315b.C42846be;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.p4522b.C58480gp;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.ak */
/* compiled from: PG */
public final /* synthetic */ class C124056ak implements C42846be {

    /* renamed from: a */
    public final /* synthetic */ C124059an f342638a;

    /* renamed from: b */
    public final /* synthetic */ String f342639b;

    /* renamed from: c */
    public final /* synthetic */ AccountId f342640c;

    /* renamed from: d */
    public final /* synthetic */ C58480gp f342641d;

    public /* synthetic */ C124056ak(C124059an anVar, String str, AccountId accountId, C58480gp gpVar) {
        this.f342638a = anVar;
        this.f342639b = str;
        this.f342640c = accountId;
        this.f342641d = gpVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0073, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45928a(com.google.android.libraries.storage.p3315b.C42847bf r21) {
        /*
            r20 = this;
            r1 = r20
            com.google.android.apps.search.assistant.platform.pcp.i.an r0 = r1.f342638a
            java.lang.String r2 = r1.f342639b
            com.google.apps.tiktok.account.AccountId r3 = r1.f342640c
            com.google.common.b.gp r4 = r1.f342641d
            com.google.android.libraries.storage.b.az r5 = new com.google.android.libraries.storage.b.az
            r5.<init>()
            java.lang.StringBuilder r6 = r5.f112130a
            java.lang.String r7 = "SELECT data_id, data_type, data_content FROM SharedProactiveData WHERE "
            r6.append(r7)
            java.lang.StringBuilder r6 = r5.f112130a
            java.lang.String r7 = "data_id = ? "
            r6.append(r7)
            java.util.ArrayList r6 = r5.f112131b
            r6.add(r2)
            java.lang.StringBuilder r6 = r5.f112130a
            java.lang.String r7 = " AND data_type = ? "
            r6.append(r7)
            r6 = 100006(0x186a6, double:4.94095E-319)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.util.ArrayList r7 = r5.f112131b
            r7.add(r6)
            com.google.android.libraries.storage.b.ay r5 = r5.mo45920a()
            r6 = r21
            android.database.Cursor r5 = r6.mo45932d(r5)
            r6 = 1
            boolean r7 = r5.moveToNext()     // Catch:{ all -> 0x024c }
            if (r7 == 0) goto L_0x006f
            java.lang.String r7 = "data_content"
            int r7 = r5.getColumnIndex(r7)     // Catch:{ all -> 0x024c }
            byte[] r7 = r5.getBlob(r7)     // Catch:{ all -> 0x024c }
            if (r7 != 0) goto L_0x005c
            j$.util.Optional r7 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x024c }
            if (r5 == 0) goto L_0x0076
        L_0x0058:
            r5.close()
            goto L_0x0076
        L_0x005c:
            com.google.protobuf.ba r8 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x024c }
            com.google.android.apps.search.assistant.platform.pcp.f.h r9 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h.f341925m     // Catch:{ all -> 0x024c }
            com.google.protobuf.bv r7 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r9, (byte[]) r7, (com.google.protobuf.C62921ba) r8)     // Catch:{ all -> 0x024c }
            com.google.android.apps.search.assistant.platform.pcp.f.h r7 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r7     // Catch:{ all -> 0x024c }
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)     // Catch:{ all -> 0x024c }
            if (r5 == 0) goto L_0x0076
            goto L_0x0058
        L_0x006f:
            j$.util.Optional r7 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x024c }
            if (r5 == 0) goto L_0x0076
            goto L_0x0058
        L_0x0076:
            boolean r5 = r7.isPresent()
            if (r5 == 0) goto L_0x024b
            java.lang.Object r5 = r7.get()
            com.google.android.apps.search.assistant.platform.pcp.f.h r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r5
            double r8 = r5.f341937k
            java.lang.Object r5 = r7.get()
            com.google.android.apps.search.assistant.platform.pcp.f.h r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123779h) r5
            double r10 = r5.f341938l
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "_destination"
            java.lang.String r14 = r2.concat(r5)
            com.google.assistant.ag.c.dj r2 = com.google.assistant.p3803ag.p3809c.C49017dj.f126788c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.ag.c.cz r2 = (com.google.assistant.p3803ag.p3809c.C49006cz) r2
            com.google.assistant.ag.c.cy r5 = com.google.assistant.p3803ag.p3809c.C49005cy.f126761d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ag.c.cx r5 = (com.google.assistant.p3803ag.p3809c.C49004cx) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.ag.c.cy r7 = (com.google.assistant.p3803ag.p3809c.C49005cy) r7
            int r12 = r7.f126763a
            r12 = r12 | r6
            r7.f126763a = r12
            r12 = 0
            r7.f126764b = r12
            com.google.android.libraries.f.a r7 = r0.f342647a
            long r12 = r7.mo26870b()
            com.google.protobuf.ar r0 = r0.f342652f
            long r15 = com.google.protobuf.p4750c.C62948a.m95453d(r0)
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.ag.c.cy r0 = (com.google.assistant.p3803ag.p3809c.C49005cy) r0
            int r7 = r0.f126763a
            r6 = 2
            r7 = r7 | r6
            r0.f126763a = r7
            long r12 = r12 + r15
            r0.f126765c = r12
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.assistant.ag.c.dj r0 = (com.google.assistant.p3803ag.p3809c.C49017dj) r0
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.ag.c.cy r5 = (com.google.assistant.p3803ag.p3809c.C49005cy) r5
            r5.getClass()
            r0.f126791b = r5
            r5 = 1
            r0.f126790a = r5
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.ag.c.dj r0 = (com.google.assistant.p3803ag.p3809c.C49017dj) r0
            com.google.assistant.ag.c.ce r2 = com.google.assistant.p3803ag.p3809c.C48985ce.f126722e
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.ag.c.bs r2 = (com.google.assistant.p3803ag.p3809c.C48972bs) r2
            com.google.assistant.ag.c.bw r5 = com.google.assistant.p3803ag.p3809c.C48976bw.f126700c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ag.c.bv r5 = (com.google.assistant.p3803ag.p3809c.C48975bv) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.ag.c.bw r7 = (com.google.assistant.p3803ag.p3809c.C48976bw) r7
            int r12 = r7.f126702a
            r13 = 1
            r12 = r12 | r13
            r7.f126702a = r12
            r12 = 5
            r7.f126703b = r12
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.ag.c.ce r7 = (com.google.assistant.p3803ag.p3809c.C48985ce) r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.ag.c.bw r5 = (com.google.assistant.p3803ag.p3809c.C48976bw) r5
            r5.getClass()
            r7.f126727d = r5
            r7.f126726c = r6
            com.google.assistant.ag.c.bu r5 = com.google.assistant.p3803ag.p3809c.C48974bu.f126695d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ag.c.bt r5 = (com.google.assistant.p3803ag.p3809c.C48973bt) r5
            r5.copyOnWrite()
            com.google.protobuf.bv r7 = r5.instance
            com.google.assistant.ag.c.bu r7 = (com.google.assistant.p3803ag.p3809c.C48974bu) r7
            int r12 = r7.f126697a
            r12 = r12 | r6
            r7.f126697a = r12
            r12 = 1000(0x3e8, double:4.94E-321)
            r7.f126699c = r12
            com.google.cg.k r7 = com.google.p4479cg.C58079k.f155250c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.cg.j r7 = (com.google.p4479cg.C58078j) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r12 = r7.instance
            com.google.cg.k r12 = (com.google.p4479cg.C58079k) r12
            r12.f155252a = r8
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.cg.k r8 = (com.google.p4479cg.C58079k) r8
            r8.f155253b = r10
            r5.copyOnWrite()
            com.google.protobuf.bv r8 = r5.instance
            com.google.assistant.ag.c.bu r8 = (com.google.assistant.p3803ag.p3809c.C48974bu) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.cg.k r7 = (com.google.p4479cg.C58079k) r7
            r7.getClass()
            r8.f126698b = r7
            int r7 = r8.f126697a
            r9 = 1
            r7 = r7 | r9
            r8.f126697a = r7
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.ag.c.ce r7 = (com.google.assistant.p3803ag.p3809c.C48985ce) r7
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.ag.c.bu r5 = (com.google.assistant.p3803ag.p3809c.C48974bu) r5
            r5.getClass()
            r7.f126725b = r5
            r5 = 4
            r7.f126724a = r5
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.ag.c.ce r2 = (com.google.assistant.p3803ag.p3809c.C48985ce) r2
            com.google.assistant.ag.c.az r5 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ag.c.av r5 = (com.google.assistant.p3803ag.p3809c.C48948av) r5
            com.google.assistant.ag.c.ay r7 = com.google.assistant.p3803ag.p3809c.C48951ay.f126654b
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.ag.c.ax r7 = (com.google.assistant.p3803ag.p3809c.C48950ax) r7
            com.google.assistant.ag.c.az r8 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.ag.c.av r8 = (com.google.assistant.p3803ag.p3809c.C48948av) r8
            com.google.assistant.ag.c.br r9 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.ag.c.bl r9 = (com.google.assistant.p3803ag.p3809c.C48965bl) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.ag.c.br r10 = (com.google.assistant.p3803ag.p3809c.C48971br) r10
            r0.getClass()
            r10.f126692b = r0
            r10.f126691a = r6
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.assistant.ag.c.az r0 = (com.google.assistant.p3803ag.p3809c.C48952az) r0
            com.google.protobuf.bv r9 = r9.build()
            com.google.assistant.ag.c.br r9 = (com.google.assistant.p3803ag.p3809c.C48971br) r9
            r9.getClass()
            r0.f126660b = r9
            r9 = 1
            r0.f126659a = r9
            r7.mo53201a(r8)
            com.google.assistant.ag.c.az r0 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.ag.c.av r0 = (com.google.assistant.p3803ag.p3809c.C48948av) r0
            com.google.assistant.ag.c.br r8 = com.google.assistant.p3803ag.p3809c.C48971br.f126689d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.ag.c.bl r8 = (com.google.assistant.p3803ag.p3809c.C48965bl) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.ag.c.br r9 = (com.google.assistant.p3803ag.p3809c.C48971br) r9
            r2.getClass()
            r9.f126692b = r2
            r2 = 5
            r9.f126691a = r2
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.ag.c.az r2 = (com.google.assistant.p3803ag.p3809c.C48952az) r2
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.ag.c.br r8 = (com.google.assistant.p3803ag.p3809c.C48971br) r8
            r8.getClass()
            r2.f126660b = r8
            r8 = 1
            r2.f126659a = r8
            r7.mo53201a(r0)
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.ag.c.az r0 = (com.google.assistant.p3803ag.p3809c.C48952az) r0
            com.google.protobuf.bv r2 = r7.build()
            com.google.assistant.ag.c.ay r2 = (com.google.assistant.p3803ag.p3809c.C48951ay) r2
            r2.getClass()
            r0.f126660b = r2
            r0.f126659a = r6
            com.google.protobuf.bv r0 = r5.build()
            r17 = r0
            com.google.assistant.ag.c.az r17 = (com.google.assistant.p3803ag.p3809c.C48952az) r17
            com.google.assistant.ag.b.a.f r0 = com.google.assistant.p3803ag.p3807b.p3808a.C48904f.f126552a
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.ag.b.a.e r0 = (com.google.assistant.p3803ag.p3807b.p3808a.C48903e) r0
            com.google.protobuf.bt r2 = com.google.assistant.p3803ag.p3807b.p3808a.C48902d.f126550b
            com.google.assistant.ag.b.a.d r5 = com.google.assistant.p3803ag.p3807b.p3808a.C48902d.f126549a
            r0.mo58885m(r2, r5)
            com.google.protobuf.bv r0 = r0.build()
            r19 = r0
            com.google.assistant.ag.b.a.f r19 = (com.google.assistant.p3803ag.p3807b.p3808a.C48904f) r19
            j$.util.Optional r13 = p3186j$.util.Optional.m71637of(r3)
            com.google.android.apps.search.assistant.platform.pcp.validity.a r0 = new com.google.android.apps.search.assistant.platform.pcp.validity.a
            r15 = 100006(0x186a6, float:1.40138E-40)
            r16 = 23
            r18 = 0
            r12 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r4.mo55395g(r0)
        L_0x024b:
            return
        L_0x024c:
            r0 = move-exception
            r2 = r0
            if (r5 == 0) goto L_0x026e
            r5.close()     // Catch:{ all -> 0x0254 }
            goto L_0x026e
        L_0x0254:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x026e }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r0[r5] = r4     // Catch:{ Exception -> 0x026e }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r6, r0)     // Catch:{ Exception -> 0x026e }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x026e }
            r4[r5] = r3     // Catch:{ Exception -> 0x026e }
            r0.invoke(r2, r4)     // Catch:{ Exception -> 0x026e }
        L_0x026e:
            goto L_0x0270
        L_0x026f:
            throw r2
        L_0x0270:
            goto L_0x026f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9339i.C124056ak.mo45928a(com.google.android.libraries.storage.b.bf):void");
    }
}
