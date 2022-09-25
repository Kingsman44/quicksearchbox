package com.google.android.libraries.assistant.auto.ondevice;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.shared.search.Query;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.i */
/* compiled from: PG */
public final /* synthetic */ class C11918i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C11926q f38300a;

    /* renamed from: b */
    public final /* synthetic */ b f38301b;

    /* renamed from: c */
    public final /* synthetic */ Query f38302c;

    public /* synthetic */ C11918i(C11926q qVar, b bVar, Query query) {
        this.f38300a = qVar;
        this.f38301b = bVar;
        this.f38302c = query;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v76, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: com.google.protos.an.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v77, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: com.google.protos.an.f} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0399, code lost:
        if (((com.google.common.p4522b.C58759qy) r3).f156534a.equals(r0.f180932b) != false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0192, code lost:
        if (r6.equals("Media") != false) goto L_0x01ae;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r23 = this;
            r0 = r23
            com.google.android.libraries.assistant.auto.ondevice.q r1 = r0.f38300a
            com.google.android.apps.gsa.g.f.b r2 = r0.f38301b
            com.google.android.apps.gsa.shared.search.Query r3 = r0.f38302c
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r4 = r2.b
            r5 = 1
            if (r4 == r5) goto L_0x0017
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0527
        L_0x0017:
            com.google.speech.grammar.pumpkin.s r2 = r2.e
            if (r2 == 0) goto L_0x0521
            com.google.protobuf.cq r4 = r2.f180939a
            int r4 = r4.size()
            if (r4 > 0) goto L_0x0025
            goto L_0x0521
        L_0x0025:
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f38315h
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250268T
            boolean r4 = r4.mo79746e(r6)
            java.lang.String r6 = "OfflineARWorker"
            java.lang.String r7 = "Routine"
            r8 = 0
            if (r4 == 0) goto L_0x00b6
            com.google.protobuf.cq r4 = r2.f180939a
            java.lang.Object r4 = r4.get(r8)
            com.google.speech.grammar.pumpkin.q r4 = (com.google.speech.grammar.pumpkin.C66525q) r4
            java.lang.String r4 = r4.f180932b
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x00b6
            com.google.common.base.ax r2 = r1.f38314g
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x0054
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0527
        L_0x0054:
            java.lang.String r2 = r3.f252770i
            com.google.common.base.ax r4 = r1.f38314g
            java.lang.Object r4 = r4.mo56107c()
            java.util.Map r4 = (java.util.Map) r4
            boolean r4 = r4.containsKey(r2)
            if (r4 != 0) goto L_0x007f
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.ondevice.C11926q.f38310a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r3, r6)
            java.lang.String r3 = "Unexpected error, couldn't find Routine mapping for %s, returning"
            r4 = 43507(0xa9f3, float:6.0966E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56389s(r3, r2)
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0527
        L_0x007f:
            com.google.common.base.ax r4 = r1.f38314g
            java.lang.Object r4 = r4.mo56107c()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r2 = r4.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r2.get(r8)
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.apps.gsa.shared.search.Query r2 = r3.mo84268aE(r2, r8)
            com.google.android.libraries.gsa.k.g r3 = r1.f38311b
            com.google.android.apps.gsa.search.core.al.ce.a r4 = r1.f38313f
            com.google.common.util.concurrent.cx r4 = r4.mo78692a(r2)
            com.google.android.libraries.assistant.auto.ondevice.o r5 = new com.google.android.libraries.assistant.auto.ondevice.o
            r5.<init>(r1, r2)
            java.lang.String r1 = "generate Pumpkin Graph"
            com.google.common.util.concurrent.cx r1 = r3.mo28210j(r4, r1, r5)
            goto L_0x0527
        L_0x00ae:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0527
        L_0x00b6:
            com.google.protobuf.cq r4 = r2.f180939a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0111
            com.google.common.base.ax r4 = r1.f38317j
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0111
            com.google.protobuf.cq r4 = r2.f180939a
            java.lang.Object r4 = r4.get(r8)
            com.google.speech.grammar.pumpkin.q r4 = (com.google.speech.grammar.pumpkin.C66525q) r4
            java.lang.String r4 = r4.f180932b
            java.lang.String r9 = "CarAutomation"
            boolean r9 = android.text.TextUtils.equals(r9, r4)
            if (r9 == 0) goto L_0x00e2
            com.google.android.apps.gsa.search.core.i.t r9 = r1.f38315h
            com.google.android.apps.gsa.shared.m.d r10 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250356bb
            boolean r9 = r9.mo79746e(r10)
            if (r9 != 0) goto L_0x00f4
        L_0x00e2:
            java.lang.String r9 = "CustomCarAutomation"
            boolean r4 = android.text.TextUtils.equals(r9, r4)
            if (r4 == 0) goto L_0x0111
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f38315h
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250358bd
            boolean r4 = r4.mo79746e(r9)
            if (r4 == 0) goto L_0x0111
        L_0x00f4:
            r1.f38318k = r5
            com.google.android.libraries.gsa.k.g r3 = r1.f38311b
            com.google.common.base.ax r1 = r1.f38317j
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.assistant.auto.ondevice.s r1 = (com.google.android.libraries.assistant.auto.ondevice.C11928s) r1
            com.google.common.util.concurrent.cx r1 = r1.mo20307a()
            com.google.android.libraries.assistant.auto.ondevice.n r4 = new com.google.android.libraries.assistant.auto.ondevice.n
            r4.<init>(r2)
            java.lang.String r2 = "Get TNG OfflineCarActionGraphEntryPoint"
            com.google.common.util.concurrent.cx r1 = r3.mo28210j(r1, r2, r4)
            goto L_0x0527
        L_0x0111:
            r1.f38318k = r8
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f38315h
            com.google.android.apps.gsa.shared.m.d r9 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250335bG
            boolean r4 = r4.mo79746e(r9)
            java.lang.String r9 = "Device"
            java.lang.String r10 = "GmmUiTravel"
            java.lang.String r11 = "Answers"
            java.lang.String r12 = "GmmUiMap"
            java.lang.String r13 = "Media"
            java.lang.String r14 = "Local"
            java.lang.String r15 = "Help"
            java.lang.String r5 = "Travel"
            if (r4 == 0) goto L_0x0270
            com.google.android.libraries.assistant.auto.ondevice.a.b r4 = r1.f38316i
            com.google.protobuf.cq r6 = r2.f180939a
            int r6 = r6.size()
            java.lang.String r7 = "FulfillRequestProvider"
            if (r6 != 0) goto L_0x0150
            com.google.common.f.e r2 = com.google.android.libraries.assistant.auto.ondevice.p705a.C11835b.f38018a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r7)
            java.lang.String r3 = "Empty PumpkinTaggerResults"
            r4 = 43527(0xaa07, float:6.0994E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
            goto L_0x026a
        L_0x0150:
            com.google.protobuf.cq r2 = r2.f180939a
            java.lang.Object r2 = r2.get(r8)
            com.google.speech.grammar.pumpkin.q r2 = (com.google.speech.grammar.pumpkin.C66525q) r2
            java.lang.String r6 = r2.f180932b
            int r16 = r6.hashCode()
            r17 = 2
            r18 = 7
            r19 = 6
            r20 = 5
            r21 = 3
            r22 = 4
            switch(r16) {
                case -1781830854: goto L_0x01a5;
                case 2245473: goto L_0x019d;
                case 73592651: goto L_0x0195;
                case 74219460: goto L_0x018e;
                case 341417537: goto L_0x0186;
                case 817254485: goto L_0x017e;
                case 903061525: goto L_0x0176;
                case 2043677302: goto L_0x016e;
                default: goto L_0x016d;
            }
        L_0x016d:
            goto L_0x01ad
        L_0x016e:
            boolean r5 = r6.equals(r9)
            if (r5 == 0) goto L_0x01ad
            r8 = 2
            goto L_0x01ae
        L_0x0176:
            boolean r5 = r6.equals(r10)
            if (r5 == 0) goto L_0x01ad
            r8 = 7
            goto L_0x01ae
        L_0x017e:
            boolean r5 = r6.equals(r11)
            if (r5 == 0) goto L_0x01ad
            r8 = 1
            goto L_0x01ae
        L_0x0186:
            boolean r5 = r6.equals(r12)
            if (r5 == 0) goto L_0x01ad
            r8 = 6
            goto L_0x01ae
        L_0x018e:
            boolean r5 = r6.equals(r13)
            if (r5 == 0) goto L_0x01ad
            goto L_0x01ae
        L_0x0195:
            boolean r5 = r6.equals(r14)
            if (r5 == 0) goto L_0x01ad
            r8 = 5
            goto L_0x01ae
        L_0x019d:
            boolean r5 = r6.equals(r15)
            if (r5 == 0) goto L_0x01ad
            r8 = 3
            goto L_0x01ae
        L_0x01a5:
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x01ad
            r8 = 4
            goto L_0x01ae
        L_0x01ad:
            r8 = -1
        L_0x01ae:
            switch(r8) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01be;
                case 2: goto L_0x01bc;
                case 3: goto L_0x01ba;
                case 4: goto L_0x01b7;
                case 5: goto L_0x01b5;
                case 6: goto L_0x01b3;
                case 7: goto L_0x01b3;
                default: goto L_0x01b1;
            }
        L_0x01b1:
            r5 = 1
            goto L_0x01c1
        L_0x01b3:
            r5 = 4
            goto L_0x01c1
        L_0x01b5:
            r5 = 6
            goto L_0x01c1
        L_0x01b7:
            r5 = 8
            goto L_0x01c1
        L_0x01ba:
            r5 = 5
            goto L_0x01c1
        L_0x01bc:
            r5 = 3
            goto L_0x01c1
        L_0x01be:
            r5 = 2
            goto L_0x01c1
        L_0x01c0:
            r5 = 7
        L_0x01c1:
            com.google.common.f.e r6 = com.google.android.libraries.assistant.auto.ondevice.p705a.C11835b.f38018a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r8, r7)
            java.lang.String r8 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15665q.m32452a(r5)
            r9 = 43525(0xaa05, float:6.0992E-41)
            java.lang.String r10 = "The vertical is %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56389s(r10, r8)
            com.google.android.libraries.assistant.auto.ondevice.a.a r6 = r4.f38019b
            int r8 = r5 + -1
            r9 = 0
            switch(r8) {
                case 1: goto L_0x0225;
                case 2: goto L_0x0225;
                case 3: goto L_0x0225;
                case 4: goto L_0x0225;
                case 5: goto L_0x0225;
                case 6: goto L_0x01e1;
                case 7: goto L_0x0225;
                default: goto L_0x01e0;
            }
        L_0x01e0:
            goto L_0x023e
        L_0x01e1:
            com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil r6 = r6.f38017b
            com.google.bp.a.b.k r8 = com.google.p4242bp.p4243a.p4245b.C56152k.f149611f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.bp.a.b.j r8 = (com.google.p4242bp.p4243a.p4245b.C56151j) r8
            java.lang.String r10 = "MusicServiceOn"
            r8.mo54328a(r10)
            com.google.protobuf.bv r8 = r8.build()
            com.google.bp.a.b.k r8 = (com.google.p4242bp.p4243a.p4245b.C56152k) r8
            com.google.common.base.ax r6 = r6.mo20311a(r2, r8)
            boolean r8 = r6.mo56113h()
            if (r8 != 0) goto L_0x020f
            com.google.common.f.a.d r6 = com.google.android.libraries.assistant.auto.ondevice.p705a.C11833a.f38016a
            com.google.common.f.x r6 = r6.mo56224b()
            java.lang.String r8 = "can't build AnalyzerResponse from HypothesisResult: %s"
            r10 = 43522(0xaa02, float:6.0987E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r6).mo56372aa(r10)).mo56389s(r8, r2)
            goto L_0x023e
        L_0x020f:
            java.lang.Object r2 = r6.mo56107c()
            r9 = r2
            com.google.protos.an.f r9 = (com.google.protos.p4850an.C63595f) r9
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p705a.C11833a.f38016a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r6 = "Generated AnalyzerResponse: %s"
            r8 = 43521(0xaa01, float:6.0986E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r8)).mo56389s(r6, r9)
            goto L_0x023e
        L_0x0225:
            com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil r6 = r6.f38017b
            com.google.bp.a.b.k r8 = com.google.p4242bp.p4243a.p4245b.C56152k.f149611f
            com.google.common.base.ax r2 = r6.mo20311a(r2, r8)
            boolean r6 = r2.mo56113h()
            if (r6 != 0) goto L_0x0234
            goto L_0x023e
        L_0x0234:
            r2.mo56107c()
            java.lang.Object r2 = r2.mo56107c()
            r9 = r2
            com.google.protos.an.f r9 = (com.google.protos.p4850an.C63595f) r9
        L_0x023e:
            if (r9 == 0) goto L_0x0255
            com.google.android.libraries.assistant.auto.tng.r.c.b.m r2 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r.m32453f()
            com.google.android.libraries.assistant.auto.tng.r.c.b.a r6 = new com.google.android.libraries.assistant.auto.tng.r.c.b.a
            r6.<init>(r9)
            r7 = r2
            com.google.android.libraries.assistant.auto.tng.r.c.b.f r7 = (com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15654f) r7
            r7.f46775a = r6
            r7.f46779e = r5
            com.google.common.base.ax r2 = r4.mo20176a(r3, r2)
            goto L_0x026a
        L_0x0255:
            com.google.common.f.e r2 = com.google.android.libraries.assistant.auto.ondevice.p705a.C11835b.f38018a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r7)
            java.lang.String r3 = "Didn't get valid AnalyzerResponse."
            r4 = 43526(0xaa06, float:6.0993E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x026a:
            com.google.common.util.concurrent.cx r1 = r1.mo20305e(r2)
            goto L_0x0527
        L_0x0270:
            com.google.android.libraries.assistant.auto.ondevice.b.c r4 = r1.f38312c
            com.google.common.base.b r8 = com.google.common.base.C58836b.f156633a
            r4.f38122r = r8
            r8 = 0
        L_0x0277:
            com.google.protobuf.cq r0 = r2.f180939a
            int r0 = r0.size()
            if (r8 >= r0) goto L_0x04d2
            com.google.protobuf.cq r0 = r2.f180939a
            java.lang.Object r0 = r0.get(r8)
            com.google.speech.grammar.pumpkin.q r0 = (com.google.speech.grammar.pumpkin.C66525q) r0
            r17 = r2
            com.google.android.apps.gsa.search.core.i.t r2 = r4.f38106b
            r18 = r3
            java.lang.String r3 = r0.f180932b
            boolean r3 = android.text.TextUtils.equals(r7, r3)
            if (r3 == 0) goto L_0x02a6
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250385cD
            boolean r3 = r2.mo79746e(r3)
            if (r3 == 0) goto L_0x02a6
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250273Y
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x02a6
            goto L_0x02ac
        L_0x02a6:
            boolean r2 = com.google.android.apps.gsa.g.g.d.a(r0)
            if (r2 == 0) goto L_0x02ce
        L_0x02ac:
            com.google.android.apps.gsa.search.core.i.t r2 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250385cD
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x02ce
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Dispatched PumpkinTaggerResult to OfflinePuntBuilder"
            r19 = r7
            r7 = 43537(0xaa11, float:6.1008E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r3)
            com.google.android.libraries.assistant.auto.ondevice.b.aa r2 = r4.f38107c
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x04bb
        L_0x02ce:
            r19 = r7
            java.lang.String r2 = r0.f180932b
            boolean r3 = android.text.TextUtils.equals(r13, r2)
            if (r3 == 0) goto L_0x02e0
            com.google.android.libraries.assistant.auto.ondevice.b.r r2 = r4.f38112h
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x04bb
        L_0x02e0:
            boolean r3 = android.text.TextUtils.equals(r9, r2)
            if (r3 == 0) goto L_0x02ee
            com.google.android.libraries.assistant.auto.ondevice.b.m r2 = r4.f38113i
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x04bb
        L_0x02ee:
            boolean r3 = android.text.TextUtils.equals(r11, r2)
            if (r3 == 0) goto L_0x0306
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250386cE
            boolean r3 = r3.mo79746e(r7)
            if (r3 == 0) goto L_0x0306
            com.google.android.libraries.assistant.auto.ondevice.b.e r2 = r4.f38117m
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x04bb
        L_0x0306:
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250382cA
            boolean r3 = r3.mo79746e(r7)
            if (r3 == 0) goto L_0x031e
            boolean r3 = android.text.TextUtils.equals(r15, r2)
            if (r3 == 0) goto L_0x031e
            com.google.android.libraries.assistant.auto.ondevice.b.p r2 = r4.f38116l
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x04bb
        L_0x031e:
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250364bj
            boolean r3 = r3.mo79746e(r7)
            if (r3 == 0) goto L_0x0348
            boolean r3 = android.text.TextUtils.equals(r14, r2)
            if (r3 != 0) goto L_0x0340
            boolean r3 = android.text.TextUtils.equals(r12, r2)
            if (r3 != 0) goto L_0x0340
            boolean r3 = android.text.TextUtils.equals(r5, r2)
            if (r3 != 0) goto L_0x0340
            boolean r3 = android.text.TextUtils.equals(r10, r2)
            if (r3 == 0) goto L_0x0348
        L_0x0340:
            com.google.android.libraries.assistant.auto.ondevice.b.q r2 = r4.f38114j
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x04bb
        L_0x0348:
            if (r8 != 0) goto L_0x04b9
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250362bh
            boolean r3 = r3.mo79746e(r7)
            if (r3 == 0) goto L_0x04aa
            com.google.android.apps.gsa.search.core.carassistant.f.n r3 = r4.f38119o
            com.google.android.apps.gsa.search.core.i.t r7 = r3.f231793e
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250366bl
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x03a2
            if (r0 == 0) goto L_0x03a2
            dagger.a r7 = r3.f231792d
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r7 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r7
            android.accounts.Account r7 = r7.mo79668a()
            if (r7 == 0) goto L_0x03a2
            boolean r3 = r3.mo79376c()
            if (r3 == 0) goto L_0x0377
            goto L_0x03a2
        L_0x0377:
            java.lang.String r3 = r0.f180935e
            com.google.common.b.gu r7 = com.google.android.apps.gsa.search.core.carassistant.p6784f.C85726n.f231790b
            j$.util.stream.Stream r7 = p3186j$.util.Collection.EL.stream(r7)
            p3186j$.util.Objects.requireNonNull(r3)
            com.google.android.apps.gsa.search.core.carassistant.f.m r8 = new com.google.android.apps.gsa.search.core.carassistant.f.m
            r8.<init>(r3)
            boolean r3 = r7.anyMatch(r8)
            if (r3 != 0) goto L_0x039b
            com.google.common.b.ij r3 = com.google.android.apps.gsa.search.core.carassistant.p6784f.C85726n.f231791c
            java.lang.String r7 = r0.f180932b
            com.google.common.b.qy r3 = (com.google.common.p4522b.C58759qy) r3
            java.lang.Object r3 = r3.f156534a
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x03a2
        L_0x039b:
            com.google.android.libraries.assistant.auto.ondevice.b.z r2 = r4.f38115k
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x03e3
        L_0x03a2:
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f38106b
            com.google.android.apps.gsa.g.c.b r7 = r4.f38118n
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250361bg
            boolean r3 = r3.mo79746e(r8)
            if (r3 != 0) goto L_0x03af
            goto L_0x03e6
        L_0x03af:
            com.google.protobuf.cq r3 = r0.f180933c
            int r3 = r3.size()
            if (r3 == 0) goto L_0x03e6
            java.lang.String r3 = r0.f180932b
            java.lang.String r8 = "Call"
            boolean r8 = r3.equals(r8)
            if (r8 != 0) goto L_0x03cf
            java.lang.String r8 = "CallFollowOn"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x03e6
            boolean r3 = r7.f()
            if (r3 == 0) goto L_0x03e6
        L_0x03cf:
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Dispatched PumpkinTaggerResult to OfflineCallActionBuilder"
            r7 = 43536(0xaa10, float:6.1007E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r3)
            com.google.android.libraries.assistant.auto.ondevice.b.j r2 = r4.f38108d
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
        L_0x03e3:
            r8 = 0
            goto L_0x04bb
        L_0x03e6:
            com.google.android.apps.gsa.search.core.i.t r3 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r7 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250365bk
            boolean r3 = r3.mo79746e(r7)
            if (r3 != 0) goto L_0x03f1
            goto L_0x042c
        L_0x03f1:
            com.google.protobuf.cq r3 = r0.f180933c
            int r3 = r3.size()
            if (r3 == 0) goto L_0x042c
            java.lang.String r3 = r0.f180932b
            java.lang.String r7 = "SendMessage"
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x040b
            java.lang.String r7 = "SendMessageFollowOn"
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L_0x042c
        L_0x040b:
            boolean r3 = r4.mo20222b()
            if (r3 != 0) goto L_0x042c
            boolean r3 = r4.mo20221a(r2)
            if (r3 != 0) goto L_0x042c
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Dispatched PumpkinTaggerResult to OfflineSendMessageBuilder"
            r7 = 43535(0xaa0f, float:6.1006E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r3)
            com.google.android.libraries.assistant.auto.ondevice.b.ac r2 = r4.f38109e
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x03e3
        L_0x042c:
            java.lang.String r3 = "SearchMessage"
            boolean r7 = android.text.TextUtils.equals(r3, r2)
            if (r7 != 0) goto L_0x043a
            boolean r7 = r4.mo20223c(r2)
            if (r7 == 0) goto L_0x0484
        L_0x043a:
            com.google.android.apps.gsa.search.core.i.t r7 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250295aT
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x0484
            boolean r2 = r4.mo20223c(r2)
            if (r2 == 0) goto L_0x046e
            com.google.android.apps.gsa.g.c.b r2 = r4.f38118n
            boolean r7 = r2.b
            if (r7 == 0) goto L_0x046e
            java.lang.String r2 = r2.c
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            if (r2 == 0) goto L_0x046e
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Dispatched PumpkinTaggerResult to OfflineTTRBuilder"
            r7 = 43534(0xaa0e, float:6.1004E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r3)
            com.google.android.libraries.assistant.auto.ondevice.b.ae r2 = r4.f38110f
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x03e3
        L_0x046e:
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Dispatched PumpkinTaggerResult to OfflineVRMBuilder"
            r7 = 43533(0xaa0d, float:6.1003E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r3)
            com.google.android.libraries.assistant.auto.ondevice.b.af r2 = r4.f38123s
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x03e3
        L_0x0484:
            boolean r2 = r4.mo20221a(r2)
            if (r2 == 0) goto L_0x04b8
            com.google.android.apps.gsa.search.core.i.t r2 = r4.f38106b
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250251C
            boolean r2 = r2.mo79746e(r3)
            if (r2 == 0) goto L_0x04b8
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Dispatched PumpkinTaggerResult to OfflineDirectReplyBuilder"
            r7 = 43532(0xaa0c, float:6.1001E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r3)
            com.google.android.libraries.assistant.auto.ondevice.b.n r2 = r4.f38124t
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            goto L_0x03e3
        L_0x04aa:
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "New communication stack is disabled."
            r7 = 43531(0xaa0b, float:6.1E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r7)).mo56386p(r3)
        L_0x04b8:
            r8 = 0
        L_0x04b9:
            com.google.common.base.b r2 = com.google.common.base.C58836b.f156633a
        L_0x04bb:
            boolean r3 = r2.mo56113h()
            if (r3 == 0) goto L_0x04c8
            r4.f38121q = r0
            r4.f38122r = r2
            com.google.common.base.ax r0 = r4.f38122r
            goto L_0x04e4
        L_0x04c8:
            r0 = 1
            int r8 = r8 + r0
            r2 = r17
            r3 = r18
            r7 = r19
            goto L_0x0277
        L_0x04d2:
            r18 = r3
            com.google.common.f.a.d r0 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "No builder can handle this TaggerResult."
            r3 = 43530(0xaa0a, float:6.0999E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x04e4:
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x051a
            com.google.android.libraries.assistant.auto.ondevice.b.c r2 = r1.f38312c
            com.google.speech.grammar.pumpkin.q r2 = r2.f38121q
            com.google.speech.grammar.pumpkin.q r3 = com.google.speech.grammar.pumpkin.C66525q.f180929f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0509
            com.google.common.f.e r2 = com.google.android.libraries.assistant.auto.ondevice.C11926q.f38310a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r6)
            java.lang.String r3 = "HypothesisResult is empty. Please set hypothesisToBeHandled in dispatcher."
            r4 = 43517(0xa9fd, float:6.098E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
        L_0x0509:
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.g.b.a r0 = (com.google.android.apps.gsa.g.b.a) r0
            com.google.android.libraries.assistant.auto.ondevice.b.c r1 = r1.f38312c
            com.google.speech.grammar.pumpkin.q r1 = r1.f38121q
            r2 = r18
            com.google.common.util.concurrent.cx r1 = r0.b(r1, r2)
            goto L_0x0527
        L_0x051a:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            goto L_0x0527
        L_0x0521:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
        L_0x0527:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.C11918i.call():java.lang.Object");
    }
}
