package com.google.android.libraries.assistant.p1363c.p1398g.p1405d;

import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.tts.debug.TtsDebugDataProvider$getDebugData$1", mo61344c = "TtsDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {124})
/* renamed from: com.google.android.libraries.assistant.c.g.d.b */
/* compiled from: PG */
final class C17372b extends C69572j implements C69630p {

    /* renamed from: a */
    Object f50240a;

    /* renamed from: b */
    Object f50241b;

    /* renamed from: c */
    int f50242c;

    /* renamed from: d */
    final /* synthetic */ C46677o f50243d;

    /* renamed from: e */
    final /* synthetic */ C17375e f50244e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17372b(C46677o oVar, C17375e eVar, C69577g gVar) {
        super(2, gVar);
        this.f50243d = oVar;
        this.f50244e = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17372b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.libraries.assistant.c.g.d.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.libraries.assistant.c.g.d.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.libraries.assistant.c.g.d.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f50242c
            r2 = 0
            if (r1 == 0) goto L_0x000f
            java.lang.Object r0 = r9.f50241b
            java.lang.Object r1 = r9.f50240a
            p5462h.C69714l.m101134b(r10)
            goto L_0x003a
        L_0x000f:
            p5462h.C69714l.m101134b(r10)
            com.google.apps.tiktok.d.a.o r10 = r9.f50243d
            com.google.common.b.gu r10 = r10.mo50698b()
            com.google.apps.tiktok.d.a.e r1 = com.google.apps.tiktok.p3633d.p3634a.C46667e.TEXT
            boolean r10 = r10.contains(r1)
            if (r10 != 0) goto L_0x0028
            com.google.apps.tiktok.d.a.g r10 = com.google.apps.tiktok.p3633d.p3634a.C46675m.f121943k
            java.lang.String r0 = "NO_DATA"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)
            return r10
        L_0x0028:
            com.google.android.libraries.assistant.c.g.d.e r10 = r9.f50244e
            kotlinx.coroutines.j.b r1 = r10.f50258c
            r9.f50240a = r1
            r9.f50241b = r10
            r3 = 1
            r9.f50242c = r3
            java.lang.Object r3 = r1.mo63025b(r2, r9)
            if (r3 == r0) goto L_0x0101
            r0 = r10
        L_0x003a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r10.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r3 = "Tts.API:"
            r10.append(r3)     // Catch:{ all -> 0x00fc }
            r3 = 10
            r10.append(r3)     // Catch:{ all -> 0x00fc }
            com.google.common.f.e r4 = com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17375e.f50256a     // Catch:{ all -> 0x00fc }
            r4 = r0
            com.google.android.libraries.assistant.c.g.d.e r4 = (com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17375e) r4     // Catch:{ all -> 0x00fc }
            java.util.Set r4 = r4.f50257b     // Catch:{ all -> 0x00fc }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00fc }
        L_0x0054:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00fc }
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00fc }
            com.google.android.libraries.assistant.c.g.d.h r5 = (com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17378h) r5     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = r5.mo23315a()     // Catch:{ all -> 0x00fc }
            java.util.List r5 = p5462h.p5483m.C69764m.m101203w(r5)     // Catch:{ all -> 0x00fc }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x00fc }
        L_0x006c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00fc }
            if (r6 == 0) goto L_0x0054
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00fc }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r7.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r8 = "  "
            r7.append(r8)     // Catch:{ all -> 0x00fc }
            r7.append(r6)     // Catch:{ all -> 0x00fc }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x00fc }
            r10.append(r6)     // Catch:{ all -> 0x00fc }
            r10.append(r3)     // Catch:{ all -> 0x00fc }
            goto L_0x006c
        L_0x0090:
            java.lang.String r4 = "  Recorded ttsSessions:"
            r10.append(r4)     // Catch:{ all -> 0x00fc }
            r10.append(r3)     // Catch:{ all -> 0x00fc }
            com.google.android.libraries.assistant.c.g.d.e r0 = (com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17375e) r0     // Catch:{ all -> 0x00fc }
            com.google.common.b.eo r0 = r0.f50259d     // Catch:{ all -> 0x00fc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00fc }
        L_0x00a0:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x00fc }
            if (r4 == 0) goto L_0x00d7
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x00fc }
            java.lang.String r5 = "ttsSessionDebugDataBuffer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x00fc }
            com.google.android.libraries.assistant.c.g.d.a r4 = (com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17371a) r4     // Catch:{ all -> 0x00fc }
            com.google.android.libraries.assistant.c.g.k.k r5 = r4.f50235a     // Catch:{ all -> 0x00fc }
            com.google.android.libraries.assistant.c.g.k.am r6 = r4.f50236b     // Catch:{ all -> 0x00fc }
            com.google.common.util.concurrent.cx r7 = r4.f50237c     // Catch:{ all -> 0x00fc }
            com.google.common.util.concurrent.cx r8 = r4.f50238d     // Catch:{ all -> 0x00fc }
            com.google.common.util.concurrent.cx r4 = r4.f50239e     // Catch:{ all -> 0x00fc }
            java.lang.String r4 = com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g.m34658f(r5, r6, r7, r8, r4)     // Catch:{ all -> 0x00fc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fc }
            r5.<init>()     // Catch:{ all -> 0x00fc }
            java.lang.String r6 = "    "
            r5.append(r6)     // Catch:{ all -> 0x00fc }
            r5.append(r4)     // Catch:{ all -> 0x00fc }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x00fc }
            r10.append(r4)     // Catch:{ all -> 0x00fc }
            r10.append(r3)     // Catch:{ all -> 0x00fc }
            goto L_0x00a0
        L_0x00d7:
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00fc }
            com.google.apps.tiktok.d.a.a r0 = new com.google.apps.tiktok.d.a.a     // Catch:{ all -> 0x00fc }
            r0.<init>()     // Catch:{ all -> 0x00fc }
            r3 = 0
            r0.mo50684b(r3)     // Catch:{ all -> 0x00fc }
            com.google.apps.tiktok.d.a.e r3 = com.google.apps.tiktok.p3633d.p3634a.C46667e.TEXT     // Catch:{ all -> 0x00fc }
            r0.mo50686d(r3)     // Catch:{ all -> 0x00fc }
            com.google.protobuf.z r10 = com.google.protobuf.C63088z.m96143E(r10)     // Catch:{ all -> 0x00fc }
            r0.f121916a = r10     // Catch:{ all -> 0x00fc }
            com.google.apps.tiktok.d.a.g r10 = r0.mo50683a()     // Catch:{ all -> 0x00fc }
            java.lang.String r0 = "builder()\n          .set…Data))\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)     // Catch:{ all -> 0x00fc }
            r1.mo63026c(r2)
            return r10
        L_0x00fc:
            r10 = move-exception
            r1.mo63026c(r2)
            throw r10
        L_0x0101:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17372b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C17372b(this.f50243d, this.f50244e, gVar);
    }
}
