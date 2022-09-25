package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.hv */
/* compiled from: PG */
public final class C87127hv implements C87143ik {

    /* renamed from: a */
    private final C87126hu f235410a;

    /* renamed from: b */
    private final C86842bk f235411b;

    /* renamed from: c */
    private final C86842bk f235412c;

    /* renamed from: d */
    private final C86842bk f235413d;

    /* renamed from: e */
    private final C86842bk f235414e;

    /* renamed from: f */
    private final C86842bk f235415f;

    public C87127hv(C87126hu huVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f235410a = huVar;
        this.f235411b = new C86842bk(aVar);
        this.f235412c = new C86842bk(aVar2);
        this.f235413d = new C86842bk(aVar3);
        this.f235414e = new C86842bk(aVar4);
        this.f235415f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235410a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235411b
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235412c
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235413d
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235414e
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235415f
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r11 = r10.f235411b
            boolean r0 = r11.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235412c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235413d
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235414e
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235415f
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x00e4
        L_0x0037:
            com.google.android.apps.gsa.search.core.state.hu r0 = r10.f235410a
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f235412c
            com.google.android.apps.gsa.search.core.state.bk r2 = r10.f235413d
            com.google.android.apps.gsa.search.core.state.bk r3 = r10.f235414e
            com.google.android.apps.gsa.search.core.state.bk r4 = r10.f235415f
            r5 = 4
            com.google.android.apps.gsa.search.core.state.bk[] r5 = new com.google.android.apps.gsa.search.core.state.C86842bk[r5]
            r6 = 0
            r5[r6] = r11
            r7 = 1
            r5[r7] = r2
            r8 = 2
            r5[r8] = r3
            r9 = 3
            r5[r9] = r4
            boolean r4 = r0.mo80746e(r5)
            if (r4 == 0) goto L_0x006d
            com.google.android.apps.gsa.search.core.state.dw r11 = r11.mo80533a()
            com.google.android.apps.gsa.search.core.state.z r11 = (com.google.android.apps.gsa.search.core.state.C87171z) r11
            com.google.android.apps.gsa.search.core.state.dw r2 = r2.mo80533a()
            com.google.android.apps.gsa.search.core.state.co r2 = (com.google.android.apps.gsa.search.core.state.C86893co) r2
            com.google.android.apps.gsa.search.core.state.dw r4 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r4 = (com.google.android.apps.gsa.search.core.state.C87052fn) r4
            boolean r11 = r0.mo80747g(r11, r2, r4)
            goto L_0x006e
        L_0x006d:
            r11 = 0
        L_0x006e:
            com.google.android.apps.gsa.search.core.state.bk[] r2 = new com.google.android.apps.gsa.search.core.state.C86842bk[r8]
            r2[r6] = r1
            r2[r7] = r3
            boolean r2 = r0.mo80746e(r2)
            if (r2 == 0) goto L_0x00dc
            com.google.android.apps.gsa.search.core.state.dw r1 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r1 = (com.google.android.apps.gsa.search.core.state.C86812ai) r1
            com.google.android.apps.gsa.search.core.state.dw r2 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r2 = (com.google.android.apps.gsa.search.core.state.C87052fn) r2
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f235177m
            long r3 = r0.f235396f
            long r8 = r2.f252780s
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x00dc
            r0.f235396f = r8
            boolean r3 = r2.mo84381cN()
            if (r3 != 0) goto L_0x00d4
            boolean r3 = r2.mo84397cd()
            if (r3 != 0) goto L_0x00d4
            boolean r3 = r0.mo80749i()
            if (r3 == 0) goto L_0x00a9
            int r1 = r2.mo84472e()
            goto L_0x00d5
        L_0x00a9:
            com.google.android.apps.gsa.search.core.i.t r3 = r0.f235395e
            com.google.android.apps.gsa.shared.m.d r4 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250258J
            boolean r3 = r3.mo79746e(r4)
            if (r3 == 0) goto L_0x00c0
            com.google.android.apps.gsa.search.shared.service.ClientConfig r3 = r1.f234471a
            com.google.common.o.amo r3 = r3.f236951d
            com.google.common.o.amo r4 = com.google.common.p4552o.amo.ANDROID_AUTO_EMBEDDED
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c0
            goto L_0x00d4
        L_0x00c0:
            boolean r3 = r2.mo84403cj()
            if (r3 == 0) goto L_0x00d4
            com.google.android.apps.gsa.search.shared.service.ClientConfig r1 = r1.f234471a
            boolean r1 = r1.mo81904u()
            if (r1 == 0) goto L_0x00cf
            goto L_0x00d4
        L_0x00cf:
            int r1 = r2.mo84472e()
            goto L_0x00d5
        L_0x00d4:
            r1 = 0
        L_0x00d5:
            int r2 = r0.f235397g
            if (r2 == r1) goto L_0x00dc
            r0.f235397g = r1
            r6 = 1
        L_0x00dc:
            r11 = r11 | r6
            if (r11 == 0) goto L_0x00e4
            com.google.android.apps.gsa.search.core.state.hu r11 = r10.f235410a
            r11.mo80591ar()
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87127hv.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
