package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121672aa;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62942bv;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.p */
/* compiled from: PG */
public final class C33910p extends C33897c {

    /* renamed from: a */
    private static final C59071e f90462a = C59071e.m91331h();

    /* renamed from: b */
    private final C121672aa f90463b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33910p(C69585o oVar, C121672aa aaVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        this.f90463b = aaVar;
    }

    /* renamed from: c */
    private final C33908n m62560c(C33901g gVar) {
        C33907m mVar = (C33907m) C33908n.f90454c.createBuilder();
        C69664n.m101060f(mVar, "newBuilder()");
        C33913s a = C69664n.m101061g(mVar, "builder");
        C33900f fVar = (C33900f) C33902h.f90442c.createBuilder();
        C69664n.m101060f(fVar, "newBuilder()");
        C69664n.m101061g(fVar, "builder");
        C69664n.m101061g(gVar, "value");
        fVar.copyOnWrite();
        ((C33902h) fVar.instance).f90445b = gVar.getNumber();
        C62942bv build = fVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C33902h hVar = (C33902h) build;
        C69664n.m101061g(hVar, "value");
        C33907m mVar2 = a.f90464a;
        mVar2.copyOnWrite();
        C33908n nVar = (C33908n) mVar2.instance;
        hVar.getClass();
        nVar.f90457b = hVar;
        nVar.f90456a = 2;
        return a.mo39125a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39122b(com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33906l r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            java.lang.String r0 = "newBuilder()"
            boolean r1 = r11 instanceof com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33909o
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.libraries.search.assistant.invocation.j.c.o r1 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33909o) r1
            int r2 = r1.f90461d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f90461d = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.libraries.search.assistant.invocation.j.c.o r1 = new com.google.android.libraries.search.assistant.invocation.j.c.o
            r1.<init>(r9, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f90459b
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f90461d
            r4 = 1
            if (r3 == 0) goto L_0x0034
            if (r3 != r4) goto L_0x002c
            java.lang.Object r10 = r1.f90458a
            p5462h.C69714l.m101134b(r11)     // Catch:{ a -> 0x010c, a -> 0x0102 }
            goto L_0x00bc
        L_0x002c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0034:
            p5462h.C69714l.m101134b(r11)
            com.google.common.f.e r11 = f90462a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "INV.Lifecycle.Service"
            r11.mo56378ag(r3, r5)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r10.f90451a
            if (r3 != 0) goto L_0x004c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x004c:
            java.lang.String r5 = "invocationToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            com.google.frameworks.client.a.a.b r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r3)
            int r6 = r10.f90452b
            com.google.android.libraries.search.assistant.invocation.j.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b.m62546a(r6)
            if (r6 != 0) goto L_0x005f
            com.google.android.libraries.search.assistant.invocation.j.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b.UNRECOGNIZED
        L_0x005f:
            java.lang.String r6 = r6.name()
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 51302(0xc866, float:7.189E-41)
            r7.<init>(r8)
            r11.mo56379ah(r7)
            java.lang.String r7 = "Updating invocation(%s) state to %s."
            r11.mo56354G(r7, r3, r6)
            com.google.android.apps.search.assistant.platform.j.b.a.a.aa r11 = r9.f90463b     // Catch:{ a -> 0x010b, a -> 0x0101 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r10.f90451a     // Catch:{ a -> 0x010b, a -> 0x0101 }
            if (r3 != 0) goto L_0x007b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ a -> 0x010b, a -> 0x0101 }
        L_0x007b:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)     // Catch:{ a -> 0x010b, a -> 0x0101 }
            r3.getClass()     // Catch:{ a -> 0x010b, a -> 0x0101 }
            g.a.a r11 = r11.f337564a     // Catch:{ a -> 0x010b, a -> 0x0101 }
            java.lang.Object r11 = r11.mo17428b()     // Catch:{ a -> 0x010b, a -> 0x0101 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r11 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121718y) r11     // Catch:{ a -> 0x010b, a -> 0x0101 }
            r11.getClass()     // Catch:{ a -> 0x010b, a -> 0x0101 }
            int r10 = r10.f90452b     // Catch:{ a -> 0x010b, a -> 0x0101 }
            com.google.android.libraries.search.assistant.invocation.j.a.b r10 = com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b.m62546a(r10)     // Catch:{ a -> 0x010b, a -> 0x0101 }
            if (r10 != 0) goto L_0x0096
            com.google.android.libraries.search.assistant.invocation.j.a.b r10 = com.google.android.libraries.search.assistant.invocation.p2636j.p2637a.C33891b.UNRECOGNIZED     // Catch:{ a -> 0x010b, a -> 0x0101 }
        L_0x0096:
            java.lang.String r5 = "invocationState"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)     // Catch:{ a -> 0x010b, a -> 0x0101 }
            r1.f90458a = r9     // Catch:{ a -> 0x010b, a -> 0x0101 }
            r1.f90461d = r4     // Catch:{ a -> 0x010b, a -> 0x0101 }
            kotlinx.coroutines.aw r5 = r11.f337749b     // Catch:{ a -> 0x010b, a -> 0x0101 }
            h.c.o r5 = r5.mo5702lZ()     // Catch:{ a -> 0x010b, a -> 0x0101 }
            com.google.android.apps.search.assistant.platform.j.b.a.a.x r6 = new com.google.android.apps.search.assistant.platform.j.b.a.a.x     // Catch:{ a -> 0x010b, a -> 0x0101 }
            r7 = 0
            r6.<init>(r11, r3, r10, r7)     // Catch:{ a -> 0x010b, a -> 0x0101 }
            java.lang.Object r10 = kotlinx.coroutines.C71803m.m105040a(r5, r6, r1)     // Catch:{ a -> 0x010b, a -> 0x0101 }
            h.c.a.a r11 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ a -> 0x010b, a -> 0x0101 }
            if (r10 == r11) goto L_0x00b5
            h.q r10 = p5462h.C69788q.f186170a     // Catch:{ a -> 0x010b, a -> 0x0101 }
        L_0x00b5:
            if (r10 == r11) goto L_0x00b9
            h.q r10 = p5462h.C69788q.f186170a     // Catch:{ a -> 0x010b, a -> 0x0101 }
        L_0x00b9:
            if (r10 == r2) goto L_0x0100
            r10 = r9
        L_0x00bc:
            com.google.android.libraries.search.assistant.invocation.j.c.n r11 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33908n.f90454c     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.protobuf.bn r11 = r11.createBuilder()     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.m r11 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33907m) r11     // Catch:{ a -> 0x010c, a -> 0x0102 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.s r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.j r1 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33904j.f90447a     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.i r1 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33903i) r1     // Catch:{ a -> 0x010c, a -> 0x0102 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)     // Catch:{ a -> 0x010c, a -> 0x0102 }
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r0)     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.protobuf.bv r0 = r1.build()     // Catch:{ a -> 0x010c, a -> 0x0102 }
            java.lang.String r1 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.j r0 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33904j) r0     // Catch:{ a -> 0x010c, a -> 0x0102 }
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.m r1 = r11.f90464a     // Catch:{ a -> 0x010c, a -> 0x0102 }
            r1.copyOnWrite()     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.protobuf.bv r1 = r1.instance     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.n r1 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33908n) r1     // Catch:{ a -> 0x010c, a -> 0x0102 }
            r0.getClass()     // Catch:{ a -> 0x010c, a -> 0x0102 }
            r1.f90457b = r0     // Catch:{ a -> 0x010c, a -> 0x0102 }
            r1.f90456a = r4     // Catch:{ a -> 0x010c, a -> 0x0102 }
            com.google.android.libraries.search.assistant.invocation.j.c.n r10 = r11.mo39125a()     // Catch:{ a -> 0x010c, a -> 0x0102 }
            goto L_0x0114
        L_0x0100:
            return r2
        L_0x0101:
            r10 = r9
        L_0x0102:
            com.google.android.libraries.search.assistant.invocation.j.c.g r11 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33901g.INVALID_STATE_TRANSITION
            com.google.android.libraries.search.assistant.invocation.j.c.p r10 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33910p) r10
            com.google.android.libraries.search.assistant.invocation.j.c.n r10 = r10.m62560c(r11)
            goto L_0x0114
        L_0x010b:
            r10 = r9
        L_0x010c:
            com.google.android.libraries.search.assistant.invocation.j.c.g r11 = com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33901g.INVALID_INVOCATION_TOKEN
            com.google.android.libraries.search.assistant.invocation.j.c.p r10 = (com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33910p) r10
            com.google.android.libraries.search.assistant.invocation.j.c.n r10 = r10.m62560c(r11)
        L_0x0114:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2636j.p2640c.C33910p.mo39122b(com.google.android.libraries.search.assistant.invocation.j.c.l, h.c.g):java.lang.Object");
    }
}
