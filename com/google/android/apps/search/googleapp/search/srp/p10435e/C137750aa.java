package com.google.android.apps.search.googleapp.search.srp.p10435e;

import com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.aa */
/* compiled from: PG */
public final class C137750aa {

    /* renamed from: b */
    private static final C59071e f374713b = C59071e.m91331h();

    /* renamed from: a */
    public final C71422aw f374714a;

    /* renamed from: c */
    private final boolean f374715c;

    /* renamed from: d */
    private final boolean f374716d;

    /* renamed from: e */
    private final C137764ao f374717e;

    /* renamed from: f */
    private final C137777ba f374718f;

    /* renamed from: g */
    private final C21370a f374719g;

    public C137750aa(boolean z, boolean z2, C69585o oVar, C71422aw awVar, C137764ao aoVar, C137777ba baVar, C21370a aVar) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        this.f374715c = z;
        this.f374716d = z2;
        this.f374714a = awVar;
        this.f374717e = aoVar;
        this.f374718f = baVar;
        this.f374719g = aVar;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m223912c(C137750aa aaVar, C137542d dVar, boolean z, boolean z2, C137770au auVar, C69577g gVar, int i) {
        boolean z3 = false;
        boolean z4 = ((i & 2) == 0) & z;
        if ((i & 4) == 0) {
            z3 = true;
        }
        boolean z5 = z3 & z2;
        if ((i & 8) != 0) {
            auVar = C137770au.PSYCHIC;
        }
        boolean z6 = aaVar.f374715c;
        return aaVar.mo113943b(dVar, z4, z5, auVar, gVar);
    }

