package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$1$1", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {99, 114})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.h */
/* compiled from: PG */
final class C120952h extends C69572j implements C69630p {

    /* renamed from: a */
    Object f336284a;

    /* renamed from: b */
    Object f336285b;

    /* renamed from: c */
    int f336286c;

    /* renamed from: d */
    int f336287d;

    /* renamed from: e */
    final /* synthetic */ C120917am f336288e;

    /* renamed from: f */
    private /* synthetic */ Object f336289f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120952h(C120917am amVar, C69577g gVar) {
        super(2, gVar);
        this.f336288e = amVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120952h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.assistant.f.d.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: com.google.assistant.f.d.a.c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0173  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r1.f336287d
            java.lang.String r3 = "newBuilder()"
            r4 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x003c
            if (r2 == r5) goto L_0x0025
            int r0 = r1.f336286c
            java.lang.Object r2 = r1.f336285b
            com.google.assistant.f.d.a.at r2 = (com.google.assistant.p3931f.p3940d.p3941a.C52870at) r2
            java.lang.Object r5 = r1.f336284a
            java.lang.Object r7 = r1.f336289f
            kotlinx.coroutines.aw r7 = (kotlinx.coroutines.C71422aw) r7
            p5462h.C69714l.m101134b(r21)
            r17 = r3
            r14 = r7
            r3 = r21
            goto L_0x011d
        L_0x0025:
            java.lang.Object r2 = r1.f336285b
            com.google.assistant.f.d.a.d r2 = (com.google.assistant.p3931f.p3940d.p3941a.C52897d) r2
            java.lang.Object r5 = r1.f336284a
            java.lang.Object r7 = r1.f336289f
            kotlinx.coroutines.aw r7 = (kotlinx.coroutines.C71422aw) r7
            p5462h.C69714l.m101134b(r21)     // Catch:{ fa -> 0x0039 }
            r8 = r2
            r2 = r5
            r14 = r7
            r5 = r21
            goto L_0x00d8
        L_0x0039:
            r0 = move-exception
            goto L_0x018b
        L_0x003c:
            p5462h.C69714l.m101134b(r21)
            java.lang.Object r2 = r1.f336289f
            kotlinx.coroutines.aw r2 = (kotlinx.coroutines.C71422aw) r2
            com.google.android.apps.search.assistant.platform.g.a.am r7 = r1.f336288e
            com.google.android.libraries.search.assistant.appactions.a.y r8 = r7.f336195p
            com.google.assistant.e.j.ady r7 = r7.f336182c
            java.lang.String r7 = r7.f134916c
            java.lang.String r9 = "bindArgs.appPackage"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)
            com.google.android.apps.search.assistant.platform.g.a.am r9 = r1.f336288e
            com.google.assistant.e.j.ady r9 = r9.f336182c
            java.lang.String r9 = r9.f134915b
            java.lang.String r10 = "bindArgs.targetClass"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            io.grpc.co r7 = r8.mo38085a(r7, r9)
            com.google.assistant.f.d.a.c r8 = com.google.assistant.p3931f.p3940d.p3941a.C52898e.m86749a(r7)
            com.google.assistant.f.d.a.d r7 = com.google.assistant.p3931f.p3940d.p3941a.C52898e.m86750b(r7)
            com.google.android.apps.search.assistant.platform.g.a.am r9 = r1.f336288e
            com.google.assistant.e.j.ady r9 = r9.f336182c
            com.google.protobuf.bt r10 = com.google.assistant.p3795af.p3796a.p3797a.C48775a.f126212d
            com.google.protobuf.bt r10 = com.google.protobuf.C62942bv.checkIsLite(r10)
            r9.mo58887l(r10)
            com.google.protobuf.bf r9 = r9.f169962ag
            com.google.protobuf.bs r11 = r10.f169971d
            java.lang.Object r9 = r9.mo58854l(r11)
            if (r9 != 0) goto L_0x0081
            java.lang.Object r9 = r10.f169969b
            goto L_0x0085
        L_0x0081:
            java.lang.Object r9 = r10.mo58889c(r9)
        L_0x0085:
            com.google.assistant.f.c.w r9 = (com.google.assistant.p3931f.p3939c.C52846w) r9
            com.google.protobuf.cq r9 = r9.f138655a
            r10 = 0
            java.lang.Object r9 = r9.get(r10)
            com.google.assistant.f.c.v r9 = (com.google.assistant.p3931f.p3939c.C52845v) r9
            java.lang.String r10 = "bindArgs\n              .…      .getFulfillments(0)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            com.google.android.apps.search.assistant.platform.g.a.am r10 = r1.f336288e     // Catch:{ fa -> 0x0039 }
            com.google.assistant.f.d.a.ar r11 = com.google.assistant.p3931f.p3940d.p3941a.C52868ar.f138706d     // Catch:{ fa -> 0x0039 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ fa -> 0x0039 }
            com.google.assistant.f.d.a.aq r11 = (com.google.assistant.p3931f.p3940d.p3941a.C52867aq) r11     // Catch:{ fa -> 0x0039 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r3)     // Catch:{ fa -> 0x0039 }
            com.google.assistant.f.d.a.bp r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")     // Catch:{ fa -> 0x0039 }
            com.google.assistant.f.d.a.ah r10 = r10.f336184e     // Catch:{ fa -> 0x0039 }
            r11.mo53939b(r10)     // Catch:{ fa -> 0x0039 }
            java.lang.String r10 = r9.f138650a     // Catch:{ fa -> 0x0039 }
            java.lang.String r12 = "primaryFulfillment.name"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r12)     // Catch:{ fa -> 0x0039 }
            r11.mo53941d(r10)     // Catch:{ fa -> 0x0039 }
            java.lang.String r9 = r9.f138651b     // Catch:{ fa -> 0x0039 }
            java.lang.String r10 = "primaryFulfillment.identifier"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)     // Catch:{ fa -> 0x0039 }
            r11.mo53940c(r9)     // Catch:{ fa -> 0x0039 }
            com.google.assistant.f.d.a.ar r9 = r11.mo53938a()     // Catch:{ fa -> 0x0039 }
            com.google.common.util.concurrent.cx r9 = r8.mo53945d(r9)     // Catch:{ fa -> 0x0039 }
            r1.f336289f = r2     // Catch:{ fa -> 0x0039 }
            r1.f336284a = r8     // Catch:{ fa -> 0x0039 }
            r1.f336285b = r7     // Catch:{ fa -> 0x0039 }
            r1.f336287d = r5     // Catch:{ fa -> 0x0039 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r1)     // Catch:{ fa -> 0x0039 }
            if (r5 == r0) goto L_0x018a
            r14 = r2
            r2 = r8
            r8 = r7
        L_0x00d8:
            com.google.assistant.f.d.a.at r5 = (com.google.assistant.p3931f.p3940d.p3941a.C52870at) r5     // Catch:{ fa -> 0x0039 }
            int r15 = r5.f138713a
            com.google.android.apps.search.assistant.platform.g.a.am r10 = r1.f336288e
            java.lang.String r7 = "stub"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r7)
            java.lang.String r7 = "futureStub"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)
            kotlinx.coroutines.z r13 = new kotlinx.coroutines.z
            r13.<init>()
            com.google.android.apps.search.assistant.platform.g.a.aj r12 = new com.google.android.apps.search.assistant.platform.g.a.aj
            r11 = r2
            com.google.assistant.f.d.a.c r11 = (com.google.assistant.p3931f.p3940d.p3941a.C52896c) r11
            r16 = 0
            r7 = r12
            r9 = r13
            r17 = r3
            r3 = r12
            r12 = r15
            r18 = r13
            r13 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            kotlinx.coroutines.C71803m.m105043d(r14, r6, r6, r3, r4)
            r1.f336289f = r14
            r1.f336284a = r2
            r1.f336285b = r5
            r1.f336286c = r15
            r3 = 2
            r1.f336287d = r3
            r3 = r18
            java.lang.Object r3 = r3.mo62825a(r1)
            if (r3 == r0) goto L_0x018a
            r0 = r15
            r19 = r5
            r5 = r2
            r2 = r19
        L_0x011d:
            io.grpc.i.aj r3 = (p5488io.grpc.p5533i.C70862aj) r3
            com.google.android.apps.search.assistant.platform.g.a.am r7 = r1.f336288e
            kotlinx.coroutines.b.cy r7 = r7.f336193n
            com.google.assistant.f.d.a.ap r2 = r2.f138714b
            if (r2 != 0) goto L_0x0129
            com.google.assistant.f.d.a.ap r2 = com.google.assistant.p3931f.p3940d.p3941a.C52866ap.f138704a
        L_0x0129:
            r7.mo62807f(r2)
            com.google.android.apps.search.assistant.platform.g.a.g r2 = new com.google.android.apps.search.assistant.platform.g.a.g
            com.google.android.apps.search.assistant.platform.g.a.am r8 = r1.f336288e
            r11 = r5
            com.google.assistant.f.d.a.c r11 = (com.google.assistant.p3931f.p3940d.p3941a.C52896c) r11
            r12 = 0
            r7 = r2
            r9 = r3
            r10 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            kotlinx.coroutines.C71803m.m105043d(r14, r6, r6, r2, r4)
            com.google.android.apps.search.assistant.platform.g.a.am r2 = r1.f336288e
            com.google.assistant.f.d.a.al r4 = com.google.assistant.p3931f.p3940d.p3941a.C52862al.f138692c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.f.d.a.ak r4 = (com.google.assistant.p3931f.p3940d.p3941a.C52861ak) r4
            r5 = r17
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.assistant.f.d.a.bn r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.assistant.f.d.a.ak r5 = r4.f138732a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.assistant.f.d.a.al r5 = (com.google.assistant.p3931f.p3940d.p3941a.C52862al) r5
            r5.f138694a = r0
            com.google.assistant.e.j.ady r0 = r2.f336182c
            com.google.protobuf.bt r2 = com.google.assistant.p3795af.p3796a.p3797a.C48775a.f126212d
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r0.mo58887l(r2)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r5 = r2.f169971d
            java.lang.Object r0 = r0.mo58854l(r5)
            if (r0 != 0) goto L_0x0173
            java.lang.Object r0 = r2.f169969b
            goto L_0x0177
        L_0x0173:
            java.lang.Object r0 = r2.mo58889c(r0)
        L_0x0177:
            java.lang.String r2 = "bindArgs.getExtension(\n …Request\n                )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            com.google.assistant.f.c.w r0 = (com.google.assistant.p3931f.p3939c.C52846w) r0
            r4.mo53937b(r0)
            com.google.assistant.f.d.a.al r0 = r4.mo53936a()
            r3.mo20123c(r0)
            h.q r0 = p5462h.C69788q.f186170a
        L_0x018a:
            return r0
        L_0x018b:
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120917am.f336180a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.x r0 = r2.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.android.apps.search.assistant.platform.g.a.am r2 = r1.f336288e
            com.google.assistant.e.j.ady r2 = r2.f336182c
            java.lang.String r3 = r2.f134916c
            java.lang.String r2 = r2.f134915b
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 35651(0x8b43, float:4.9958E-41)
            r4.<init>(r5)
            r0.mo56379ah(r4)
            java.lang.String r4 = "Failed to start a session with %s:%s"
            r0.mo56354G(r4, r3, r2)
            com.google.android.apps.search.assistant.platform.g.a.am r0 = r1.f336288e
            kotlinx.coroutines.z r0 = r0.f336196q
            com.google.android.apps.search.assistant.platform.g.a.an r2 = com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120918an.FAILED
            r0.mo62909P(r2)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120952h.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120952h hVar = new C120952h(this.f336288e, gVar);
        hVar.f336289f = obj;
        return hVar;
    }
}
