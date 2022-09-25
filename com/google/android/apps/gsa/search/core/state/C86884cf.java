package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cf */
/* compiled from: PG */
public final class C86884cf implements C87143ik {

    /* renamed from: a */
    private final C86883ce f234636a;

    /* renamed from: b */
    private final C86842bk f234637b;

    /* renamed from: c */
    private final C86842bk f234638c;

    /* renamed from: d */
    private final C86842bk f234639d;

    /* renamed from: e */
    private final C86842bk f234640e;

    /* renamed from: f */
    private final C86842bk f234641f;

    public C86884cf(C86883ce ceVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f234636a = ceVar;
        this.f234637b = new C86842bk(aVar);
        this.f234638c = new C86842bk(aVar2);
        this.f234639d = new C86842bk(aVar3);
        this.f234640e = new C86842bk(aVar4);
        this.f234641f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234636a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (r11.mo80694O(r12) == false) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        if (r1.mo80790W(r12) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234637b
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234638c
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234639d
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234640e
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234641f
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r1 = r0.f234637b
            boolean r2 = r1.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234638c
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234639d
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234640e
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f234641f
            boolean r2 = r2.f234552a
            if (r2 == 0) goto L_0x0285
        L_0x003b:
            com.google.android.apps.gsa.search.core.state.ce r2 = r0.f234636a
            com.google.android.apps.gsa.search.core.state.bk r3 = r0.f234638c
            com.google.android.apps.gsa.search.core.state.bk r4 = r0.f234639d
            com.google.android.apps.gsa.search.core.state.bk r5 = r0.f234640e
            com.google.android.apps.gsa.search.core.state.bk r6 = r0.f234641f
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.BitFlags r7 = r2.f234625b
            r8 = 7
            boolean r7 = r7.mo85052e(r8)
            boolean r10 = r2.f234632i
            boolean r11 = r5.f234552a
            r14 = 1
            r8 = 1
            if (r11 == 0) goto L_0x008c
            com.google.android.apps.gsa.search.core.state.dw r11 = r5.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r11 = (com.google.android.apps.gsa.search.core.state.C87052fn) r11
            com.google.android.apps.gsa.shared.search.Query r9 = r2.f234630g
            com.google.android.apps.gsa.shared.search.Query r12 = r11.f235177m
            boolean r9 = r12.mo84383cP(r9)
            if (r9 == 0) goto L_0x0069
            goto L_0x008c
        L_0x0069:
            com.google.android.apps.gsa.shared.search.Query r9 = r11.f235177m
            r2.f234630g = r9
            com.google.android.apps.gsa.shared.search.Query r9 = r2.f234630g
            boolean r9 = r9.mo84403cj()
            r2.f234632i = r9
            boolean r9 = r2.f234634k
            if (r9 != 0) goto L_0x0083
            com.google.android.apps.gsa.shared.search.Query r9 = r2.f234630g
            boolean r9 = r9.mo84385cR()
            if (r9 != 0) goto L_0x0083
            r2.f234634k = r8
        L_0x0083:
            com.google.android.apps.gsa.shared.util.BitFlags r9 = r2.f234625b
            r11 = 0
            boolean r9 = r9.mo85049c(r14, r11)
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            com.google.android.apps.gsa.search.core.state.dw r11 = r3.mo80533a()
            if (r11 == 0) goto L_0x00ab
            com.google.android.apps.gsa.search.core.state.dw r11 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r11 = (com.google.android.apps.gsa.search.core.state.C86812ai) r11
            com.google.android.apps.gsa.search.shared.service.ClientConfig r11 = r11.f234471a
            if (r11 == 0) goto L_0x00ab
            com.google.android.apps.gsa.search.core.state.dw r11 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r11 = (com.google.android.apps.gsa.search.core.state.C86812ai) r11
            com.google.android.apps.gsa.search.shared.service.ClientConfig r11 = r11.f234471a
            boolean r11 = r11.mo81898p()
            r2.f234635l = r11
        L_0x00ab:
            com.google.android.apps.gsa.search.core.state.dw r11 = r5.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r11 = (com.google.android.apps.gsa.search.core.state.C87052fn) r11
            if (r9 != 0) goto L_0x00bb
            boolean r12 = r1.f234552a
            if (r12 != 0) goto L_0x00bb
            boolean r12 = r4.f234552a
            if (r12 == 0) goto L_0x01e3
        L_0x00bb:
            com.google.android.apps.gsa.search.core.state.dw r1 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.z r1 = (com.google.android.apps.gsa.search.core.state.C87171z) r1
            com.google.android.apps.gsa.shared.search.Query r12 = r11.f235177m
            com.google.android.apps.gsa.shared.search.Query r13 = r2.f234631h
            boolean r13 = r11.mo80694O(r13)
            if (r13 == 0) goto L_0x00ce
            com.google.android.apps.gsa.shared.search.Query r13 = r2.f234631h
            goto L_0x00d4
        L_0x00ce:
            boolean r13 = r11.mo80694O(r12)
            if (r13 != 0) goto L_0x0109
        L_0x00d4:
            com.google.android.apps.gsa.shared.search.Query r13 = r2.f234631h
            boolean r13 = r1.mo80790W(r13)
            if (r13 == 0) goto L_0x00df
            com.google.android.apps.gsa.shared.search.Query r13 = r2.f234631h
            goto L_0x00e5
        L_0x00df:
            boolean r13 = r1.mo80790W(r12)
            if (r13 != 0) goto L_0x0109
        L_0x00e5:
            boolean r13 = r11.mo80688F()
            if (r13 == 0) goto L_0x00ec
            goto L_0x0109
        L_0x00ec:
            boolean r12 = r1.mo80787T()
            if (r12 == 0) goto L_0x0106
            com.google.android.apps.gsa.shared.search.Query r12 = r2.f234631h
            boolean r12 = r1.mo80790W(r12)
            if (r12 != 0) goto L_0x0106
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r2.f234625b
            r16 = r9
            r8 = 0
            boolean r8 = r12.mo85049c(r14, r8)
            r13 = r8
            goto L_0x0130
        L_0x0106:
            r16 = r9
            goto L_0x012f
        L_0x0109:
            r16 = r9
            r8 = 0
            com.google.android.apps.gsa.shared.search.Query r13 = r2.f234631h
            r2.f234631h = r12
            com.google.android.apps.gsa.shared.util.BitFlags r12 = r2.f234625b
            boolean r8 = r12.mo85049c(r8, r14)
            if (r8 == 0) goto L_0x011b
            r13 = 1
            goto L_0x0130
        L_0x011b:
            com.google.common.f.e r8 = com.google.android.apps.gsa.search.core.state.C86883ce.f234624a
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r12 = "ConversationState"
            r8.mo56378ag(r9, r12)
            java.lang.String r9 = "trackExpectingFollowOn - FLAG_CONVERSATION_ON_FOR_FOLLOW_ON already set"
            r12 = 8698(0x21fa, float:1.2188E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r12)).mo56386p(r9)
        L_0x012f:
            r13 = 0
        L_0x0130:
            r9 = r16 | r13
            com.google.android.apps.gsa.shared.util.BitFlags r8 = r2.f234625b
            com.google.android.apps.gsa.search.core.state.dw r4 = r4.mo80533a()
            com.google.android.apps.gsa.search.core.state.bb r4 = (com.google.android.apps.gsa.search.core.state.C86833bb) r4
            boolean r4 = r4.mo80530b()
            if (r4 != 0) goto L_0x0149
            boolean r4 = r1.mo80788U()
            if (r4 == 0) goto L_0x0147
            goto L_0x0149
        L_0x0147:
            r13 = 0
            goto L_0x014a
        L_0x0149:
            r13 = 1
        L_0x014a:
            r14 = 2
            r8.mo85055h(r14, r13)
            com.google.android.apps.gsa.shared.util.BitFlags r4 = r2.f234625b
            boolean r8 = r2.f234633j
            if (r8 == 0) goto L_0x015d
            boolean r8 = r1.mo80780L()
            if (r8 == 0) goto L_0x015d
            r13 = 1
            goto L_0x015e
        L_0x015d:
            r13 = 0
        L_0x015e:
            r14 = 4
            r4.mo85055h(r14, r13)
            com.google.android.apps.gsa.shared.util.BitFlags r4 = r2.f234625b
            r12 = 7
            boolean r4 = r4.mo85052e(r12)
            if (r4 == 0) goto L_0x017c
            boolean r8 = r2.f234632i
            if (r8 == 0) goto L_0x017c
            com.google.android.apps.gsa.shared.search.Query r8 = r11.f235177m
            boolean r1 = r1.mo80779K(r8)
            if (r1 == 0) goto L_0x017c
            r1 = 1
            r2.f234633j = r1
        L_0x017c:
            if (r7 != r4) goto L_0x017f
            goto L_0x01e3
        L_0x017f:
            if (r4 == 0) goto L_0x01d7
            com.google.android.apps.gsa.search.core.al.ab.a r1 = r2.f234626c
            com.google.android.apps.gsa.shared.search.Query r4 = r2.f234630g
            r1.mo78382e(r4)
            boolean r1 = r2.f234635l
            if (r1 != 0) goto L_0x01e3
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f234627d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249425dL
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x019b
            com.google.android.apps.gsa.search.core.al.dg.a r1 = r2.f234628e
            r1.mo78890c()
        L_0x019b:
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f234627d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249432dS
            boolean r1 = r1.mo79746e(r4)
            if (r1 != 0) goto L_0x01ab
            com.google.android.apps.gsa.search.core.al.dg.a r1 = r2.f234628e
            r4 = 0
            r1.mo78895h(r4)
        L_0x01ab:
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f234627d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249376cP
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x01ba
            com.google.android.apps.gsa.search.core.al.dg.a r1 = r2.f234628e
            r1.mo78893f()
        L_0x01ba:
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f234627d
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90063do.f249363cC
            boolean r1 = r1.mo79746e(r4)
            if (r1 == 0) goto L_0x01c9
            com.google.android.apps.gsa.search.core.al.dg.a r1 = r2.f234628e
            r1.mo78891d()
        L_0x01c9:
            com.google.android.apps.gsa.search.core.i.t r1 = r2.f234627d
            boolean r1 = com.google.android.apps.gsa.opa.p6448i.C83709a.m133281a(r1)
            if (r1 == 0) goto L_0x01e3
            com.google.android.apps.gsa.search.core.al.dg.a r1 = r2.f234628e
            r1.mo78889a()
            goto L_0x01e3
        L_0x01d7:
            com.google.android.apps.gsa.search.core.al.ab.a r1 = r2.f234626c
            r1.mo78380c()
            boolean r1 = r2.f234633j
            if (r1 == 0) goto L_0x01e3
            r2.mo80545b()
        L_0x01e3:
            boolean r1 = r2.f234632i
            if (r1 == 0) goto L_0x01fb
            if (r10 != 0) goto L_0x01fb
            com.google.android.apps.gsa.search.core.state.dw r1 = r5.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r1 = (com.google.android.apps.gsa.search.core.state.C87052fn) r1
            com.google.android.apps.gsa.shared.search.Query r1 = r1.f235177m
            boolean r1 = r1.mo84385cR()
            if (r1 != 0) goto L_0x01fb
            r1 = 1
            r2.mo80544a(r1)
        L_0x01fb:
            boolean r1 = r2.f234632i
            if (r1 == 0) goto L_0x0210
            com.google.android.apps.gsa.shared.search.Query r1 = r11.f235177m
            boolean r1 = r1.mo84403cj()
            if (r1 == 0) goto L_0x0210
            com.google.android.apps.gsa.search.shared.actions.SearchError r1 = r11.mo80708g()
            if (r1 == 0) goto L_0x0210
            r2.mo80545b()
        L_0x0210:
            boolean r1 = r3.f234552a
            if (r1 == 0) goto L_0x025b
            com.google.android.apps.gsa.search.core.state.dw r1 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r1 = (com.google.android.apps.gsa.search.core.state.C86812ai) r1
            long r3 = r1.f234472b
            long r7 = r2.f234629f
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x025b
            r2.f234629f = r3
            boolean r1 = r2.mo80546e()
            com.google.android.apps.gsa.search.shared.service.b.yw r3 = com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw.f238955d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.yv r3 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88361yv) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.yw r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw) r4
            int r5 = r4.f238957a
            r7 = 1
            r5 = r5 | r7
            r4.f238957a = r5
            r4.f238958b = r1
            boolean r1 = r2.f234632i
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.android.apps.gsa.search.shared.service.b.yw r4 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw) r4
            int r5 = r4.f238957a
            r5 = r5 | 2
            r4.f238957a = r5
            r4.f238959c = r1
            com.google.protobuf.bv r1 = r3.build()
            com.google.android.apps.gsa.search.shared.service.b.yw r1 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88362yw) r1
            com.google.android.apps.gsa.search.core.al.ab.a r3 = r2.f234626c
            r3.mo78378a(r1)
        L_0x025b:
            boolean r1 = r6.f234552a
            if (r1 == 0) goto L_0x027e
            com.google.android.apps.gsa.search.core.state.dw r1 = r6.mo80533a()
            com.google.android.apps.gsa.search.core.state.d.bq r1 = (com.google.android.apps.gsa.search.core.state.p6872d.C86950bq) r1
            com.google.android.ssb.g r1 = r1.mo80607e()
            com.google.android.ssb.g r3 = com.google.android.ssb.C45350g.IDLE
            if (r1 != r3) goto L_0x027e
            boolean r1 = r2.f234634k
            if (r1 == 0) goto L_0x027e
            com.google.android.apps.gsa.shared.search.Query r1 = r2.f234630g
            boolean r1 = r1.mo84385cR()
            if (r1 == 0) goto L_0x027e
            com.google.android.apps.gsa.search.core.al.ab.a r1 = r2.f234626c
            r1.mo78379b()
        L_0x027e:
            if (r9 == 0) goto L_0x0285
            com.google.android.apps.gsa.search.core.state.ce r1 = r0.f234636a
            r1.mo80591ar()
        L_0x0285:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C86884cf.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
