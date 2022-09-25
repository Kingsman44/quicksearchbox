package com.google.android.libraries.search.assistant.invocation.p2646l.p2649c;

import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9243a.p9244a.C121689ar;
import com.google.common.p4526f.C59071e;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.l.c.k */
/* compiled from: PG */
public final class C33951k extends C33945e {

    /* renamed from: a */
    private static final C59071e f90530a = C59071e.m91331h();

    /* renamed from: b */
    private final C121689ar f90531b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33951k(C69585o oVar, C121689ar arVar) {
        super(oVar);
        C69664n.m101061g(oVar, "lightweightContext");
        this.f90531b = arVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1 A[Catch:{ all -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ed A[Catch:{ all -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39149b(com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33947g r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33950j
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.libraries.search.assistant.invocation.l.c.j r0 = (com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33950j) r0
            int r1 = r0.f90529d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90529d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.l.c.j r0 = new com.google.android.libraries.search.assistant.invocation.l.c.j
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f90527b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90529d
            java.lang.String r3 = "INV.MediaCxt.Service"
            r4 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r4) goto L_0x002e
            java.lang.Object r11 = r0.f90526a
            p5462h.C69714l.m101134b(r12)     // Catch:{ all -> 0x002b }
            goto L_0x0085
        L_0x002b:
            r12 = move-exception
            goto L_0x00ff
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            p5462h.C69714l.m101134b(r12)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r12 = r11.f90520a
            if (r12 != 0) goto L_0x003f
            com.google.android.libraries.search.assistant.invocation.o.a.bp r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x003f:
            java.lang.String r2 = "request.token"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r2)
            com.google.frameworks.client.a.a.b r12 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r12)
            com.google.common.f.e r5 = f90530a     // Catch:{ all -> 0x00fb }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ all -> 0x00fb }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x00fb }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x00fb }
            r5.mo56378ag(r6, r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r6 = "Fetching mediaParams from the resource for invocation: %s."
            com.google.common.f.n r7 = new com.google.common.f.n     // Catch:{ all -> 0x00fb }
            r8 = 51309(0xc86d, float:7.1899E-41)
            r7.<init>(r8)     // Catch:{ all -> 0x00fb }
            r5.mo56379ah(r7)     // Catch:{ all -> 0x00fb }
            r5.mo56389s(r6, r12)     // Catch:{ all -> 0x00fb }
            com.google.android.apps.search.assistant.platform.j.b.a.a.ar r5 = r10.f90531b     // Catch:{ all -> 0x00fb }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r11 = r11.f90520a     // Catch:{ all -> 0x00fb }
            if (r11 != 0) goto L_0x006d
            com.google.android.libraries.search.assistant.invocation.o.a.bp r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x00fb }
        L_0x006d:
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)     // Catch:{ all -> 0x00fb }
            com.google.android.apps.search.assistant.platform.j.b.a.a.aq r11 = r5.mo105297a(r11)     // Catch:{ all -> 0x00fb }
            r0.f90526a = r12     // Catch:{ all -> 0x00fb }
            r0.f90529d = r4     // Catch:{ all -> 0x00fb }
            com.google.android.apps.search.assistant.platform.j.b.a.a.y r2 = r11.f337603b     // Catch:{ all -> 0x00fb }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r11 = r11.f337602a     // Catch:{ all -> 0x00fb }
            java.lang.Object r11 = r2.mo105323i(r11, r0)     // Catch:{ all -> 0x00fb }
            if (r11 == r1) goto L_0x00fa
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x0085:
            com.google.android.libraries.search.assistant.invocation.f.b.d.e r12 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33753e) r12     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.assistant.invocation.l.c.i r0 = com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33949i.f90522b     // Catch:{ all -> 0x002b }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.assistant.invocation.l.c.h r0 = (com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33948h) r0     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r1)     // Catch:{ all -> 0x002b }
            java.util.concurrent.atomic.AtomicReference r1 = r12.f90137a     // Catch:{ all -> 0x002b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x00ed
            com.google.android.libraries.search.assistant.invocation.f.b.d.c r1 = com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33751c.f90135a     // Catch:{ all -> 0x002b }
            r12.mo39061e(r1)     // Catch:{ all -> 0x002b }
            java.util.concurrent.atomic.AtomicReference r12 = r12.f90137a     // Catch:{ all -> 0x002b }
            java.lang.Object r12 = r12.get()     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "params.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r1)     // Catch:{ all -> 0x002b }
            com.google.assistant.e.i.a.id r12 = (com.google.assistant.p3897e.p3917i.p3918a.C51450id) r12     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r1)     // Catch:{ all -> 0x002b }
            r0.copyOnWrite()     // Catch:{ all -> 0x002b }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.assistant.invocation.l.c.i r1 = (com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33949i) r1     // Catch:{ all -> 0x002b }
            r12.getClass()     // Catch:{ all -> 0x002b }
            r1.f90524a = r12     // Catch:{ all -> 0x002b }
            com.google.common.f.e r12 = f90530a     // Catch:{ all -> 0x002b }
            com.google.common.f.x r12 = r12.mo56224b()     // Catch:{ all -> 0x002b }
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12     // Catch:{ all -> 0x002b }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x002b }
            r12.mo56378ag(r1, r3)     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "Done fetching mediaParams for: %s."
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ all -> 0x002b }
            r3 = 51310(0xc86e, float:7.19E-41)
            r2.<init>(r3)     // Catch:{ all -> 0x002b }
            r12.mo56379ah(r2)     // Catch:{ all -> 0x002b }
            r12.mo56389s(r1, r11)     // Catch:{ all -> 0x002b }
            com.google.protobuf.bv r12 = r0.build()     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r0)     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.assistant.invocation.l.c.i r12 = (com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33949i) r12     // Catch:{ all -> 0x002b }
            return r12
        L_0x00ed:
            com.google.android.libraries.search.assistant.invocation.f.b.d.b r0 = com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d.C33750b.f90134a     // Catch:{ all -> 0x002b }
            r12.mo39061e(r0)     // Catch:{ all -> 0x002b }
            com.google.android.libraries.search.assistant.invocation.b.g r12 = new com.google.android.libraries.search.assistant.invocation.b.g     // Catch:{ all -> 0x002b }
            java.lang.String r0 = "Lost access to media context resource"
            r12.<init>(r0)     // Catch:{ all -> 0x002b }
            throw r12     // Catch:{ all -> 0x002b }
        L_0x00fa:
            return r1
        L_0x00fb:
            r11 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        L_0x00ff:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Error getting MediaContext from the invocation: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = "."
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            io.grpc.fa r11 = com.google.android.libraries.search.assistant.invocation.utils.C34722f.m63458a(r12, r11)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2646l.p2649c.C33951k.mo39149b(com.google.android.libraries.search.assistant.invocation.l.c.g, h.c.g):java.lang.Object");
    }
}
