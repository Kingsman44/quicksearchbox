package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.gq */
/* compiled from: PG */
public final class C116741gq implements C87143ik {

    /* renamed from: a */
    private final C116740gp f323818a;

    /* renamed from: b */
    private final C86842bk f323819b;

    /* renamed from: c */
    private final C86842bk f323820c;

    /* renamed from: d */
    private final C86842bk f323821d;

    /* renamed from: e */
    private final C86842bk f323822e;

    /* renamed from: f */
    private final C86842bk f323823f;

    public C116741gq(C116740gp gpVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5) {
        this.f323818a = gpVar;
        this.f323819b = new C86842bk(aVar);
        this.f323820c = new C86842bk(aVar2);
        this.f323821d = new C86842bk(aVar3);
        this.f323822e = new C86842bk(aVar4);
        this.f323823f = new C86842bk(aVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323818a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:84:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0146  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r14) {
        /*
            r13 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323819b
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323820c
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323821d
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323822e
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323823f
            r0.mo80534b(r14)
            com.google.android.apps.gsa.search.core.state.bk r14 = r13.f323819b
            boolean r0 = r14.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323820c
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323821d
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323822e
            boolean r0 = r0.f234552a
            if (r0 != 0) goto L_0x0037
            com.google.android.apps.gsa.search.core.state.bk r0 = r13.f323823f
            boolean r0 = r0.f234552a
            if (r0 == 0) goto L_0x017b
        L_0x0037:
            com.google.android.apps.gsa.staticplugins.search.session.state.gp r0 = r13.f323818a
            com.google.android.apps.gsa.search.core.state.bk r1 = r13.f323820c
            com.google.android.apps.gsa.search.core.state.bk r2 = r13.f323821d
            com.google.android.apps.gsa.search.core.state.bk r3 = r13.f323822e
            com.google.android.apps.gsa.search.core.state.bk r4 = r13.f323823f
            boolean r5 = r2.f234552a
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x0095
            dagger.a r5 = r0.f323805a
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r5 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r5
            com.google.android.apps.gsa.shared.search.Query r5 = r5.f323784p
            com.google.android.apps.gsa.shared.search.Query r8 = r0.f323809e
            boolean r8 = r5.mo84383cP(r8)
            if (r8 != 0) goto L_0x0091
            com.google.android.apps.gsa.shared.search.Query r8 = r0.f323809e
            boolean r8 = r8.mo84385cR()
            if (r8 == 0) goto L_0x0073
            boolean r8 = r5.mo84397cd()
            if (r8 != 0) goto L_0x0073
            boolean r8 = r5.mo84341bZ()
            if (r8 != 0) goto L_0x0073
            r0.f323811g = r7
            r0.f323812h = r7
            r8 = 1
            goto L_0x0074
        L_0x0073:
            r8 = 0
        L_0x0074:
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f323809e
            boolean r9 = r9.mo84385cR()
            if (r9 == 0) goto L_0x008e
            boolean r9 = r5.mo84385cR()
            if (r9 == 0) goto L_0x008e
            java.lang.String r9 = r5.f252770i
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x008e
            r0.f323813i = r7
            r8 = 1
            goto L_0x0092
        L_0x008e:
            r0.f323813i = r6
            goto L_0x0092
        L_0x0091:
            r8 = 0
        L_0x0092:
            r0.f323809e = r5
            goto L_0x0096
        L_0x0095:
            r8 = 0
        L_0x0096:
            boolean r5 = r14.f234552a
            if (r5 == 0) goto L_0x00e5
            com.google.android.apps.gsa.search.core.state.dw r5 = r14.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r5 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r5
            com.google.android.apps.gsa.shared.search.Query r9 = r0.f323809e
            boolean r5 = r5.mo102986P(r9)
            if (r5 == 0) goto L_0x00e5
            com.google.android.apps.gsa.search.core.state.dw r5 = r14.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r5 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r5
            com.google.android.apps.gsa.search.shared.actions.ActionData r5 = r5.f324250j
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = r0.f323810f
            if (r9 == 0) goto L_0x00ce
            com.google.android.apps.gsa.search.shared.actions.ActionData r10 = com.google.android.apps.gsa.search.shared.actions.ActionData.f235991b
            boolean r9 = com.google.common.base.C58832aw.m90831a(r9, r10)
            if (r9 != 0) goto L_0x00ce
            com.google.android.apps.gsa.search.shared.actions.ActionData r9 = r0.f323810f
            boolean r9 = com.google.common.base.C58832aw.m90831a(r5, r9)
            if (r9 != 0) goto L_0x00ce
            if (r5 == 0) goto L_0x00cc
            boolean r9 = r5.mo81099j()
            if (r9 != 0) goto L_0x00ce
        L_0x00cc:
            r9 = 1
            goto L_0x00cf
        L_0x00ce:
            r9 = 0
        L_0x00cf:
            r0.f323810f = r5
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            if (r9 == 0) goto L_0x00e3
            com.google.android.apps.gsa.shared.util.BitFlags r5 = r0.f323807c
            r9 = 0
            r11 = 8
            boolean r5 = r5.mo85049c(r9, r11)
            if (r5 == 0) goto L_0x00e3
            r5 = 1
            goto L_0x00e4
        L_0x00e3:
            r5 = 0
        L_0x00e4:
            r8 = r8 | r5
        L_0x00e5:
            boolean r5 = r2.f234552a
            if (r5 != 0) goto L_0x00f9
            boolean r5 = r14.f234552a
            if (r5 != 0) goto L_0x00f9
            boolean r1 = r1.f234552a
            if (r1 != 0) goto L_0x00f9
            boolean r1 = r4.f234552a
            if (r1 != 0) goto L_0x00f9
            boolean r1 = r3.f234552a
            if (r1 == 0) goto L_0x0174
        L_0x00f9:
            com.google.android.apps.gsa.search.core.state.dw r1 = r14.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r1 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r1
            com.google.android.apps.gsa.search.core.state.dw r2 = r2.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.gk r2 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk) r2
            com.google.android.apps.gsa.search.shared.actions.ActionData r3 = r0.f323810f
            if (r3 == 0) goto L_0x0134
            int r3 = r3.f235999i
            com.google.android.apps.gsa.shared.search.Query r2 = r2.f323784p
            boolean r2 = r2.mo84321bF()
            if (r2 != 0) goto L_0x012c
            boolean r2 = com.google.android.apps.gsa.search.shared.p6930h.C87561d.m142217a(r3)
            if (r2 == 0) goto L_0x012d
            com.google.android.apps.gsa.search.shared.actions.VoiceAction r2 = r1.mo80807f()
            if (r2 == 0) goto L_0x0126
            boolean r2 = r2.mo81083v()
            if (r2 == 0) goto L_0x0126
            goto L_0x012c
        L_0x0126:
            boolean r1 = r1.mo102990U()
            if (r1 != 0) goto L_0x012d
        L_0x012c:
            r3 = 0
        L_0x012d:
            int r1 = r0.f323808d
            if (r3 == r1) goto L_0x0134
            r0.f323808d = r3
            goto L_0x0135
        L_0x0134:
            r6 = 0
        L_0x0135:
            r1 = r8 | r6
            com.google.android.apps.gsa.search.core.state.dw r14 = r14.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.z r14 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116836z) r14
            boolean r2 = r14.mo103003ai()
            if (r2 == 0) goto L_0x0146
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x014a
        L_0x0146:
            boolean r7 = r14.mo102989T()
        L_0x014a:
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r14 = 4
            r2 = 170(0xaa, float:2.38E-43)
            boolean r14 = r0.mo102916n(r7, r14, r2)
            boolean r2 = r0.mo102917o()
            boolean r3 = r0.mo102918p()
            r1 = r1 | r14
            r1 = r1 | r2
            r8 = r1 | r3
            if (r14 != 0) goto L_0x0163
            if (r3 == 0) goto L_0x0174
        L_0x0163:
            boolean r14 = r0.mo102914k()
            if (r14 == 0) goto L_0x0174
            dagger.a r14 = r0.f323806b
            java.lang.Object r14 = r14.mo27525b()
            com.google.android.apps.gsa.staticplugins.search.session.state.ci r14 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116625ci) r14
            r14.mo102803e()
        L_0x0174:
            if (r8 == 0) goto L_0x017b
            com.google.android.apps.gsa.staticplugins.search.session.state.gp r14 = r13.f323818a
            r14.mo80591ar()
        L_0x017b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116741gq.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
