package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.eb */
/* compiled from: PG */
public final class C116672eb implements C87143ik {

    /* renamed from: a */
    private final C116671ea f323556a;

    /* renamed from: b */
    private final C86842bk f323557b;

    /* renamed from: c */
    private final C86842bk f323558c;

    /* renamed from: d */
    private final C86842bk f323559d;

    /* renamed from: e */
    private final C86842bk f323560e;

    /* renamed from: f */
    private final C86842bk f323561f;

    /* renamed from: g */
    private final C86842bk f323562g;

    public C116672eb(C116671ea eaVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f323556a = eaVar;
        this.f323557b = new C86842bk(aVar);
        this.f323558c = new C86842bk(aVar2);
        this.f323559d = new C86842bk(aVar3);
        this.f323560e = new C86842bk(aVar4);
        this.f323561f = new C86842bk(aVar5);
        this.f323562g = new C86842bk(aVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323556a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x018c, code lost:
        if (r6 != false) goto L_0x0195;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00fe  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r14) {
        /*
            r13 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323557b
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323558c
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323559d
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323560e
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323561f
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323562g
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r14 = r13.f323557b
            boolean r0 = r14.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323558c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323559d
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323560e
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323561f
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323562g
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x0232
        L_0x0042:
            com.google.android.apps.gsa.staticplugins.search.session.state.ea r0 = r13.f323556a
            com.google.android.apps.gsa.search.core.state.bk r1 = r13.f323558c
            com.google.android.apps.gsa.search.core.state.bk r2 = r13.f323559d
            com.google.android.apps.gsa.search.core.state.bk r3 = r13.f323560e
            com.google.android.apps.gsa.search.core.state.bk r4 = r13.f323561f
            com.google.android.apps.gsa.search.core.state.bk r5 = r13.f323562g
            boolean r6 = r2.f234552a
            r7 = 0
            r8 = 1
            if (r6 != 0) goto L_0x005c
            boolean r6 = r5.f234552a
            if (r6 != 0) goto L_0x005c
            boolean r6 = r1.f234552a
            if (r6 == 0) goto L_0x0103
        L_0x005c:
            com.google.android.apps.gsa.search.core.state.dw r1 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.aq r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116579aq) r1
            com.google.android.apps.gsa.search.core.state.dw r6 = r2.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r6 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r6
            com.google.android.apps.gsa.search.core.state.dw r9 = r5.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.TtsState r9 = (com.google.android.apps.gsa.staticplugins.search.session.state.TtsState) r9
            com.google.android.apps.gsa.shared.search.Query r10 = r6.f323784p
            boolean r10 = r10.mo84374cG()
            if (r10 != 0) goto L_0x00e5
            com.google.android.apps.gsa.shared.search.Query r10 = r6.f323784p
            boolean r10 = r10.mo84372cE()
            if (r10 == 0) goto L_0x0080
            goto L_0x00e5
        L_0x0080:
            com.google.android.apps.gsa.shared.search.Query r10 = r6.f323784p
            boolean r10 = r10.mo84468dv()
            if (r10 == 0) goto L_0x00c8
            com.google.android.apps.gsa.staticplugins.search.session.state.gj r10 = r6.f323791w
            com.google.android.apps.gsa.shared.search.Query r11 = r6.f323784p
            boolean r10 = r10.mo102861l(r11)
            if (r10 != 0) goto L_0x00b6
            boolean r10 = r6.mo102877R()
            if (r10 != 0) goto L_0x00b6
            boolean r1 = r1.mo102783g()
            if (r1 == 0) goto L_0x00ad
            boolean r1 = r6.mo102878T()
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r9.mo102767y()
            if (r1 != 0) goto L_0x00ad
        L_0x00aa:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00ad:
            boolean r1 = r6.mo80458S()
            if (r1 == 0) goto L_0x00b6
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00b6:
            boolean r1 = r6.mo102879U()
            if (r1 == 0) goto L_0x00c5
            boolean r1 = r6.mo102885ab()
            if (r1 != 0) goto L_0x00c5
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00c5:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00f1
        L_0x00c8:
            com.google.android.apps.gsa.shared.search.Query r1 = r6.f323784p
            boolean r1 = r1.mo84385cR()
            if (r1 != 0) goto L_0x00d3
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00d3:
            boolean r1 = r6.mo102879U()
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r6.mo102885ab()
            if (r1 != 0) goto L_0x00e2
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00e2:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00f1
        L_0x00e5:
            boolean r1 = r1.mo102783g()
            if (r1 == 0) goto L_0x00ef
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x00ed:
            r1 = 0
            goto L_0x00f2
        L_0x00ef:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x00f1:
            r1 = 1
        L_0x00f2:
            com.google.android.apps.gsa.shared.util.BitFlags r6 = r0.f323540b
            r9 = r1 ^ 1
            r10 = 4
            boolean r6 = r6.mo85055h(r10, r9)
            if (r6 == 0) goto L_0x0103
            com.google.android.apps.gsa.search.core.al.cx.a r6 = r0.f323542d
            r6.mo78823c(r1)
        L_0x0103:
            boolean r1 = r2.f234552a
            if (r1 == 0) goto L_0x011f
            com.google.android.apps.gsa.search.core.state.dw r1 = r2.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r1
            com.google.android.apps.gsa.shared.search.Query r1 = r1.f323784p
            boolean r1 = r1.mo84324bI()
            r1 = r1 ^ r8
            boolean r2 = r0.f323544f
            if (r2 == r1) goto L_0x011f
            r0.f323544f = r1
            com.google.android.apps.gsa.search.core.al.cx.a r2 = r0.f323542d
            r2.mo78821a(r1)
        L_0x011f:
            boolean r1 = r4.f234552a
            if (r1 == 0) goto L_0x0144
            com.google.android.apps.gsa.search.core.state.dw r1 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.hz r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116777hz) r1
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r1.f323974c
            long r1 = r1.f253762b
            r9 = 1
            boolean r1 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r1, r9)
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.BitFlags r2 = r0.f323540b
            r9 = 2
            boolean r2 = r2.mo85055h(r9, r1)
            if (r2 == 0) goto L_0x0144
            com.google.android.apps.gsa.search.core.al.cx.a r2 = r0.f323542d
            r2.mo78825e(r1)
        L_0x0144:
            boolean r1 = r14.f234552a
            if (r1 == 0) goto L_0x01f7
            com.google.android.apps.gsa.search.core.state.dw r1 = r14.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r1
            long r9 = r1.f323268b
            long r11 = r0.f323547i
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x015c
            boolean r2 = r0.f323546h
            boolean r4 = r1.f323270d
            if (r2 == r4) goto L_0x017e
        L_0x015c:
            boolean r2 = r1.f323270d
            r0.f323546h = r2
            r0.f323547i = r9
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r2 = r0.f323546h
            if (r2 == 0) goto L_0x0177
            dagger.a r4 = r0.f323539a
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gr r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116742gr) r4
            boolean r4 = r4.f323824a
            if (r4 != 0) goto L_0x0177
            r0.f323545g = r8
            goto L_0x017e
        L_0x0177:
            if (r2 != 0) goto L_0x017b
            r0.f323545g = r7
        L_0x017b:
            r0.mo102827e(r2)
        L_0x017e:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r2 = r1.f323267a
            boolean r4 = r2.mo81882L()
            boolean r6 = r2.mo81883M()
            boolean r9 = r0.f323543e
            if (r9 != r4) goto L_0x018f
            if (r6 == 0) goto L_0x019a
            goto L_0x0195
        L_0x018f:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r6 = r0.f323543e
            r0.f323543e = r4
        L_0x0195:
            com.google.android.apps.gsa.search.core.al.cx.a r4 = r0.f323542d
            r4.mo78822b()
        L_0x019a:
            boolean r4 = r2.mo81874D()
            boolean r6 = r0.f323548j
            if (r4 == r6) goto L_0x01ad
            boolean r2 = r2.mo81874D()
            r0.f323548j = r2
            com.google.android.apps.gsa.search.core.al.cx.a r4 = r0.f323542d
            r4.mo78827g(r2)
        L_0x01ad:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r1.f323267a
            com.google.common.o.amo r1 = r1.f236951d
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.ANDROID_AUTO
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x01cc
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.ANDROID_AUTO_PROJECTED
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x01cc
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.ANDROID_AUTO_PHONE
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x01ca
            goto L_0x01cc
        L_0x01ca:
            r2 = 0
            goto L_0x01cd
        L_0x01cc:
            r2 = 1
        L_0x01cd:
            boolean r4 = r0.f323549k
            if (r4 == r2) goto L_0x01d8
            r0.f323549k = r2
            com.google.android.apps.gsa.search.core.al.bi.a r4 = r0.f323541c
            r4.mo78548q(r2)
        L_0x01d8:
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.SPEAKER_ID_ENROLLMENT
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x01eb
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.TI_SID_ENROLLMENT
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r1 = 0
            goto L_0x01ec
        L_0x01eb:
            r1 = 1
        L_0x01ec:
            boolean r2 = r0.f323550l
            if (r2 == r1) goto L_0x01f7
            r0.f323550l = r1
            com.google.android.apps.gsa.search.core.al.bi.a r2 = r0.f323541c
            r2.mo78547p(r1)
        L_0x01f7:
            boolean r1 = r14.f234552a
            if (r1 != 0) goto L_0x0202
            boolean r1 = r5.f234552a
            if (r1 == 0) goto L_0x0200
            goto L_0x0202
        L_0x0200:
            r14 = 0
            goto L_0x0212
        L_0x0202:
            com.google.android.apps.gsa.search.core.state.dw r14 = r14.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r14 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r14
            com.google.android.apps.gsa.search.core.state.dw r1 = r5.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.TtsState r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.TtsState) r1
            boolean r14 = r0.mo102828g(r14, r1)
        L_0x0212:
            boolean r1 = r3.f234552a
            if (r1 == 0) goto L_0x022b
            boolean r1 = r0.f323545g
            if (r1 == 0) goto L_0x022b
            com.google.android.apps.gsa.search.core.state.dw r1 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gr r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116742gr) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r1 = r1.f323824a
            if (r1 == 0) goto L_0x022b
            r0.f323545g = r7
            r0.mo102827e(r8)
        L_0x022b:
            if (r14 == 0) goto L_0x0232
            com.google.android.apps.gsa.staticplugins.search.session.state.ea r14 = r13.f323556a
            r14.mo80591ar()
        L_0x0232:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116672eb.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
