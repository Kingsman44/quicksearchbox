package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f;

import com.google.android.libraries.search.assistant.p2697j.p2698a.C34743k;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69498ao;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.orchestrator.ConnectionInvocationsTracker$initialize$1", mo61344c = "ConnectionInvocationsTracker.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.g */
/* compiled from: PG */
final class C34322g extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C34326k f91265a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34322g(C34326k kVar, C69577g gVar) {
        super(2, gVar);
        this.f91265a = kVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.util.Iterator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.util.Iterator} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=com.google.android.libraries.search.assistant.invocation.o.f.k, code=java.lang.Object, for r9v0, types: [com.google.android.libraries.search.assistant.invocation.o.f.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00c3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m62974e(java.lang.Object r9, java.util.Set r10, java.util.Set r11, p5462h.p5466c.C69577g r12) {
        /*
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34319d
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.invocation.o.f.d r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34319d) r0
            int r1 = r0.f91261e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91261e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.f.d r0 = new com.google.android.libraries.search.assistant.invocation.o.f.d
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.f91260d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91261e
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f91259c
            java.lang.Object r10 = r0.f91258b
            java.lang.Object r11 = r0.f91257a
            p5462h.C69714l.m101134b(r12)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L_0x009d
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            p5462h.C69714l.m101134b(r12)
            java.util.Set r10 = p5462h.p5463a.C69514bd.m100889c(r10, r11)
            java.util.Iterator r10 = r10.iterator()
        L_0x0043:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00cf
            java.lang.Object r11 = r10.next()
            com.google.android.libraries.search.assistant.invocation.o.h.a.a r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a) r11
            r12 = r9
            com.google.android.libraries.search.assistant.invocation.o.f.k r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34326k) r12
            java.util.concurrent.atomic.AtomicReference r12 = r12.f91275d
            com.google.android.libraries.search.assistant.invocation.o.f.e r2 = new com.google.android.libraries.search.assistant.invocation.o.f.e
            r2.<init>(r11)
        L_0x0059:
            java.lang.Object r11 = r12.get()
            java.lang.String r4 = "get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            java.util.Set r11 = (java.util.Set) r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r11.iterator()
        L_0x006d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r5.next()
            java.lang.Object r7 = r2.mo5761a(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x006d
            r4.add(r6)
            goto L_0x006d
        L_0x0087:
            java.util.Set r4 = p5462h.p5463a.C69540x.m100846ab(r4)
            java.util.Set r5 = p5462h.p5463a.C69514bd.m100889c(r11, r4)
        L_0x008f:
            boolean r6 = r12.compareAndSet(r11, r5)
            if (r6 == 0) goto L_0x00c8
            java.util.Iterator r11 = r4.iterator()
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
        L_0x009d:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00c4
            java.lang.Object r12 = r9.next()
            h.i r12 = (p5462h.C69685i) r12
            java.lang.Object r2 = r12.f186052a
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r12 = r12.f186053b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r12 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r12
            r0.f91257a = r10
            r0.f91258b = r11
            r0.f91259c = r9
            r0.f91261e = r3
            r4 = r10
            com.google.android.libraries.search.assistant.invocation.o.f.k r4 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34326k) r4
            java.lang.Object r12 = m62975f(r4, r2, r12, r0)
            if (r12 == r1) goto L_0x00c3
            goto L_0x009d
        L_0x00c3:
            return r1
        L_0x00c4:
            r9 = r10
            r10 = r11
            goto L_0x0043
        L_0x00c8:
            java.lang.Object r6 = r12.get()
            if (r6 == r11) goto L_0x008f
            goto L_0x0059
        L_0x00cf:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34322g.m62974e(com.google.android.libraries.search.assistant.invocation.o.f.k, java.util.Set, java.util.Set, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m62975f(com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34326k r7, java.lang.String r8, com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r9, p5462h.p5466c.C69577g r10) {
        /*
            boolean r0 = r10 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34321f
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.search.assistant.invocation.o.f.f r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34321f) r0
            int r1 = r0.f91264b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f91264b = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.o.f.f r0 = new com.google.android.libraries.search.assistant.invocation.o.f.f
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.f91263a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f91264b
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r10)     // Catch:{ a -> 0x0062 }
            goto L_0x0062
        L_0x0027:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002f:
            p5462h.C69714l.m101134b(r10)
            com.google.common.f.e r10 = com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34326k.f91272a     // Catch:{ a -> 0x0062 }
            com.google.common.f.x r10 = r10.mo56224b()     // Catch:{ a -> 0x0062 }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ a -> 0x0062 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ a -> 0x0062 }
            java.lang.String r4 = "TRG.InvocationTracker"
            r10.mo56378ag(r2, r4)     // Catch:{ a -> 0x0062 }
            java.lang.String r2 = "Terminating invocation(%s => %s)."
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)     // Catch:{ a -> 0x0062 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ a -> 0x0062 }
            r6 = 51337(0xc889, float:7.1938E-41)
            r5.<init>(r6)     // Catch:{ a -> 0x0062 }
            r10.mo56379ah(r5)     // Catch:{ a -> 0x0062 }
            r10.mo56354G(r2, r8, r4)     // Catch:{ a -> 0x0062 }
            com.google.android.apps.search.assistant.platform.j.b.a.c r7 = r7.f91273b     // Catch:{ a -> 0x0062 }
            com.google.android.apps.search.assistant.platform.j.b.a.e r8 = com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.C121723e.CLIENT_DISCONNECTED     // Catch:{ a -> 0x0062 }
            r0.f91264b = r3     // Catch:{ a -> 0x0062 }
            java.lang.Object r7 = r7.mo105317b(r9, r8, r0)     // Catch:{ a -> 0x0062 }
            if (r7 != r1) goto L_0x0062
            return r1
        L_0x0062:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34322g.m62975f(com.google.android.libraries.search.assistant.invocation.o.f.k, java.lang.String, com.google.android.libraries.search.assistant.invocation.o.a.bp, h.c.g):java.lang.Object");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C34322g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return new C34317b(this.f91265a, C71594u.m104517d(C71536cm.m104384b(C34743k.m63492c(this.f91265a.f91276e.f91384e, C69498ao.f185920a), new C34318c(this.f91265a, (C69577g) null)), this.f91265a.f91274c));
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C34322g(this.f91265a, gVar);
    }
}
