package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.sources.EnabledInvocationSources$valueSupplier$1", mo61344c = "EnabledInvocationSources.kt", mo61345d = "invokeSuspend", mo61346e = {25})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.e */
/* compiled from: PG */
final class C34295e extends C69572j implements C69626l {

    /* renamed from: a */
    Object f91203a;

    /* renamed from: b */
    Object f91204b;

    /* renamed from: c */
    Object f91205c;

    /* renamed from: d */
    int f91206d;

    /* renamed from: e */
    final /* synthetic */ C34296f f91207e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34295e(C34296f fVar, C69577g gVar) {
        super(1, gVar);
        this.f91207e = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34295e(this.f91207e, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f91206d
            if (r1 == 0) goto L_0x0015
            java.lang.Object r1 = r7.f91205c
            java.lang.Object r2 = r7.f91204b
            java.lang.Object r3 = r7.f91203a
            p5462h.C69714l.m101134b(r8)
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r7
            goto L_0x0058
        L_0x0015:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.invocation.o.f.a.f r8 = r7.f91207e
            com.google.android.libraries.search.assistant.invocation.o.f.a.an r8 = r8.f91208a
            java.util.Map r8 = r8.f91082a
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
            r2 = r8
            r3 = r1
            r8 = r7
        L_0x002e:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0074
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r4 = r1.getValue()
            com.google.android.libraries.search.assistant.invocation.o.i.m r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.C34703m) r4
            h.f.a.l r4 = r4.f92123d
            r8.f91203a = r3
            r8.f91204b = r2
            r8.f91205c = r1
            r5 = 1
            r8.f91206d = r5
            java.lang.Object r4 = r4.mo5761a(r8)
            if (r4 == r0) goto L_0x0073
            r6 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r6
        L_0x0058:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r5 = r4
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            r5.put(r8, r2)
        L_0x006e:
            r8 = r0
            r0 = r1
            r2 = r3
            r3 = r4
            goto L_0x002e
        L_0x0073:
            return r0
        L_0x0074:
            java.util.Set r8 = r3.keySet()
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34297g.f91212a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "TRG.SourceDefinitions"
            r0.mo56378ag(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p5462h.p5463a.C69540x.m100804k(r8, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r8.iterator()
        L_0x0096:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()
            com.google.android.libraries.search.assistant.invocation.o.a.bf r3 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf) r3
            java.lang.String r3 = r3.name()
            r1.add(r3)
            goto L_0x0096
        L_0x00aa:
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 51341(0xc88d, float:7.1944E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "Enabled invocation sources: %s."
            r0.mo56389s(r2, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a.C34295e.mo5193b(java.lang.Object):java.lang.Object");
    }
}