    /* renamed from: a */
    public final void mo113942a() {
        this.f374717e.f374775u.mo113957e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.apps.search.googleapp.search.srp.e.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: com.google.android.apps.search.googleapp.search.srp.e.aa} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: com.google.android.apps.search.googleapp.search.srp.e.aa} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d9 A[Catch:{ Exception -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0168 A[Catch:{ Exception -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017b A[Catch:{ Exception -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019f A[Catch:{ Exception -> 0x01bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo113943b(com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d r18, boolean r19, boolean r20, com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au r21, p5462h.p5466c.C69577g r22) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            r3 = r22
            boolean r4 = r3 instanceof com.google.android.apps.search.googleapp.search.srp.p10435e.C137800y
            if (r4 == 0) goto L_0x001b
            r4 = r3
            com.google.android.apps.search.googleapp.search.srp.e.y r4 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137800y) r4
            int r5 = r4.f374905h
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f374905h = r5
            goto L_0x0020
        L_0x001b:
            com.google.android.apps.search.googleapp.search.srp.e.y r4 = new com.google.android.apps.search.googleapp.search.srp.e.y
            r4.<init>(r1, r3)
        L_0x0020:
            java.lang.Object r3 = r4.f374903f
            h.c.a.a r5 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r6 = r4.f374905h
            r7 = 1
            if (r6 == 0) goto L_0x0046
            if (r6 != r7) goto L_0x003e
            boolean r0 = r4.f374902e
            boolean r2 = r4.f374901d
            java.lang.Object r5 = r4.f374900c
            java.lang.Object r6 = r4.f374899b
            java.lang.Object r4 = r4.f374898a
            p5462h.C69714l.m101134b(r3)     // Catch:{ Exception -> 0x01bc }
            r16 = r2
            r2 = r0
            r0 = r16
            goto L_0x0077
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            p5462h.C69714l.m101134b(r3)
            if (r0 == 0) goto L_0x0056
            if (r2 != 0) goto L_0x004e
            goto L_0x0056
        L_0x004e:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01bc }
            r2.<init>(r0)     // Catch:{ Exception -> 0x01bc }
            throw r2     // Catch:{ Exception -> 0x01bc }
        L_0x0056:
            com.google.android.apps.search.googleapp.search.srp.e.ao r3 = r1.f374717e     // Catch:{ Exception -> 0x01bc }
            r4.f374898a = r1     // Catch:{ Exception -> 0x01bc }
            r6 = r18
            r4.f374899b = r6     // Catch:{ Exception -> 0x01bc }
            r8 = r21
            r4.f374900c = r8     // Catch:{ Exception -> 0x01bc }
            r4.f374901d = r0     // Catch:{ Exception -> 0x01bc }
            r4.f374902e = r2     // Catch:{ Exception -> 0x01bc }
            r4.f374905h = r7     // Catch:{ Exception -> 0x01bc }
            com.google.android.apps.search.googleapp.search.srp.e.h r9 = r3.f374775u     // Catch:{ Exception -> 0x01bc }
            com.google.android.apps.search.googleapp.search.srp.e.an r10 = new com.google.android.apps.search.googleapp.search.srp.e.an     // Catch:{ Exception -> 0x01bc }
            r10.<init>(r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.Object r3 = r9.mo113956d(r10, r4)     // Catch:{ Exception -> 0x01bc }
            if (r3 == r5) goto L_0x01bb
            r4 = r1
            r5 = r8
        L_0x0077:
            com.google.android.apps.search.googleapp.search.srp.e.as r3 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as) r3     // Catch:{ Exception -> 0x01bc }
            r8 = 0
            java.lang.String r9 = "uriBuilder.build()"
            java.lang.String r10 = "i"
            java.lang.String r11 = "pf"
            java.lang.String r12 = "search"
            java.lang.String r13 = "requestParams"
            java.lang.String r14 = "searchQuery"
            java.lang.String r15 = "requestData.paramsMap"
            r7 = 0
            if (r0 == 0) goto L_0x00d9
            r0 = r4
            com.google.android.apps.search.googleapp.search.srp.e.aa r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa) r0     // Catch:{ Exception -> 0x01bc }
            com.google.android.apps.search.googleapp.search.srp.e.ba r0 = r0.f374718f     // Catch:{ Exception -> 0x01bc }
            com.google.protobuf.dn r5 = r3.f374786b     // Catch:{ Exception -> 0x01bc }
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)     // Catch:{ Exception -> 0x01bc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r15)     // Catch:{ Exception -> 0x01bc }
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r14)     // Catch:{ Exception -> 0x01bc }
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r13 = "toPrefetchBrowserUrl"
            com.google.apps.tiktok.tracing.bi r13 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r13)     // Catch:{ Exception -> 0x01bc }
            r14 = r6
            com.google.android.apps.search.googleapp.search.k.a.d r14 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r14     // Catch:{ all -> 0x00d0 }
            android.net.Uri$Builder r0 = r0.mo113950a(r14, r5, r12, r7)     // Catch:{ all -> 0x00d0 }
            r0.appendQueryParameter(r11, r10)     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = "agsai"
            r10 = r6
            com.google.android.apps.search.googleapp.search.k.a.d r10 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r10     // Catch:{ all -> 0x00d0 }
            com.google.android.apps.search.googleapp.search.e.g r10 = r10.f374092f     // Catch:{ all -> 0x00d0 }
            if (r10 != 0) goto L_0x00ba
            com.google.android.apps.search.googleapp.search.e.g r10 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ all -> 0x00d0 }
        L_0x00ba:
            java.lang.String r10 = r10.f373783o     // Catch:{ all -> 0x00d0 }
            r0.appendQueryParameter(r5, r10)     // Catch:{ all -> 0x00d0 }
            java.lang.String r5 = "pb=1"
            r0.encodedFragment(r5)     // Catch:{ all -> 0x00d0 }
            android.net.Uri r0 = r0.build()     // Catch:{ all -> 0x00d0 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ all -> 0x00d0 }
            p5462h.p5472e.C69598b.m101013a(r13, r8)     // Catch:{ Exception -> 0x01bc }
            goto L_0x0150
        L_0x00d0:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r13, r2)     // Catch:{ Exception -> 0x01bc }
            throw r3     // Catch:{ Exception -> 0x01bc }
        L_0x00d9:
            if (r2 == 0) goto L_0x013b
            r0 = r4
            com.google.android.apps.search.googleapp.search.srp.e.aa r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa) r0     // Catch:{ Exception -> 0x01bc }
            com.google.android.apps.search.googleapp.search.srp.e.ba r0 = r0.f374718f     // Catch:{ Exception -> 0x01bc }
            com.google.protobuf.dn r8 = r3.f374786b     // Catch:{ Exception -> 0x01bc }
            java.util.Map r8 = java.util.Collections.unmodifiableMap(r8)     // Catch:{ Exception -> 0x01bc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r15)     // Catch:{ Exception -> 0x01bc }
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r14)     // Catch:{ Exception -> 0x01bc }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r13)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r13 = "srpPrefetchType"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r13)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r13 = "toPrefetchNetworkUrl"
            com.google.apps.tiktok.tracing.bi r13 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r13)     // Catch:{ Exception -> 0x01bc }
            com.google.android.apps.search.googleapp.search.srp.e.au r14 = com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au.PSYCHIC     // Catch:{ all -> 0x0132 }
            com.google.android.apps.search.googleapp.search.srp.e.au r5 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137770au) r5     // Catch:{ all -> 0x0132 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0132 }
            java.lang.String r14 = "s"
            if (r5 == 0) goto L_0x0114
            r15 = 1
            if (r5 != r15) goto L_0x010e
            boolean r5 = r0.f374799a     // Catch:{ all -> 0x0132 }
            if (r5 == 0) goto L_0x0114
            goto L_0x0115
        L_0x010e:
            h.g r0 = new h.g     // Catch:{ all -> 0x0132 }
            r0.<init>()     // Catch:{ all -> 0x0132 }
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0114:
            r12 = r14
        L_0x0115:
            r5 = r6
            com.google.android.apps.search.googleapp.search.k.a.d r5 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r5     // Catch:{ all -> 0x0132 }
            android.net.Uri$Builder r0 = r0.mo113950a(r5, r8, r12, r7)     // Catch:{ all -> 0x0132 }
            r0.appendQueryParameter(r11, r10)     // Catch:{ all -> 0x0132 }
            java.lang.String r5 = "sns"
            java.lang.String r8 = "1"
            r0.appendQueryParameter(r5, r8)     // Catch:{ all -> 0x0132 }
            android.net.Uri r0 = r0.build()     // Catch:{ all -> 0x0132 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)     // Catch:{ all -> 0x0132 }
            r5 = 0
            p5462h.p5472e.C69598b.m101013a(r13, r5)     // Catch:{ Exception -> 0x01bc }
            goto L_0x0150
        L_0x0132:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch:{ all -> 0x0135 }
        L_0x0135:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r13, r2)     // Catch:{ Exception -> 0x01bc }
            throw r3     // Catch:{ Exception -> 0x01bc }
        L_0x013b:
            r0 = r4
            com.google.android.apps.search.googleapp.search.srp.e.aa r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa) r0     // Catch:{ Exception -> 0x01bc }
            com.google.android.apps.search.googleapp.search.srp.e.ba r0 = r0.f374718f     // Catch:{ Exception -> 0x01bc }
            com.google.protobuf.dn r5 = r3.f374786b     // Catch:{ Exception -> 0x01bc }
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)     // Catch:{ Exception -> 0x01bc }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r15)     // Catch:{ Exception -> 0x01bc }
            r8 = r6
            com.google.android.apps.search.googleapp.search.k.a.d r8 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r8     // Catch:{ Exception -> 0x01bc }
            android.net.Uri r0 = r0.mo113952c(r8, r5)     // Catch:{ Exception -> 0x01bc }
        L_0x0150:
            com.google.protobuf.dn r3 = r3.f374785a     // Catch:{ Exception -> 0x01bc }
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r5 = "requestData.headersMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)     // Catch:{ Exception -> 0x01bc }
            java.util.Map r3 = p5462h.p5463a.C69505av.m100876r(r3)     // Catch:{ Exception -> 0x01bc }
            java.lang.String r5 = "X-Speech-Requestid"
            r8 = r6
            com.google.android.apps.search.googleapp.search.k.a.d r8 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r8     // Catch:{ Exception -> 0x01bc }
            com.google.android.apps.search.googleapp.search.e.g r8 = r8.f374092f     // Catch:{ Exception -> 0x01bc }
            if (r8 != 0) goto L_0x016a
            com.google.android.apps.search.googleapp.search.e.g r8 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r     // Catch:{ Exception -> 0x01bc }
        L_0x016a:
            java.lang.String r8 = r8.f373783o     // Catch:{ Exception -> 0x01bc }
            java.lang.String r9 = "currentSearchQuery.queryOptions.requestId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ Exception -> 0x01bc }
            r3.put(r5, r8)     // Catch:{ Exception -> 0x01bc }
            r5 = r4
            com.google.android.apps.search.googleapp.search.srp.e.aa r5 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa) r5     // Catch:{ Exception -> 0x01bc }
            boolean r5 = r5.f374716d     // Catch:{ Exception -> 0x01bc }
            if (r5 == 0) goto L_0x018c
            java.lang.String r5 = "X-Device-Elapsed-Time"
            com.google.android.apps.search.googleapp.search.srp.e.aa r4 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa) r4     // Catch:{ Exception -> 0x01bc }
            com.google.android.libraries.f.a r4 = r4.f374719g     // Catch:{ Exception -> 0x01bc }
            long r8 = r4.mo26872d()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01bc }
            r3.put(r5, r4)     // Catch:{ Exception -> 0x01bc }
        L_0x018c:
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x01bc }
            com.google.android.libraries.web.base.f r0 = com.google.android.libraries.web.base.C43257h.m76306m(r0)     // Catch:{ Exception -> 0x01bc }
            com.google.common.b.gz r4 = r0.f113051b     // Catch:{ Exception -> 0x01bc }
            r4.mo55433l(r3)     // Catch:{ Exception -> 0x01bc }
            r3 = 1
            r0.mo46344e(r3)     // Catch:{ Exception -> 0x01bc }
            if (r2 != 0) goto L_0x01b1
            com.google.android.apps.search.googleapp.search.k.a.d r6 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r6     // Catch:{ Exception -> 0x01bc }
            int r2 = r6.f374088b     // Catch:{ Exception -> 0x01bc }
            int r2 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r2)     // Catch:{ Exception -> 0x01bc }
            if (r2 != 0) goto L_0x01aa
            goto L_0x01ae
        L_0x01aa:
            r4 = 6
            if (r2 != r4) goto L_0x01ae
            r7 = 1
        L_0x01ae:
            r0.mo46347h(r7)     // Catch:{ Exception -> 0x01bc }
        L_0x01b1:
            com.google.android.libraries.web.base.h r0 = r0.mo46365k()     // Catch:{ Exception -> 0x01bc }
            java.lang.String r2 = "builder(searchUrl.toStri…       }\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ Exception -> 0x01bc }
            return r0
        L_0x01bb:
            return r5
        L_0x01bc:
            r0 = move-exception
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto L_0x01c2
            throw r0
        L_0x01c2:
            com.google.common.f.e r2 = f374713b
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r2 = r2.mo56382g(r0)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 41055(0xa05f, float:5.753E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "Fail to create LoadUrlParams"
            r2.mo56386p(r3)
            com.google.android.apps.search.googleapp.search.srp.e.ab r2 = new com.google.android.apps.search.googleapp.search.srp.e.ab
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.srp.p10435e.C137750aa.mo113943b(com.google.android.apps.search.googleapp.search.k.a.d, boolean, boolean, com.google.android.apps.search.googleapp.search.srp.e.au, h.c.g):java.lang.Object");
    }
}
