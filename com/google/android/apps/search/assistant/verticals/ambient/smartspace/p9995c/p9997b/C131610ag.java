package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.TimersWholeHomeChannel$scheduleChannelClose$1", mo61344c = "TimersWholeHomeChannel.kt", mo61345d = "invokeSuspend", mo61346e = {307, 434, 311})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ag */
/* compiled from: PG */
final class C131610ag extends C69572j implements C69630p {

    /* renamed from: a */
    Object f359593a;

    /* renamed from: b */
    Object f359594b;

    /* renamed from: c */
    Object f359595c;

    /* renamed from: d */
    int f359596d;

    /* renamed from: e */
    final /* synthetic */ Duration f359597e;

    /* renamed from: f */
    final /* synthetic */ C131614ak f359598f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131610ag(Duration duration, C131614ak akVar, C69577g gVar) {
        super(2, gVar);
        this.f359597e = duration;
        this.f359598f = akVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131610ag) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f359596d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x0024
            if (r1 == r2) goto L_0x0017
            java.lang.Object r0 = r9.f359593a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0014 }
            goto L_0x0085
        L_0x0014:
            r10 = move-exception
            goto L_0x008e
        L_0x0017:
            java.lang.Object r1 = r9.f359595c
            java.lang.Object r2 = r9.f359594b
            java.lang.Object r3 = r9.f359593a
            p5462h.C69714l.m101134b(r10)
            r8 = r3
            r3 = r1
            r1 = r8
            goto L_0x004f
        L_0x0024:
            p5462h.C69714l.m101134b(r10)
            goto L_0x0039
        L_0x0028:
            p5462h.C69714l.m101134b(r10)
            j$.time.Duration r10 = r9.f359597e
            long r5 = r10.toMillis()
            r9.f359596d = r3
            java.lang.Object r10 = kotlinx.coroutines.C71608bi.m104551c(r5, r9)
            if (r10 == r0) goto L_0x0092
        L_0x0039:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r10 = r9.f359598f
            kotlinx.coroutines.j.b r1 = r10.f359614h
            j$.time.Duration r3 = r9.f359597e
            r9.f359593a = r1
            r9.f359594b = r10
            r9.f359595c = r3
            r9.f359596d = r2
            java.lang.Object r2 = r1.mo63025b(r4, r9)
            if (r2 != r0) goto L_0x004e
            return r0
        L_0x004e:
            r2 = r10
        L_0x004f:
            com.google.protos.p.b.ak r10 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak.f359606a     // Catch:{ all -> 0x008c }
            r10 = r2
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r10 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r10     // Catch:{ all -> 0x008c }
            r10.f359615i = r4     // Catch:{ all -> 0x008c }
            r10 = r2
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r10 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r10     // Catch:{ all -> 0x008c }
            com.google.common.f.e r10 = r10.f359611e     // Catch:{ all -> 0x008c }
            com.google.common.f.x r10 = r10.mo56224b()     // Catch:{ all -> 0x008c }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x008c }
            java.lang.String r5 = "Scheduled inactive channel close after %s"
            com.google.common.f.n r6 = new com.google.common.f.n     // Catch:{ all -> 0x008c }
            r7 = 39130(0x98da, float:5.4833E-41)
            r6.<init>(r7)     // Catch:{ all -> 0x008c }
            r10.mo56379ah(r6)     // Catch:{ all -> 0x008c }
            r10.mo56389s(r5, r3)     // Catch:{ all -> 0x008c }
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.b r10 = com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131620b.INACTIVE_CHANNEL     // Catch:{ all -> 0x008c }
            r9.f359593a = r1     // Catch:{ all -> 0x008c }
            r9.f359594b = r4     // Catch:{ all -> 0x008c }
            r9.f359595c = r4     // Catch:{ all -> 0x008c }
            r3 = 3
            r9.f359596d = r3     // Catch:{ all -> 0x008c }
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.ak r2 = (com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131614ak) r2     // Catch:{ all -> 0x008c }
            java.lang.Object r10 = r2.mo110209b(r10, r9)     // Catch:{ all -> 0x008c }
            if (r10 == r0) goto L_0x008b
            r0 = r1
        L_0x0085:
            r0.mo63026c(r4)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x008b:
            return r0
        L_0x008c:
            r10 = move-exception
            r0 = r1
        L_0x008e:
            r0.mo63026c(r4)
            throw r10
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b.C131610ag.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131610ag(this.f359597e, this.f359598f, gVar);
    }
}
