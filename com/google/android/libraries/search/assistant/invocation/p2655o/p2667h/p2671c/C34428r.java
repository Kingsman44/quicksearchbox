package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.c.r */
/* compiled from: PG */
public final class C34428r {

    /* renamed from: e */
    private static final C59071e f91492e = C59071e.m91331h();

    /* renamed from: a */
    public final C34412b f91493a;

    /* renamed from: b */
    public final C34429s f91494b;

    /* renamed from: c */
    public C34423m f91495c;

    /* renamed from: d */
    public final C71587n f91496d = new C71552db(new C34425o(this, (C69577g) null));

    public C34428r(C34412b bVar, C34429s sVar) {
        C69664n.m101061g(bVar, "configuration");
        this.f91493a = bVar;
        this.f91494b = sVar;
    }

    /* renamed from: b */
    public static final Object m63122b(C34423m mVar, C69577g gVar) {
        C59052c cVar = (C59052c) f91492e.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.ManagedLifecycle");
        String c = C33914a.m62568c(mVar.f91476a);
        cVar.mo56379ah(new C59094n(51359));
        cVar.mo56389s("Shutdown triggering managed lifecycle(%s)", c);
        Object c2 = C71663i.m104690c(mVar.f91477b.mo39311a(), gVar);
        return c2 == C69554a.COROUTINE_SUSPENDED ? c2 : C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.google.android.libraries.search.assistant.invocation.o.h.c.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.google.android.libraries.search.assistant.invocation.o.h.c.k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.google.android.libraries.search.assistant.invocation.o.h.c.k} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39350a(com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34421k r7, p5462h.p5466c.C69577g r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34424n
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.invocation.o.h.c.n r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34424n) r0
            int r1 = r0.f91481d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91481d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.h.c.n r0 = new com.google.android.libraries.search.assistant.invocation.o.h.c.n
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f91479b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91481d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f91478a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0065
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = f91492e
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "TRG.ManagedLifecycle"
            r8.mo56378ag(r2, r4)
            java.lang.String r2 = com.google.android.libraries.search.assistant.invocation.p2641k.C33914a.m62568c(r7)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 51358(0xc89e, float:7.1968E-41)
            r4.<init>(r5)
            r8.mo56379ah(r4)
            java.lang.String r4 = "Initialize triggering managed lifecycle(%s)"
            r8.mo56389s(r4, r2)
            com.google.common.util.concurrent.cx r8 = r7.mo39256c()
            r0.f91478a = r7
            r0.f91481d = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 == r1) goto L_0x006d
        L_0x0065:
            com.google.android.libraries.search.assistant.invocation.o.h.c.g r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34417g) r8
            com.google.android.libraries.search.assistant.invocation.o.h.c.m r0 = new com.google.android.libraries.search.assistant.invocation.o.h.c.m
            r0.<init>(r7, r8)
            return r0
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34428r.mo39350a(com.google.android.libraries.search.assistant.invocation.o.h.c.k, h.c.g):java.lang.Object");
    }
}
