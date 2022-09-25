package com.google.android.apps.search.assistant.surfaces.voice.p9712n;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119657g;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.voicesearch.ClientOpDispatcherFactory$startTtsOutput$1", mo61344c = "ClientOpDispatcherFactory.kt", mo61345d = "invokeSuspend", mo61346e = {91, 99, 100})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.r */
/* compiled from: PG */
final class C128448r extends C69572j implements C69630p {

    /* renamed from: a */
    Object f353281a;

    /* renamed from: b */
    int f353282b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f353283c;

    /* renamed from: d */
    final /* synthetic */ C128449s f353284d;

    /* renamed from: e */
    final /* synthetic */ C51809dy f353285e;

    /* renamed from: f */
    private /* synthetic */ Object f353286f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128448r(C60870cx cxVar, C128449s sVar, C51809dy dyVar, C69577g gVar) {
        super(2, gVar);
        this.f353283c = cxVar;
        this.f353284d = sVar;
        this.f353285e = dyVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128448r) mo5194c((C119657g) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.apps.search.assistant.platform.b.a.a.a.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.google.android.apps.search.assistant.platform.b.a.a.a.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f353282b
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r4) goto L_0x0028
            if (r1 == r3) goto L_0x0019
            java.lang.Object r0 = r7.f353286f
            java.io.Closeable r0 = (java.io.Closeable) r0
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0016 }
            goto L_0x00b0
        L_0x0016:
            r8 = move-exception
            goto L_0x00b9
        L_0x0019:
            java.lang.Object r1 = r7.f353281a
            java.lang.Object r3 = r7.f353286f
            java.io.Closeable r3 = (java.io.Closeable) r3
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0024 }
            goto L_0x00a0
        L_0x0024:
            r8 = move-exception
            r0 = r3
            goto L_0x00b9
        L_0x0028:
            java.lang.Object r1 = r7.f353286f
            com.google.android.apps.search.assistant.platform.b.a.a.a.g r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119657g) r1
            p5462h.C69714l.m101134b(r8)
            goto L_0x0044
        L_0x0030:
            p5462h.C69714l.m101134b(r8)
            java.lang.Object r8 = r7.f353286f
            r1 = r8
            com.google.android.apps.search.assistant.platform.b.a.a.a.g r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119657g) r1
            com.google.common.util.concurrent.cx r8 = r7.f353283c
            r7.f353286f = r1
            r7.f353282b = r4
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r7)
            if (r8 == r0) goto L_0x00bf
        L_0x0044:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0054
            com.google.assistant.e.j.ec r8 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c.f350821b
            java.lang.String r0 = "ignore()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            return r8
        L_0x0054:
            com.google.android.apps.search.assistant.surfaces.voice.n.s r8 = r7.f353284d
            com.google.android.apps.gsa.binaries.satin.app.anu r8 = r8.f353290d
            com.google.android.libraries.assistant.c.g.k.k r4 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17508k.f50521c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.assistant.c.g.k.i r4 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17506i) r4
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.android.libraries.assistant.c.g.k.m r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.android.libraries.assistant.c.g.k.d r6 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17501d.f50516a
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.libraries.assistant.c.g.k.c r6 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17500c) r6
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r5)
            com.google.android.libraries.assistant.c.g.k.f r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r6, "builder")
            com.google.android.libraries.assistant.c.g.k.d r5 = r5.mo23374a()
            r4.mo23376b(r5)
            com.google.android.libraries.assistant.c.g.k.k r4 = r4.mo23375a()
            com.google.android.apps.search.assistant.libraries.e.d.f r8 = r8.mo66630a(r4)
            com.google.assistant.e.j.dy r4 = r7.f353285e
            com.google.android.apps.search.assistant.platform.b.a.e r8 = r8.mo104305a(r4)
            com.google.android.apps.search.assistant.platform.b.a.a.a.f r4 = new com.google.android.apps.search.assistant.platform.b.a.a.a.f
            r4.<init>(r8)
            r7.f353286f = r4     // Catch:{ all -> 0x00b7 }
            r7.f353281a = r4     // Catch:{ all -> 0x00b7 }
            r7.f353282b = r3     // Catch:{ all -> 0x00b7 }
            java.lang.Object r8 = r1.mo104473b(r7)     // Catch:{ all -> 0x00b7 }
            if (r8 == r0) goto L_0x00b6
            r1 = r4
            r3 = r1
        L_0x00a0:
            r7.f353286f = r3     // Catch:{ all -> 0x0024 }
            r7.f353281a = r2     // Catch:{ all -> 0x0024 }
            r8 = 3
            r7.f353282b = r8     // Catch:{ all -> 0x0024 }
            com.google.android.apps.search.assistant.platform.b.a.a.a.f r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9007a.p9008a.C119656f) r1     // Catch:{ all -> 0x0024 }
            java.lang.Object r8 = r1.mo104471a(r7)     // Catch:{ all -> 0x0024 }
            if (r8 == r0) goto L_0x00b6
            r0 = r3
        L_0x00b0:
            com.google.assistant.e.j.ec r8 = (com.google.assistant.p3897e.p3921j.C52070ec) r8     // Catch:{ all -> 0x0016 }
            p5462h.p5472e.C69598b.m101013a(r0, r2)
            return r8
        L_0x00b6:
            return r0
        L_0x00b7:
            r8 = move-exception
            r0 = r4
        L_0x00b9:
            throw r8     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r8)
            throw r1
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9712n.C128448r.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128448r rVar = new C128448r(this.f353283c, this.f353284d, this.f353285e, gVar);
        rVar.f353286f = obj;
        return rVar;
    }
}
