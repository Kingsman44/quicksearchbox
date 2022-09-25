package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121722d;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122044d;
import com.google.common.p4526f.C59071e;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.bf */
/* compiled from: PG */
public final class C121850bf extends C122044d {

    /* renamed from: a */
    private static final C59071e f338106a = C59071e.m91331h();

    /* renamed from: b */
    private final C121864p f338107b;

    /* renamed from: c */
    private final C121722d f338108c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121850bf(C121864p pVar, C121722d dVar, C69585o oVar) {
        super(oVar);
        C69664n.m101061g(pVar, "apaVisActivityStarterBackend");
        C69664n.m101061g(dVar, "tokenVerifier");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f338107b = pVar;
        this.f338108c = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v6 java.lang.Object), (r8v1 java.lang.Object) binds: [B:26:0x0085, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105398b(com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121833ap r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121847bc
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.a.bc r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121847bc) r0
            int r1 = r0.f338096e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338096e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.a.bc r0 = new com.google.android.apps.search.assistant.platform.j.b.c.a.bc
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338094c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338096e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r8)
            goto L_0x0088
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            java.lang.Object r7 = r0.f338093b
            java.lang.Object r2 = r0.f338092a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0051
        L_0x003b:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121871w.m201308a(r7)
            if (r7 == 0) goto L_0x0062
            r0.f338092a = r6
            r0.f338093b = r7
            r0.f338096e = r4
            java.lang.Object r8 = r6.mo105400d(r7, r0)
            if (r8 == r1) goto L_0x0061
            r2 = r6
        L_0x0051:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x005a
            goto L_0x0063
        L_0x005a:
            com.google.android.apps.search.assistant.platform.j.b.c.a.am r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121830am.INVALID_INVOCATION_TOKEN
            com.google.android.apps.search.assistant.platform.j.b.c.a.as r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121874z.m201311a(r7, r5)
            return r7
        L_0x0061:
            return r1
        L_0x0062:
            r2 = r6
        L_0x0063:
            com.google.frameworks.client.data.android.server.a.a.e r8 = com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a.f89619d
            java.lang.String r4 = "INTENT_KEYS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            android.os.Parcelable r8 = com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94277d(r8)
            java.lang.String r4 = "INTENT_KEYS.fromRequestHeaders()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            android.content.Intent r8 = (android.content.Intent) r8
            com.google.android.apps.search.assistant.platform.j.b.c.a.bf r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121850bf) r2
            com.google.android.apps.search.assistant.platform.j.b.c.a.p r2 = r2.f338107b
            r0.f338092a = r5
            r0.f338093b = r5
            r0.f338096e = r3
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r7
            java.lang.Object r8 = r2.mo73941a(r8, r7, r0)
            if (r8 != r1) goto L_0x0088
            return r1
        L_0x0088:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121850bf.mo105398b(com.google.android.apps.search.assistant.platform.j.b.c.a.ap, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088 A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v6 java.lang.Object), (r8v1 java.lang.Object) binds: [B:26:0x0085, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105399c(com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121838au r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121848bd
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.apps.search.assistant.platform.j.b.c.a.bd r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121848bd) r0
            int r1 = r0.f338101e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338101e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.a.bd r0 = new com.google.android.apps.search.assistant.platform.j.b.c.a.bd
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f338099c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338101e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r8)
            goto L_0x0088
        L_0x002b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0033:
            java.lang.Object r7 = r0.f338098b
            java.lang.Object r2 = r0.f338097a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0051
        L_0x003b:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121822ae.m201252a(r7)
            if (r7 == 0) goto L_0x0062
            r0.f338097a = r6
            r0.f338098b = r7
            r0.f338101e = r4
            java.lang.Object r8 = r6.mo105400d(r7, r0)
            if (r8 == r1) goto L_0x0061
            r2 = r6
        L_0x0051:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x005a
            goto L_0x0063
        L_0x005a:
            com.google.android.apps.search.assistant.platform.j.b.c.a.am r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121830am.INVALID_INVOCATION_TOKEN
            com.google.android.apps.search.assistant.platform.j.b.c.a.ax r7 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121825ah.m201255a(r7, r5)
            return r7
        L_0x0061:
            return r1
        L_0x0062:
            r2 = r6
        L_0x0063:
            com.google.frameworks.client.data.android.server.a.a.e r8 = com.google.android.libraries.search.assistant.invocation.android.parcelables.C33487a.f89619d
            java.lang.String r4 = "INTENT_KEYS"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            android.os.Parcelable r8 = com.google.frameworks.client.data.android.server.p4646a.p4647a.C61543g.m94277d(r8)
            java.lang.String r4 = "INTENT_KEYS.fromRequestHeaders()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)
            android.content.Intent r8 = (android.content.Intent) r8
            com.google.android.apps.search.assistant.platform.j.b.c.a.bf r2 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121850bf) r2
            com.google.android.apps.search.assistant.platform.j.b.c.a.p r2 = r2.f338107b
            r0.f338097a = r5
            r0.f338098b = r5
            r0.f338101e = r3
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r7
            java.lang.Object r8 = r2.mo73942b(r8, r7, r0)
            if (r8 != r1) goto L_0x0088
            return r1
        L_0x0088:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121850bf.mo105399c(com.google.android.apps.search.assistant.platform.j.b.c.a.au, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105400d(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121849be
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.apps.search.assistant.platform.j.b.c.a.be r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121849be) r0
            int r1 = r0.f338105d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f338105d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.b.c.a.be r0 = new com.google.android.apps.search.assistant.platform.j.b.c.a.be
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f338103b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f338105d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r5 = r0.f338102a
            p5462h.C69714l.m101134b(r6)
            goto L_0x005a
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r6)
            boolean r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2693a.C34708c.m63443b(r5)
            if (r6 == 0) goto L_0x003f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x003f:
            java.lang.String r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.C34705a.m63441b(r5)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x004e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x004e:
            com.google.android.apps.search.assistant.platform.j.b.a.d r6 = r4.f338108c
            r0.f338102a = r5
            r0.f338105d = r3
            java.lang.Object r6 = r6.mo105318c(r5, r0)
            if (r6 == r1) goto L_0x0092
        L_0x005a:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0067
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L_0x0067:
            com.google.common.f.e r6 = f338106a
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "INV.ActivityStarter"
            r6.mo56378ag(r0, r1)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r5
            com.google.frameworks.client.a.a.b r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r5)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36020(0x8cb4, float:5.0475E-41)
            r0.<init>(r1)
            r6.mo56379ah(r0)
            java.lang.String r0 = "verifyToken: failed for token = %s"
            r6.mo56389s(r0, r5)
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L_0x0092:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a.C121850bf.mo105400d(com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }
}
