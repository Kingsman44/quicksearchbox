package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.assistant.p3897e.p3921j.C52081en;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.impl.ExecutionController$execute$1", mo61344c = "ExecutionController.kt", mo61345d = "invokeSuspend", mo61346e = {38, 40, 43})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.a */
/* compiled from: PG */
final class C120712a extends C69572j implements C69630p {

    /* renamed from: a */
    int f335727a;

    /* renamed from: b */
    final /* synthetic */ C52081en f335728b;

    /* renamed from: c */
    final /* synthetic */ C120715d f335729c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120712a(C52081en enVar, C120715d dVar, C69577g gVar) {
        super(2, gVar);
        this.f335728b = enVar;
        this.f335729c = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120712a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r8 != r0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        if (r8 != r0) goto L_0x004a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f335727a
            java.lang.String r2 = "fulfillmentResult"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r4) goto L_0x0016
            if (r1 == r3) goto L_0x0012
            p5462h.C69714l.m101134b(r8)
            goto L_0x0078
        L_0x0012:
            p5462h.C69714l.m101134b(r8)
            goto L_0x005d
        L_0x0016:
            p5462h.C69714l.m101134b(r8)
            goto L_0x004a
        L_0x001a:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120715d.f335738a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.assistant.e.j.en r1 = r7.f335728b
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 35576(0x8af8, float:4.9853E-41)
            r5.<init>(r6)
            r8.mo56379ah(r5)
            java.lang.String r5 = "Execution delta: %s"
            r8.mo56389s(r5, r1)
            com.google.assistant.e.j.en r8 = r7.f335728b
            com.google.android.apps.search.assistant.platform.f.f.a r1 = new com.google.android.apps.search.assistant.platform.f.f.a
            r1.<init>(r8)
            com.google.android.apps.search.assistant.platform.f.j.a.d r8 = r7.f335729c
            com.google.android.apps.search.assistant.platform.f.k.b.b r5 = r8.f335741d
            r7.f335727a = r4
            java.lang.Object r8 = r8.mo104905a(r1, r5, r7)
            if (r8 == r0) goto L_0x0084
        L_0x004a:
            com.google.android.apps.search.assistant.platform.f.f.c r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c) r8
            com.google.android.apps.search.assistant.platform.f.j.a.d r1 = r7.f335729c
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.android.apps.search.assistant.platform.f.j.a.d r4 = r7.f335729c
            com.google.android.apps.search.assistant.platform.f.c.b.b r4 = r4.f335742e
            r7.f335727a = r3
            java.lang.Object r8 = r1.mo104906b(r8, r4, r7)
            if (r8 == r0) goto L_0x0084
        L_0x005d:
            com.google.android.apps.search.assistant.platform.f.f.c r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c) r8
            com.google.android.apps.search.assistant.platform.f.j.a.d r1 = r7.f335729c
            com.google.android.apps.search.assistant.platform.f.e.b.l r1 = r1.f335739b
            com.google.android.apps.search.assistant.platform.f.e.b.k r1 = r1.mo104837a(r8)
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r2)
            com.google.common.util.concurrent.cx r8 = r1.mo104821a(r8)
            r1 = 3
            r7.f335727a = r1
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r7)
            if (r8 != r0) goto L_0x0078
            return r0
        L_0x0078:
            com.google.android.apps.search.assistant.platform.f.e.a.b r8 = (com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9095a.C120541b) r8
            com.google.common.b.gu r8 = r8.mo104817c()
            java.lang.String r0 = "executionResult.getInteractions()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            return r8
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a.C120712a.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120712a(this.f335728b, this.f335729c, gVar);
    }
}
