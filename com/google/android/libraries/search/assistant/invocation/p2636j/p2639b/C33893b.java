package com.google.android.libraries.search.assistant.invocation.p2636j.p2639b;

import com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33899e;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.b.b */
/* compiled from: PG */
public final class C33893b {

    /* renamed from: a */
    private static final C59071e f90429a = C59071e.m91331h();

    /* renamed from: b */
    private final C33899e f90430b;

    public C33893b(C33899e eVar) {
        C69664n.m101061g(eVar, "lifecycleApiServiceStub");
        this.f90430b = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39121a(com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp r9, com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b r10, p5462h.p5466c.C69577g r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.libraries.search.assistant.invocation.p2636j.p2639b.C33892a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.google.android.libraries.search.assistant.invocation.j.b.a r0 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2639b.C33892a) r0
            int r1 = r0.f90428e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90428e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.j.b.a r0 = new com.google.android.libraries.search.assistant.invocation.j.b.a
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f90426c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90428e
            java.lang.String r3 = "INV.Lifecycle.Client"
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r10 = r0.f90425b
            java.lang.Object r9 = r0.f90424a
            p5462h.C69714l.m101134b(r11)
            goto L_0x00af
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            p5462h.C69714l.m101134b(r11)
            com.google.common.f.e r11 = f90429a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r2, r3)
            com.google.frameworks.client.a.a.b r2 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)
            java.lang.String r5 = r10.name()
            com.google.common.f.n r6 = new com.google.common.f.n
            r7 = 51300(0xc864, float:7.1887E-41)
            r6.<init>(r7)
            r11.mo56379ah(r6)
            java.lang.String r6 = "#updateState(token=%s, state:%s)."
            r11.mo56354G(r6, r2, r5)
            com.google.android.libraries.search.assistant.invocation.j.c.e r11 = r8.f90430b
            com.google.android.libraries.search.assistant.invocation.j.c.l r2 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33906l.f90449c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.invocation.j.c.k r2 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33905k) r2
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r5)
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r5)
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.libraries.search.assistant.invocation.j.c.l r6 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33906l) r6
            r9.getClass()
            r6.f90451a = r9
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r5)
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.libraries.search.assistant.invocation.j.c.l r5 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33906l) r5
            int r6 = r10.getNumber()
            r5.f90452b = r6
            com.google.protobuf.bv r2 = r2.build()
            java.lang.String r5 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            com.google.android.libraries.search.assistant.invocation.j.c.l r2 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33906l) r2
            r0.f90424a = r9
            r0.f90425b = r10
            r0.f90428e = r4
            io.grpc.de r5 = new io.grpc.de
            r5.<init>()
            java.lang.Object r11 = r11.mo39123b(r2, r5, r0)
            if (r11 == r1) goto L_0x0134
        L_0x00af:
            com.google.android.libraries.search.assistant.invocation.j.c.n r11 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33908n) r11
            com.google.common.f.e r0 = f90429a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r3)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r9 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp) r9
            com.google.frameworks.client.a.a.b r9 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r9)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 51301(0xc865, float:7.1888E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Invocation(%s) state update request(%s) completed(%s)."
            r0.mo56359L(r1, r9, r10, r11)
            int r9 = r11.f90456a
            r10 = 2
            if (r9 != r10) goto L_0x0131
            java.lang.Object r9 = r11.f90457b
            com.google.android.libraries.search.assistant.invocation.j.c.h r9 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33902h) r9
            java.lang.String r11 = "response.error"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r11)
            int r11 = r9.f90445b
            com.google.android.libraries.search.assistant.invocation.j.c.g r11 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33901g.m62558a(r11)
            if (r11 != 0) goto L_0x00ec
            com.google.android.libraries.search.assistant.invocation.j.c.g r11 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33901g.UNRECOGNIZED
        L_0x00ec:
            int r11 = r11.ordinal()
            if (r11 == r4) goto L_0x0129
            if (r11 == r10) goto L_0x0121
            java.lang.Exception r10 = new java.lang.Exception
            int r11 = r9.f90445b
            com.google.android.libraries.search.assistant.invocation.j.c.g r11 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33901g.m62558a(r11)
            if (r11 != 0) goto L_0x0100
            com.google.android.libraries.search.assistant.invocation.j.c.g r11 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33901g.UNRECOGNIZED
        L_0x0100:
            java.lang.String r9 = r9.f90444a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown exception while updating invocation state - "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ": "
            r0.append(r11)
            r0.append(r9)
            java.lang.String r9 = "."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            goto L_0x0130
        L_0x0121:
            com.google.android.libraries.search.assistant.invocation.j.a.a r10 = new com.google.android.libraries.search.assistant.invocation.j.a.a
            java.lang.String r9 = r9.f90444a
            r10.<init>(r9)
            goto L_0x0130
        L_0x0129:
            com.google.android.libraries.search.assistant.invocation.b.a r10 = new com.google.android.libraries.search.assistant.invocation.b.a
            java.lang.String r9 = r9.f90444a
            r10.<init>(r9)
        L_0x0130:
            throw r10
        L_0x0131:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        L_0x0134:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2636j.p2639b.C33893b.mo39121a(com.google.android.libraries.search.assistant.invocation.o.a.bp, com.google.android.libraries.search.assistant.invocation.j.a.b, h.c.g):java.lang.Object");
    }
}
