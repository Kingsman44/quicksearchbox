package com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128098bt;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128120u;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71643cp;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.c */
/* compiled from: PG */
public final class C128664c {

    /* renamed from: d */
    private static final C59071e f353695d = C59071e.m91331h();

    /* renamed from: a */
    public final C71422aw f353696a;

    /* renamed from: b */
    public C71643cp f353697b;

    /* renamed from: c */
    public final C128098bt f353698c = C128098bt.STATE_NOT_SET;

    /* renamed from: e */
    private final C128120u f353699e;

    public C128664c(Optional optional, C71422aw awVar) {
        C69664n.m101061g(optional, "voicePlateClassicServiceFutureStubOptional");
        C69664n.m101061g(awVar, "scope");
        this.f353696a = awVar;
        this.f353699e = (C128120u) optional.orElse(null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009e A[SYNTHETIC, Splitter:B:30:0x009e] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108607a(com.google.android.apps.gsa.nga.shared.p6407v.C83320io r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128662a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.a r0 = (com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128662a) r0
            int r1 = r0.f353691d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f353691d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.a r0 = new com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f353689b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f353691d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            p5462h.C69714l.m101134b(r9)     // Catch:{ Exception -> 0x002b }
            goto L_0x010d
        L_0x002b:
            r8 = move-exception
            goto L_0x00ef
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            java.lang.Object r8 = r0.f353688a
            p5462h.C69714l.m101134b(r9)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0089
        L_0x003c:
            p5462h.C69714l.m101134b(r9)
            com.google.common.f.e r9 = f353695d
            com.google.common.f.x r2 = r9.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 37929(0x9429, float:5.315E-41)
            r5.<init>(r6)
            r2.mo56379ah(r5)
            java.lang.String r5 = "checkEscapeHatchArgsAndMaybeStartVoicePlate "
            r2.mo56386p(r5)
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.u r2 = r7.f353699e
            if (r2 == 0) goto L_0x0136
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.d r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128103d.f352473c     // Catch:{ Exception -> 0x0114 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ Exception -> 0x0114 }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.c r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128102c) r9     // Catch:{ Exception -> 0x0114 }
            r9.copyOnWrite()     // Catch:{ Exception -> 0x0114 }
            com.google.protobuf.bv r5 = r9.instance     // Catch:{ Exception -> 0x0114 }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.d r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128103d) r5     // Catch:{ Exception -> 0x0114 }
            r8.getClass()     // Catch:{ Exception -> 0x0114 }
            r5.f352476b = r8     // Catch:{ Exception -> 0x0114 }
            int r8 = r5.f352475a     // Catch:{ Exception -> 0x0114 }
            r8 = r8 | r4
            r5.f352475a = r8     // Catch:{ Exception -> 0x0114 }
            com.google.protobuf.bv r8 = r9.build()     // Catch:{ Exception -> 0x0114 }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.d r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128103d) r8     // Catch:{ Exception -> 0x0114 }
            com.google.common.util.concurrent.cx r8 = r2.mo108341b(r8)     // Catch:{ Exception -> 0x0114 }
            r0.f353688a = r7     // Catch:{ Exception -> 0x0114 }
            r0.f353691d = r4     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ Exception -> 0x0114 }
            if (r9 == r1) goto L_0x0113
            r8 = r7
        L_0x0089:
            java.lang.String r2 = "voicePlateClassicService…ild())\n          .await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x0114 }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.f r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128105f) r9     // Catch:{ Exception -> 0x0114 }
            com.google.assistant.e.j.e.gl r9 = r9.f352480b
            if (r9 != 0) goto L_0x0096
            com.google.assistant.e.j.e.gl r9 = com.google.assistant.p3897e.p3921j.p3926e.C51986gl.f136421f
        L_0x0096:
            com.google.protobuf.cq r9 = r9.f136424b
            int r9 = r9.size()
            if (r9 == 0) goto L_0x0110
            com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.ui.contentsource.impl.c r8 = (com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128664c) r8     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.u r8 = r8.f353699e     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.at r9 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at.f352396c     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.y r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128124y) r9     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ai r2 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128060ai.f352370c     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.af r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128057af) r2     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ah r5 = com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128059ah.ESCAPE_HATCH     // Catch:{ Exception -> 0x002b }
            r2.copyOnWrite()     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.bv r6 = r2.instance     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ai r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128060ai) r6     // Catch:{ Exception -> 0x002b }
            int r5 = r5.f352369c     // Catch:{ Exception -> 0x002b }
            r6.f352373b = r5     // Catch:{ Exception -> 0x002b }
            int r5 = r6.f352372a     // Catch:{ Exception -> 0x002b }
            r4 = r4 | r5
            r6.f352372a = r4     // Catch:{ Exception -> 0x002b }
            r9.copyOnWrite()     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.bv r4 = r9.instance     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.at r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at) r4     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.ai r2 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128060ai) r2     // Catch:{ Exception -> 0x002b }
            r2.getClass()     // Catch:{ Exception -> 0x002b }
            r4.f352399b = r2     // Catch:{ Exception -> 0x002b }
            r2 = 6
            r4.f352398a = r2     // Catch:{ Exception -> 0x002b }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ Exception -> 0x002b }
            com.google.android.apps.search.assistant.surfaces.voice.j.a.a.b.at r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128071at) r9     // Catch:{ Exception -> 0x002b }
            com.google.common.util.concurrent.cx r8 = r8.mo108342c(r9)     // Catch:{ Exception -> 0x002b }
            r9 = 0
            r0.f353688a = r9     // Catch:{ Exception -> 0x002b }
            r0.f353691d = r3     // Catch:{ Exception -> 0x002b }
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ Exception -> 0x002b }
            if (r8 != r1) goto L_0x010d
            return r1
        L_0x00ef:
            com.google.common.f.e r9 = f353695d
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.x r8 = r9.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 37932(0x942c, float:5.3154E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Could not start voice plate"
            r8.mo56386p(r9)
        L_0x010d:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0110:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0113:
            return r1
        L_0x0114:
            r8 = move-exception
            com.google.common.f.e r9 = f353695d
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.x r8 = r9.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 37934(0x942e, float:5.3157E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Could not fetch escape hatch args."
            r8.mo56386p(r9)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0136:
            com.google.common.f.x r8 = r9.mo56226d()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r9 = new com.google.common.f.n
            r0 = 37935(0x942f, float:5.3158E-41)
            r9.<init>(r0)
            r8.mo56379ah(r9)
            java.lang.String r9 = "Missing voicePlateClassicServiceFutureStub"
            r8.mo56386p(r9)
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.titan.sidepanel.p9743ui.contentsource.impl.C128664c.mo108607a(com.google.android.apps.gsa.nga.shared.v.io, h.c.g):java.lang.Object");
    }
}
