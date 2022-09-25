package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.logging.FCFLogger$clearFeatureNameToFeatureStatus$1", mo61344c = "FCFLogger.kt", mo61345d = "invokeSuspend", mo61346e = {104})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.d.a */
/* compiled from: PG */
public final class C127919a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f352114a;

    /* renamed from: b */
    Object f352115b;

    /* renamed from: c */
    int f352116c;

    /* renamed from: d */
    final /* synthetic */ C127921c f352117d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127919a(C127921c cVar, C69577g gVar) {
        super(2, gVar);
        this.f352117d = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127919a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.h.d.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.h.d.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.apps.search.assistant.surfaces.voice.h.d.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r6) {
        /*
            r5 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f352116c
            r2 = 0
            if (r1 == 0) goto L_0x000f
            java.lang.Object r0 = r5.f352115b
            java.lang.Object r1 = r5.f352114a
            p5462h.C69714l.m101134b(r6)
            goto L_0x0024
        L_0x000f:
            p5462h.C69714l.m101134b(r6)
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r6 = r5.f352117d
            kotlinx.coroutines.j.b r1 = r6.f352123b
            r5.f352114a = r1
            r5.f352115b = r6
            r3 = 1
            r5.f352116c = r3
            java.lang.Object r3 = r1.mo63025b(r2, r5)
            if (r3 == r0) goto L_0x0061
            r0 = r6
        L_0x0024:
            r6 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c) r6     // Catch:{ all -> 0x005c }
            j$.util.concurrent.ConcurrentHashMap r6 = r6.f352124c     // Catch:{ all -> 0x005c }
            java.util.Enumeration r6 = r6.keys()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = "featureNameToFeatureStatus.keys()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r3)     // Catch:{ all -> 0x005c }
            java.util.Iterator r6 = p5462h.p5463a.C69540x.m100807n(r6)     // Catch:{ all -> 0x005c }
        L_0x0036:
            boolean r3 = r6.hasNext()     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r6.next()     // Catch:{ all -> 0x005c }
            j.a.c.c.a.cb r3 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71029cb) r3     // Catch:{ all -> 0x005c }
            r4 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c) r4     // Catch:{ all -> 0x005c }
            com.google.common.b.ij r4 = r4.f352125d     // Catch:{ all -> 0x005c }
            boolean r4 = r4.contains(r3)     // Catch:{ all -> 0x005c }
            if (r4 != 0) goto L_0x0036
            r4 = r0
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c) r4     // Catch:{ all -> 0x005c }
            j$.util.concurrent.ConcurrentHashMap r4 = r4.f352124c     // Catch:{ all -> 0x005c }
            r4.remove(r3)     // Catch:{ all -> 0x005c }
            goto L_0x0036
        L_0x0056:
            r1.mo63026c(r2)
            h.q r6 = p5462h.C69788q.f186170a
            return r6
        L_0x005c:
            r6 = move-exception
            r1.mo63026c(r2)
            throw r6
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127919a.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127919a(this.f352117d, gVar);
    }
}
