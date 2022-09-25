package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127110b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.controller.api.ConversationActions$startInteractionWithSelfTrigger$1", mo61344c = "ConversationActions.kt", mo61345d = "invokeSuspend", mo61346e = {38, 40})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.c */
/* compiled from: PG */
final class C126976c extends C69572j implements C69630p {

    /* renamed from: a */
    int f349644a;

    /* renamed from: b */
    final /* synthetic */ C126977d f349645b;

    /* renamed from: c */
    final /* synthetic */ C127110b f349646c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126976c(C126977d dVar, C127110b bVar, C69577g gVar) {
        super(2, gVar);
        this.f349645b = dVar;
        this.f349646c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126976c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f349644a
            r2 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r2) goto L_0x000e
            p5462h.C69714l.m101134b(r8)
            goto L_0x00c0
        L_0x000e:
            p5462h.C69714l.m101134b(r8)
            goto L_0x001f
        L_0x0012:
            p5462h.C69714l.m101134b(r8)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.d r8 = r7.f349645b
            r7.f349644a = r2
            java.lang.Object r8 = r8.mo107877c(r7)
            if (r8 == r0) goto L_0x00ee
        L_0x001f:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.d r8 = r7.f349645b
            com.google.android.apps.search.assistant.surfaces.voice.f.a.o r8 = r8.f349649b
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.b r1 = r7.f349646c
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.e r3 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e.f350939f
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.d r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127456d) r3
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            java.lang.String r4 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            com.google.android.apps.search.assistant.platform.b.a.d.cs r4 = r1.f350003b
            if (r4 != 0) goto L_0x003d
            com.google.android.apps.search.assistant.platform.b.a.d.cs r4 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs.f333803i
        L_0x003d:
            java.lang.String r5 = "startRequest.request"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.e r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e) r6
            r4.getClass()
            r6.f350942b = r4
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.c r4 = r1.f350005d
            if (r4 != 0) goto L_0x0059
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.c r4 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127455c.f350936b
        L_0x0059:
            java.lang.String r6 = "startRequest.entryPointContext"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.e r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e) r6
            r4.getClass()
            r6.f350945e = r4
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.c r4 = r1.f350004c
            if (r4 != 0) goto L_0x0073
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.c r4 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127045c.f349832d
        L_0x0073:
            java.lang.String r6 = "startRequest.queryContextParams"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.e r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e) r6
            r4.getClass()
            r6.f350943c = r4
            int r4 = r6.f350941a
            r4 = r4 | r2
            r6.f350941a = r4
            com.google.android.libraries.search.assistant.invocation.o.a.ca r1 = r1.f350006e
            if (r1 != 0) goto L_0x0092
            com.google.android.libraries.search.assistant.invocation.o.a.ca r1 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34065ca.f90770i
        L_0x0092:
            java.lang.String r4 = "startRequest.requestedSharedResources"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.e r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e) r4
            r1.getClass()
            r4.f350944d = r1
            com.google.protobuf.bv r1 = r3.build()
            java.lang.String r3 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.e r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127457e) r1
            r3 = 2
            r7.f349644a = r3
            io.grpc.de r3 = new io.grpc.de
            r3.<init>()
            java.lang.Object r8 = r8.mo108087b(r1, r3, r7)
            if (r8 != r0) goto L_0x00c0
            return r0
        L_0x00c0:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.g r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127459g) r8
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.c r0 = r8.f350949a
            if (r0 != 0) goto L_0x00c8
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.c r0 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c.f350959c
        L_0x00c8:
            java.lang.String r1 = "result.entryPointStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            int r0 = r0.f350961a
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.b r0 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127464b.m208424a(r0)
            if (r0 != 0) goto L_0x00d7
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.b r0 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127464b.UNRECOGNIZED
        L_0x00d7:
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x00ed
            if (r0 == r2) goto L_0x00ed
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.c r8 = r8.f350949a
            if (r8 != 0) goto L_0x00e7
            com.google.android.apps.search.assistant.surfaces.voice.f.a.h.c r8 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c.f350959c
        L_0x00e7:
            java.lang.String r8 = r8.f350962b
            r0.<init>(r8)
            throw r0
        L_0x00ed:
            return r8
        L_0x00ee:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126976c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126976c(this.f349645b, this.f349646c, gVar);
    }
}
