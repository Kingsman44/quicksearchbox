package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.connection.impl.ConnectionManagerApaCallbacks$onInteractionFinished$2", mo61344c = "ConnectionManagerApaCallbacks.kt", mo61345d = "invokeSuspend", mo61346e = {177, 178, 179})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.m */
/* compiled from: PG */
final class C126960m extends C69572j implements C69630p {

    /* renamed from: a */
    int f349587a;

    /* renamed from: b */
    final /* synthetic */ C126962o f349588b;

    /* renamed from: c */
    final /* synthetic */ C119844cl f349589c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126960m(C126962o oVar, C119844cl clVar, C69577g gVar) {
        super(2, gVar);
        this.f349588b = oVar;
        this.f349589c = clVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126960m) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r5.mo107977g(r1, new p5488io.grpc.C70334de(), r4) != r0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b0, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r5.mo107973c(r1, new p5488io.grpc.C70334de(), r4) != r0) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r5) {
        /*
            r4 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r4.f349587a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 == r3) goto L_0x0014
            if (r1 == r2) goto L_0x0010
            p5462h.C69714l.m101134b(r5)
            goto L_0x0071
        L_0x0010:
            p5462h.C69714l.m101134b(r5)
            goto L_0x0041
        L_0x0014:
            p5462h.C69714l.m101134b(r5)
            goto L_0x002e
        L_0x0018:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.o r5 = r4.f349588b
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.w r5 = r5.f349594b
            com.google.android.apps.search.assistant.platform.b.a.d.cl r1 = r4.f349589c
            r4.f349587a = r3
            io.grpc.de r3 = new io.grpc.de
            r3.<init>()
            java.lang.Object r5 = r5.mo107973c(r1, r3, r4)
            if (r5 == r0) goto L_0x00b0
        L_0x002e:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.o r5 = r4.f349588b
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.w r5 = r5.f349594b
            com.google.android.apps.search.assistant.platform.b.a.d.dz r1 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz.f333865f
            java.lang.String r3 = "getDefaultInstance()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            r4.f349587a = r2
            java.lang.Object r5 = r5.mo107977g(r1, new p5488io.grpc.C70334de(), r4)
            if (r5 == r0) goto L_0x00b0
        L_0x0041:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.o r5 = r4.f349588b
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.w r5 = r5.f349594b
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.b r1 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127142b.f350055a
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.a r1 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127133a) r1
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            com.google.protobuf.bv r1 = r1.build()
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.c.b r1 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9537c.C127142b) r1
            r2 = 3
            r4.f349587a = r2
            io.grpc.de r2 = new io.grpc.de
            r2.<init>()
            java.lang.Object r5 = r5.mo107972b(r1, r2, r4)
            if (r5 != r0) goto L_0x0071
            return r0
        L_0x0071:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.o r5 = r4.f349588b
            com.google.android.apps.search.assistant.surfaces.voice.d.g.h r5 = r5.f349597e
            com.google.android.apps.search.assistant.platform.b.a.d.cl r0 = r4.f349589c
            com.google.android.apps.search.assistant.platform.b.a.d.cb r0 = r0.f333792c
            if (r0 != 0) goto L_0x007d
            com.google.android.apps.search.assistant.platform.b.a.d.cb r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x007d:
            java.lang.String r1 = "interactionResult.id"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.String r2 = "interactionId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            java.util.concurrent.atomic.AtomicReference r5 = r5.f350724b
            com.google.android.apps.search.assistant.surfaces.voice.d.g.g r3 = new com.google.android.apps.search.assistant.surfaces.voice.d.g.g
            r3.<init>(r0)
            p3186j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(r5, r3)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.o r5 = r4.f349588b
            com.google.android.apps.search.assistant.surfaces.voice.d.g.f r5 = r5.f349598f
            com.google.android.apps.search.assistant.platform.b.a.d.cl r0 = r4.f349589c
            com.google.android.apps.search.assistant.platform.b.a.d.cb r0 = r0.f333792c
            if (r0 != 0) goto L_0x009d
            com.google.android.apps.search.assistant.platform.b.a.d.cb r0 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x009d:
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r2)
            java.util.concurrent.atomic.AtomicReference r5 = r5.f350721b
            com.google.android.apps.search.assistant.surfaces.voice.d.g.e r1 = new com.google.android.apps.search.assistant.surfaces.voice.d.g.e
            r1.<init>(r0)
            p3186j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(r5, r1)
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        L_0x00b0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126960m.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126960m(this.f349588b, this.f349589c, gVar);
    }
}
