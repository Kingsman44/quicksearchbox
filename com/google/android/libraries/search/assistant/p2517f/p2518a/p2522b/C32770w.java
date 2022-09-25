package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$isKeySupported$$inlined$ifOpenFuture$1", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {466})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.w */
/* compiled from: PG */
public final class C32770w extends C69572j implements C69630p {

    /* renamed from: a */
    int f87933a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87934b;

    /* renamed from: c */
    final /* synthetic */ C32607ac f87935c;

    /* renamed from: d */
    final /* synthetic */ C32781ac f87936d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32770w(C32607ac acVar, C69577g gVar, C32607ac acVar2, C32781ac acVar3) {
        super(2, gVar);
        this.f87934b = acVar;
        this.f87935c = acVar2;
        this.f87936d = acVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32770w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r1.f87954c == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r4.f87936d.f87955d != false) goto L_0x005c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r4.f87933a
            r2 = 1
            if (r1 == 0) goto L_0x000b
            p5462h.C69714l.m101134b(r5)
            goto L_0x0025
        L_0x000b:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.assistant.f.a.b.ac r5 = r4.f87934b
            kotlinx.coroutines.cp r5 = r5.f87319j
            boolean r5 = r5.mo62867mj()
            if (r5 == 0) goto L_0x0062
            com.google.android.libraries.search.assistant.f.a.b.ac r5 = r4.f87935c
            kotlinx.coroutines.z r5 = r5.f87323n
            r4.f87933a = r2
            java.lang.Object r5 = r5.mo62825a(r4)
            if (r5 != r0) goto L_0x0025
            return r0
        L_0x0025:
            com.google.android.libraries.search.assistant.f.a.b.cv r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32680cv) r5
            com.google.android.libraries.search.assistant.f.a.d.ac r0 = r4.f87936d
            com.google.android.libraries.search.assistant.f.a.d.ar r0 = r0.f87953b
            if (r0 != 0) goto L_0x002f
            com.google.android.libraries.search.assistant.f.a.d.ar r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x002f:
            java.lang.String r1 = "requestedKey.contextKey"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.libraries.search.assistant.f.a.d.cu r5 = r5.mo38240a(r0)
            r0 = 0
            if (r5 == 0) goto L_0x005c
            boolean r1 = r5.f88071c
            if (r1 != 0) goto L_0x0051
            com.google.android.libraries.search.assistant.f.a.d.ac r1 = r4.f87936d
            java.lang.String r3 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            int r3 = r1.f87952a
            r3 = r3 & 2
            if (r3 == 0) goto L_0x005c
            boolean r1 = r1.f87954c
            if (r1 == 0) goto L_0x0051
            goto L_0x005c
        L_0x0051:
            boolean r5 = r5.f88072d
            if (r5 != 0) goto L_0x005d
            com.google.android.libraries.search.assistant.f.a.d.ac r5 = r4.f87936d
            boolean r5 = r5.f87955d
            if (r5 != 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x0062:
            com.google.android.libraries.search.assistant.f.a.b.ac r5 = r4.f87934b
            java.util.List r5 = r5.f87318i
            com.google.android.libraries.search.assistant.f.a.b.ce r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60549a(r5)
            com.google.android.libraries.search.assistant.n.a.a.b r5 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63595b(r5)
            com.google.android.libraries.search.assistant.n.a.e r5 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63594a(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32770w.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32770w(this.f87934b, gVar, this.f87935c, this.f87936d);
    }
}
