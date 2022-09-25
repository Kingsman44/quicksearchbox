package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.search.voicesearch.assistantpowered.request.QueryFreeRequestDataFetcher$getRequestDataForNonM5Request$2", mo61344c = "QueryFreeRequestDataFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {175, 185, 195})
/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.af */
/* compiled from: PG */
final class C138735af extends C69572j implements C69630p {

    /* renamed from: a */
    Object f377320a;

    /* renamed from: b */
    int f377321b;

    /* renamed from: c */
    final /* synthetic */ C138736ag f377322c;

    /* renamed from: d */
    private /* synthetic */ Object f377323d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138735af(C138736ag agVar, C69577g gVar) {
        super(2, gVar);
        this.f377322c = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C138735af) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: kotlinx.coroutines.be} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f377321b
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L_0x002c
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001a
            java.lang.Object r0 = r10.f377323d
            com.google.android.apps.search.googleapp.search.srp.e.ap r0 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137765ap) r0
            p5462h.C69714l.m101134b(r11)     // Catch:{ Exception -> 0x0017 }
            goto L_0x00c8
        L_0x0017:
            r11 = move-exception
            goto L_0x00d3
        L_0x001a:
            java.lang.Object r1 = r10.f377323d
            com.google.android.apps.search.googleapp.search.srp.e.ap r1 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137765ap) r1
            p5462h.C69714l.m101134b(r11)
            goto L_0x0084
        L_0x0022:
            java.lang.Object r1 = r10.f377320a
            java.lang.Object r3 = r10.f377323d
            com.google.android.apps.search.googleapp.search.srp.e.ap r3 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137765ap) r3
            p5462h.C69714l.m101134b(r11)
            goto L_0x0066
        L_0x002c:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f377323d
            kotlinx.coroutines.aw r11 = (kotlinx.coroutines.C71422aw) r11
            com.google.android.apps.search.googleapp.search.srp.e.as r1 = com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as.f374783c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.search.srp.e.ap r1 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137765ap) r1
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ae r6 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.ae
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ag r7 = r10.f377322c
            r6.<init>(r7, r5)
            kotlinx.coroutines.be r6 = kotlinx.coroutines.C71803m.m105042c(r11, r5, r5, r6, r4)
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ad r7 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.ad
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ag r8 = r10.f377322c
            r7.<init>(r8, r5)
            kotlinx.coroutines.be r11 = kotlinx.coroutines.C71803m.m105042c(r11, r5, r5, r7, r4)
            r10.f377323d = r1
            r10.f377320a = r11
            r10.f377321b = r3
            java.lang.Object r3 = r6.mo62825a(r10)
            if (r3 == r0) goto L_0x011f
            r9 = r1
            r1 = r11
            r11 = r3
            r3 = r9
        L_0x0066:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0070
            java.lang.String r6 = "X-Geo"
            r3.mo113946c(r6, r11)
            goto L_0x0077
        L_0x0070:
            java.lang.String r11 = "devloc"
            java.lang.String r6 = "0"
            r3.mo113947d(r11, r6)
        L_0x0077:
            r10.f377323d = r3
            r10.f377320a = r5
            r10.f377321b = r2
            java.lang.Object r11 = r1.mo62825a(r10)
            if (r11 == r0) goto L_0x011f
            r1 = r3
        L_0x0084:
            com.google.android.apps.search.googleapp.customtabs.c.u r11 = (com.google.android.apps.search.googleapp.customtabs.p10151c.C133699u) r11
            if (r11 == 0) goto L_0x00a5
            int r2 = r11.f364175b
            com.google.android.apps.search.googleapp.customtabs.c.s r2 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133697s.m216929a(r2)
            if (r2 != 0) goto L_0x0092
            com.google.android.apps.search.googleapp.customtabs.c.s r2 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133697s.UNKNOWN
        L_0x0092:
            com.google.android.apps.search.googleapp.customtabs.c.s r3 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133697s.AVAILABLE
            if (r2 != r3) goto L_0x00a5
            com.google.android.apps.search.googleapp.customtabs.c.o r11 = r11.f364176c
            if (r11 != 0) goto L_0x009c
            com.google.android.apps.search.googleapp.customtabs.c.o r11 = com.google.android.apps.search.googleapp.customtabs.p10151c.C133693o.f364157f
        L_0x009c:
            int r11 = r11.f364160b
            r2 = 7
            if (r11 < r2) goto L_0x00a5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
        L_0x00a5:
            if (r5 == 0) goto L_0x00b0
            java.lang.String r11 = "ampcct"
            java.lang.String r2 = r5.toString()
            r1.mo113947d(r11, r2)
        L_0x00b0:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ag r11 = r10.f377322c     // Catch:{ Exception -> 0x00d1 }
            com.google.android.apps.search.googleapp.search.j.e r11 = r11.f377334k     // Catch:{ Exception -> 0x00d1 }
            com.google.common.util.concurrent.cx r11 = r11.mo113798a()     // Catch:{ Exception -> 0x00d1 }
            java.lang.String r2 = "optInChecker.clientOptInContext()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)     // Catch:{ Exception -> 0x00d1 }
            r10.f377323d = r1     // Catch:{ Exception -> 0x00d1 }
            r10.f377321b = r4     // Catch:{ Exception -> 0x00d1 }
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r10)     // Catch:{ Exception -> 0x00d1 }
            if (r11 == r0) goto L_0x00d0
            r0 = r1
        L_0x00c8:
            java.lang.String r1 = "optInChecker.clientOptInContext().await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)     // Catch:{ Exception -> 0x0017 }
            com.google.knowledge.b.m r11 = (com.google.knowledge.p4671b.C61820m) r11     // Catch:{ Exception -> 0x0017 }
            goto L_0x0107
        L_0x00d0:
            return r0
        L_0x00d1:
            r11 = move-exception
            r0 = r1
        L_0x00d3:
            boolean r1 = r11 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto L_0x011e
            com.google.knowledge.b.l r1 = com.google.android.apps.search.googleapp.search.p10418j.C137531e.m223407b()
            com.google.protobuf.bv r1 = r1.build()
            java.lang.String r2 = "getDefaultClientOptInContext().build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.knowledge.b.m r1 = (com.google.knowledge.p4671b.C61820m) r1
            com.google.common.f.a.d r2 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138736ag.f377324a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            com.google.common.f.aa r3 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            java.lang.Integer r4 = new java.lang.Integer
            r5 = 180707701(0xac56175, float:1.9007069E-32)
            r4.<init>(r5)
            r2.mo56378ag(r3, r4)
            com.google.common.f.x r11 = r2.mo56382g(r11)
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            java.lang.String r2 = "Fail to fetch x-client-opt-in-context"
            r11.mo56386p(r2)
            r11 = r1
        L_0x0107:
            byte[] r11 = r11.toByteArray()
            java.lang.String r1 = "clientOptInContext.toByteArray()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            java.lang.String r1 = "X-Client-Opt-In-Context"
            java.lang.String r11 = com.google.android.apps.search.googleapp.search.p10418j.C137526a.m223402a(r11)
            r0.mo113946c(r1, r11)
            com.google.protobuf.bv r11 = r0.build()
            return r11
        L_0x011e:
            throw r11
        L_0x011f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138735af.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C138735af afVar = new C138735af(this.f377322c, gVar);
        afVar.f377323d = obj;
        return afVar;
    }
}
