package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.aa */
/* compiled from: PG */
public final /* synthetic */ class C130151aa implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C130158ah f356849a;

    public /* synthetic */ C130151aa(C130158ah ahVar) {
        this.f356849a = ahVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ah r2 = r1.f356849a
            r0 = r17
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.e r0 = (com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e) r0
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.f356856a
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "ResponseLayerFragment"
            r3.mo56378ag(r4, r5)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            r4 = 38749(0x975d, float:5.4299E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            java.lang.Object r4 = r0.f353476a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.b r4 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b) r4
            com.google.assistant.e.j.dy r4 = r4.f350027b
            if (r4 != 0) goto L_0x002a
            com.google.assistant.e.j.dy r4 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x002a:
            java.lang.String r4 = r4.f135936b
            java.lang.Object r6 = r0.f353476a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.b r6 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b) r6
            com.google.android.apps.search.assistant.platform.b.a.d.ao r6 = r6.f350030e
            if (r6 != 0) goto L_0x0036
            com.google.android.apps.search.assistant.platform.b.a.d.ao r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao.f333670e
        L_0x0036:
            com.google.android.apps.search.assistant.platform.b.a.d.cb r6 = r6.f333672a
            if (r6 != 0) goto L_0x003c
            com.google.android.apps.search.assistant.platform.b.a.d.cb r6 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x003c:
            java.lang.String r7 = "onClientOp: %s, interaction id: %s"
            java.lang.String r6 = r6.f333767a
            r3.mo56354G(r7, r4, r6)
            java.lang.Object r3 = r0.f353476a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.b r3 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b) r3
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r4 = r2.f356860D
            r4.getClass()
            com.google.android.apps.search.assistant.platform.b.a.d.cb r6 = r4.f356836a
            com.google.android.apps.search.assistant.platform.b.a.d.ao r7 = r3.f350030e
            if (r7 != 0) goto L_0x0055
            com.google.android.apps.search.assistant.platform.b.a.d.ao r8 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao.f333670e
            goto L_0x0056
        L_0x0055:
            r8 = r7
        L_0x0056:
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = r8.f333672a
            if (r8 != 0) goto L_0x005c
            com.google.android.apps.search.assistant.platform.b.a.d.cb r8 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x005c:
            r4.f356836a = r8
            if (r7 != 0) goto L_0x0062
            com.google.android.apps.search.assistant.platform.b.a.d.ao r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao.f333670e
        L_0x0062:
            java.lang.String r7 = r7.f333674c
            java.lang.String r9 = "conversationId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r9)
            java.lang.String r9 = r4.f356840e
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r7)
            r4.f356840e = r7
            r4 = 1
            r7 = r9 ^ 1
            r9 = 2
            if (r7 == 0) goto L_0x0089
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.au r7 = r2.f356880q
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r10 = r7.f356905f
            p5462h.p5473f.p5475b.C69664n.m101058d(r10)
            int r10 = r10.f356841f
            if (r10 != r9) goto L_0x0089
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r7 = r7.f356905f
            p5462h.p5473f.p5475b.C69664n.m101058d(r7)
            r7.f356841f = r4
        L_0x0089:
            boolean r7 = r8.equals(r6)
            java.lang.String r8 = "feedback.RECORD_FEEDBACK"
            java.lang.String r10 = "ui.KEEP_SCREEN_CONTENTS"
            java.lang.String r11 = "clientOp"
            if (r7 != 0) goto L_0x0174
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.au r7 = r2.f356880q
            com.google.assistant.e.j.dy r13 = r3.f350027b
            if (r13 != 0) goto L_0x009d
            com.google.assistant.e.j.dy r13 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x009d:
            java.lang.String r6 = r6.f333767a
            boolean r6 = r6.isEmpty()
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r11)
            java.lang.String r14 = r13.f135936b
            boolean r14 = p5462h.p5473f.p5475b.C69664n.m101066l(r14, r8)
            java.lang.String r15 = "#DRL: Keep screen content for ClientOp %s"
            if (r14 == 0) goto L_0x00c7
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130171au.f356900a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r14 = new com.google.common.f.n
            r12 = 38764(0x976c, float:5.432E-41)
            r14.<init>(r12)
            r6.mo56379ah(r14)
            r6.mo56389s(r15, r8)
            goto L_0x0122
        L_0x00c7:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r12 = r7.f356905f
            p5462h.p5473f.p5475b.C69664n.m101058d(r12)
            int r12 = r12.f356841f
            if (r12 == r9) goto L_0x0122
            boolean r12 = r7.f356904e
            if (r12 != 0) goto L_0x00f7
            boolean r12 = r7.f356903d
            if (r12 == 0) goto L_0x00f7
            java.lang.String r12 = r13.f135936b
            boolean r12 = p5462h.p5473f.p5475b.C69664n.m101066l(r12, r10)
            if (r12 == 0) goto L_0x00f7
            com.google.common.f.e r6 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130171au.f356900a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.n r12 = new com.google.common.f.n
            r14 = 38763(0x976b, float:5.4319E-41)
            r12.<init>(r14)
            r6.mo56379ah(r12)
            r6.mo56389s(r15, r10)
            goto L_0x0122
        L_0x00f7:
            boolean r12 = r7.f356902c
            if (r12 == 0) goto L_0x011b
            boolean r12 = r7.mo109547c(r13)
            if (r12 == 0) goto L_0x0112
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r12 = r7.f356905f
            p5462h.p5473f.p5475b.C69664n.m101058d(r12)
            boolean r12 = r12.f356838c
            if (r12 != 0) goto L_0x0122
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r12 = r7.f356905f
            p5462h.p5473f.p5475b.C69664n.m101058d(r12)
            r12.f356838c = r4
            goto L_0x011b
        L_0x0112:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r12 = r7.f356905f
            p5462h.p5473f.p5475b.C69664n.m101058d(r12)
            r14 = 0
            r12.f356838c = r14
            goto L_0x011c
        L_0x011b:
            r14 = 0
        L_0x011c:
            if (r6 != 0) goto L_0x0123
            r7.mo109546b()
            goto L_0x0123
        L_0x0122:
            r14 = 0
        L_0x0123:
            r7.f356904e = r14
            boolean r6 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130170at.m212511a(r13)
            if (r6 != 0) goto L_0x0135
            java.lang.String r6 = r13.f135936b
            boolean r6 = p5462h.p5473f.p5475b.C69664n.m101066l(r6, r10)
            if (r6 == 0) goto L_0x0135
            r6 = 1
            goto L_0x0136
        L_0x0135:
            r6 = 0
        L_0x0136:
            r7.f356903d = r6
            boolean r6 = r7.f356902c
            if (r6 == 0) goto L_0x0160
            boolean r6 = r7.mo109547c(r13)
            if (r6 == 0) goto L_0x0160
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r6 = r7.f356901b
            android.view.View r6 = r6.requireView()
            r12 = 2131428792(0x7f0b05b8, float:1.8479238E38)
            android.view.View r6 = r6.findViewById(r12)
            java.lang.String r12 = "null cannot be cast to non-null type com.google.android.apps.search.assistant.surfaces.voice.ui.response.DynamicResponseLayerView"
            p5462h.p5473f.p5475b.C69664n.m101059e(r6, r12)
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.DynamicResponseLayerView r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.DynamicResponseLayerView) r6
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.e r6 = r6.mo17754z()
            r6.mo109609b(r4)
            r7.mo109545a()
        L_0x0160:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.a r6 = r2.f356882s
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.BackNavigationTupleListViewModel r7 = r6.f356845d
            r7.getClass()
            com.google.android.apps.search.assistant.surfaces.voice.d.g.j r6 = r6.f356844c
            com.google.protobuf.z r6 = r6.mo108033a()
            r7.f356832f = r6
            r6 = 0
            r2.mo109538c(r6)
            goto L_0x01ab
        L_0x0174:
            boolean r6 = r2.f356858B
            if (r6 == 0) goto L_0x01ab
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.au r6 = r2.f356880q
            com.google.assistant.e.j.dy r7 = r3.f350027b
            if (r7 != 0) goto L_0x0180
            com.google.assistant.e.j.dy r7 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0180:
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r11)
            boolean r7 = r6.mo109547c(r7)
            if (r7 == 0) goto L_0x01ab
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r7 = r6.f356901b
            android.support.v4.app.FragmentManager r7 = r7.getChildFragmentManager()
            java.lang.String r12 = "fragment.getChildFragmentManager()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r12)
            android.support.v4.app.cc r12 = r7.f634a
            java.lang.String r13 = "chit_chat_query_place_holder"
            android.support.v4.app.Fragment r12 = r12.mo671c(r13)
            if (r12 != 0) goto L_0x01ab
            android.support.v4.app.cc r7 = r7.f634a
            java.lang.String r12 = "CHIT_CHAT_QUERY_FRAGMENT_TAG"
            android.support.v4.app.Fragment r7 = r7.mo671c(r12)
            if (r7 != 0) goto L_0x01ab
            r6.mo109545a()
        L_0x01ab:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r6 = r2.f356866c
            android.support.v4.app.FragmentManager r6 = r6.getChildFragmentManager()
            android.support.v4.app.cc r6 = r6.f634a
            java.lang.String r7 = "ResponseErrorFragment"
            android.support.v4.app.Fragment r6 = r6.mo671c(r7)
            if (r6 == 0) goto L_0x01cc
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r7 = r2.f356866c
            android.support.v4.app.FragmentManager r7 = r7.getChildFragmentManager()
            android.support.v4.app.a r12 = new android.support.v4.app.a
            r12.<init>((android.support.p031v4.app.FragmentManager) r7)
            r12.mo516m(r6)
            r12.mo509f()
        L_0x01cc:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r6 = r2.f356866c
            android.support.v4.app.FragmentManager r6 = r6.getChildFragmentManager()
            android.support.v4.app.cc r6 = r6.f634a
            r7 = 2131428800(0x7f0b05c0, float:1.8479255E38)
            android.support.v4.app.Fragment r6 = r6.mo670b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.e.c r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9876e.C130253c) r6
            if (r6 == 0) goto L_0x01fd
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.e.h r6 = r6.mo17754z()
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.e.c r6 = r6.f357098b
            android.support.v4.app.FragmentManager r6 = r6.getChildFragmentManager()
            android.support.v4.app.cc r6 = r6.f634a
            r7 = 2131428802(0x7f0b05c2, float:1.8479259E38)
            android.support.v4.app.Fragment r6 = r6.mo670b(r7)
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.b r6 = (com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.C128582b) r6
            if (r6 == 0) goto L_0x01fd
            com.google.android.apps.search.assistant.surfaces.voice.shared.ui.c.k r6 = r6.mo17754z()
            r6.mo108537g()
        L_0x01fd:
            com.google.assistant.e.j.dy r6 = r3.f350027b
            if (r6 != 0) goto L_0x0203
            com.google.assistant.e.j.dy r6 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0203:
            java.lang.String r6 = r6.f135936b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r7 = r3.f350028c
            if (r7 != 0) goto L_0x020b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r7 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j.f355890c
        L_0x020b:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r12 = r2.f356866c
            android.support.v4.app.FragmentManager r12 = r12.getChildFragmentManager()
            int r13 = r7.f355893b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r13 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.m211713a(r13)
            if (r13 != 0) goto L_0x021b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r13 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.DEFAULT_NOT_VISIBLE
        L_0x021b:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r14 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.ESCAPE_HATCH
            boolean r13 = r13.equals(r14)
            if (r13 == 0) goto L_0x0229
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.ah r0 = r2.f356872i
            r0.mo109105a(r7)
            return
        L_0x0229:
            java.lang.String r13 = "ui.SHOW_SUGGESTIONS"
            boolean r13 = r6.equals(r13)
            r14 = 0
            if (r13 == 0) goto L_0x029c
            android.support.v4.app.cc r4 = r12.f634a
            r5 = 2131429045(0x7f0b06b5, float:1.8479752E38)
            android.support.v4.app.Fragment r4 = r4.mo670b(r5)
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.uielements.suggestion.i r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129320i) r4
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r14)
            com.google.assistant.e.j.dy r3 = r3.f350027b
            if (r3 != 0) goto L_0x0247
            com.google.assistant.e.j.dy r3 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0247:
            com.google.assistant.e.j.e.gl r5 = com.google.assistant.p3897e.p3921j.p3926e.C51986gl.f136421f
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.w r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.response.w
            r6.<init>(r4)
            java.lang.String r4 = "show_suggestions_args"
            com.google.assistant.e.j.ec r3 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b.m208357a(r3, r4, r5, r6)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.b r0 = r2.f356863G
            if (r0 == 0) goto L_0x0296
            boolean r3 = r0.f355671b
            if (r3 != 0) goto L_0x0264
            goto L_0x0296
        L_0x0264:
            java.util.HashSet r3 = r0.f355672c
            java.lang.String r4 = "KEY_SUGGESTIONS"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0287
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.C129584b.f355670a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r3 = new com.google.common.f.n
            r5 = 38362(0x95da, float:5.3757E-41)
            r3.<init>(r5)
            r0.mo56379ah(r3)
            java.lang.String r3 = "Try to add %s key that was added before"
            r0.mo56389s(r3, r4)
            goto L_0x0296
        L_0x0287:
            java.util.HashSet r3 = r0.f355673d
            r3.toString()
            java.util.HashSet r3 = r0.f355672c
            r3.add(r4)
            java.util.HashSet r0 = r0.f355673d
            r0.add(r4)
        L_0x0296:
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x029c:
            java.lang.String r13 = "ui.HIGHLIGHT_USER_QUERY"
            boolean r13 = r6.equals(r13)
            if (r13 == 0) goto L_0x02c8
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r14)
            com.google.assistant.e.j.dy r3 = r3.f350027b
            if (r3 != 0) goto L_0x02ae
            com.google.assistant.e.j.dy r3 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x02ae:
            com.google.assistant.e.j.a.n r4 = com.google.assistant.p3897e.p3921j.p3922a.C51656n.f134597e
            com.google.protobuf.eb r4 = r4.getParserForType()
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.x r5 = new com.google.android.apps.search.assistant.surfaces.voice.ui.response.x
            r5.<init>(r2)
            java.lang.String r6 = "highlight_user_query_args"
            com.google.assistant.e.j.ec r3 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b.m208357a(r3, r6, r4, r5)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x02c8:
            boolean r8 = r6.equals(r8)
            if (r8 == 0) goto L_0x02fc
            android.support.v4.app.cc r4 = r12.f634a
            java.lang.String r5 = "FEEDBACK_FRAGMENT_TAG"
            android.support.v4.app.Fragment r4 = r4.mo671c(r5)
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.d.b r4 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.p9875d.C130235b) r4
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r14)
            com.google.assistant.e.j.dy r3 = r3.f350027b
            if (r3 != 0) goto L_0x02e2
            com.google.assistant.e.j.dy r3 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x02e2:
            com.google.assistant.e.j.hb r5 = com.google.assistant.p3897e.p3921j.C52150hb.f136843e
            com.google.protobuf.eb r5 = r5.getParserForType()
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.y r6 = new com.google.android.apps.search.assistant.surfaces.voice.ui.response.y
            r6.<init>(r4)
            java.lang.String r4 = "feedback_completion_args"
            com.google.assistant.e.j.ec r3 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127405b.m208357a(r3, r4, r5, r6)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x02fc:
            boolean r8 = r6.equals(r10)
            if (r8 == 0) goto L_0x0329
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.au r4 = r2.f356880q
            com.google.assistant.e.j.dy r3 = r3.f350027b
            if (r3 != 0) goto L_0x030a
            com.google.assistant.e.j.dy r3 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x030a:
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r11)
            boolean r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130170at.m212511a(r3)
            if (r3 == 0) goto L_0x031a
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResponseInfoViewModel r3 = r4.f356905f
            p5462h.p5473f.p5475b.C69664n.m101058d(r3)
            r3.f356841f = r9
        L_0x031a:
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r14)
            com.google.assistant.e.j.ec r3 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c.f350821b
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x0329:
            java.lang.String r3 = "ui.RESET_FOCUS"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0342
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r14)
            com.google.assistant.e.j.ec r3 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c.f350821b
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResetFocusViewModel r0 = r2.f356862F
            r0.getClass()
            r0.f356835a = r4
            return
        L_0x0342:
            java.lang.String r3 = "ui.EXIT_NATIVE_FORM"
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x035d
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.au r3 = r2.f356880q
            r3.f356904e = r4
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r14)
            com.google.assistant.e.j.ec r3 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c.f350821b
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x035d:
            com.google.common.b.hd r3 = r2.f356869f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0520
            java.lang.Object r3 = r0.f353476a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.b r3 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b) r3
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r6 = r0.mo108513b(r14)
            com.google.assistant.e.j.dy r0 = r3.f350027b
            if (r0 != 0) goto L_0x0373
            com.google.assistant.e.j.dy r0 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0373:
            java.lang.String r3 = r0.f135936b
            com.google.common.f.e r7 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.f356856a
            com.google.common.f.x r7 = r7.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r7.mo56378ag(r8, r5)
            java.lang.String r8 = "processClientOpRequest : %s"
            r10 = 38751(0x975f, float:5.4302E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r10)).mo56389s(r8, r3)
            com.google.common.b.hd r7 = r2.f356869f     // Catch:{ all -> 0x04fd }
            java.lang.Object r7 = r7.get(r3)     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.c r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.C129146c) r7     // Catch:{ all -> 0x04fd }
            if (r7 != 0) goto L_0x03b8
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.f356856a     // Catch:{ all -> 0x04fd }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x04fd }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x04fd }
            r0.mo56378ag(r4, r5)     // Catch:{ all -> 0x04fd }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x04fd }
            r4 = 38754(0x9762, float:5.4306E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ all -> 0x04fd }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x04fd }
            java.lang.String r4 = "Ignoring ClientOp as handler not found : %s"
            r0.mo56389s(r4, r3)     // Catch:{ all -> 0x04fd }
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND     // Catch:{ all -> 0x04fd }
            com.google.assistant.e.j.ec r0 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c.m208359a(r0)     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r6, r0)     // Catch:{ all -> 0x04fd }
            goto L_0x051a
        L_0x03b8:
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.e r7 = r7.mo108791a(r0)     // Catch:{ all -> 0x04fd }
            android.support.v4.app.Fragment r8 = r7.f354976d     // Catch:{ all -> 0x04fd }
            if (r8 == 0) goto L_0x04f7
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResetFocusViewModel r10 = r2.f356862F     // Catch:{ all -> 0x04fd }
            r10.getClass()
            boolean r10 = r10.f356835a     // Catch:{ all -> 0x04fd }
            if (r10 == 0) goto L_0x03f1
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.f356856a     // Catch:{ all -> 0x04fd }
            com.google.common.f.x r10 = r10.mo56224b()     // Catch:{ all -> 0x04fd }
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x04fd }
            r10.mo56378ag(r12, r5)     // Catch:{ all -> 0x04fd }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x04fd }
            r12 = 38753(0x9761, float:5.4305E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r12)     // Catch:{ all -> 0x04fd }
            com.google.common.f.c r10 = (com.google.common.p4526f.C59052c) r10     // Catch:{ all -> 0x04fd }
            java.lang.String r12 = "RESET_FOCUS clear screen content before %s"
            r10.mo56389s(r12, r3)     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.au r3 = r2.f356880q     // Catch:{ all -> 0x04fd }
            r3.mo109546b()     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ResetFocusViewModel r3 = r2.f356862F     // Catch:{ all -> 0x04fd }
            r3.getClass()
            r10 = 0
            r3.f356835a = r10     // Catch:{ all -> 0x04fd }
        L_0x03f1:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r3 = r2.f356866c     // Catch:{ all -> 0x04fd }
            android.support.v4.app.FragmentManager r3 = r3.getChildFragmentManager()     // Catch:{ all -> 0x04fd }
            android.support.v4.app.a r10 = new android.support.v4.app.a     // Catch:{ all -> 0x04fd }
            r10.<init>((android.support.p031v4.app.FragmentManager) r3)     // Catch:{ all -> 0x04fd }
            r3 = 2130771989(0x7f010015, float:1.7147084E38)
            r12 = 2130771990(0x7f010016, float:1.7147086E38)
            r13 = 0
            r10.mo691x(r3, r12, r13, r13)     // Catch:{ all -> 0x04fd }
            java.lang.String r3 = r7.f354977e     // Catch:{ all -> 0x04fd }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x04fd }
            if (r3 != 0) goto L_0x0411
            java.lang.String r14 = r7.f354977e     // Catch:{ all -> 0x04fd }
            goto L_0x0423
        L_0x0411:
            android.support.v4.app.Fragment r3 = r7.f354976d     // Catch:{ all -> 0x04fd }
            if (r3 == 0) goto L_0x0423
            java.lang.String r12 = r3.getTag()     // Catch:{ all -> 0x04fd }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x04fd }
            if (r12 != 0) goto L_0x0423
            java.lang.String r14 = r3.getTag()     // Catch:{ all -> 0x04fd }
        L_0x0423:
            r3 = 2131428798(0x7f0b05be, float:1.847925E38)
            r10.mo511h(r3, r8, r14, r4)     // Catch:{ all -> 0x04fd }
            r10.mo509f()     // Catch:{ all -> 0x04fd }
            com.google.assistant.e.j.ec r7 = r7.f354975c     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.f r10 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f.f350033d     // Catch:{ all -> 0x04fd }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.e r10 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e) r10     // Catch:{ all -> 0x04fd }
            r10.copyOnWrite()     // Catch:{ all -> 0x04fd }
            com.google.protobuf.bv r12 = r10.instance     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.f r12 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f) r12     // Catch:{ all -> 0x04fd }
            r7.getClass()     // Catch:{ all -> 0x04fd }
            r12.f350036b = r7     // Catch:{ all -> 0x04fd }
            int r7 = r12.f350035a     // Catch:{ all -> 0x04fd }
            r7 = r7 | r4
            r12.f350035a = r7     // Catch:{ all -> 0x04fd }
            com.google.android.libraries.f.a r7 = r2.f356884u     // Catch:{ all -> 0x04fd }
            long r12 = r7.mo26872d()     // Catch:{ all -> 0x04fd }
            r10.copyOnWrite()     // Catch:{ all -> 0x04fd }
            com.google.protobuf.bv r7 = r10.instance     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.f r7 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f) r7     // Catch:{ all -> 0x04fd }
            int r14 = r7.f350035a     // Catch:{ all -> 0x04fd }
            r14 = r14 | r9
            r7.f350035a = r14     // Catch:{ all -> 0x04fd }
            r7.f350037c = r12     // Catch:{ all -> 0x04fd }
            com.google.protobuf.bv r7 = r10.build()     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.f r7 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f) r7     // Catch:{ all -> 0x04fd }
            r6.mo108511a(r7)     // Catch:{ all -> 0x04fd }
            boolean r7 = r2.f356888y     // Catch:{ all -> 0x04fd }
            if (r7 == 0) goto L_0x04ce
            boolean r7 = r8 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g     // Catch:{ all -> 0x04fd }
            if (r7 == 0) goto L_0x04ce
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x04fd }
            r7.<init>()     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r8 = r2.f356866c     // Catch:{ all -> 0x04fd }
            android.support.v4.app.FragmentManager r8 = r8.getChildFragmentManager()     // Catch:{ all -> 0x04fd }
            android.support.v4.app.cc r8 = r8.f634a     // Catch:{ all -> 0x04fd }
            java.util.List r8 = r8.mo677i()     // Catch:{ all -> 0x04fd }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x04fd }
        L_0x0481:
            boolean r10 = r8.hasNext()     // Catch:{ all -> 0x04fd }
            if (r10 == 0) goto L_0x0497
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x04fd }
            android.support.v4.app.Fragment r10 = (android.support.p031v4.app.Fragment) r10     // Catch:{ all -> 0x04fd }
            int r12 = r10.getId()     // Catch:{ all -> 0x04fd }
            if (r12 != r3) goto L_0x0481
            r7.add(r10)     // Catch:{ all -> 0x04fd }
            goto L_0x0481
        L_0x0497:
            int r3 = r7.size()     // Catch:{ all -> 0x04fd }
            if (r3 >= r9) goto L_0x049e
            goto L_0x04ce
        L_0x049e:
            r3 = 0
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x04fd }
            android.support.v4.app.Fragment r3 = (android.support.p031v4.app.Fragment) r3     // Catch:{ all -> 0x04fd }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ all -> 0x04fd }
            android.support.v4.app.Fragment r7 = (android.support.p031v4.app.Fragment) r7     // Catch:{ all -> 0x04fd }
            boolean r8 = r3 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.p9808a.C129288b     // Catch:{ all -> 0x04fd }
            if (r8 == 0) goto L_0x04ce
            boolean r3 = r3.isVisible()     // Catch:{ all -> 0x04fd }
            if (r3 == 0) goto L_0x04ce
            boolean r3 = r7 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g     // Catch:{ all -> 0x04fd }
            if (r3 == 0) goto L_0x04ce
            r3 = 8
            r2.mo109538c(r3)     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.g r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9803f.C129244g) r7     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.o r3 = r7.mo17754z()     // Catch:{ all -> 0x04fd }
            r3.mo108933c(r4)     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.f.o r3 = r7.mo17754z()     // Catch:{ all -> 0x04fd }
            r3.mo108932b(r4)     // Catch:{ all -> 0x04fd }
        L_0x04ce:
            boolean r3 = r2.f356858B     // Catch:{ all -> 0x04fd }
            if (r3 == 0) goto L_0x051a
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.au r3 = r2.f356880q     // Catch:{ all -> 0x04fd }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)     // Catch:{ all -> 0x04fd }
            boolean r0 = r3.mo109547c(r0)     // Catch:{ all -> 0x04fd }
            if (r0 == 0) goto L_0x051a
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.r r0 = r3.f356901b     // Catch:{ all -> 0x04fd }
            android.view.View r0 = r0.requireView()     // Catch:{ all -> 0x04fd }
            r3 = 2131428803(0x7f0b05c3, float:1.847926E38)
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.ContentScrollView r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.ContentScrollView) r0     // Catch:{ all -> 0x04fd }
            if (r0 == 0) goto L_0x051a
            r3 = 130(0x82, float:1.82E-43)
            r0.fullScroll(r3)     // Catch:{ all -> 0x04fd }
            r0.requestLayout()     // Catch:{ all -> 0x04fd }
            goto L_0x051a
        L_0x04f7:
            com.google.assistant.e.j.ec r0 = r7.f354975c     // Catch:{ all -> 0x04fd }
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r6, r0)     // Catch:{ all -> 0x04fd }
            goto L_0x051a
        L_0x04fd:
            r0 = move-exception
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.f356856a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Error while processing client op."
            r5 = 38752(0x9760, float:5.4303E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
            com.google.assistant.e.j.kf r0 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            com.google.assistant.e.j.ec r0 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c.m208359a(r0)
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r6, r0)
        L_0x051a:
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x0520:
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.n r3 = r2.f356874k
            java.lang.String r5 = "clientOpName"
            p5462h.p5473f.p5475b.C69664n.m101061g(r6, r5)
            java.util.Map r3 = r3.f357126b
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x05b4
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.n r3 = r2.f356874k
            java.lang.String r5 = "event"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r5)
            java.lang.Object r5 = r0.f353476a
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.b r5 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127122b) r5
            com.google.assistant.e.j.dy r6 = r5.f350027b
            if (r6 != 0) goto L_0x0540
            com.google.assistant.e.j.dy r6 = com.google.assistant.p3897e.p3921j.C51809dy.f135933f
        L_0x0540:
            java.lang.String r6 = r6.f135936b
            java.lang.String r7 = "request.data.clientOpName"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference
            r7.<init>(r14)
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.m r8 = new com.google.android.apps.search.assistant.surfaces.voice.ui.response.m
            r8.<init>(r7)
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r8)
            java.util.Map r8 = r3.f357126b
            java.lang.Object r8 = r8.get(r6)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.a.f r8 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9518a.C126928f) r8
            if (r8 != 0) goto L_0x059e
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130277n.f357125a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 38741(0x9755, float:5.4288E-41)
            r4.<init>(r5)
            r3.mo56379ah(r4)
            java.lang.String r4 = "No prefetcher to handle %s"
            r3.mo56389s(r4, r6)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.f r3 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127126f.f350033d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.e r3 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9535a.C127125e) r3
            java.lang.String r4 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.h r3 = p5462h.p5473f.p5475b.C69664n.m101061g(r3, "builder")
            com.google.assistant.e.j.kf r4 = com.google.assistant.p3897e.p3921j.C52235kf.INTERNAL
            com.google.assistant.e.j.ec r4 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64578b(r4)
            java.lang.String r5 = "error(Status.INTERNAL)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            r3.mo107954b(r4)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.b.a.f r3 = r3.mo107953a()
            r0.mo108511a(r3)
            goto L_0x05ae
        L_0x059e:
            kotlinx.coroutines.aw r3 = r3.f357127c
            kotlinx.coroutines.ay r6 = kotlinx.coroutines.C71424ay.UNDISPATCHED
            com.google.android.apps.search.assistant.surfaces.voice.ui.response.l r9 = new com.google.android.apps.search.assistant.surfaces.voice.ui.response.l
            r9.<init>(r8, r5, r0, r14)
            kotlinx.coroutines.cp r0 = kotlinx.coroutines.C71803m.m105043d(r3, r14, r6, r9, r4)
            r7.set(r0)
        L_0x05ae:
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x05b4:
            int r3 = r7.f355893b
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.m211713a(r3)
            if (r3 != 0) goto L_0x05be
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r3 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.DEFAULT_NOT_VISIBLE
        L_0x05be:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r4 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.RESPONSE
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x05d5
            com.google.android.apps.search.assistant.surfaces.voice.shared.a.d r0 = r0.mo108513b(r14)
            com.google.assistant.e.j.ec r3 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c.f350821b
            com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130158ah.m212490g(r0, r3)
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.a r0 = r2.f356871h
            r0.mo108800b()
            return
        L_0x05d5:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.ah r0 = r2.f356872i
            r0.mo109105a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.C130151aa.accept(java.lang.Object):void");
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
