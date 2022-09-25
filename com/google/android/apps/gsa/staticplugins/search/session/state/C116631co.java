package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.co */
/* compiled from: PG */
public final class C116631co implements C87143ik {

    /* renamed from: a */
    private final C116630cn f323474a;

    /* renamed from: b */
    private final C86842bk f323475b;

    /* renamed from: c */
    private final C86842bk f323476c;

    /* renamed from: d */
    private final C86842bk f323477d;

    /* renamed from: e */
    private final C86842bk f323478e;

    /* renamed from: f */
    private final C86842bk f323479f;

    public C116631co(C116630cn cnVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f323474a = cnVar;
        this.f323475b = new C86842bk(aVar);
        this.f323476c = new C86842bk(aVar2);
        this.f323477d = new C86842bk(aVar3);
        this.f323478e = new C86842bk(aVar4);
        this.f323479f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323474a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323475b
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323476c
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323477d
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323478e
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323479f
            r2.mo80534b(r1)
            com.google.android.apps.gsa.search.core.state.bk r1 = r0.f323475b
            boolean r2 = r1.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323476c
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323477d
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323478e
            boolean r2 = r2.f234552a
            if (r2 != 0) goto L_0x003b
            com.google.android.apps.gsa.search.core.state.bk r2 = r0.f323479f
            boolean r2 = r2.f234552a
            if (r2 == 0) goto L_0x00fe
        L_0x003b:
            com.google.android.apps.gsa.staticplugins.search.session.state.cn r2 = r0.f323474a
            com.google.android.apps.gsa.search.core.state.bk r3 = r0.f323476c
            com.google.android.apps.gsa.search.core.state.bk r4 = r0.f323477d
            com.google.android.apps.gsa.search.core.state.bk r5 = r0.f323478e
            com.google.android.apps.gsa.search.core.state.bk r6 = r0.f323479f
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r7 = r3.f234552a
            r8 = 0
            if (r7 == 0) goto L_0x0067
            com.google.android.apps.gsa.search.core.state.dw r3 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.aj r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116572aj) r3
            com.google.android.apps.gsa.search.core.state.dw r7 = r6.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r7
            long r9 = r2.f323465d
            long r11 = r3.f323290a
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x0067
            r2.f323465d = r11
            boolean r3 = r2.mo102815k(r7, r8)
            goto L_0x0068
        L_0x0067:
            r3 = 0
        L_0x0068:
            boolean r7 = r6.f234552a
            if (r7 == 0) goto L_0x00a3
            com.google.android.apps.gsa.search.core.state.dw r7 = r6.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r7
            com.google.android.apps.gsa.shared.search.Query r9 = r7.f323784p
            com.google.android.apps.gsa.shared.search.Query r10 = r2.f323464c
            boolean r10 = r9.mo84383cP(r10)
            if (r10 != 0) goto L_0x0098
            long r10 = r2.f323470i
            long r12 = r9.f252780s
            r14 = 0
            r16 = r9
            r8 = 1
            int r17 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r17 != 0) goto L_0x0091
            com.google.android.apps.gsa.shared.util.BitFlags r10 = r2.f323463b
            boolean r8 = r10.mo85049c(r14, r8)
            goto L_0x009b
        L_0x0091:
            com.google.android.apps.gsa.shared.util.BitFlags r10 = r2.f323463b
            boolean r8 = r10.mo85049c(r8, r14)
            goto L_0x009b
        L_0x0098:
            r16 = r9
            r8 = 0
        L_0x009b:
            r2.mo102811e(r7)
            r7 = r16
            r2.f323464c = r7
            r3 = r3 | r8
        L_0x00a3:
            boolean r7 = r4.f234552a
            if (r7 == 0) goto L_0x00bf
            com.google.android.apps.gsa.search.core.state.dw r4 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.aq r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116579aq) r4
            boolean r4 = r4.mo102783g()
            if (r4 == 0) goto L_0x00bf
            r4 = 0
            r2.f323466e = r4
            com.google.android.apps.gsa.search.core.state.dw r4 = r6.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r4
            r2.mo102811e(r4)
        L_0x00bf:
            boolean r4 = r1.f234552a
            if (r4 == 0) goto L_0x00eb
            com.google.android.apps.gsa.search.core.state.dw r4 = r6.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r4 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r4
            com.google.android.apps.gsa.search.core.state.dw r7 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r7 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r7
            boolean r7 = r7.mo102774j()
            boolean r4 = r2.mo102815k(r4, r7)
            r3 = r3 | r4
            com.google.android.apps.gsa.search.core.state.dw r1 = r1.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r1
            long r7 = r1.f323268b
            long r9 = r2.f323469h
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00eb
            r2.f323469h = r7
            r2.mo102812g()
        L_0x00eb:
            boolean r1 = r5.f234552a
            if (r1 != 0) goto L_0x00f3
            boolean r1 = r6.f234552a
            if (r1 == 0) goto L_0x00f7
        L_0x00f3:
            r1 = 0
            r2.mo102813i(r1)
        L_0x00f7:
            if (r3 == 0) goto L_0x00fe
            com.google.android.apps.gsa.staticplugins.search.session.state.cn r1 = r0.f323474a
            r1.mo80591ar()
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116631co.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
