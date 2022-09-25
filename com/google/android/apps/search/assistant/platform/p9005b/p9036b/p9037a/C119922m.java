package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.conversation.context.impl.ContextController$fetchInitialRequestContext$1$1", mo61344c = "ContextController.kt", mo61345d = "invokeSuspend", mo61346e = {89, 102, 113, 114})
/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.m */
/* compiled from: PG */
final class C119922m extends C69572j implements C69630p {

    /* renamed from: a */
    Object f333969a;

    /* renamed from: b */
    Object f333970b;

    /* renamed from: c */
    Object f333971c;

    /* renamed from: d */
    Object f333972d;

    /* renamed from: e */
    int f333973e;

    /* renamed from: f */
    final /* synthetic */ C119927r f333974f;

    /* renamed from: g */
    final /* synthetic */ boolean f333975g;

    /* renamed from: h */
    private /* synthetic */ Object f333976h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119922m(C119927r rVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f333974f = rVar;
        this.f333975g = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C119922m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: kotlinx.coroutines.aw} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0057, code lost:
        if (r14 != r0) goto L_0x0059;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0177 A[Catch:{ ct -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0194 A[Catch:{ ct -> 0x0201 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0243  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r14) {
        /*
            r13 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r13.f333973e
            r2 = 2
            r3 = 1
            java.lang.String r4 = "ConvEngine.Context"
            r5 = 3
            r6 = 0
            if (r1 == 0) goto L_0x0043
            if (r1 == r3) goto L_0x003b
            if (r1 == r2) goto L_0x0028
            if (r1 == r5) goto L_0x001b
            java.lang.Object r0 = r13.f333976h
            com.google.android.apps.search.assistant.platform.b.b.e r0 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119936e) r0
            p5462h.C69714l.m101134b(r14)
            goto L_0x0244
        L_0x001b:
            java.lang.Object r1 = r13.f333969a
            com.google.android.apps.search.assistant.platform.b.b.e r1 = (com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119936e) r1
            java.lang.Object r2 = r13.f333976h
            kotlinx.coroutines.be r2 = (kotlinx.coroutines.C71604be) r2
            p5462h.C69714l.m101134b(r14)
            goto L_0x022f
        L_0x0028:
            java.lang.Object r1 = r13.f333972d
            java.lang.Object r2 = r13.f333971c
            java.lang.Object r3 = r13.f333970b
            java.lang.Object r7 = r13.f333969a
            kotlinx.coroutines.be r7 = (kotlinx.coroutines.C71604be) r7
            java.lang.Object r8 = r13.f333976h
            kotlinx.coroutines.be r8 = (kotlinx.coroutines.C71604be) r8
            p5462h.C69714l.m101134b(r14)
            goto L_0x0144
        L_0x003b:
            java.lang.Object r1 = r13.f333976h
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r14)
            goto L_0x0059
        L_0x0043:
            p5462h.C69714l.m101134b(r14)
            java.lang.Object r14 = r13.f333976h
            r1 = r14
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            com.google.android.apps.search.assistant.platform.b.b.a.r r14 = r13.f333974f
            com.google.android.apps.search.assistant.platform.b.b.a.c r14 = r14.f333995e
            r13.f333976h = r1
            r13.f333973e = r3
            java.lang.Object r14 = r14.mo104561b(r13)
            if (r14 == r0) goto L_0x024e
        L_0x0059:
            com.google.common.b.gu r14 = (com.google.common.p4522b.C58485gu) r14
            boolean r3 = r13.f333975g
            if (r3 == 0) goto L_0x007e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0068:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x007d
            java.lang.Object r7 = r14.next()
            r8 = r7
            com.google.android.libraries.search.assistant.f.a.d.ac r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac) r8
            boolean r8 = r8.f87954c
            if (r8 == 0) goto L_0x0068
            r3.add(r7)
            goto L_0x0068
        L_0x007d:
            r14 = r3
        L_0x007e:
            java.util.ArrayList r3 = new java.util.ArrayList
            r7 = 10
            int r7 = p5462h.p5463a.C69540x.m100804k(r14, r7)
            r3.<init>(r7)
            java.util.Iterator r14 = r14.iterator()
        L_0x008d:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x00a3
            java.lang.Object r7 = r14.next()
            com.google.android.libraries.search.assistant.f.a.d.ac r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac) r7
            com.google.android.libraries.search.assistant.f.a.d.ar r7 = r7.f87953b
            if (r7 != 0) goto L_0x009f
            com.google.android.libraries.search.assistant.f.a.d.ar r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x009f:
            r3.add(r7)
            goto L_0x008d
        L_0x00a3:
            java.util.Iterator r14 = r3.iterator()
        L_0x00a7:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto L_0x00c6
            java.lang.Object r7 = r14.next()
            com.google.android.libraries.search.assistant.f.a.d.ar r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r7
            int r7 = r7.f87975a
            int r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32789ak.m60768a(r7)
            r8 = 8
            if (r7 == r8) goto L_0x00be
            goto L_0x00a7
        L_0x00be:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "ContextKey has no type set"
            r14.<init>(r0)
            throw r14
        L_0x00c6:
            java.util.List r14 = p5462h.p5463a.C69540x.m100827I(r3)
            int r7 = r3.size()
            int r14 = r14.size()
            if (r7 == r14) goto L_0x00f1
            com.google.common.f.e r14 = com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119927r.f333991a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14.mo56378ag(r7, r4)
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 34590(0x871e, float:4.8471E-41)
            r7.<init>(r8)
            r14.mo56379ah(r7)
            java.lang.String r7 = "Duplicate context keys"
            r14.mo56386p(r7)
        L_0x00f1:
            com.google.android.apps.search.assistant.platform.b.b.a.l r14 = new com.google.android.apps.search.assistant.platform.b.b.a.l
            com.google.android.apps.search.assistant.platform.b.b.a.r r7 = r13.f333974f
            boolean r8 = r13.f333975g
            r14.<init>(r7, r3, r8, r6)
            kotlinx.coroutines.be r8 = kotlinx.coroutines.C71803m.m105042c(r1, r6, r6, r14, r5)
            com.google.android.apps.search.assistant.platform.b.b.a.k r14 = new com.google.android.apps.search.assistant.platform.b.b.a.k
            com.google.android.apps.search.assistant.platform.b.b.a.r r7 = r13.f333974f
            boolean r9 = r13.f333975g
            r14.<init>(r7, r3, r9, r6)
            kotlinx.coroutines.be r14 = kotlinx.coroutines.C71803m.m105042c(r1, r6, r6, r14, r5)
            com.google.android.apps.search.assistant.platform.b.b.a.j r7 = new com.google.android.apps.search.assistant.platform.b.b.a.j
            com.google.android.apps.search.assistant.platform.b.b.a.r r9 = r13.f333974f
            boolean r10 = r13.f333975g
            r7.<init>(r9, r3, r10, r6)
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r1, r6, r6, r7, r5)
            com.google.assistant.e.j.ex r3 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.ew r3 = (com.google.assistant.p3897e.p3921j.C52090ew) r3
            java.lang.String r7 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            com.google.assistant.e.j.pr r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.protobuf.a.b r7 = r3.mo53848b()
            r13.f333976h = r8
            r13.f333969a = r14
            r13.f333970b = r3
            r13.f333971c = r3
            r13.f333972d = r7
            r13.f333973e = r2
            java.lang.Object r1 = r1.mo62825a(r13)
            if (r1 == r0) goto L_0x024e
            r2 = r3
            r12 = r7
            r7 = r14
            r14 = r1
            r1 = r12
        L_0x0144:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.String r9 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r9)
            java.lang.String r1 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r1)
            com.google.assistant.e.j.pr r2 = (com.google.assistant.p3897e.p3921j.C52382pr) r2
            com.google.assistant.e.j.ew r1 = r2.f137456a
            r1.mo53790c(r14)
            com.google.assistant.e.j.pr r3 = (com.google.assistant.p3897e.p3921j.C52382pr) r3
            com.google.assistant.e.j.ex r14 = r3.mo53847a()
            com.google.android.apps.search.assistant.platform.b.b.a.r r1 = r13.f333974f
            com.google.android.apps.search.assistant.platform.f.g.j r1 = r1.f333994d
            com.google.assistant.e.j.ex r2 = com.google.assistant.p3897e.p3921j.C52091ex.f136710b
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.ew r2 = (com.google.assistant.p3897e.p3921j.C52090ew) r2
            com.google.protobuf.cq r3 = r14.f136712a
            com.google.android.libraries.search.assistant.i.d r9 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89598g     // Catch:{ ct -> 0x0201 }
            j$.util.Optional r9 = r9.mo38884e(r3)     // Catch:{ ct -> 0x0201 }
            boolean r10 = r9.isPresent()     // Catch:{ ct -> 0x0201 }
            if (r10 != 0) goto L_0x0194
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9038b.C119933a.f334010a     // Catch:{ ct -> 0x0201 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ ct -> 0x0201 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ ct -> 0x0201 }
            r1.mo56378ag(r2, r4)     // Catch:{ ct -> 0x0201 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ ct -> 0x0201 }
            r2 = 34599(0x8727, float:4.8484E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ ct -> 0x0201 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ ct -> 0x0201 }
            java.lang.String r2 = "#rewriteQueryContextParams: QueryContextParams does not exist in ConversationParams."
            r1.mo56386p(r2)     // Catch:{ ct -> 0x0201 }
            goto L_0x0215
        L_0x0194:
            java.lang.Object r9 = r9.get()     // Catch:{ ct -> 0x0201 }
            com.google.assistant.e.i.a.ko r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51515ko) r9     // Catch:{ ct -> 0x0201 }
            com.google.protobuf.bn r9 = r9.toBuilder()     // Catch:{ ct -> 0x0201 }
            com.google.assistant.e.i.a.kn r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51514kn) r9     // Catch:{ ct -> 0x0201 }
            int r10 = r1.f335690j     // Catch:{ ct -> 0x0201 }
            com.google.android.apps.search.assistant.platform.b.a.d.cd r10 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.m198736a(r10)     // Catch:{ ct -> 0x0201 }
            if (r10 != 0) goto L_0x01aa
            com.google.android.apps.search.assistant.platform.b.a.d.cd r10 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.UNRECOGNIZED     // Catch:{ ct -> 0x0201 }
        L_0x01aa:
            com.google.android.apps.search.assistant.platform.b.a.d.cd r11 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.CLIENT     // Catch:{ ct -> 0x0201 }
            if (r10 == r11) goto L_0x01cb
            int r1 = r1.f335690j     // Catch:{ ct -> 0x0201 }
            com.google.android.apps.search.assistant.platform.b.a.d.cd r1 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.m198736a(r1)     // Catch:{ ct -> 0x0201 }
            if (r1 != 0) goto L_0x01b8
            com.google.android.apps.search.assistant.platform.b.a.d.cd r1 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.UNRECOGNIZED     // Catch:{ ct -> 0x0201 }
        L_0x01b8:
            com.google.android.apps.search.assistant.platform.b.a.d.cd r10 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.QUERY_FOLLOW_ON     // Catch:{ ct -> 0x0201 }
            if (r1 == r10) goto L_0x01cb
            r9.copyOnWrite()     // Catch:{ ct -> 0x0201 }
            com.google.protobuf.bv r1 = r9.instance     // Catch:{ ct -> 0x0201 }
            com.google.assistant.e.i.a.ko r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51515ko) r1     // Catch:{ ct -> 0x0201 }
            r1.f134216c = r6     // Catch:{ ct -> 0x0201 }
            int r10 = r1.f134214a     // Catch:{ ct -> 0x0201 }
            r10 = r10 & -3
            r1.f134214a = r10     // Catch:{ ct -> 0x0201 }
        L_0x01cb:
            com.google.android.libraries.search.assistant.i.d r1 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89598g     // Catch:{ ct -> 0x0201 }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ ct -> 0x0201 }
            com.google.assistant.e.i.a.ko r9 = (com.google.assistant.p3897e.p3917i.p3918a.C51515ko) r9     // Catch:{ ct -> 0x0201 }
            com.google.assistant.e.j.kc r1 = r1.mo38881b(r9)     // Catch:{ ct -> 0x0201 }
            r2.mo53792e(r1)     // Catch:{ ct -> 0x0201 }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ ct -> 0x0201 }
        L_0x01de:
            boolean r3 = r1.hasNext()     // Catch:{ ct -> 0x0201 }
            if (r3 == 0) goto L_0x01fa
            java.lang.Object r3 = r1.next()     // Catch:{ ct -> 0x0201 }
            com.google.assistant.e.j.kc r3 = (com.google.assistant.p3897e.p3921j.C52232kc) r3     // Catch:{ ct -> 0x0201 }
            java.lang.String r9 = r3.f137065b     // Catch:{ ct -> 0x0201 }
            com.google.android.libraries.search.assistant.i.d r10 = com.google.android.libraries.search.assistant.p2585i.p2586a.C33477a.f89598g     // Catch:{ ct -> 0x0201 }
            java.lang.String r10 = r10.f89601a     // Catch:{ ct -> 0x0201 }
            boolean r9 = r9.equals(r10)     // Catch:{ ct -> 0x0201 }
            if (r9 != 0) goto L_0x01de
            r2.mo53792e(r3)     // Catch:{ ct -> 0x0201 }
            goto L_0x01de
        L_0x01fa:
            com.google.protobuf.bv r14 = r2.build()
            com.google.assistant.e.j.ex r14 = (com.google.assistant.p3897e.p3921j.C52091ex) r14
            goto L_0x0215
        L_0x0201:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9038b.C119933a.f334010a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "#rewriteQueryContextParams: could not parse entry for QueryContextParam!"
            r4 = 34598(0x8726, float:4.8482E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x0215:
            com.google.android.apps.search.assistant.platform.b.b.e r1 = com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119937f.m198845d()
            r1.mo104558c(r14)
            r13.f333976h = r7
            r13.f333969a = r1
            r13.f333970b = r6
            r13.f333971c = r6
            r13.f333972d = r6
            r13.f333973e = r5
            java.lang.Object r14 = r8.mo62825a(r13)
            if (r14 == r0) goto L_0x024e
            r2 = r7
        L_0x022f:
            j$.util.Optional r14 = p3186j$.util.Optional.ofNullable(r14)
            r1.mo104559d(r14)
            r13.f333976h = r1
            r13.f333969a = r6
            r14 = 4
            r13.f333973e = r14
            java.lang.Object r14 = r2.mo62825a(r13)
            if (r14 == r0) goto L_0x024e
            r0 = r1
        L_0x0244:
            com.google.common.b.hd r14 = (com.google.common.p4522b.C58495hd) r14
            r0.mo104557b(r14)
            com.google.android.apps.search.assistant.platform.b.b.f r14 = r0.mo104556a()
            return r14
        L_0x024e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a.C119922m.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C119922m mVar = new C119922m(this.f333974f, this.f333975g, gVar);
        mVar.f333976h = obj;
        return mVar;
    }
}
