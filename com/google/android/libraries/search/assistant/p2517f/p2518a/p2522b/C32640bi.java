package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.invocation.assistdata.p2595a.C33517a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32594a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b;
import kotlinx.coroutines.C71422aw;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bi */
/* compiled from: PG */
public final class C32640bi implements C32594a {

    /* renamed from: a */
    public final C71422aw f87485a;

    /* renamed from: b */
    private final C32603b f87486b;

    /* renamed from: c */
    private final C33517a f87487c;

    public C32640bi(C33517a aVar, C71422aw awVar, C32603b bVar) {
        this.f87487c = aVar;
        this.f87485a = awVar;
        this.f87486b = bVar;
    }

    /* JADX WARNING: type inference failed for: r7v6, types: [com.google.android.libraries.search.assistant.f.a.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38200a(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q r7, boolean r8, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32831bz r9, p5462h.p5466c.C69577g r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32638bg
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.libraries.search.assistant.f.a.b.bg r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32638bg) r0
            int r1 = r0.f87481d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87481d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.bg r0 = new com.google.android.libraries.search.assistant.f.a.b.bg
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f87479b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87481d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r7 = r0.f87478a
            p5462h.C69714l.m101134b(r10)
            goto L_0x009f
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            p5462h.C69714l.m101134b(r10)
            com.google.android.libraries.search.assistant.f.a.d.y r10 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y.f88112f
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.x r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32878x) r10
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            com.google.android.libraries.search.assistant.f.a.d.aa r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            com.google.android.libraries.search.assistant.f.a.d.be r4 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.bd r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32809bd) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)
            com.google.android.libraries.search.assistant.f.a.d.bg r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            com.google.android.libraries.search.assistant.f.a.d.ar r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.aj r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)
            com.google.android.libraries.search.assistant.f.a.d.at r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            r2.mo38301d(r9)
            com.google.android.libraries.search.assistant.f.a.d.ar r9 = r2.mo38298a()
            r4.mo38308b(r9)
            com.google.android.libraries.search.assistant.f.a.d.be r9 = r4.mo38307a()
            r10.mo38290b(r9)
            com.google.android.libraries.search.assistant.f.a.d.x r9 = r10.f87949a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.android.libraries.search.assistant.f.a.d.y r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r9
            int r2 = r9.f88114a
            r2 = r2 | 2
            r9.f88114a = r2
            r9.f88116c = r8
            com.google.android.libraries.search.assistant.f.a.d.y r8 = r10.mo38289a()
            com.google.android.libraries.search.assistant.f.a.b r9 = r6.f87486b
            com.google.common.util.concurrent.cx r7 = r9.mo38180b(r8, r7)
            java.lang.String r8 = "accessSession.fetchContext(request, strategy)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            r0.f87478a = r6
            r0.f87481d = r3
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r7, r0)
            if (r10 == r1) goto L_0x0115
            r7 = r6
        L_0x009f:
            com.google.android.libraries.search.assistant.f.a.d.aw r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r10
            java.lang.String r8 = "response"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r8)
            java.lang.String r8 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r8)
            int r8 = r10.f87980a
            r9 = 5
            r0 = 0
            if (r8 != r9) goto L_0x00b6
            java.lang.Object r8 = r10.f87981b
            com.google.android.libraries.search.assistant.f.a.d.bx r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32829bx) r8
            goto L_0x00b7
        L_0x00b6:
            r8 = r0
        L_0x00b7:
            if (r8 != 0) goto L_0x0101
            com.google.android.libraries.search.assistant.f.a.b.bi r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32640bi) r7
            com.google.android.libraries.search.assistant.f.a.b r7 = r7.f87486b
            boolean r8 = r7 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32607ac
            if (r8 == 0) goto L_0x00c4
            r0 = r7
            com.google.android.libraries.search.assistant.f.a.b.ac r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32607ac) r0
        L_0x00c4:
            if (r0 == 0) goto L_0x00c9
            java.util.List r7 = r0.f87318i
            goto L_0x00cb
        L_0x00c9:
            java.util.List r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b
        L_0x00cb:
            r1 = r7
            java.lang.String r7 = "tags"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r7)
            java.lang.String r7 = "result"
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r7)
            com.google.android.libraries.search.assistant.f.a.b.ce r7 = new com.google.android.libraries.search.assistant.f.a.b.ce
            io.grpc.Status r2 = p5488io.grpc.Status.f186915m
            java.lang.String r8 = "INTERNAL"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r8)
            com.google.protos.j.a.a.b.a.a.a.a.a.b r3 = com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5114a.p5115a.p5116a.C65570b.ERROR_BAD_INVOCATION_TOKEN
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Could not read InvocationToken from the ContextProvider response: "
            r8.<init>(r9)
            r8.append(r10)
            java.lang.String r8 = java.lang.String.valueOf(r10)
            java.lang.String r4 = r9.concat(r8)
            r5 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            com.google.android.libraries.search.assistant.n.a.a.b r7 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63595b(r7)
            com.google.android.libraries.search.assistant.n.a.e r7 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63594a(r7)
            throw r7
        L_0x0101:
            com.google.android.libraries.search.assistant.f.a.b.bi r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32640bi) r7
            com.google.android.libraries.search.assistant.invocation.assistdata.a.a r7 = r7.f87487c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = r8.f88028b
            if (r8 != 0) goto L_0x010b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x010b:
            java.lang.String r9 = "invocationData.invocationToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            com.google.android.libraries.search.assistant.invocation.assistdata.b.u r7 = r7.mo38956a(r8)
            return r7
        L_0x0115:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32640bi.mo38200a(com.google.android.libraries.search.assistant.f.a.d.q, boolean, com.google.android.libraries.search.assistant.f.a.d.bz, h.c.g):java.lang.Object");
    }
}
