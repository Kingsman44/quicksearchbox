package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32780ab;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32783ae;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.l */
/* compiled from: PG */
public final class C32316l implements C32314j {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f86582a = C59071e.m91331h();
    @Deprecated

    /* renamed from: b */
    private static final C32781ac f86583b;
    @Deprecated

    /* renamed from: c */
    private static final Duration f86584c = Duration.ofMillis(2000);

    /* renamed from: d */
    private final C32324t f86585d;

    static {
        C32780ab abVar = (C32780ab) C32781ac.f87950e.createBuilder();
        C69664n.m101060f(abVar, "newBuilder()");
        C32783ae a = C69664n.m101061g(abVar, "builder");
        C32796ar arVar = C32325u.f86627a;
        a.mo38293b(C32325u.f86630d);
        C32780ab abVar2 = a.f87956a;
        abVar2.copyOnWrite();
        C32781ac acVar = (C32781ac) abVar2.instance;
        acVar.f87952a |= 4;
        acVar.f87955d = false;
        f86583b = a.mo38292a();
    }

    public C32316l(C32324t tVar) {
        this.f86585d = tVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38037a(com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b r9, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq r10, java.lang.Integer r11, p5462h.p5466c.C69577g r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32315k
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.aa.c.a.k r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32315k) r0
            int r1 = r0.f86581e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f86581e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.aa.c.a.k r0 = new com.google.android.libraries.search.assistant.aa.c.a.k
            r0.<init>(r8, r12)
        L_0x0018:
            r7 = r0
            java.lang.Object r12 = r7.f86579c
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f86581e
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            java.lang.Object r11 = r7.f86578b
            java.lang.Object r10 = r7.f86577a
            p5462h.C69714l.m101134b(r12)
        L_0x002b:
            r5 = r11
            goto L_0x005b
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0035:
            p5462h.C69714l.m101134b(r12)
            com.google.android.libraries.search.assistant.aa.c.a.t r1 = r8.f86585d
            com.google.android.libraries.search.assistant.f.a.d.ac r4 = f86583b
            j$.util.Optional r5 = p3186j$.util.Optional.ofNullable(r11)
            java.lang.String r12 = "ofNullable(requestId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r12)
            j$.time.Duration r6 = f86584c
            java.lang.String r12 = "TIMEOUT_DURATION"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r12)
            r7.f86577a = r10
            r7.f86578b = r11
            r7.f86581e = r2
            r2 = r10
            r3 = r9
            java.lang.Object r12 = r1.mo38038a(r2, r3, r4, r5, r6, r7)
            if (r12 == r0) goto L_0x00e6
            goto L_0x002b
        L_0x005b:
            com.google.android.libraries.search.assistant.f.a.d.aw r12 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r12
            java.lang.String r9 = "Sbcp"
            if (r12 != 0) goto L_0x0092
            com.google.common.f.e r11 = f86582a
            com.google.common.f.x r11 = r11.mo56225c()
            r0 = r11
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r11, r9)
            com.google.android.libraries.search.assistant.f.a.d.ar r9 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32325u.f86627a
            com.google.android.libraries.search.assistant.f.a.d.ar r9 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32325u.f86630d
            java.lang.String r3 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r9)
            com.google.android.libraries.search.assistant.f.a.d.cq r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r10
            java.lang.String r4 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r10)
            com.google.common.f.n r9 = new com.google.common.f.n
            r10 = 52551(0xcd47, float:7.364E-41)
            r9.<init>(r10)
            r0.mo56379ah(r9)
            java.lang.String r1 = "Returning %s locale. No Locale returned from Context API for key: %s. SessionToken: %s; RequestId: %s"
            java.lang.String r2 = "en-US"
            r0.mo56360M(r1, r2, r3, r4, r5)
            java.lang.String r9 = "en-US"
            return r9
        L_0x0092:
            int r11 = r12.f87980a
            r0 = 3
            if (r11 != r0) goto L_0x009c
            java.lang.Object r11 = r12.f87981b
            com.google.android.libraries.search.assistant.f.a.d.bi r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi) r11
            goto L_0x009e
        L_0x009c:
            com.google.android.libraries.search.assistant.f.a.d.bi r11 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32814bi.f87999a
        L_0x009e:
            com.google.protobuf.bt r12 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a.p2531a.C32888b.f88139e
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r11.mo58887l(r12)
            com.google.protobuf.bf r11 = r11.f169962ag
            com.google.protobuf.bs r0 = r12.f169971d
            java.lang.Object r11 = r11.mo58854l(r0)
            if (r11 != 0) goto L_0x00b4
            java.lang.Object r11 = r12.f169969b
            goto L_0x00b8
        L_0x00b4:
            java.lang.Object r11 = r12.mo58889c(r11)
        L_0x00b8:
            java.lang.String r12 = "contextResult.genericCon…localeContextResponseExt)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            com.google.android.libraries.search.assistant.f.a.e.b.a.a.b r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a.p2531a.C32888b) r11
            com.google.common.f.e r12 = f86582a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r9)
            java.lang.String r9 = r11.f88142b
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 52550(0xcd46, float:7.3638E-41)
            r0.<init>(r1)
            r12.mo56379ah(r0)
            java.lang.String r0 = "%s Locale returned from Context API. SessionToken: %s; RequestId: %s"
            r12.mo56359L(r0, r9, r10, r5)
            java.lang.String r9 = r11.f88142b
            java.lang.String r10 = "localeContextResponse.primaryLocale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            return r9
        L_0x00e6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32316l.mo38037a(com.google.android.libraries.search.assistant.f.a.b, com.google.android.libraries.search.assistant.f.a.d.cq, java.lang.Integer, h.c.g):java.lang.Object");
    }
}
