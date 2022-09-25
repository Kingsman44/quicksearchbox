package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.OneSearchAppSearchUpdater$updateCacheForPrimaryAccount$1", mo61344c = "OneSearchAppSearchUpdater.kt", mo61345d = "invokeSuspend", mo61346e = {57, 66, 69})
/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.c */
/* compiled from: PG */
final class C138224c extends C69572j implements C69630p {

    /* renamed from: a */
    Object f376078a;

    /* renamed from: b */
    int f376079b;

    /* renamed from: c */
    final /* synthetic */ C138222b f376080c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138224c(C138222b bVar, C69577g gVar) {
        super(2, gVar);
        this.f376080c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138224c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b$a} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r13 != r0) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00db, code lost:
        if (r13 == r0) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00dd, code lost:
        return r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r13) {
        /*
            r12 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r12.f376079b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r3) goto L_0x0017
            if (r1 == r2) goto L_0x0011
            p5462h.C69714l.m101134b(r13)     // Catch:{ Exception -> 0x001b }
            goto L_0x00fc
        L_0x0011:
            java.lang.Object r1 = r12.f376078a
            p5462h.C69714l.m101134b(r13)     // Catch:{ Exception -> 0x001b }
            goto L_0x0053
        L_0x0017:
            p5462h.C69714l.m101134b(r13)     // Catch:{ Exception -> 0x001b }
            goto L_0x0032
        L_0x001b:
            r13 = move-exception
            goto L_0x00de
        L_0x001e:
            p5462h.C69714l.m101134b(r13)
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b r13 = r12.f376080c     // Catch:{ Exception -> 0x001b }
            com.google.android.libraries.search.a.m r13 = r13.f376074c     // Catch:{ Exception -> 0x001b }
            com.google.common.util.concurrent.cx r13 = r13.mo38012a()     // Catch:{ Exception -> 0x001b }
            r12.f376079b = r3     // Catch:{ Exception -> 0x001b }
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r12)     // Catch:{ Exception -> 0x001b }
            if (r13 != r0) goto L_0x0032
            return r0
        L_0x0032:
            com.google.apps.tiktok.account.AccountId r13 = (com.google.apps.tiktok.account.AccountId) r13     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b r1 = r12.f376080c     // Catch:{ Exception -> 0x001b }
            android.content.Context r1 = r1.f376073b     // Catch:{ Exception -> 0x001b }
            java.lang.Class<com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b$a> r4 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138222b.C138223a.class
            java.lang.Object r13 = com.google.apps.tiktok.inject.C47245e.m84045a(r1, r4, r13)     // Catch:{ Exception -> 0x001b }
            r1 = r13
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.b$a r1 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138222b.C138223a) r1     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.sources.a.ar r13 = r1.mo114205cI()     // Catch:{ Exception -> 0x001b }
            com.google.common.util.concurrent.cx r13 = r13.mo114272d()     // Catch:{ Exception -> 0x001b }
            r12.f376078a = r1     // Catch:{ Exception -> 0x001b }
            r12.f376079b = r2     // Catch:{ Exception -> 0x001b }
            java.lang.Object r13 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r12)     // Catch:{ Exception -> 0x001b }
            if (r13 == r0) goto L_0x00dd
        L_0x0053:
            j$.util.Optional r13 = (p3186j$.util.Optional) r13     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.v r2 = com.google.android.apps.search.googleapp.search.suggest.C138678v.f377195e     // Catch:{ Exception -> 0x001b }
            java.lang.Object r13 = r13.orElse(r2)     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.v r13 = (com.google.android.apps.search.googleapp.search.suggest.C138678v) r13     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.f r1 = r1.mo114204cE()     // Catch:{ Exception -> 0x001b }
            java.lang.String r2 = "zeroPrefixSuggestResponse"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)     // Catch:{ Exception -> 0x001b }
            r2 = 0
            r12.f376078a = r2     // Catch:{ Exception -> 0x001b }
            r2 = 3
            r12.f376079b = r2     // Catch:{ Exception -> 0x001b }
            com.google.protobuf.cq r2 = r13.f377199c     // Catch:{ Exception -> 0x001b }
            r2.size()     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r2 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n.f376169h     // Catch:{ Exception -> 0x001b }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.m r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138262m) r2     // Catch:{ Exception -> 0x001b }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x001b }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r4 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r4     // Catch:{ Exception -> 0x001b }
            int r5 = r4.f376171a     // Catch:{ Exception -> 0x001b }
            r3 = r3 | r5
            r4.f376171a = r3     // Catch:{ Exception -> 0x001b }
            java.lang.String r3 = ""
            r4.f376172b = r3     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.af r3 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138171af.ENTRY_POINT_UNKNOWN     // Catch:{ Exception -> 0x001b }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x001b }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r4 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r4     // Catch:{ Exception -> 0x001b }
            int r3 = r3.f375943d     // Catch:{ Exception -> 0x001b }
            r4.f376176f = r3     // Catch:{ Exception -> 0x001b }
            int r3 = r4.f376171a     // Catch:{ Exception -> 0x001b }
            r3 = r3 | 16
            r4.f376171a = r3     // Catch:{ Exception -> 0x001b }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ Exception -> 0x001b }
            java.lang.String r3 = "newBuilder()\n        .se…UNKNOWN)\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.n r2 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138263n) r2     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r3 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r.f376326j     // Catch:{ Exception -> 0x001b }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.o r3 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138264o) r3     // Catch:{ Exception -> 0x001b }
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.provider.j r4 = r1.f376092e     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.s r8 = r4.mo114234a(r2, r13, r3)     // Catch:{ Exception -> 0x001b }
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.e r5 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138227f.f376088a     // Catch:{ Exception -> 0x001b }
            android.content.Context r6 = r1.f376091d     // Catch:{ Exception -> 0x001b }
            com.google.protobuf.bv r13 = r3.build()     // Catch:{ Exception -> 0x001b }
            java.lang.String r2 = "getSuggestionsResponseBuilder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)     // Catch:{ Exception -> 0x001b }
            r7 = r13
            com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.r r7 = (com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.C138317r) r7     // Catch:{ Exception -> 0x001b }
            com.google.android.libraries.f.a r13 = r1.f376093f     // Catch:{ Exception -> 0x001b }
            long r9 = r13.mo26870b()     // Catch:{ Exception -> 0x001b }
            r11 = r12
            java.lang.Object r13 = r5.mo114206a(r6, r7, r8, r9, r11)     // Catch:{ Exception -> 0x001b }
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ Exception -> 0x001b }
            if (r13 == r1) goto L_0x00db
            h.q r13 = p5462h.C69788q.f186170a     // Catch:{ Exception -> 0x001b }
        L_0x00db:
            if (r13 != r0) goto L_0x00fc
        L_0x00dd:
            return r0
        L_0x00de:
            com.google.common.f.e r0 = com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138222b.f376072a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r13 = r0.mo56382g(r13)
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 41121(0xa0a1, float:5.7623E-41)
            r0.<init>(r1)
            r13.mo56379ah(r0)
            java.lang.String r0 = "Could not update AppSearch zero-prefix cache"
            r13.mo56386p(r0)
        L_0x00fc:
            h.q r13 = p5462h.C69788q.f186170a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.cache.C138224c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C138224c(this.f376080c, gVar);
    }
}
