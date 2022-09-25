package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.legacy.programmatic.LegacyProgrammaticInvocationSourceImpl$trigger$1", mo61344c = "LegacyProgrammaticInvocationSource.kt", mo61345d = "invokeSuspend", mo61346e = {54, 71})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.b.a.c */
/* compiled from: PG */
final class C34663c extends C69572j implements C69630p {

    /* renamed from: a */
    int f92042a;

    /* renamed from: b */
    final /* synthetic */ C34664d f92043b;

    /* renamed from: c */
    final /* synthetic */ Integer f92044c;

    /* renamed from: d */
    final /* synthetic */ String f92045d;

    /* renamed from: e */
    private /* synthetic */ Object f92046e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34663c(C34664d dVar, Integer num, String str, C69577g gVar) {
        super(2, gVar);
        this.f92043b = dVar;
        this.f92044c = num;
        this.f92045d = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34663c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0139  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f92042a
            r2 = 1
            java.lang.String r3 = "TRG.LegacyProgrammatic"
            if (r1 == 0) goto L_0x001b
            if (r1 == r2) goto L_0x0013
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x0010 }
            goto L_0x00fa
        L_0x0010:
            r11 = move-exception
            goto L_0x00fd
        L_0x0013:
            java.lang.Object r1 = r10.f92046e
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r11)
            goto L_0x0036
        L_0x001b:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f92046e
            kotlinx.coroutines.aw r11 = (kotlinx.coroutines.C71422aw) r11
            com.google.android.libraries.search.assistant.invocation.o.i.b.a.d r1 = r10.f92043b
            com.google.android.libraries.search.assistant.invocation.o.f.a.av r1 = r1.f92049c
            com.google.android.libraries.search.assistant.invocation.o.a.bf r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.ENTRYPOINT_LEGACY_PROGRAMMATIC
            kotlinx.coroutines.b.n r1 = r1.mo39282a(r4)
            r10.f92046e = r11
            r10.f92042a = r2
            java.lang.Object r11 = kotlinx.coroutines.p5574b.C71517bu.m104350a(r1, r10)
            if (r11 == r0) goto L_0x0187
        L_0x0036:
            com.google.android.libraries.search.assistant.invocation.o.f.a.aq r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34234aq) r11
            r1 = 0
            if (r11 == 0) goto L_0x0160
            java.lang.Integer r11 = r10.f92044c
            java.lang.String r4 = r10.f92045d
            com.google.android.libraries.search.assistant.invocation.o.i.d r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34684d.f92090g
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.i.c r5 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34666c) r5
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.libraries.search.assistant.invocation.o.i.k r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.android.libraries.search.assistant.invocation.o.a.bf r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf.ENTRYPOINT_LEGACY_PROGRAMMATIC
            r5.mo39467b(r7)
            com.google.android.libraries.search.assistant.invocation.o.a.ba r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba.f90707h
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.a.az r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34036az) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            com.google.android.libraries.search.assistant.invocation.o.a.bh r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.android.libraries.search.assistant.invocation.o.i.b.a.b r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34662b.f92037d
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.android.libraries.search.assistant.invocation.o.i.b.a.a r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34661a) r8
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r6)
            java.lang.String r6 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r6)
            int r11 = r11.intValue()
            r8.copyOnWrite()
            com.google.protobuf.bv r6 = r8.instance
            com.google.android.libraries.search.assistant.invocation.o.i.b.a.b r6 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34662b) r6
            int r9 = r6.f92039a
            r2 = r2 | r9
            r6.f92039a = r2
            r6.f92040b = r11
            r11 = 2
            if (r4 == 0) goto L_0x0097
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.android.libraries.search.assistant.invocation.o.i.b.a.b r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34662b) r2
            int r6 = r2.f92039a
            r6 = r6 | r11
            r2.f92039a = r6
            r2.f92041c = r4
        L_0x0097:
            com.google.protobuf.bv r2 = r8.build()
            java.lang.String r4 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            com.google.android.libraries.search.assistant.invocation.o.i.b.a.b r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34662b) r2
            java.lang.String r4 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            com.google.android.libraries.search.assistant.invocation.o.a.az r4 = r7.f90745a
            r4.copyOnWrite()
            com.google.protobuf.bv r4 = r4.instance
            com.google.android.libraries.search.assistant.invocation.o.a.ba r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34038ba) r4
            r2.getClass()
            r4.f90714f = r2
            int r2 = r4.f90709a
            r2 = r2 | 16
            r4.f90709a = r2
            com.google.android.libraries.search.assistant.invocation.o.a.ba r2 = r7.mo39195a()
            r5.mo39469d(r2)
            com.google.android.libraries.search.assistant.invocation.o.i.d r2 = r5.mo39466a()
            com.google.common.f.e r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34664d.f92047a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r3)
            java.lang.Integer r5 = r10.f92044c
            java.lang.String r6 = r10.f92045d
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 51418(0xc8da, float:7.2052E-41)
            r7.<init>(r8)
            r4.mo56379ah(r7)
            java.lang.String r7 = "On programmatic invocation(%s, %s)."
            r4.mo56354G(r7, r5, r6)
            com.google.android.libraries.search.assistant.invocation.o.i.b.a.d r4 = r10.f92043b
            com.google.android.libraries.search.assistant.invocation.o.f.a.am r4 = r4.f92048b     // Catch:{ all -> 0x0010 }
            com.google.common.util.concurrent.cx r2 = r4.mo39276a(r2)     // Catch:{ all -> 0x0010 }
            r10.f92046e = r1     // Catch:{ all -> 0x0010 }
            r10.f92042a = r11     // Catch:{ all -> 0x0010 }
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r2, r10)     // Catch:{ all -> 0x0010 }
            if (r11 != r0) goto L_0x00fa
            return r0
        L_0x00fa:
            com.google.android.libraries.search.assistant.invocation.o.a.bp r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r11     // Catch:{ all -> 0x0010 }
            goto L_0x0101
        L_0x00fd:
            java.lang.Object r11 = p5462h.C69714l.m101133a(r11)
        L_0x0101:
            java.lang.Integer r0 = r10.f92044c
            java.lang.String r1 = r10.f92045d
            boolean r2 = p5462h.C69702k.m101125b(r11)
            if (r2 == 0) goto L_0x012f
            r2 = r11
            com.google.android.libraries.search.assistant.invocation.o.a.bp r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r2
            com.google.common.f.e r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34664d.f92047a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r3)
            com.google.frameworks.client.a.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r2)
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 51420(0xc8dc, float:7.2055E-41)
            r5.<init>(r6)
            r4.mo56379ah(r5)
            java.lang.String r5 = "On programmatic invocation(%s, %s) propagation complete(%s)."
            r4.mo56359L(r5, r0, r1, r2)
        L_0x012f:
            java.lang.Integer r0 = r10.f92044c
            java.lang.String r1 = r10.f92045d
            java.lang.Throwable r2 = p5462h.C69702k.m101124a(r11)
            if (r2 == 0) goto L_0x015c
            com.google.common.f.e r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34664d.f92047a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r3)
            com.google.common.f.x r2 = r4.mo56382g(r2)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 51419(0xc8db, float:7.2053E-41)
            r3.<init>(r4)
            r2.mo56379ah(r3)
            java.lang.String r3 = "On programmatic invocation(%s, %s) propagation failed."
            r2.mo56354G(r3, r0, r1)
        L_0x015c:
            p5462h.C69714l.m101134b(r11)
            return r11
        L_0x0160:
            com.google.common.f.e r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34664d.f92047a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r0, r3)
            java.lang.Integer r0 = r10.f92044c
            java.lang.String r2 = r10.f92045d
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 51421(0xc8dd, float:7.2056E-41)
            r3.<init>(r4)
            r11.mo56379ah(r3)
            java.lang.String r3 = "No active clients for invocation(%s, %s)."
            r11.mo56354G(r3, r0, r2)
            com.google.android.libraries.search.assistant.invocation.o.c.c r11 = new com.google.android.libraries.search.assistant.invocation.o.c.c
            r11.<init>(r1)
            throw r11
        L_0x0187:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2685b.p2686a.C34663c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C34663c cVar = new C34663c(this.f92043b, this.f92044c, this.f92045d, gVar);
        cVar.f92046e = obj;
        return cVar;
    }
}
