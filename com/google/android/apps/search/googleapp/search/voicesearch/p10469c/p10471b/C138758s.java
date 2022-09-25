package com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b;

import com.google.android.apps.search.googleapp.search.srp.p10435e.C137777ba;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.b.s */
/* compiled from: PG */
public final class C138758s {

    /* renamed from: a */
    public static final C59071e f377414a = C59071e.m91331h();

    /* renamed from: b */
    public final C69585o f377415b;

    /* renamed from: c */
    public final C71422aw f377416c;

    /* renamed from: d */
    private final boolean f377417d;

    /* renamed from: e */
    private final C138736ag f377418e;

    /* renamed from: f */
    private final C137777ba f377419f;

    /* renamed from: g */
    private final C21370a f377420g;

    public C138758s(boolean z, C69585o oVar, C71422aw awVar, C138736ag agVar, C137777ba baVar, C21370a aVar) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(aVar, "clock");
        this.f377417d = z;
        this.f377415b = oVar;
        this.f377416c = awVar;
        this.f377418e = agVar;
        this.f377419f = baVar;
        this.f377420g = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo114514a(com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d r9, p5462h.p5466c.C69577g r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138757r
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.r r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138757r) r0
            int r1 = r0.f377413e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f377413e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.r r0 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.r
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f377411c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f377413e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            java.lang.Object r9 = r0.f377410b
            java.lang.Object r0 = r0.f377409a
            p5462h.C69714l.m101134b(r10)
            goto L_0x007b
        L_0x002c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0034:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ag r10 = r8.f377418e
            int r2 = r9.f374088b
            int r2 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r2)
            if (r2 != 0) goto L_0x0043
        L_0x0041:
            r2 = 0
            goto L_0x0048
        L_0x0043:
            r5 = 11
            if (r2 != r5) goto L_0x0041
            r2 = 1
        L_0x0048:
            r0.f377409a = r8
            r0.f377410b = r9
            r0.f377413e = r4
            java.util.concurrent.atomic.AtomicReference r5 = r10.mo114506c(r2)
            java.lang.Object r6 = r5.get()
            com.google.android.apps.search.googleapp.search.srp.e.as r7 = com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as.f374783c
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r7)
            if (r6 == 0) goto L_0x0063
            java.lang.Object r10 = r10.mo114504a(r2, r0)
            goto L_0x0078
        L_0x0063:
            kotlinx.coroutines.aw r0 = r10.f377325b
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.ab r6 = new com.google.android.apps.search.googleapp.search.voicesearch.c.b.ab
            r7 = 0
            r6.<init>(r10, r2, r7)
            r10 = 3
            kotlinx.coroutines.C71803m.m105043d(r0, r7, r7, r6, r10)
            java.lang.Object r10 = r5.get()
            java.lang.String r0 = "requestDataReference.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
        L_0x0078:
            if (r10 == r1) goto L_0x00ed
            r0 = r8
        L_0x007b:
            com.google.android.apps.search.googleapp.search.srp.e.as r10 = (com.google.android.apps.search.googleapp.search.srp.p10435e.C137768as) r10
            com.google.android.apps.search.googleapp.search.voicesearch.c.b.s r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138758s) r0
            com.google.android.apps.search.googleapp.search.srp.e.ba r1 = r0.f377419f
            com.google.protobuf.dn r2 = r10.f374786b
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.lang.String r5 = "requestData.paramsMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.apps.search.googleapp.search.k.a.d r9 = (com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137542d) r9
            android.net.Uri r1 = r1.mo113952c(r9, r2)
            com.google.protobuf.dn r10 = r10.f374785a
            java.util.Map r10 = java.util.Collections.unmodifiableMap(r10)
            java.lang.String r2 = "requestData.headersMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            java.util.Map r10 = p5462h.p5463a.C69505av.m100876r(r10)
            com.google.android.apps.search.googleapp.search.e.g r2 = r9.f374092f
            if (r2 != 0) goto L_0x00a7
            com.google.android.apps.search.googleapp.search.e.g r2 = com.google.android.apps.search.googleapp.search.p10409e.C137418g.f373767r
        L_0x00a7:
            java.lang.String r2 = r2.f373783o
            java.lang.String r5 = "currentSearchQuery.queryOptions.requestId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.lang.String r5 = "X-Speech-Requestid"
            r10.put(r5, r2)
            boolean r2 = r0.f377417d
            if (r2 == 0) goto L_0x00c6
            com.google.android.libraries.f.a r0 = r0.f377420g
            long r5 = r0.mo26872d()
            java.lang.String r0 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "X-Device-Elapsed-Time"
            r10.put(r2, r0)
        L_0x00c6:
            java.lang.String r0 = r1.toString()
            com.google.android.libraries.web.base.f r0 = com.google.android.libraries.web.base.C43257h.m76306m(r0)
            com.google.common.b.gz r1 = r0.f113051b
            r1.mo55433l(r10)
            int r9 = r9.f374088b
            int r9 = com.google.android.apps.search.googleapp.search.p10420k.p10421a.C137540b.m223424a(r9)
            if (r9 != 0) goto L_0x00dc
            goto L_0x00e0
        L_0x00dc:
            r10 = 6
            if (r9 != r10) goto L_0x00e0
            r3 = 1
        L_0x00e0:
            r0.mo46347h(r3)
            com.google.android.libraries.web.base.h r9 = r0.mo46365k()
            java.lang.String r10 = "loadUrlParamsBuilder\n   …ger.RETRY)\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            return r9
        L_0x00ed:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.p10471b.C138758s.mo114514a(com.google.android.apps.search.googleapp.search.k.a.d, h.c.g):java.lang.Object");
    }
}
