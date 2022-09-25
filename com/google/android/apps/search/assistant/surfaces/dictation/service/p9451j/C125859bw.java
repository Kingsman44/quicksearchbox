package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119271ag;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126348y;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.invocation.StartDictationHandler$startDictation$1", mo61344c = "StartDictationHandler.kt", mo61345d = "invokeSuspend", mo61346e = {57})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.bw */
/* compiled from: PG */
final class C125859bw extends C69572j implements C69630p {

    /* renamed from: a */
    long f346876a;

    /* renamed from: b */
    int f346877b;

    /* renamed from: c */
    final /* synthetic */ C119271ag f346878c;

    /* renamed from: d */
    final /* synthetic */ C125860bx f346879d;

    /* renamed from: e */
    final /* synthetic */ C126348y f346880e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125859bw(C119271ag agVar, C125860bx bxVar, C126348y yVar, C69577g gVar) {
        super(2, gVar);
        this.f346878c = agVar;
        this.f346879d = bxVar;
        this.f346880e = yVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125859bw) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0 A[Catch:{ Exception -> 0x0010 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r15) {
        /*
            r14 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r14.f346877b
            java.lang.String r2 = "request.args"
            r3 = 1
            if (r1 == 0) goto L_0x0013
            long r0 = r14.f346876a
            p5462h.C69714l.m101134b(r15)     // Catch:{ Exception -> 0x0010 }
            goto L_0x0095
        L_0x0010:
            r15 = move-exception
            goto L_0x00cc
        L_0x0013:
            p5462h.C69714l.m101134b(r15)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bx r15 = r14.f346879d
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.ac r15 = r15.f346882b
            java.util.concurrent.atomic.AtomicLong r15 = r15.f345802a
            long r12 = r15.getAndIncrement()
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bx r15 = r14.f346879d     // Catch:{ Exception -> 0x00ca }
            com.google.android.apps.search.assistant.libraries.dictation.b.ag r1 = r14.f346878c     // Catch:{ Exception -> 0x00ca }
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.c r4 = r15.f346883c     // Catch:{ Exception -> 0x00ca }
            int r5 = r1.f332616b     // Catch:{ Exception -> 0x00ca }
            com.google.android.apps.search.assistant.libraries.dictation.b.s r5 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.m197993a(r5)     // Catch:{ Exception -> 0x00ca }
            if (r5 != 0) goto L_0x0030
            com.google.android.apps.search.assistant.libraries.dictation.b.s r5 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.UNRECOGNIZED     // Catch:{ Exception -> 0x00ca }
        L_0x0030:
            r7 = r5
            com.google.protos.f.b.b.a.n r5 = r1.f332615a     // Catch:{ Exception -> 0x00ca }
            if (r5 != 0) goto L_0x0037
            com.google.protos.f.b.b.a.n r5 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n     // Catch:{ Exception -> 0x00ca }
        L_0x0037:
            int r5 = r5.f175469a     // Catch:{ Exception -> 0x00ca }
            com.google.protos.f.b.b.a.i r5 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i.m96446a(r5)     // Catch:{ Exception -> 0x00ca }
            if (r5 != 0) goto L_0x0041
            com.google.protos.f.b.b.a.i r5 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i.UNRECOGNIZED     // Catch:{ Exception -> 0x00ca }
        L_0x0041:
            r9 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.by r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125861by.f346890a     // Catch:{ Exception -> 0x00ca }
            com.google.protos.f.b.b.a.n r6 = r1.f332615a     // Catch:{ Exception -> 0x00ca }
            if (r6 != 0) goto L_0x004a
            com.google.protos.f.b.b.a.n r6 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n     // Catch:{ Exception -> 0x00ca }
        L_0x004a:
            int r6 = r6.f175473e     // Catch:{ Exception -> 0x00ca }
            com.google.protos.f.b.b.a.f r6 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64727f.m96444a(r6)     // Catch:{ Exception -> 0x00ca }
            if (r6 != 0) goto L_0x0054
            com.google.protos.f.b.b.a.f r6 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64727f.UNRECOGNIZED     // Catch:{ Exception -> 0x00ca }
        L_0x0054:
            com.google.android.apps.search.assistant.libraries.dictation.b.u r10 = r5.apply(r6)     // Catch:{ Exception -> 0x00ca }
            com.google.protos.f.b.b.a.n r5 = r1.f332615a     // Catch:{ Exception -> 0x00ca }
            if (r5 != 0) goto L_0x005e
            com.google.protos.f.b.b.a.n r5 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n     // Catch:{ Exception -> 0x00ca }
        L_0x005e:
            java.lang.String r5 = r5.f175470b     // Catch:{ Exception -> 0x00ca }
            java.lang.String r6 = "request.args.prefixText"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ Exception -> 0x00ca }
            int r5 = r5.length()     // Catch:{ Exception -> 0x00ca }
            if (r5 <= 0) goto L_0x006d
            r11 = 1
            goto L_0x006f
        L_0x006d:
            r5 = 0
            r11 = 0
        L_0x006f:
            r8 = 0
            r5 = r12
            r4.mo107425x(r5, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ca }
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.a r15 = r15.f346884d     // Catch:{ Exception -> 0x00ca }
            com.google.protos.f.b.b.a.n r1 = r1.f332615a     // Catch:{ Exception -> 0x00ca }
            if (r1 != 0) goto L_0x007c
            com.google.protos.f.b.b.a.n r1 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n     // Catch:{ Exception -> 0x00ca }
        L_0x007c:
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ Exception -> 0x00ca }
            r15.mo107398f(r1)     // Catch:{ Exception -> 0x00ca }
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bx r4 = r14.f346879d     // Catch:{ Exception -> 0x00ca }
            com.google.android.apps.search.assistant.libraries.dictation.b.ag r7 = r14.f346878c     // Catch:{ Exception -> 0x00ca }
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.y r8 = r14.f346880e     // Catch:{ Exception -> 0x00ca }
            r14.f346876a = r12     // Catch:{ Exception -> 0x00ca }
            r14.f346877b = r3     // Catch:{ Exception -> 0x00ca }
            r5 = r12
            r9 = r14
            java.lang.Object r15 = r4.mo107141c(r5, r7, r8, r9)     // Catch:{ Exception -> 0x00ca }
            if (r15 == r0) goto L_0x00c9
            r0 = r12
        L_0x0095:
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.ab r15 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126293ab) r15     // Catch:{ Exception -> 0x0010 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bx r4 = r14.f346879d     // Catch:{ Exception -> 0x0010 }
            com.google.android.apps.search.assistant.libraries.dictation.b.ag r5 = r14.f346878c     // Catch:{ Exception -> 0x0010 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.c r6 = r4.f346883c     // Catch:{ Exception -> 0x0010 }
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r7 = r15.mo107515a()     // Catch:{ Exception -> 0x0010 }
            r6.mo107414m(r0, r7)     // Catch:{ Exception -> 0x0010 }
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r6 = r15.mo107515a()     // Catch:{ Exception -> 0x0010 }
            if (r6 != 0) goto L_0x00ab
            goto L_0x00b8
        L_0x00ab:
            int[] r7 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125857bu.f346866a     // Catch:{ Exception -> 0x0010 }
            int r6 = r6.ordinal()     // Catch:{ Exception -> 0x0010 }
            r6 = r7[r6]     // Catch:{ Exception -> 0x0010 }
            if (r6 != r3) goto L_0x00b8
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.OK     // Catch:{ Exception -> 0x0010 }
            goto L_0x00ba
        L_0x00b8:
            com.google.net.a.a.b r3 = com.google.net.p4726a.p4727a.C62722b.INTERNAL     // Catch:{ Exception -> 0x0010 }
        L_0x00ba:
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.a r4 = r4.f346884d     // Catch:{ Exception -> 0x0010 }
            com.google.protos.f.b.b.a.n r5 = r5.f332615a     // Catch:{ Exception -> 0x0010 }
            if (r5 != 0) goto L_0x00c2
            com.google.protos.f.b.b.a.n r5 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64735n.f175467n     // Catch:{ Exception -> 0x0010 }
        L_0x00c2:
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ Exception -> 0x0010 }
            r4.mo107397e(r5, r3)     // Catch:{ Exception -> 0x0010 }
            return r15
        L_0x00c9:
            return r0
        L_0x00ca:
            r15 = move-exception
            r0 = r12
        L_0x00cc:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.bx r2 = r14.f346879d
            com.google.android.apps.search.assistant.libraries.dictation.b.ag r3 = r14.f346878c
            com.google.common.f.e r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125860bx.f346881a
            com.google.common.f.x r4 = r4.mo56225c()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.x r4 = r4.mo56382g(r15)
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            int r3 = r3.f332616b
            com.google.android.apps.search.assistant.libraries.dictation.b.s r3 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.m197993a(r3)
            if (r3 != 0) goto L_0x00e8
            com.google.android.apps.search.assistant.libraries.dictation.b.s r3 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s.UNRECOGNIZED
        L_0x00e8:
            java.lang.String r5 = "request.requester"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r5)
            com.google.frameworks.client.a.a.b r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a.m206489a(r3)
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 36750(0x8f8e, float:5.1498E-41)
            r5.<init>(r6)
            r4.mo56379ah(r5)
            java.lang.String r5 = "Failed to start dictation on request from %s to DictationInvocationService [SD]"
            r4.mo56389s(r5, r3)
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.c r3 = r2.f346883c
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r4 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a.FAILURE_UNCLASSIFIED_START_ERROR
            r3.mo107413l(r0, r4, r15)
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.a r0 = r2.f346884d
            r0.mo107396d(r15)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125859bw.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125859bw(this.f346878c, this.f346879d, this.f346880e, gVar);
    }
}
