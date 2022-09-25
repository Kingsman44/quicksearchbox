package com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.opahandover.impl.OpaHandoverControllerImpl$maybeWrapFulfillmentResult$1", mo61344c = "OpaHandoverControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {113, 118, 134, 139})
/* renamed from: com.google.android.apps.search.assistant.platform.f.k.a.q */
/* compiled from: PG */
final class C120774q extends C69572j implements C69630p {

    /* renamed from: a */
    Object f335889a;

    /* renamed from: b */
    int f335890b;

    /* renamed from: c */
    final /* synthetic */ C60870cx f335891c;

    /* renamed from: d */
    final /* synthetic */ C120777t f335892d;

    /* renamed from: e */
    final /* synthetic */ boolean f335893e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120774q(C60870cx cxVar, C120777t tVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f335891c = cxVar;
        this.f335892d = tVar;
        this.f335893e = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120774q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r11 != r0) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f335890b
            java.lang.String r2 = "currentInteractionId.id"
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            java.lang.String r8 = "newBuilder()"
            if (r1 == 0) goto L_0x0031
            if (r1 == r6) goto L_0x002d
            if (r1 == r5) goto L_0x0024
            if (r1 == r4) goto L_0x001f
            java.lang.Object r0 = r10.f335889a
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x001c }
            goto L_0x00c9
        L_0x001c:
            r11 = move-exception
            goto L_0x01ba
        L_0x001f:
            p5462h.C69714l.m101134b(r11)
            goto L_0x00b0
        L_0x0024:
            java.lang.Object r1 = r10.f335889a
            p5462h.C69714l.m101134b(r11)     // Catch:{ all -> 0x002a }
            goto L_0x0060
        L_0x002a:
            r11 = move-exception
            goto L_0x01e0
        L_0x002d:
            p5462h.C69714l.m101134b(r11)
            goto L_0x003e
        L_0x0031:
            p5462h.C69714l.m101134b(r11)
            com.google.common.util.concurrent.cx r11 = r10.f335891c
            r10.f335890b = r6
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r10)
            if (r11 == r0) goto L_0x0206
        L_0x003e:
            r1 = r11
            com.google.android.apps.search.assistant.platform.f.f.c r1 = (com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c) r1
            com.google.android.apps.search.assistant.platform.f.k.a.l r11 = new com.google.android.apps.search.assistant.platform.f.k.a.l     // Catch:{ all -> 0x002a }
            r11.<init>(r1)     // Catch:{ all -> 0x002a }
            kotlinx.coroutines.b.n r11 = com.google.android.libraries.search.assistant.p2511d.C32538am.m60349a(r11)     // Catch:{ all -> 0x002a }
            com.google.android.apps.search.assistant.platform.f.k.a.t r6 = r10.f335892d     // Catch:{ all -> 0x002a }
            com.google.android.apps.search.assistant.platform.f.k.a.p r9 = new com.google.android.apps.search.assistant.platform.f.k.a.p     // Catch:{ all -> 0x002a }
            r9.<init>(r11, r6)     // Catch:{ all -> 0x002a }
            com.google.android.apps.search.assistant.platform.f.k.a.m r11 = new com.google.android.apps.search.assistant.platform.f.k.a.m     // Catch:{ all -> 0x002a }
            r11.<init>(r7)     // Catch:{ all -> 0x002a }
            r10.f335889a = r1     // Catch:{ all -> 0x002a }
            r10.f335890b = r5     // Catch:{ all -> 0x002a }
            java.lang.Object r11 = kotlinx.coroutines.p5574b.C71517bu.m104352c(r9, r11, r10)     // Catch:{ all -> 0x002a }
            if (r11 == r0) goto L_0x01df
        L_0x0060:
            com.google.android.apps.search.assistant.platform.f.k.a.a r11 = (com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120758a) r11     // Catch:{ all -> 0x002a }
            if (r11 != 0) goto L_0x0066
            com.google.android.apps.search.assistant.platform.f.k.a.a r11 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120758a.FORWARD_TO_CLIENT     // Catch:{ all -> 0x002a }
        L_0x0066:
            com.google.android.apps.search.assistant.platform.f.k.a.a r5 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120758a.FORWARD_TO_CLIENT
            if (r11 != r5) goto L_0x0072
            com.google.android.apps.search.assistant.platform.f.k.a.t r11 = r10.f335892d
            boolean r0 = r10.f335893e
            r11.mo104930f(r0, r7)
            return r1
        L_0x0072:
            com.google.android.apps.search.assistant.platform.f.k.a.t r11 = r10.f335892d
            boolean r5 = r11.f335905i
            if (r5 == 0) goto L_0x00b4
            com.google.android.libraries.search.assistant.performer.h.a.b r1 = com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36110b.f94442c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.assistant.performer.h.a.a r1 = (com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36109a) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            com.google.android.libraries.search.assistant.performer.h.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.apps.search.assistant.platform.b.a.d.cb r11 = r11.f335902f
            java.lang.String r11 = r11.f333767a
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r2)
            r1.mo39970b(r11)
            com.google.android.libraries.search.assistant.performer.h.a.b r11 = r1.mo39969a()
            com.google.android.apps.search.assistant.platform.f.k.a.t r1 = r10.f335892d
            com.google.android.apps.search.assistant.platform.b.a.b.c.d.a r1 = r1.f335899c
            com.google.assistant.e.j.dy r11 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120778u.m199973a(r11)
            com.google.common.util.concurrent.cx r11 = r1.mo104485a(r11)
            java.lang.String r1 = "opaHandoverStreamService…erClientOp(handoverArgs))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r1)
            r10.f335889a = r7
            r10.f335890b = r4
            java.lang.Object r11 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r10)
            if (r11 == r0) goto L_0x00b3
        L_0x00b0:
            com.google.assistant.e.j.dy r11 = (com.google.assistant.p3897e.p3921j.C51809dy) r11
            goto L_0x0125
        L_0x00b3:
            return r0
        L_0x00b4:
            com.google.android.apps.search.assistant.platform.f.k.a.k r11 = new com.google.android.apps.search.assistant.platform.f.k.a.k     // Catch:{ all -> 0x01b8 }
            r11.<init>(r1)     // Catch:{ all -> 0x01b8 }
            kotlinx.coroutines.b.n r11 = com.google.android.libraries.search.assistant.p2511d.C32538am.m60349a(r11)     // Catch:{ all -> 0x01b8 }
            r10.f335889a = r1     // Catch:{ all -> 0x01b8 }
            r10.f335890b = r3     // Catch:{ all -> 0x01b8 }
            java.lang.Object r11 = com.google.common.p4522b.C58479go.m89815g(r11, r10)     // Catch:{ all -> 0x01b8 }
            if (r11 != r0) goto L_0x00c8
            return r0
        L_0x00c8:
            r0 = r1
        L_0x00c9:
            com.google.common.b.gu r11 = (com.google.common.p4522b.C58485gu) r11     // Catch:{ all -> 0x001c }
            com.google.android.apps.search.assistant.platform.f.k.a.t r0 = r10.f335892d
            com.google.android.libraries.search.assistant.performer.h.a.b r1 = com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36110b.f94442c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.assistant.performer.h.a.a r1 = (com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36109a) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            com.google.android.libraries.search.assistant.performer.h.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.apps.search.assistant.platform.b.a.d.cb r0 = r0.f335902f
            java.lang.String r0 = r0.f333767a
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)
            r1.mo39970b(r0)
            com.google.protobuf.a.b r0 = new com.google.protobuf.a.b
            com.google.android.libraries.search.assistant.performer.h.a.a r2 = r1.f94446a
            com.google.protobuf.bv r2 = r2.instance
            com.google.android.libraries.search.assistant.performer.h.a.b r2 = (com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36110b) r2
            com.google.protobuf.cq r2 = r2.f94445b
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            java.lang.String r4 = "_builder.getConversationDeltaList()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r4)
            r0.<init>(r2)
            java.lang.String r0 = "values"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r0)
            com.google.android.libraries.search.assistant.performer.h.a.a r0 = r1.f94446a
            r0.copyOnWrite()
            com.google.protobuf.bv r0 = r0.instance
            com.google.android.libraries.search.assistant.performer.h.a.b r0 = (com.google.android.libraries.search.assistant.performer.p2764h.p2765a.C36110b) r0
            com.google.protobuf.cq r2 = r0.f94445b
            boolean r4 = r2.mo58948c()
            if (r4 != 0) goto L_0x0118
            com.google.protobuf.cq r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r2)
            r0.f94445b = r2
        L_0x0118:
            com.google.protobuf.cq r0 = r0.f94445b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r11, (java.util.List) r0)
            com.google.android.libraries.search.assistant.performer.h.a.b r11 = r1.mo39969a()
            com.google.assistant.e.j.dy r11 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120778u.m199973a(r11)
        L_0x0125:
            com.google.android.apps.search.assistant.platform.f.k.a.t r0 = r10.f335892d
            com.google.android.apps.search.assistant.platform.f.k.a.b r0 = r0.f335903g
            boolean r1 = r10.f335893e
            if (r1 == 0) goto L_0x0130
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96849aT
            goto L_0x0132
        L_0x0130:
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f96848aS
        L_0x0132:
            java.lang.String r2 = "if (isFinal) AndroidAppF…EFETCH_HANDOVER_CLIENT_OP"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r0.mo104920a(r1)
            java.lang.String r0 = "handoverClientOp"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            com.google.assistant.e.j.en r0 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.el r0 = (com.google.assistant.p3897e.p3921j.C52079el) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r8)
            com.google.assistant.e.j.pp r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            r0.mo53846d()
            com.google.assistant.e.j.ep r1 = com.google.assistant.p3897e.p3921j.C52083ep.f136689f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.j.eo r1 = (com.google.assistant.p3897e.p3921j.C52082eo) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r8)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.assistant.e.j.ei r4 = com.google.assistant.p3897e.p3921j.C52076ei.f136664f
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.eh r4 = (com.google.assistant.p3897e.p3921j.C52075eh) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r8)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r2)
            java.lang.String r2 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r2)
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.assistant.e.j.ei r5 = (com.google.assistant.p3897e.p3921j.C52076ei) r5
            r11.getClass()
            r5.f136668c = r11
            int r11 = r5.f136666a
            r11 = r11 | 32
            r5.f136666a = r11
            com.google.protobuf.bv r11 = r4.build()
            java.lang.String r4 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            com.google.assistant.e.j.ei r11 = (com.google.assistant.p3897e.p3921j.C52076ei) r11
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r2)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.e.j.ep r2 = (com.google.assistant.p3897e.p3921j.C52083ep) r2
            r11.getClass()
            r2.f136693c = r11
            r2.f136692b = r3
            com.google.protobuf.bv r11 = r1.build()
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r4)
            com.google.assistant.e.j.ep r11 = (com.google.assistant.p3897e.p3921j.C52083ep) r11
            r0.mo53845c(r11)
            com.google.assistant.e.j.en r11 = r0.mo53843a()
            com.google.android.apps.search.assistant.platform.f.f.a r0 = new com.google.android.apps.search.assistant.platform.f.f.a
            r0.<init>(r11)
            return r0
        L_0x01b8:
            r11 = move-exception
            r0 = r1
        L_0x01ba:
            com.google.common.f.e r1 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120777t.f335897a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.x r1 = r1.mo56382g(r11)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 35589(0x8b05, float:4.9871E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "Failed to fetch conversation deltas"
            r1.mo56386p(r2)
            com.google.android.apps.search.assistant.platform.f.k.a.t r1 = r10.f335892d
            boolean r2 = r10.f335893e
            r1.mo104930f(r2, r11)
        L_0x01df:
            return r0
        L_0x01e0:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120777t.f335897a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r0 = r0.mo56382g(r11)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 35590(0x8b06, float:4.9872E-41)
            r2.<init>(r3)
            r0.mo56379ah(r2)
            java.lang.String r2 = "Failed to fetch the first conversation delta"
            r0.mo56386p(r2)
            com.google.android.apps.search.assistant.platform.f.k.a.t r0 = r10.f335892d
            boolean r2 = r10.f335893e
            r0.mo104930f(r2, r11)
            return r1
        L_0x0206:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9120k.p9121a.C120774q.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120774q(this.f335891c, this.f335892d, this.f335893e, gVar);
    }
}
