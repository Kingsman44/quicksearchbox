package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b;

import android.content.Context;
import com.google.assistant.p3897e.p3921j.C52081en;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.fluidactions.fulfillment.impl.FluidActionsFulfillmentImpl$assist$1", mo61344c = "FluidActionsFulfillmentImpl.kt", mo61345d = "invokeSuspend", mo61346e = {48})
/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.c */
/* compiled from: PG */
final class C33138c extends C69572j implements C69630p {

    /* renamed from: a */
    Object f88659a;

    /* renamed from: b */
    Object f88660b;

    /* renamed from: c */
    Object f88661c;

    /* renamed from: d */
    Object f88662d;

    /* renamed from: e */
    Object f88663e;

    /* renamed from: f */
    Object f88664f;

    /* renamed from: g */
    int f88665g;

    /* renamed from: h */
    final /* synthetic */ C33139d f88666h;

    /* renamed from: i */
    final /* synthetic */ Context f88667i;

    /* renamed from: j */
    final /* synthetic */ C52081en f88668j;

    /* renamed from: k */
    private /* synthetic */ Object f88669k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33138c(C33139d dVar, Context context, C52081en enVar, C69577g gVar) {
        super(2, gVar);
        this.f88666h = dVar;
        this.f88667i = context;
        this.f88668j = enVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33138c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: com.google.assistant.e.j.en} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.google.android.libraries.search.assistant.fluidactions.d.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0053  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f88665g
            if (r1 == 0) goto L_0x0023
            java.lang.Object r1 = r13.f88664f
            java.lang.Object r2 = r13.f88663e
            java.lang.Object r3 = r13.f88662d
            java.lang.Object r4 = r13.f88661c
            java.lang.Object r5 = r13.f88660b
            java.lang.Object r6 = r13.f88659a
            java.lang.Object r7 = r13.f88669k
            kotlinx.coroutines.aw r7 = (kotlinx.coroutines.C71422aw) r7
            p5462h.C69714l.m101134b(r14)
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r13
            goto L_0x00a9
        L_0x0023:
            p5462h.C69714l.m101134b(r14)
            java.lang.Object r14 = r13.f88669k
            kotlinx.coroutines.aw r14 = (kotlinx.coroutines.C71422aw) r14
            com.google.android.libraries.search.assistant.fluidactions.d.b.d r1 = r13.f88666h
            java.util.Map r2 = r1.f88672c
            android.content.Context r3 = r13.f88667i
            com.google.assistant.e.j.en r4 = r13.f88668j
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = r2
            com.google.common.b.pv r6 = (com.google.common.p4522b.C58729pv) r6
            int r6 = r6.f156487c
            r5.<init>(r6)
            com.google.common.b.hd r2 = (com.google.common.p4522b.C58495hd) r2
            com.google.common.b.ij r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r7 = r14
            r6 = r3
            r14 = r13
            r12 = r4
            r4 = r1
            r1 = r5
            r5 = r12
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00b8
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r3 = r3.getValue()
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.e.g r3 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33111g) r3
            r8 = r4
            com.google.android.libraries.search.assistant.fluidactions.d.b.d r8 = (com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.C33139d) r8
            com.google.android.libraries.search.assistant.fluidactions.b.d r9 = r8.f88670a
            com.google.android.libraries.search.b.b r8 = r8.f88671b
            r10 = r6
            android.content.Context r10 = (android.content.Context) r10
            r11 = r5
            com.google.assistant.e.j.en r11 = (com.google.assistant.p3897e.p3921j.C52081en) r11
            com.google.common.util.concurrent.cx r3 = r3.mo38538a(r10, r11, r9, r8)
            java.lang.String r8 = "it.value.assistAsync(con…onsConfig, appFlowLogger)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r8)
            com.google.android.libraries.search.assistant.fluidactions.d.b.a r8 = new com.google.android.libraries.search.assistant.fluidactions.d.b.a
            r9 = 0
            r8.<init>(r3, r9)
            r10 = 3
            kotlinx.coroutines.be r8 = kotlinx.coroutines.C71803m.m105042c(r7, r9, r9, r8, r10)
            com.google.android.libraries.search.assistant.fluidactions.d.b.b r9 = new com.google.android.libraries.search.assistant.fluidactions.d.b.b
            r9.<init>(r3)
            r8.mo62873s(r9)
            r14.f88669k = r7
            r14.f88659a = r6
            r14.f88660b = r5
            r14.f88661c = r4
            r14.f88662d = r1
            r14.f88663e = r2
            r14.f88664f = r1
            r3 = 1
            r14.f88665g = r3
            java.lang.Object r3 = r8.mo62825a(r14)
            if (r3 == r0) goto L_0x00b7
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            r0 = r14
            r14 = r3
            r3 = r2
        L_0x00a9:
            j$.util.Optional r14 = (p3186j$.util.Optional) r14
            r2.add(r14)
            r14 = r0
            r0 = r1
            r1 = r3
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            goto L_0x004d
        L_0x00b7:
            return r0
        L_0x00b8:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x00c1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d8
            java.lang.Object r1 = r0.next()
            r2 = r1
            j$.util.Optional r2 = (p3186j$.util.Optional) r2
            boolean r2 = r2.isPresent()
            if (r2 == 0) goto L_0x00c1
            r14.add(r1)
            goto L_0x00c1
        L_0x00d8:
            int r0 = p5462h.p5463a.C69540x.m100945c(r14)
            if (r0 < 0) goto L_0x00e4
            r0 = 0
            java.lang.Object r14 = r14.get(r0)
            goto L_0x00e8
        L_0x00e4:
            j$.util.Optional r14 = p3186j$.util.Optional.empty()
        L_0x00e8:
            java.lang.String r0 = "responseFutures.filter {…/ 0) { Optional.empty() }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.C33138c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33138c cVar = new C33138c(this.f88666h, this.f88667i, this.f88668j, gVar);
        cVar.f88669k = obj;
        return cVar;
    }
}
