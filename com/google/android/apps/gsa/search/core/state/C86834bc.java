package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.bc */
/* compiled from: PG */
public final class C86834bc implements C87143ik {

    /* renamed from: a */
    private final C86833bb f234540a;

    /* renamed from: b */
    private final C86842bk f234541b;

    /* renamed from: c */
    private final C86842bk f234542c;

    /* renamed from: d */
    private final C86842bk f234543d;

    /* renamed from: e */
    private final C86842bk f234544e;

    /* renamed from: f */
    private final C86842bk f234545f;

    /* renamed from: g */
    private final C86842bk f234546g;

    public C86834bc(C86833bb bbVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f234540a = bbVar;
        this.f234541b = new C86842bk(aVar);
        this.f234542c = new C86842bk(aVar2);
        this.f234543d = new C86842bk(aVar3);
        this.f234544e = new C86842bk(aVar4);
        this.f234545f = new C86842bk(aVar5);
        this.f234546g = new C86842bk(aVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234540a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0102, code lost:
        if (com.google.android.apps.gsa.search.core.state.C87171z.m140903O(r0) != false) goto L_0x0112;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0307  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234541b
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234542c
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234543d
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234544e
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234545f
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234546g
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r1 = r0.f234541b
            boolean r2 = r1.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234542c
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234543d
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234544e
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234545f
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x0046
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234546g
            boolean r2 = r2.f234552a
            if (r2 == 0) goto L_0x0309
        L_0x0046:
            com.google.android.apps.gsa.search.core.state.bb r2 = r0.f234540a
            com.google.android.apps.gsa.search.core.state.bk r3 = r0.f234542c
            com.google.android.apps.gsa.search.core.state.bk r4 = r0.f234543d
            com.google.android.apps.gsa.search.core.state.bk r5 = r0.f234544e
            com.google.android.apps.gsa.search.core.state.bk r6 = r0.f234545f
            com.google.android.apps.gsa.search.core.state.bk r7 = r0.f234546g
            com.google.android.apps.gsa.search.core.state.dw r8 = r5.mo80533a()
            com.google.android.apps.gsa.search.core.state.z r8 = (com.google.android.apps.gsa.search.core.state.C87171z) r8
            com.google.android.apps.gsa.search.core.state.dw r9 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r9 = (com.google.android.apps.gsa.search.core.state.C87052fn) r9
            com.google.android.apps.gsa.search.core.state.dw r10 = r6.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r10 = (com.google.android.apps.gsa.search.core.state.C86812ai) r10
            com.google.android.apps.gsa.search.shared.service.ClientConfig r10 = r10.f234471a
            java.lang.String r11 = r10.f236953f
            java.lang.String r12 = "transcription"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0072
            goto L_0x0309
        L_0x0072:
            boolean r11 = r2.f234529g
            boolean r12 = r2.f234530h
            boolean r13 = r2.mo80530b()
            boolean r14 = r9.mo80458S()
            boolean r15 = r2.f234531i
            boolean r0 = r3.f234552a
            r16 = 0
            r17 = 1
            if (r0 != 0) goto L_0x008c
            boolean r0 = r5.f234552a
            if (r0 == 0) goto L_0x009f
        L_0x008c:
            if (r14 == 0) goto L_0x0094
            boolean r0 = r9.mo80455H()
            if (r0 != 0) goto L_0x009a
        L_0x0094:
            boolean r0 = r8.mo80799af()
            if (r0 == 0) goto L_0x009c
        L_0x009a:
            r0 = 1
            goto L_0x009d
        L_0x009c:
            r0 = 0
        L_0x009d:
            r2.f234529g = r0
        L_0x009f:
            boolean r0 = r3.f234552a
            if (r0 != 0) goto L_0x00af
            boolean r0 = r4.f234552a
            if (r0 != 0) goto L_0x00af
            boolean r0 = r5.f234552a
            if (r0 != 0) goto L_0x00af
            boolean r0 = r7.f234552a
            if (r0 == 0) goto L_0x0115
        L_0x00af:
            com.google.android.apps.gsa.search.core.state.dw r0 = r4.mo80533a()
            com.google.android.apps.gsa.search.core.state.TtsState r0 = (com.google.android.apps.gsa.search.core.state.TtsState) r0
            boolean r0 = r0.mo80421v()
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.f234530h
            if (r0 == 0) goto L_0x0105
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r0 = r8.mo80807f()
            if (r0 == 0) goto L_0x0105
            boolean r4 = r0.mo81082u()
            if (r4 == 0) goto L_0x0105
            com.google.android.apps.gsa.search.shared.actions.util.CardDecision r4 = r8.mo80808g()
            boolean r4 = r4.f236255i
            if (r4 == 0) goto L_0x0105
            com.google.android.apps.gsa.search.shared.actions.modular.ModularAction r0 = (com.google.android.apps.gsa.search.shared.actions.modular.ModularAction) r0
            com.google.bb.a.nl r4 = r0.mo81219Z()
            if (r4 != 0) goto L_0x00dc
            goto L_0x0105
        L_0x00dc:
            com.google.bb.a.nl r0 = r0.mo81219Z()
            com.google.bb.a.le r4 = r0.f145694d
            if (r4 != 0) goto L_0x00e6
            com.google.bb.a.le r4 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x00e6:
            boolean r4 = com.google.android.apps.gsa.search.core.state.C87171z.m140903O(r4)
            if (r4 != 0) goto L_0x0112
            com.google.bb.a.le r4 = r0.f145695e
            if (r4 != 0) goto L_0x00f2
            com.google.bb.a.le r4 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x00f2:
            boolean r4 = com.google.android.apps.gsa.search.core.state.C87171z.m140903O(r4)
            if (r4 != 0) goto L_0x0112
            com.google.bb.a.le r0 = r0.f145697g
            if (r0 != 0) goto L_0x00fe
            com.google.bb.a.le r0 = com.google.p4152bb.p4153a.C55244le.f145466h
        L_0x00fe:
            boolean r0 = com.google.android.apps.gsa.search.core.state.C87171z.m140903O(r0)
            if (r0 == 0) goto L_0x0105
            goto L_0x0112
        L_0x0105:
            com.google.android.apps.gsa.search.core.state.dw r0 = r7.mo80533a()
            com.google.android.apps.gsa.search.core.state.eq r0 = (com.google.android.apps.gsa.search.core.state.C87023eq) r0
            boolean r0 = r0.f235025F
            if (r0 == 0) goto L_0x0110
            goto L_0x0112
        L_0x0110:
            r0 = 0
            goto L_0x0113
        L_0x0112:
            r0 = 1
        L_0x0113:
            r2.f234530h = r0
        L_0x0115:
            boolean r0 = r3.f234552a
            if (r0 == 0) goto L_0x013f
            com.google.android.apps.gsa.shared.search.Query r0 = r9.f235177m
            boolean r0 = r0.mo84337bV()
            if (r0 == 0) goto L_0x0133
            com.google.android.apps.gsa.shared.search.Query r0 = r9.f235177m
            boolean r0 = r0.mo84412cs()
            if (r0 != 0) goto L_0x0133
            com.google.android.apps.gsa.shared.search.Query r0 = r9.f235177m
            boolean r0 = r0.mo84324bI()
            if (r0 != 0) goto L_0x0133
            r0 = 1
            goto L_0x0134
        L_0x0133:
            r0 = 0
        L_0x0134:
            r2.f234531i = r0
            if (r0 == 0) goto L_0x013f
            if (r15 != 0) goto L_0x013f
            com.google.android.apps.gsa.search.core.al.k.b r0 = r2.f234526d
            r0.mo79027a()
        L_0x013f:
            com.google.android.apps.gsa.search.core.i.t r0 = r2.f234527e
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250421cn
            boolean r0 = r0.mo79746e(r4)
            if (r0 == 0) goto L_0x0155
            boolean r0 = r10.mo81898p()
            if (r0 != 0) goto L_0x0277
            boolean r0 = r10.mo81901s()
            if (r0 != 0) goto L_0x0277
        L_0x0155:
            boolean r0 = r6.f234552a
            if (r0 != 0) goto L_0x0163
            boolean r0 = r3.f234552a
            if (r0 != 0) goto L_0x0163
            boolean r0 = r2.mo80530b()
            if (r13 == r0) goto L_0x0277
        L_0x0163:
            com.google.android.apps.gsa.search.core.state.dw r0 = r6.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r0 = (com.google.android.apps.gsa.search.core.state.C86812ai) r0
            com.google.android.libraries.search.c.e r3 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_AUDIO
            com.google.android.libraries.search.c.d r4 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE
            dagger.a r5 = r2.f234524b
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r5 = (com.google.android.apps.gsa.search.core.state.C87052fn) r5
            com.google.android.apps.gsa.shared.search.Query r5 = r5.f235177m
            com.google.android.libraries.search.c.d r7 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_BVRA
            com.google.android.apps.gsa.search.shared.service.ClientConfig r8 = r0.f234471a
            com.google.common.o.amo r8 = r8.f236951d
            com.google.common.o.amo r9 = com.google.common.p4552o.amo.SPEAKER_ID_ENROLLMENT
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L_0x018d
            com.google.common.o.amo r9 = com.google.common.p4552o.amo.TI_SID_ENROLLMENT
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x018f
        L_0x018d:
            com.google.android.libraries.search.c.e r3 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_BLUETOOTH
        L_0x018f:
            boolean r8 = r2.mo80530b()
            r9 = 0
            if (r8 == 0) goto L_0x025f
            long r3 = r2.f234532j
            long r14 = r5.f252780s
            int r8 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x01bb
            dagger.a r3 = r2.f234524b
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.state.fn r3 = (com.google.android.apps.gsa.search.core.state.C87052fn) r3
            boolean r3 = r3.mo80691L(r5)
            if (r3 == 0) goto L_0x01bb
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.state.C86833bb.f234523a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r3 = "Attempting to reopen route for a cancelled query. Dropping route request."
            r4 = 8658(0x21d2, float:1.2132E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r3)
            goto L_0x0277
        L_0x01bb:
            com.google.android.apps.gsa.search.core.al.k.b r3 = r2.f234526d
            r3.mo79032h(r5)
            boolean r3 = r5.mo84338bW()
            if (r3 != 0) goto L_0x0277
            boolean r3 = r5.mo84328bM()
            if (r3 != 0) goto L_0x0277
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.f234471a
            boolean r0 = r0.mo81872B()
            if (r0 == 0) goto L_0x01d9
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_BLUETOOTH
            com.google.android.libraries.search.c.d r3 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE
            goto L_0x01ef
        L_0x01d9:
            dagger.a r0 = r2.f234525c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.m.b.f r0 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r0
            boolean r0 = r0.mo83869aF()
            if (r0 == 0) goto L_0x01eb
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_PREFERRED
            r3 = r7
            goto L_0x01ef
        L_0x01eb:
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_BLUETOOTH
            com.google.android.libraries.search.c.d r3 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_ANY
        L_0x01ef:
            com.google.common.base.ax r4 = r2.f234528f
            boolean r4 = r4.mo56113h()
            if (r4 == 0) goto L_0x0219
            com.google.common.base.ax r4 = r2.f234528f
            java.lang.Object r4 = r4.mo56107c()
            com.google.android.apps.gsa.nga.api.bx r4 = (com.google.android.apps.gsa.nga.api.C74720bx) r4
            com.google.android.apps.gsa.nga.api.NgaState r4 = r4.mo71089f()
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x0219
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_BLUETOOTH
            com.google.android.libraries.search.c.d r3 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE
            java.lang.String r4 = "android.opa.extra.SUPPRESS_OPA_UI"
            boolean r4 = r5.mo84363bw(r4)
            if (r4 == 0) goto L_0x0229
            r4 = r3
            r3 = r0
            r0 = 0
            goto L_0x0255
        L_0x0219:
            boolean r4 = r5.mo84366bz()
            if (r4 == 0) goto L_0x022d
            boolean r4 = r5.mo84336bU()
            if (r4 == 0) goto L_0x022d
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_AUDIO
            com.google.android.libraries.search.c.d r3 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE
        L_0x0229:
            r4 = r3
            r3 = r0
        L_0x022b:
            r0 = 1
            goto L_0x0255
        L_0x022d:
            boolean r4 = r5.mo84369cB()
            if (r4 != 0) goto L_0x024b
            boolean r4 = r5.mo84463dq()
            if (r4 != 0) goto L_0x024b
            boolean r4 = r5.mo84366bz()
            if (r4 == 0) goto L_0x0240
            goto L_0x024b
        L_0x0240:
            boolean r4 = r5.mo84450de()
            if (r4 == 0) goto L_0x0229
            com.google.android.libraries.search.c.e r0 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_BLUETOOTH_REQUIRED
            r3 = r0
            r4 = r7
            goto L_0x022b
        L_0x024b:
            boolean r0 = r5.mo84369cB()
            r0 = r0 ^ 1
            com.google.android.libraries.search.c.e r3 = com.google.android.libraries.search.p2904c.C37520e.ROUTE_NO_BLUETOOTH
            com.google.android.libraries.search.c.d r4 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE
        L_0x0255:
            com.google.android.libraries.search.c.d r7 = com.google.android.libraries.search.p2904c.C37478d.CONNECTION_TYPE_NONE
            if (r4 == r7) goto L_0x0260
            com.google.android.apps.gsa.search.core.state.ba r9 = new com.google.android.apps.gsa.search.core.state.ba
            r9.<init>(r2, r5)
            goto L_0x0260
        L_0x025f:
            r0 = 1
        L_0x0260:
            com.google.android.libraries.search.c.e r5 = r2.f234533k
            if (r3 != r5) goto L_0x026c
            com.google.android.libraries.search.c.d r5 = r2.f234534l
            if (r4 != r5) goto L_0x026c
            boolean r5 = r2.f234535m
            if (r5 == r0) goto L_0x0277
        L_0x026c:
            r2.f234533k = r3
            r2.f234534l = r4
            r2.f234535m = r0
            com.google.android.apps.gsa.search.core.al.k.b r5 = r2.f234526d
            r5.mo79033i(r3, r4, r9, r0)
        L_0x0277:
            boolean r0 = r2.f234529g
            if (r11 != r0) goto L_0x027f
            boolean r0 = r2.f234530h
            if (r12 == r0) goto L_0x0281
        L_0x027f:
            r16 = 1
        L_0x0281:
            boolean r0 = r6.f234552a
            if (r0 == 0) goto L_0x02ac
            com.google.android.apps.gsa.search.core.state.dw r0 = r6.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r0 = (com.google.android.apps.gsa.search.core.state.C86812ai) r0
            long r3 = r0.f234472b
            long r7 = r2.f234536n
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x02ac
            r2.f234536n = r3
            com.google.android.apps.gsa.search.core.al.k.b r0 = r2.f234526d
            r0.mo79034j()
            com.google.android.apps.gsa.search.core.al.k.b r0 = r2.f234526d
            com.google.android.apps.gsa.search.core.state.dw r3 = r6.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r3 = (com.google.android.apps.gsa.search.core.state.C86812ai) r3
            com.google.android.apps.gsa.search.shared.service.ClientConfig r3 = r3.f234471a
            boolean r3 = r3.mo81901s()
            r0.mo79031g(r3)
            goto L_0x02ae
        L_0x02ac:
            r17 = r16
        L_0x02ae:
            boolean r0 = r1.f234552a
            if (r0 == 0) goto L_0x02d6
            com.google.android.apps.gsa.search.core.state.dw r0 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.al r0 = (com.google.android.apps.gsa.search.core.state.C86815al) r0
            long r3 = r0.f234493a
            boolean r0 = r2.mo80530b()
            if (r0 == 0) goto L_0x02d6
            if (r13 == 0) goto L_0x02d6
            long r5 = r2.f234537o
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x02d6
            com.google.android.apps.gsa.search.core.al.k.b r0 = r2.f234526d
            r0.mo79029e(r3)
            com.google.android.apps.gsa.search.core.al.k.b r0 = r2.f234526d
            long r5 = r2.f234537o
            r0.mo79028c(r5)
            r2.f234537o = r3
        L_0x02d6:
            if (r17 == 0) goto L_0x0307
            boolean r0 = r2.mo80530b()
            if (r0 != 0) goto L_0x02e8
            if (r13 == 0) goto L_0x02e8
            long r0 = r2.f234537o
            com.google.android.apps.gsa.search.core.al.k.b r2 = r2.f234526d
            r2.mo79028c(r0)
            goto L_0x02ff
        L_0x02e8:
            boolean r0 = r2.mo80530b()
            if (r0 == 0) goto L_0x02ff
            if (r13 != 0) goto L_0x02ff
            com.google.android.apps.gsa.search.core.state.dw r0 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.al r0 = (com.google.android.apps.gsa.search.core.state.C86815al) r0
            long r0 = r0.f234493a
            r2.f234537o = r0
            com.google.android.apps.gsa.search.core.al.k.b r2 = r2.f234526d
            r2.mo79029e(r0)
        L_0x02ff:
            r0 = r18
            com.google.android.apps.gsa.search.core.state.bb r1 = r0.f234540a
            r1.mo80591ar()
            return
        L_0x0307:
            r0 = r18
        L_0x0309:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C86834bc.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
