package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.bb */
/* compiled from: PG */
public final /* synthetic */ class C124074bb implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124081bi f342686a;

    /* renamed from: b */
    public final /* synthetic */ List f342687b;

    /* renamed from: c */
    public final /* synthetic */ List f342688c;

    /* renamed from: d */
    public final /* synthetic */ boolean f342689d;

    /* renamed from: e */
    public final /* synthetic */ C53306j f342690e;

    /* renamed from: f */
    public final /* synthetic */ boolean f342691f;

    /* renamed from: g */
    public final /* synthetic */ C123755bv f342692g;

    /* renamed from: h */
    public final /* synthetic */ C123777f f342693h;

    /* renamed from: i */
    public final /* synthetic */ Set f342694i;

    public /* synthetic */ C124074bb(C124081bi biVar, List list, List list2, boolean z, C53306j jVar, boolean z2, C123755bv bvVar, C123777f fVar, Set set) {
        this.f342686a = biVar;
        this.f342687b = list;
        this.f342688c = list2;
        this.f342689d = z;
        this.f342690e = jVar;
        this.f342691f = z2;
        this.f342692g = bvVar;
        this.f342693h = fVar;
        this.f342694i = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0102, code lost:
        if (r1 == false) goto L_0x010f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x020e A[LOOP:1: B:40:0x0208->B:42:0x020e, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            com.google.android.apps.search.assistant.platform.pcp.i.bi r8 = r0.f342686a
            java.util.List r9 = r0.f342687b
            java.util.List r10 = r0.f342688c
            boolean r11 = r0.f342689d
            com.google.assistant.s.a.j r12 = r0.f342690e
            boolean r13 = r0.f342691f
            com.google.android.apps.search.assistant.platform.pcp.f.bv r14 = r0.f342692g
            com.google.android.apps.search.assistant.platform.pcp.f.f r15 = r0.f342693h
            java.util.Set r7 = r0.f342694i
            r1 = r26
            java.util.List r1 = (java.util.List) r1
            com.google.common.b.gz r6 = new com.google.common.b.gz
            r2 = 4
            r6.<init>(r2)
            com.google.common.b.gz r5 = new com.google.common.b.gz
            r5.<init>(r2)
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x0105
            java.util.Iterator r16 = r1.iterator()
            r1 = 0
        L_0x002e:
            boolean r2 = r16.hasNext()
            if (r2 == 0) goto L_0x00f8
            java.lang.Object r2 = r16.next()
            r17 = r2
            com.google.apps.tiktok.account.data.a r17 = (com.google.apps.tiktok.account.data.C46108a) r17
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.apps.tiktok.account.AccountId r2 = r17.mo50209a()
            r2.mo50068a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.addAll(r9)
            com.google.apps.tiktok.account.AccountId r2 = r17.mo50209a()
            int r2 = r2.mo50068a()
            com.google.apps.tiktok.account.AccountId r4 = r8.f342711c
            int r4 = r4.mo50068a()
            if (r2 != r4) goto L_0x0064
            r3.addAll(r10)
            r1 = 1
            r18 = 1
            goto L_0x0066
        L_0x0064:
            r18 = r1
        L_0x0066:
            android.content.Context r1 = r8.f342710b
            com.google.apps.tiktok.account.AccountId r2 = r17.mo50209a()
            com.google.android.apps.search.assistant.platform.pcp.b.b r4 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r1, r2)
            boolean r1 = r8.f342717i
            if (r1 == 0) goto L_0x00b0
            if (r11 != 0) goto L_0x00a1
            com.google.apps.tiktok.account.AccountId r2 = r17.mo50209a()
            com.google.apps.tiktok.account.AccountId r1 = r17.mo50209a()
            j$.util.Optional r19 = p3186j$.util.Optional.m71637of(r1)
            r1 = r8
            r0 = r2
            r2 = r3
            r20 = r9
            r9 = r3
            r3 = r12
            r21 = r10
            r10 = r4
            r4 = r13
            r22 = r13
            r13 = r5
            r5 = r14
            r23 = r14
            r14 = r6
            r6 = r19
            r24 = r7
            r7 = r15
            com.google.common.b.gu r1 = r1.mo106271b(r2, r3, r4, r5, r6, r7)
            r14.mo55429h(r0, r1)
            goto L_0x00d7
        L_0x00a1:
            r24 = r7
            r20 = r9
            r21 = r10
            r22 = r13
            r23 = r14
            r9 = r3
            r10 = r4
            r13 = r5
            r14 = r6
            goto L_0x00cc
        L_0x00b0:
            r24 = r7
            r20 = r9
            r21 = r10
            r22 = r13
            r23 = r14
            r9 = r3
            r10 = r4
            r13 = r5
            r14 = r6
            if (r11 != 0) goto L_0x00cc
            com.google.apps.tiktok.account.AccountId r0 = r17.mo50209a()
            com.google.common.b.gu r1 = r8.mo106270a(r10, r9, r12, r15)
            r14.mo55429h(r0, r1)
            goto L_0x00d7
        L_0x00cc:
            com.google.apps.tiktok.account.AccountId r0 = r17.mo50209a()
            com.google.common.b.gu r1 = r8.mo106272c(r10, r9, r12, r15)
            r14.mo55429h(r0, r1)
        L_0x00d7:
            com.google.apps.tiktok.account.AccountId r0 = r17.mo50209a()
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r9)
            com.google.common.util.concurrent.cx r1 = r10.mo106075b(r12, r1)
            r13.mo55429h(r0, r1)
            r0 = r25
            r5 = r13
            r6 = r14
            r1 = r18
            r9 = r20
            r10 = r21
            r13 = r22
            r14 = r23
            r7 = r24
            goto L_0x002e
        L_0x00f8:
            r24 = r7
            r21 = r10
            r22 = r13
            r23 = r14
            r13 = r5
            r14 = r6
            if (r1 != 0) goto L_0x0160
            goto L_0x010f
        L_0x0105:
            r24 = r7
            r21 = r10
            r22 = r13
            r23 = r14
            r13 = r5
            r14 = r6
        L_0x010f:
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0160
            android.content.Context r0 = r8.f342710b
            com.google.apps.tiktok.account.AccountId r1 = r8.f342711c
            com.google.android.apps.search.assistant.platform.pcp.b.b r0 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202992a(r0, r1)
            boolean r1 = r8.f342717i
            if (r1 == 0) goto L_0x013a
            if (r11 != 0) goto L_0x013a
            com.google.apps.tiktok.account.AccountId r9 = r8.f342711c
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r9)
            r1 = r8
            r2 = r21
            r3 = r12
            r4 = r22
            r5 = r23
            r7 = r15
            com.google.common.b.gu r1 = r1.mo106271b(r2, r3, r4, r5, r6, r7)
            r14.mo55429h(r9, r1)
            goto L_0x0153
        L_0x013a:
            if (r11 == 0) goto L_0x0148
            com.google.apps.tiktok.account.AccountId r1 = r8.f342711c
            r2 = r21
            com.google.common.b.gu r3 = r8.mo106272c(r0, r2, r12, r15)
            r14.mo55429h(r1, r3)
            goto L_0x0153
        L_0x0148:
            r2 = r21
            com.google.apps.tiktok.account.AccountId r1 = r8.f342711c
            com.google.common.b.gu r3 = r8.mo106270a(r0, r2, r12, r15)
            r14.mo55429h(r1, r3)
        L_0x0153:
            com.google.apps.tiktok.account.AccountId r1 = r8.f342711c
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            com.google.common.util.concurrent.cx r0 = r0.mo106075b(r12, r2)
            r13.mo55429h(r1, r0)
        L_0x0160:
            android.content.Context r0 = r8.f342710b
            com.google.android.apps.search.assistant.platform.pcp.b.ah r0 = com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c.m202993b(r0)
            com.google.android.apps.search.assistant.platform.pcp.i.cg r1 = r8.f342718j
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = r24
            r2.<init>(r3)
            e.a.a.u.b.t r1 = r1.f342771a
            com.google.protobuf.cq r1 = r1.f185373a
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.search.assistant.platform.pcp.i.ce r4 = new com.google.android.apps.search.assistant.platform.pcp.i.ce
            r4.<init>(r12)
            j$.util.stream.Stream r1 = r1.filter(r4)
            com.google.android.apps.search.assistant.platform.pcp.i.cf r4 = new com.google.android.apps.search.assistant.platform.pcp.i.cf
            r4.<init>(r2)
            j$.util.stream.Stream r1 = r1.filter(r4)
            com.google.android.apps.search.assistant.platform.pcp.i.cb r2 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124103cb.f342766a
            j$.util.stream.Stream r1 = r1.map(r2)
            com.google.android.apps.search.assistant.platform.pcp.i.cc r2 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124104cc.f342767a
            j$.util.stream.Collector r2 = p3186j$.util.stream.Collectors.toCollection(r2)
            java.lang.Object r1 = r1.collect(r2)
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            boolean r1 = r8.f342717i
            if (r1 == 0) goto L_0x01c3
            if (r11 != 0) goto L_0x01d6
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r22
            r5 = r23
            r7 = r15
            com.google.common.b.gu r1 = r1.mo106271b(r2, r3, r4, r5, r6, r7)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92906o(r1)
            com.google.android.apps.search.assistant.platform.pcp.i.aw r2 = com.google.android.apps.search.assistant.platform.pcp.p9339i.C124068aw.f342671a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r3)
            goto L_0x01e6
        L_0x01c3:
            if (r11 != 0) goto L_0x01d6
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            com.google.android.apps.search.assistant.platform.pcp.b.ac r1 = r0.f341542c
            com.google.android.libraries.storage.b.e r2 = r0.f341541b
            r6 = 1
            r3 = r12
            r4 = r15
            com.google.common.util.concurrent.cx r1 = r1.mo106064h(r2, r3, r4, r5, r6)
            goto L_0x01e6
        L_0x01d6:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            com.google.android.apps.search.assistant.platform.pcp.b.ac r1 = r0.f341542c
            com.google.android.libraries.storage.b.e r2 = r0.f341541b
            r6 = 0
            r3 = r12
            r4 = r15
            com.google.common.util.concurrent.cx r1 = r1.mo106064h(r2, r3, r4, r5, r6)
        L_0x01e6:
            r5 = r1
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r9)
            com.google.android.apps.search.assistant.platform.pcp.b.ac r2 = r0.f341542c
            com.google.android.libraries.storage.b.e r0 = r0.f341541b
            com.google.common.util.concurrent.cx r6 = r2.mo106060d(r0, r12, r1)
            r0 = 0
            com.google.common.b.hd r3 = r14.mo55427f(r0)
            com.google.common.b.hd r4 = r13.mo55427f(r0)
            com.google.common.b.gp r0 = com.google.common.p4522b.C58485gu.m89837e()
            com.google.common.b.gg r1 = r3.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0208:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0218
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            r0.mo55396h(r2)
            goto L_0x0208
        L_0x0218:
            com.google.common.b.gg r1 = r4.values()
            r0.mo55396h(r1)
            r0.mo55395g(r5)
            r0.mo55395g(r6)
            com.google.common.b.gu r0 = r0.mo55394f()
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92894c(r0)
            com.google.android.apps.search.assistant.platform.pcp.i.ax r9 = new com.google.android.apps.search.assistant.platform.pcp.i.ax
            r1 = r9
            r2 = r8
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.util.concurrent.Callable r1 = com.google.apps.tiktok.tracing.C47810es.m84978r(r9)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r0.mo57334a(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.p9339i.C124074bb.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
