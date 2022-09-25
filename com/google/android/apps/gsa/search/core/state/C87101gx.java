package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.gx */
/* compiled from: PG */
public final class C87101gx implements C87143ik {

    /* renamed from: a */
    private final C87100gw f235344a;

    /* renamed from: b */
    private final C86842bk f235345b;

    /* renamed from: c */
    private final C86842bk f235346c;

    /* renamed from: d */
    private final C86842bk f235347d;

    public C87101gx(C87100gw gwVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f235344a = gwVar;
        this.f235345b = new C86842bk(aVar);
        this.f235346c = new C86842bk(aVar2);
        this.f235347d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235344a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235345b
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235346c
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235347d
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r11 = r10.f235345b
            boolean r0 = r11.f234552a
            if (r0 != 0) goto L_0x0021
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235346c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0021
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f235347d
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x0107
        L_0x0021:
            com.google.android.apps.gsa.search.core.state.gw r0 = r10.f235344a
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f235346c
            com.google.android.apps.gsa.search.core.state.bk r2 = r10.f235347d
            boolean r3 = r1.f234552a
            r4 = 0
            if (r3 != 0) goto L_0x0033
            boolean r3 = r2.f234552a
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r7 = 0
            goto L_0x007b
        L_0x0033:
            com.google.android.apps.gsa.search.core.state.dw r3 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r3 = (com.google.android.apps.gsa.search.core.state.C87052fn) r3
            com.google.android.apps.gsa.search.core.state.dw r2 = r2.mo80533a()
            com.google.android.apps.gsa.search.core.state.fx r2 = (com.google.android.apps.gsa.search.core.state.C87062fx) r2
            com.google.android.apps.gsa.shared.search.Query r5 = r3.f235176l
            boolean r6 = r5.mo84320bE()
            r7 = 1
            if (r6 == 0) goto L_0x004a
        L_0x0048:
            r2 = 0
            goto L_0x006c
        L_0x004a:
            int r2 = r2.f235219i
            r6 = 2
            if (r2 != r6) goto L_0x0051
            r2 = 4
            goto L_0x006c
        L_0x0051:
            boolean r2 = r3.mo80690I()
            if (r2 == 0) goto L_0x005f
            boolean r2 = r5.mo84393cZ()
            if (r2 == 0) goto L_0x005f
            r2 = 7
            goto L_0x006c
        L_0x005f:
            boolean r2 = r3.mo80690I()
            if (r2 == 0) goto L_0x0048
            boolean r2 = r5.mo84392cY()
            if (r2 == 0) goto L_0x0048
            r2 = 1
        L_0x006c:
            int r3 = r0.f235333g
            if (r2 != r3) goto L_0x0071
            goto L_0x0031
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r0.f235335i = r7
            goto L_0x0078
        L_0x0076:
            r0.f235335i = r4
        L_0x0078:
            r0.mo80733a(r2)
        L_0x007b:
            boolean r2 = r11.f234552a
            if (r2 == 0) goto L_0x00c1
            com.google.android.apps.gsa.search.core.state.dw r11 = r11.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r11 = (com.google.android.apps.gsa.search.core.state.C86812ai) r11
            long r2 = r11.f234472b
            long r5 = r0.f235338l
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00c1
            com.google.android.apps.gsa.search.core.al.cq.a r5 = r0.f235328b
            com.google.android.apps.gsa.search.shared.service.ClientConfig r6 = r11.f234471a
            java.lang.String r8 = r11.mo80516a()
            r5.mo78783y(r6, r8)
            r0.f235336j = r4
            long r4 = r0.f235338l
            r8 = 0
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x00bc
            com.google.android.apps.gsa.search.core.al.cq.a r6 = r0.f235328b
            com.google.common.util.concurrent.cx r4 = r6.mo78770k(r4)
            com.google.android.libraries.gsa.k.g r5 = r0.f235331e
            com.google.android.apps.gsa.search.core.state.gr r6 = new com.google.android.apps.gsa.search.core.state.gr
            r6.<init>(r0, r11, r2)
            com.google.android.apps.gsa.shared.util.c.ag r11 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r8 = "SearchboxState.searchboxWork.stop"
            r11.<init>(r4, r5, r8, r6)
            com.google.android.apps.gsa.search.core.state.gs r4 = com.google.android.apps.gsa.search.core.state.C87096gs.f235323a
            r11.mo85223a(r4)
            goto L_0x00bf
        L_0x00bc:
            r0.mo80736i(r11, r2)
        L_0x00bf:
            r0.f235338l = r2
        L_0x00c1:
            boolean r11 = r1.f234552a
            if (r11 == 0) goto L_0x00f9
            com.google.android.apps.gsa.search.core.state.dw r11 = r1.mo80533a()
            com.google.android.apps.gsa.search.core.state.fn r11 = (com.google.android.apps.gsa.search.core.state.C87052fn) r11
            com.google.android.apps.gsa.shared.search.Query r1 = r11.f235176l
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f235337k
            if (r2 == r1) goto L_0x00f9
            r0.f235337k = r1
            com.google.android.apps.gsa.shared.search.Query r2 = r11.f235177m
            boolean r2 = r2.mo84383cP(r1)
            if (r2 == 0) goto L_0x00e4
            com.google.android.apps.gsa.search.core.al.cq.a r2 = r0.f235328b
            boolean r11 = r11.mo80690I()
            r2.mo78776r(r1, r11)
        L_0x00e4:
            dagger.a r11 = r0.f235341o
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r11 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r11
            dagger.a r1 = r0.f235330d
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.search.core.state.cy r1 = (com.google.android.apps.gsa.search.core.state.C86903cy) r1
            com.google.knowledge.d.f r1 = r1.f234680c
            r11.mo81658t(r1)
        L_0x00f9:
            boolean r11 = r0.f235336j
            if (r11 == 0) goto L_0x0100
            r0.mo80737j()
        L_0x0100:
            if (r7 == 0) goto L_0x0107
            com.google.android.apps.gsa.search.core.state.gw r11 = r10.f235344a
            r11.mo80591ar()
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C87101gx.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
