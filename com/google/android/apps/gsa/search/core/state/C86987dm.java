package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.dm */
/* compiled from: PG */
public final class C86987dm implements C87143ik {

    /* renamed from: a */
    private final C86986dl f234957a;

    /* renamed from: b */
    private final C86842bk f234958b;

    /* renamed from: c */
    private final C86842bk f234959c;

    /* renamed from: d */
    private final C86842bk f234960d;

    /* renamed from: e */
    private final C86842bk f234961e;

    /* renamed from: f */
    private final C86842bk f234962f;

    /* renamed from: g */
    private final C86842bk f234963g;

    public C86987dm(C86986dl dlVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6) {
        this.f234957a = dlVar;
        this.f234958b = new C86842bk(aVar);
        this.f234959c = new C86842bk(aVar2);
        this.f234960d = new C86842bk(aVar3);
        this.f234961e = new C86842bk(aVar4);
        this.f234962f = new C86842bk(aVar5);
        this.f234963g = new C86842bk(aVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234957a;
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
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234958b
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234959c
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234960d
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234961e
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234962f
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234963g
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r14 = r13.f234958b
            boolean r0 = r14.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234959c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234960d
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234961e
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234962f
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0042
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f234963g
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x0241
        L_0x0042:
            com.google.android.apps.gsa.search.core.state.dl r0 = r13.f234957a
            com.google.android.apps.gsa.search.core.state.bk r1 = r13.f234959c
            com.google.android.apps.gsa.search.core.state.bk r2 = r13.f234960d
            com.google.android.apps.gsa.search.core.state.bk r3 = r13.f234961e
            com.google.android.apps.gsa.search.core.state.bk r4 = r13.f234962f
            com.google.android.apps.gsa.search.core.state.bk r5 = r13.f234963g
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
            com.google.android.apps.gsa.search.core.state.bb r1 = (com.google.android.apps.gsa.search.core.state.C86833bb) r1
            com.google.android.apps.gsa.search.core.state.dw r6 = r2.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r6 = (com.google.android.apps.gsa.search.core.state.C87052fn) r6
            com.google.android.apps.gsa.search.core.state.dw r9 = r5.mo80533a()
            com.google.android.apps.gsa.search.core.state.TtsState r9 = (com.google.android.apps.gsa.search.core.state.TtsState) r9
            com.google.android.apps.gsa.shared.search.Query r10 = r6.f235177m
            boolean r10 = r10.mo84374cG()
            if (r10 != 0) goto L_0x00e5
            com.google.android.apps.gsa.shared.search.Query r10 = r6.f235177m
            boolean r10 = r10.mo84372cE()
            if (r10 == 0) goto L_0x0080
            goto L_0x00e5
        L_0x0080:
            com.google.android.apps.gsa.shared.search.Query r10 = r6.f235177m
            boolean r10 = r10.mo84468dv()
            if (r10 == 0) goto L_0x00c8
            com.google.android.apps.gsa.search.core.state.fm r10 = r6.f235184t
            com.google.android.apps.gsa.shared.search.Query r11 = r6.f235177m
            boolean r10 = r10.mo80682l(r11)
            if (r10 != 0) goto L_0x00b6
            boolean r10 = r6.mo80687E()
            if (r10 != 0) goto L_0x00b6
            boolean r1 = r1.mo80530b()
            if (r1 == 0) goto L_0x00ad
            boolean r1 = r6.mo80688F()
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r9.mo80423y()
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
            boolean r1 = r6.mo80690I()
            if (r1 == 0) goto L_0x00c5
            boolean r1 = r6.mo80695P()
            if (r1 != 0) goto L_0x00c5
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00c5:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00f1
        L_0x00c8:
            com.google.android.apps.gsa.shared.search.Query r1 = r6.f235177m
            boolean r1 = r1.mo84385cR()
            if (r1 != 0) goto L_0x00d3
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00d3:
            boolean r1 = r6.mo80690I()
            if (r1 == 0) goto L_0x00e2
            boolean r1 = r6.mo80695P()
            if (r1 != 0) goto L_0x00e2
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00ed
        L_0x00e2:
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00f1
        L_0x00e5:
            boolean r1 = r1.mo80530b()
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
            com.google.android.apps.gsa.shared.util.BitFlags r6 = r0.f234940b
            r9 = r1 ^ 1
            r10 = 4
            boolean r6 = r6.mo85055h(r10, r9)
            if (r6 == 0) goto L_0x0103
            com.google.android.apps.gsa.search.core.al.cx.a r6 = r0.f234942d
            r6.mo78823c(r1)
        L_0x0103:
            boolean r1 = r2.f234552a
            if (r1 == 0) goto L_0x011f
            com.google.android.apps.gsa.search.core.state.dw r1 = r2.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r1 = (com.google.android.apps.gsa.search.core.state.C87052fn) r1
            com.google.android.apps.gsa.shared.search.Query r1 = r1.f235177m
            boolean r1 = r1.mo84324bI()
            r1 = r1 ^ r8
            boolean r2 = r0.f234944f
            if (r2 == r1) goto L_0x011f
            r0.f234944f = r1
            com.google.android.apps.gsa.search.core.al.cx.a r2 = r0.f234942d
            r2.mo78821a(r1)
        L_0x011f:
            boolean r1 = r4.f234552a
            if (r1 == 0) goto L_0x0144
            com.google.android.apps.gsa.search.core.state.dw r1 = r4.mo80533a()
            com.google.android.apps.gsa.search.core.state.hb r1 = (com.google.android.apps.gsa.search.core.state.C87107hb) r1
            com.google.android.apps.gsa.shared.util.BitFlags r1 = r1.f235351c
            long r1 = r1.f253762b
            r9 = 1
            boolean r1 = com.google.android.apps.gsa.shared.util.BitFlags.m148144f(r1, r9)
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.shared.util.BitFlags r2 = r0.f234940b
            r9 = 2
            boolean r2 = r2.mo85055h(r9, r1)
            if (r2 == 0) goto L_0x0144
            com.google.android.apps.gsa.search.core.al.cx.a r2 = r0.f234942d
            r2.mo78825e(r1)
        L_0x0144:
            boolean r1 = r14.f234552a
            if (r1 == 0) goto L_0x0208
            com.google.android.apps.gsa.search.core.state.dw r1 = r14.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r1 = (com.google.android.apps.gsa.search.core.state.C86812ai) r1
            long r9 = r1.f234472b
            long r11 = r0.f234947i
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x015c
            boolean r2 = r0.f234946h
            boolean r4 = r1.f234473c
            if (r2 == r4) goto L_0x017e
        L_0x015c:
            boolean r2 = r1.f234473c
            r0.f234946h = r2
            r0.f234947i = r9
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r2 = r0.f234946h
            if (r2 == 0) goto L_0x0177
            dagger.a r4 = r0.f234939a
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.state.fu r4 = (com.google.android.apps.gsa.search.core.state.C87059fu) r4
            boolean r4 = r4.f235204e
            if (r4 != 0) goto L_0x0177
            r0.f234945g = r8
            goto L_0x017e
        L_0x0177:
            if (r2 != 0) goto L_0x017b
            r0.f234945g = r7
        L_0x017b:
            r0.mo80623a(r2)
        L_0x017e:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r2 = r1.f234471a
            boolean r4 = r2.mo81882L()
            boolean r6 = r2.mo81883M()
            boolean r9 = r0.f234943e
            if (r9 != r4) goto L_0x018f
            if (r6 == 0) goto L_0x019a
            goto L_0x0195
        L_0x018f:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r6 = r0.f234943e
            r0.f234943e = r4
        L_0x0195:
            com.google.android.apps.gsa.search.core.al.cx.a r4 = r0.f234942d
            r4.mo78822b()
        L_0x019a:
            boolean r4 = r2.mo81874D()
            boolean r6 = r0.f234948j
            if (r4 == r6) goto L_0x01ad
            boolean r2 = r2.mo81874D()
            r0.f234948j = r2
            com.google.android.apps.gsa.search.core.al.cx.a r4 = r0.f234942d
            r4.mo78827g(r2)
        L_0x01ad:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r1.f234471a
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
            boolean r4 = r0.f234949k
            if (r4 == r2) goto L_0x01d8
            r0.f234949k = r2
            com.google.android.apps.gsa.search.core.al.bi.a r4 = r0.f234941c
            r4.mo78548q(r2)
        L_0x01d8:
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.MORRIS
            boolean r2 = r2.equals(r1)
            boolean r4 = r0.f234950l
            if (r4 == r2) goto L_0x01e9
            r0.f234950l = r2
            com.google.android.apps.gsa.search.core.al.bi.a r4 = r0.f234941c
            r4.mo78549r(r2)
        L_0x01e9:
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.SPEAKER_ID_ENROLLMENT
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x01fc
            com.google.common.o.amo r2 = com.google.common.p4552o.amo.TI_SID_ENROLLMENT
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r1 = 0
            goto L_0x01fd
        L_0x01fc:
            r1 = 1
        L_0x01fd:
            boolean r2 = r0.f234951m
            if (r2 == r1) goto L_0x0208
            r0.f234951m = r1
            com.google.android.apps.gsa.search.core.al.bi.a r2 = r0.f234941c
            r2.mo78547p(r1)
        L_0x0208:
            boolean r1 = r14.f234552a
            if (r1 != 0) goto L_0x0213
            boolean r1 = r5.f234552a
            if (r1 == 0) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r14 = 0
            goto L_0x0223
        L_0x0213:
            com.google.android.apps.gsa.search.core.state.dw r14 = r14.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r14 = (com.google.android.apps.gsa.search.core.state.C86812ai) r14
            com.google.android.apps.gsa.search.core.state.dw r1 = r5.mo80533a()
            com.google.android.apps.gsa.search.core.state.TtsState r1 = (com.google.android.apps.gsa.search.core.state.TtsState) r1
            boolean r14 = r0.mo80624e(r14, r1)
        L_0x0223:
            boolean r1 = r3.f234552a
            if (r1 == 0) goto L_0x023a
            boolean r1 = r0.f234945g
            if (r1 == 0) goto L_0x023a
            com.google.android.apps.gsa.search.core.state.dw r1 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.fu r1 = (com.google.android.apps.gsa.search.core.state.C87059fu) r1
            boolean r1 = r1.f235204e
            if (r1 == 0) goto L_0x023a
            r0.f234945g = r7
            r0.mo80623a(r8)
        L_0x023a:
            if (r14 == 0) goto L_0x0241
            com.google.android.apps.gsa.search.core.state.dl r14 = r13.f234957a
            r14.mo80591ar()
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C86987dm.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
