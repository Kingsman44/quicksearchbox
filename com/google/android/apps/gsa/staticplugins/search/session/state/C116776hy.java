package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.hy */
/* compiled from: PG */
public final class C116776hy implements C87143ik {

    /* renamed from: a */
    private final C116775hx f323968a;

    /* renamed from: b */
    private final C86842bk f323969b;

    /* renamed from: c */
    private final C86842bk f323970c;

    /* renamed from: d */
    private final C86842bk f323971d;

    public C116776hy(C116775hx hxVar, C68214a aVar, C68214a aVar2, C68214a aVar3) {
        this.f323968a = hxVar;
        this.f323969b = new C86842bk(aVar);
        this.f323970c = new C86842bk(aVar2);
        this.f323971d = new C86842bk(aVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323968a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323969b
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323970c
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323971d
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r11 = r10.f323969b
            boolean r0 = r11.f234552a
            if (r0 != 0) goto L_0x0021
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323970c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0021
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323971d
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x0102
        L_0x0021:
            com.google.android.apps.gsa.staticplugins.search.session.state.hx r0 = r10.f323968a
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f323970c
            com.google.android.apps.gsa.search.core.state.bk r2 = r10.f323971d
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r3 = r1.f234552a
            r4 = 0
            if (r3 != 0) goto L_0x0035
            boolean r3 = r2.f234552a
            if (r3 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r8 = 0
            goto L_0x0076
        L_0x0035:
            com.google.android.apps.gsa.search.core.state.dw r3 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r3
            com.google.android.apps.gsa.search.core.state.dw r2 = r2.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.hd r2 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116755hd) r2
            com.google.android.apps.gsa.shared.search.Query r5 = r3.f323783o
            boolean r6 = r5.mo84320bE()
            r7 = 4
            r8 = 1
            if (r6 == 0) goto L_0x004d
        L_0x004b:
            r2 = 0
            goto L_0x0061
        L_0x004d:
            int r2 = r2.f323883p
            r6 = 2
            if (r2 != r6) goto L_0x0054
            r2 = 4
            goto L_0x0061
        L_0x0054:
            boolean r2 = r3.mo102879U()
            if (r2 == 0) goto L_0x004b
            boolean r2 = r5.mo84392cY()
            if (r2 == 0) goto L_0x004b
            r2 = 1
        L_0x0061:
            int r3 = r0.f323953f
            if (r2 != r3) goto L_0x0066
            goto L_0x0033
        L_0x0066:
            if (r2 == 0) goto L_0x006f
            r0.f323955h = r8
            if (r2 == r7) goto L_0x0073
            r0.f323957j = r8
            goto L_0x0073
        L_0x006f:
            r0.f323955h = r4
            r0.f323957j = r4
        L_0x0073:
            r0.mo102933e(r2)
        L_0x0076:
            boolean r2 = r11.f234552a
            if (r2 == 0) goto L_0x00bf
            com.google.android.apps.gsa.search.core.state.dw r11 = r11.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r11 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r11
            long r2 = r11.f323268b
            long r5 = r0.f323960m
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00bf
            com.google.android.apps.gsa.search.core.al.cq.a r5 = r0.f323949b
            com.google.android.apps.gsa.search.shared.service.ClientConfig r6 = r11.f323267a
            java.lang.String r7 = r11.mo102771e()
            r5.mo78783y(r6, r7)
            r0.mo102934g(r2)
            r0.f323958k = r4
            long r4 = r0.f323960m
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x00ba
            com.google.android.apps.gsa.search.core.al.cq.a r6 = r0.f323949b
            com.google.common.util.concurrent.cx r4 = r6.mo78770k(r4)
            com.google.android.libraries.gsa.k.g r5 = r0.f323951d
            com.google.android.apps.gsa.staticplugins.search.session.state.hs r6 = new com.google.android.apps.gsa.staticplugins.search.session.state.hs
            r6.<init>(r0, r11, r2)
            com.google.android.apps.gsa.shared.util.c.ag r11 = new com.google.android.apps.gsa.shared.util.c.ag
            java.lang.String r7 = "SearchboxState.searchboxWork.stop"
            r11.<init>(r4, r5, r7, r6)
            com.google.android.apps.gsa.staticplugins.search.session.state.ht r4 = com.google.android.apps.gsa.staticplugins.search.session.state.C116771ht.f323944a
            r11.mo85223a(r4)
            goto L_0x00bd
        L_0x00ba:
            r0.mo102935i(r11, r2)
        L_0x00bd:
            r0.f323960m = r2
        L_0x00bf:
            boolean r11 = r1.f234552a
            if (r11 == 0) goto L_0x00fb
            com.google.android.apps.gsa.search.core.state.dw r11 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r11 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r11
            com.google.android.apps.gsa.shared.search.Query r1 = r11.f323783o
            com.google.android.apps.gsa.shared.search.Query r2 = r0.f323959l
            boolean r2 = com.google.common.base.C58832aw.m90831a(r2, r1)
            if (r2 != 0) goto L_0x00fb
            r0.f323959l = r1
            com.google.android.apps.gsa.shared.search.Query r2 = r11.f323784p
            boolean r2 = r2.mo84383cP(r1)
            if (r2 == 0) goto L_0x00e6
            com.google.android.apps.gsa.search.core.al.cq.a r2 = r0.f323949b
            boolean r11 = r11.mo102879U()
            r2.mo78776r(r1, r11)
        L_0x00e6:
            dagger.a r11 = r0.f323964q
            java.lang.Object r11 = r11.mo27525b()
            com.google.android.apps.gsa.search.shared.d.c r11 = (com.google.android.apps.gsa.search.shared.p6926d.C87541c) r11
            dagger.a r0 = r0.f323950c
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.cl r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl) r0
            com.google.knowledge.d.f r0 = r0.f323452c
            r11.mo81658t(r0)
        L_0x00fb:
            if (r8 == 0) goto L_0x0102
            com.google.android.apps.gsa.staticplugins.search.session.state.hx r11 = r10.f323968a
            r11.mo80591ar()
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116776hy.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
