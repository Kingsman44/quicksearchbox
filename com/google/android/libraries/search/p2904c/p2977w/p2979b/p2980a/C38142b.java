package com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a;

import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.routing.restricted.impl.AudioRouteDisconnectorImpl$disconnectAudioAdapterRoute$1$success$1", mo61344c = "AudioRouteDisconnectorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {134, 135})
/* renamed from: com.google.android.libraries.search.c.w.b.a.b */
/* compiled from: PG */
final class C38142b extends C69572j implements C69626l {

    /* renamed from: a */
    Object f101054a;

    /* renamed from: b */
    boolean f101055b;

    /* renamed from: c */
    int f101056c;

    /* renamed from: d */
    final /* synthetic */ C38148h f101057d;

    /* renamed from: e */
    final /* synthetic */ C37384h f101058e;

    /* renamed from: f */
    final /* synthetic */ C37500dg f101059f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38142b(C38148h hVar, C37384h hVar2, C37500dg dgVar, C69577g gVar) {
        super(1, gVar);
        this.f101057d = hVar;
        this.f101058e = hVar2;
        this.f101059f = dgVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C38142b(this.f101057d, this.f101058e, this.f101059f, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.google.android.libraries.search.c.b.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        if (r8 != r0) goto L_0x0062;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f101056c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            if (r1 == r3) goto L_0x0010
            boolean r0 = r7.f101055b
            p5462h.C69714l.m101134b(r8)
            goto L_0x007c
        L_0x0010:
            java.lang.Object r1 = r7.f101054a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0062
        L_0x0016:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.c.w.b.a.h r8 = r7.f101057d
            com.google.android.libraries.search.c.b.a.f r8 = r8.f101077b
            com.google.android.libraries.search.c.b.h r1 = r7.f101058e
            com.google.common.base.ax r8 = r8.mo40909c(r1)
            java.lang.Object r8 = r8.mo56111f()
            r1 = r8
            com.google.android.libraries.search.c.b.a r1 = (com.google.android.libraries.search.p2904c.p2908b.C37363a) r1
            if (r1 != 0) goto L_0x0052
            com.google.common.f.e r8 = com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38148h.f101076a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "ALT.RouteDisconnector"
            r8.mo56378ag(r0, r1)
            com.google.android.libraries.search.c.b.h r0 = r7.f101058e
            java.lang.String r0 = r0.name()
            com.google.common.f.n r1 = new com.google.common.f.n
            r3 = 52977(0xcef1, float:7.4237E-41)
            r1.<init>(r3)
            r8.mo56379ah(r1)
            java.lang.String r1 = "#audio# no adapter(%s) found for disconnection"
            r8.mo56389s(r1, r0)
            goto L_0x0087
        L_0x0052:
            com.google.android.libraries.search.c.w.b.a.h r8 = r7.f101057d
            com.google.android.libraries.search.c.b.h r4 = r7.f101058e
            com.google.android.libraries.search.c.dg r5 = r7.f101059f
            r7.f101054a = r1
            r7.f101056c = r3
            java.lang.Object r8 = r8.mo41285d(r1, r4, r5, r7)
            if (r8 == r0) goto L_0x008c
        L_0x0062:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.google.android.libraries.search.c.w.b.a.h r4 = r7.f101057d
            com.google.android.libraries.search.c.b.h r5 = r7.f101058e
            r6 = 0
            r7.f101054a = r6
            r7.f101055b = r8
            r6 = 2
            r7.f101056c = r6
            java.lang.Object r1 = r4.mo41284c(r1, r5, r7)
            if (r1 == r0) goto L_0x008c
            r0 = r8
            r8 = r1
        L_0x007c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r0 == 0) goto L_0x0087
            if (r8 == 0) goto L_0x0087
            r2 = 1
        L_0x0087:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        L_0x008c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.p2979b.p2980a.C38142b.mo5193b(java.lang.Object):java.lang.Object");
    }
}
