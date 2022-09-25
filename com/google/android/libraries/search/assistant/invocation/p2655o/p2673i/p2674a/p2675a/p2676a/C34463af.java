package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.adapter.bisto.VoiceMatchConfigProvider$configuration$1", mo61344c = "VoiceMatchConfigProvider.kt", mo61345d = "invokeSuspend", mo61346e = {41, 43})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.af */
/* compiled from: PG */
final class C34463af extends C69572j implements C69626l {

    /* renamed from: a */
    Object f91572a;

    /* renamed from: b */
    int f91573b;

    /* renamed from: c */
    final /* synthetic */ C34467aj f91574c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34463af(C34467aj ajVar, C69577g gVar) {
        super(1, gVar);
        this.f91574c = ajVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34463af(this.f91574c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c0  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r7.f91573b
            java.lang.String r2 = "TRG.VMConfigProv"
            r3 = 1
            if (r1 == 0) goto L_0x0018
            if (r1 == r3) goto L_0x0014
            java.lang.Object r0 = r7.f91572a
            p5462h.C69714l.m101134b(r8)     // Catch:{ all -> 0x0011 }
            goto L_0x0082
        L_0x0011:
            r8 = move-exception
            goto L_0x008a
        L_0x0014:
            p5462h.C69714l.m101134b(r8)
            goto L_0x0066
        L_0x0018:
            p5462h.C69714l.m101134b(r8)
            com.google.common.f.e r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34467aj.f91580a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r1, r2)
            com.google.common.f.n r1 = new com.google.common.f.n
            r4 = 51406(0xc8ce, float:7.2035E-41)
            r1.<init>(r4)
            r8.mo56379ah(r1)
            java.lang.String r1 = "Fetching HotwordInformation."
            r8.mo56386p(r1)
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.aj r8 = r7.f91574c
            com.google.android.libraries.search.n.c.a.e.k r8 = r8.f91582c
            com.google.android.libraries.search.n.c.a.e.b r1 = com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39497b.f104020a
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.n.c.a.e.a r1 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39496a) r1
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            java.lang.String r4 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            com.google.protobuf.bv r1 = r1.build()
            java.lang.String r4 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            com.google.android.libraries.search.n.c.a.e.b r1 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39497b) r1
            r7.f91573b = r3
            io.grpc.de r4 = new io.grpc.de
            r4.<init>()
            java.lang.Object r8 = r8.mo41866b(r1, r4, r7)
            if (r8 == r0) goto L_0x00d3
        L_0x0066:
            com.google.android.libraries.search.n.c.a.e.d r8 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39499d) r8
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.aj r1 = r7.f91574c
            com.google.android.libraries.search.n.c.a.d.h r1 = r1.f91585f     // Catch:{ all -> 0x0086 }
            com.google.common.util.concurrent.cx r1 = r1.mo41862a()     // Catch:{ all -> 0x0086 }
            java.lang.String r4 = "hotwordInformationProvid…ordInformationWithRetry()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)     // Catch:{ all -> 0x0086 }
            r7.f91572a = r8     // Catch:{ all -> 0x0086 }
            r4 = 2
            r7.f91573b = r4     // Catch:{ all -> 0x0086 }
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r7)     // Catch:{ all -> 0x0086 }
            if (r1 == r0) goto L_0x0085
            r0 = r8
            r8 = r1
        L_0x0082:
            com.google.android.hotword.service.HotwordInformation r8 = (com.google.android.hotword.service.HotwordInformation) r8     // Catch:{ all -> 0x0011 }
            goto L_0x008e
        L_0x0085:
            return r0
        L_0x0086:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L_0x008a:
            java.lang.Object r8 = p5462h.C69714l.m101133a(r8)
        L_0x008e:
            java.lang.Throwable r1 = p5462h.C69702k.m101124a(r8)
            if (r1 == 0) goto L_0x00b7
            com.google.common.f.e r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34467aj.f91580a
            com.google.common.f.x r4 = r4.mo56226d()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r2)
            com.google.common.f.x r1 = r4.mo56382g(r1)
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 51407(0xc8cf, float:7.2037E-41)
            r2.<init>(r4)
            r1.mo56379ah(r2)
            java.lang.String r2 = "Fetching HotwordInformation failed."
            r1.mo56386p(r2)
        L_0x00b7:
            com.google.android.hotword.service.HotwordInformation r1 = new com.google.android.hotword.service.HotwordInformation
            r1.<init>()
            boolean r2 = r8 instanceof p5462h.C69692j
            if (r3 != r2) goto L_0x00c1
            r8 = r1
        L_0x00c1:
            com.google.android.hotword.service.HotwordInformation r8 = (com.google.android.hotword.service.HotwordInformation) r8
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.ae r1 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.ae
            com.google.android.libraries.search.n.c.a.e.d r0 = (com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e.C39499d) r0
            boolean r2 = r0.f104026c
            boolean r0 = r0.f104027d
            byte[] r3 = r8.f395875G
            com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel r8 = r8.f395887h
            r1.<init>(r2, r0, r3, r8)
            return r1
        L_0x00d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a.C34463af.mo5193b(java.lang.Object):java.lang.Object");
    }
}
