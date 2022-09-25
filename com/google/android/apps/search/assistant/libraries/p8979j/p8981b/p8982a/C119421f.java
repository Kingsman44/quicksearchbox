package com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a;

import com.google.android.libraries.assistant.p1533o.C18496n;
import com.google.android.libraries.search.p2476a.p2483e.C32221c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.libraries.j.b.a.f */
/* compiled from: PG */
public final class C119421f implements C119424i {
    @Deprecated

    /* renamed from: a */
    private static final C59071e f332928a = C59071e.m91331h();

    /* renamed from: b */
    private final C32221c f332929b;

    /* renamed from: c */
    private final C71422aw f332930c;

    public C119421f(C32221c cVar, C71422aw awVar) {
        C69664n.m101061g(cVar, "zwiebackCookieProvider");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f332929b = cVar;
        this.f332930c = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo104340a(C18496n nVar) {
        C69664n.m101061g(nVar, "params");
        return C71663i.m104692e(this.f332930c, (C71424ay) null, new C119419d(this, nVar, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo104341b(com.google.android.libraries.assistant.p1533o.C18496n r11, p5462h.p5466c.C69577g r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119420e
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.google.android.apps.search.assistant.libraries.j.b.a.e r0 = (com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119420e) r0
            int r1 = r0.f332927f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f332927f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.libraries.j.b.a.e r0 = new com.google.android.apps.search.assistant.libraries.j.b.a.e
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f332925d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f332927f
            java.lang.String r3 = "Cookie"
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            java.lang.Object r11 = r0.f332924c
            java.lang.Object r1 = r0.f332923b
            java.lang.Object r0 = r0.f332922a
            p5462h.C69714l.m101134b(r12)
            goto L_0x00a5
        L_0x0030:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0038:
            p5462h.C69714l.m101134b(r12)
            h.f.b.ac r12 = new h.f.b.ac
            r12.<init>()
            r2 = -1
            r12.f186025a = r2
            com.google.protobuf.cq r2 = r11.f52441b
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
        L_0x004a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0086
            int r6 = r5 + 1
            java.lang.Object r7 = r2.next()
            com.google.android.libraries.assistant.o.w r7 = (com.google.android.libraries.assistant.p1533o.C18505w) r7
            java.lang.String r8 = r7.f52460a
            boolean r8 = p5462h.p5473f.p5475b.C69664n.m101066l(r8, r3)
            if (r8 == 0) goto L_0x0084
            com.google.common.f.e r2 = f332928a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            java.lang.String r6 = r7.f52461b
            com.google.common.f.n r8 = new com.google.common.f.n
            r9 = 34422(0x8676, float:4.8235E-41)
            r8.<init>(r9)
            r2.mo56379ah(r8)
            java.lang.String r8 = "zwieback: Cookie header found"
            r2.mo56389s(r8, r6)
            r12.f186025a = r5
            java.lang.String r2 = r7.f52461b
            java.lang.String r5 = "header.value"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r5)
            goto L_0x0088
        L_0x0084:
            r5 = r6
            goto L_0x004a
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            com.google.android.libraries.search.a.e.c r5 = r10.f332929b
            com.google.common.util.concurrent.cx r5 = r5.mo38001a(r2)
            java.lang.String r6 = "zwiebackCookieProvider.a…eader(currentCookieValue)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r0.f332922a = r11
            r0.f332923b = r12
            r0.f332924c = r2
            r0.f332927f = r4
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)
            if (r0 == r1) goto L_0x0166
            r1 = r12
            r12 = r0
            r0 = r11
            r11 = r2
        L_0x00a5:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L_0x014d
            boolean r2 = p5462h.p5483m.C69764m.m101229h(r12)
            if (r2 == 0) goto L_0x00b1
            goto L_0x014d
        L_0x00b1:
            boolean r11 = p5462h.p5473f.p5475b.C69664n.m101066l(r12, r11)
            if (r11 != 0) goto L_0x014d
            com.google.protobuf.bv r0 = (com.google.protobuf.C62942bv) r0
            com.google.protobuf.bn r11 = r0.toBuilder()
            java.lang.String r0 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            com.google.android.libraries.assistant.o.m r11 = (com.google.android.libraries.assistant.p1533o.C18495m) r11
            com.google.android.libraries.assistant.o.p r11 = p5462h.p5473f.p5475b.C69664n.m101061g(r11, "builder")
            h.f.b.ac r1 = (p5462h.p5473f.p5475b.C69646ac) r1
            int r2 = r1.f186025a
            if (r2 < 0) goto L_0x010f
            r11.mo24012b()
            int r2 = r1.f186025a
            com.google.protobuf.a.b r3 = r11.mo24012b()
            int r1 = r1.f186025a
            java.lang.Object r1 = r3.get(r1)
            com.google.android.libraries.assistant.o.w r1 = (com.google.android.libraries.assistant.p1533o.C18505w) r1
            com.google.protobuf.bn r1 = r1.toBuilder()
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r0)
            com.google.android.libraries.assistant.o.v r1 = (com.google.android.libraries.assistant.p1533o.C18504v) r1
            com.google.android.libraries.assistant.o.y r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.common.f.e r1 = f332928a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 34421(0x8675, float:4.8234E-41)
            r3.<init>(r4)
            r1.mo56379ah(r3)
            java.lang.String r3 = "zwieback: replacing the old cookie"
            r1.mo56386p(r3)
            r0.mo24018d(r12)
            com.google.android.libraries.assistant.o.w r12 = r0.mo24015a()
            r11.mo24014d(r2, r12)
            goto L_0x0148
        L_0x010f:
            r11.mo24012b()
            com.google.android.libraries.assistant.o.w r0 = com.google.android.libraries.assistant.p1533o.C18505w.f52458d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.o.v r0 = (com.google.android.libraries.assistant.p1533o.C18504v) r0
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            com.google.android.libraries.assistant.o.y r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            r0.mo24017c(r3)
            r0.mo24018d(r12)
            com.google.common.f.e r12 = f332928a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 34420(0x8674, float:4.8233E-41)
            r1.<init>(r2)
            r12.mo56379ah(r1)
            java.lang.String r1 = "zwieback: adding a cookie"
            r12.mo56386p(r1)
            com.google.android.libraries.assistant.o.w r12 = r0.mo24015a()
            r11.mo24013c(r12)
        L_0x0148:
            com.google.android.libraries.assistant.o.n r11 = r11.mo24011a()
            return r11
        L_0x014d:
            com.google.common.f.e r11 = f332928a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.n r12 = new com.google.common.f.n
            r1 = 34419(0x8673, float:4.8231E-41)
            r12.<init>(r1)
            r11.mo56379ah(r12)
            java.lang.String r12 = "zwieback: Cookie not updated, returning params as is"
            r11.mo56386p(r12)
            return r0
        L_0x0166:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.libraries.p8979j.p8981b.p8982a.C119421f.mo104341b(com.google.android.libraries.assistant.o.n, h.c.g):java.lang.Object");
    }
}
