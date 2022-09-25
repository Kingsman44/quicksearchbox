package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.state.C86842bk;
import com.google.android.apps.gsa.search.core.state.C87141ii;
import com.google.android.apps.gsa.search.core.state.C87143ik;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.bh */
/* compiled from: PG */
public final class C116597bh implements C87143ik {

    /* renamed from: a */
    private final C116596bg f323360a;

    /* renamed from: b */
    private final C86842bk f323361b;

    /* renamed from: c */
    private final C86842bk f323362c;

    /* renamed from: d */
    private final C86842bk f323363d;

    /* renamed from: e */
    private final C86842bk f323364e;

    public C116597bh(C116596bg bgVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f323360a = bgVar;
        this.f323361b = new C86842bk(aVar);
        this.f323362c = new C86842bk(aVar2);
        this.f323363d = new C86842bk(aVar3);
        this.f323364e = new C86842bk(aVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f323360a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323361b
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323362c
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323363d
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f323364e
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r11 = r10.f323361b
            boolean r0 = r11.f234552a
            if (r0 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f323362c
            boolean r1 = r1.f234552a
            if (r1 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f323363d
            boolean r1 = r1.f234552a
            if (r1 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f323364e
            boolean r1 = r1.f234552a
            if (r1 == 0) goto L_0x017f
        L_0x002c:
            com.google.android.apps.gsa.staticplugins.search.session.state.bg r1 = r10.f323360a
            com.google.android.apps.gsa.search.core.state.bk r2 = r10.f323362c
            com.google.android.apps.gsa.search.core.state.bk r3 = r10.f323363d
            com.google.android.apps.gsa.search.core.state.bk r4 = r10.f323364e
            boolean r5 = r3.f234552a
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x0065
        L_0x003c:
            com.google.android.apps.gsa.search.core.state.dw r0 = r3.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.aq r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116579aq) r0
            com.google.android.apps.gsa.search.core.state.dw r3 = r11.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r3 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r3
            com.google.android.apps.gsa.search.shared.service.ClientConfig r3 = r3.f323267a
            boolean r3 = r3.mo81902t()
            if (r3 == 0) goto L_0x0059
            boolean r0 = r0.mo102783g()
            if (r0 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r0 = 0
            goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            boolean r3 = r1.f323356d
            if (r0 == r3) goto L_0x0065
            r1.f323356d = r0
            com.google.android.apps.gsa.search.core.al.aa.a r3 = r1.f323354b
            r3.mo78377i(r0)
        L_0x0065:
            boolean r0 = r11.f234552a
            if (r0 != 0) goto L_0x006d
            boolean r0 = r4.f234552a
            if (r0 == 0) goto L_0x009a
        L_0x006d:
            com.google.android.apps.gsa.search.core.state.dw r0 = r11.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r0
            long r8 = r0.f323268b
            com.google.android.apps.gsa.search.core.state.dw r0 = r4.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.iv r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116800iv) r0
            boolean r0 = r0.mo102950j()
            long r3 = r1.f323358f
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0089
            boolean r3 = r1.f323357e
            if (r0 == r3) goto L_0x009a
        L_0x0089:
            r1.f323357e = r0
            if (r0 != 0) goto L_0x009a
            com.google.android.apps.gsa.search.core.al.aa.a r0 = r1.f323354b
            dagger.a r3 = r1.f323355c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.r.a.b.a r3 = (com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a) r3
            r0.mo78376h(r8, r3)
        L_0x009a:
            boolean r0 = r2.f234552a
            if (r0 == 0) goto L_0x015b
            com.google.android.apps.gsa.search.core.state.dw r0 = r2.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.am r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116575am) r0
            com.google.android.apps.gsa.search.shared.service.ClientEventData r0 = r0.mo102781e(r6)
            if (r0 == 0) goto L_0x015b
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88096p.f238183a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r3.mo58887l(r2)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r2 = r2.f169971d
            boolean r2 = r3.mo58857o(r2)
            java.lang.String r3 = "S_ContextSessionState"
            if (r2 != 0) goto L_0x00d7
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.search.session.state.C116596bg.f323353a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "ACTIVITY_COMPLETED_WITH_RESULT client event received with the wrong extension."
            r3 = 32000(0x7d00, float:4.4842E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x015b
        L_0x00d7:
            com.google.protobuf.bt r2 = com.google.android.apps.gsa.search.shared.service.p6935b.C88096p.f238183a
            com.google.android.apps.gsa.search.shared.service.b.bw r4 = r0.f236955a
            com.google.protobuf.bt r2 = com.google.protobuf.C62942bv.checkIsLite(r2)
            r4.mo58887l(r2)
            com.google.protobuf.bf r4 = r4.f169962ag
            com.google.protobuf.bs r5 = r2.f169971d
            java.lang.Object r4 = r4.mo58854l(r5)
            if (r4 != 0) goto L_0x00ef
            java.lang.Object r2 = r2.f169969b
            goto L_0x00f3
        L_0x00ef:
            java.lang.Object r2 = r2.mo58889c(r4)
        L_0x00f3:
            com.google.android.apps.gsa.search.shared.service.b.r r2 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88150r) r2
            int r4 = r2.f238284b
            if (r4 != r6) goto L_0x015b
            int r2 = r2.f238285c
            r4 = -1
            if (r2 == r4) goto L_0x0107
            if (r2 == 0) goto L_0x0103
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x0105
        L_0x0103:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x0105:
            r2 = 0
            goto L_0x010a
        L_0x0107:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2 = 1
        L_0x010a:
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable> r4 = com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable.class
            boolean r4 = r0.mo81913d(r4)     // Catch:{ ClassCastException -> 0x0146 }
            if (r4 == 0) goto L_0x015b
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable> r4 = com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable.class
            android.os.Parcelable r0 = r0.mo81912b(r4)     // Catch:{ ClassCastException -> 0x0146 }
            com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable r0 = (com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable) r0     // Catch:{ ClassCastException -> 0x0146 }
            java.lang.Class<com.google.android.apps.gsa.location.ImproveLocationRequest$ImproveLocationDialogMetrics> r4 = com.google.android.apps.gsa.location.ImproveLocationRequest.ImproveLocationDialogMetrics.class
            boolean r4 = r0.mo81922b(r4)     // Catch:{ ClassCastException -> 0x0146 }
            if (r4 == 0) goto L_0x015b
            java.lang.Class<com.google.android.apps.gsa.location.ImproveLocationRequest$ImproveLocationDialogMetrics> r4 = com.google.android.apps.gsa.location.ImproveLocationRequest.ImproveLocationDialogMetrics.class
            android.os.Parcelable r0 = r0.mo81921a(r4)     // Catch:{ ClassCastException -> 0x0146 }
            com.google.android.apps.gsa.location.ImproveLocationRequest$ImproveLocationDialogMetrics r0 = (com.google.android.apps.gsa.location.ImproveLocationRequest.ImproveLocationDialogMetrics) r0     // Catch:{ ClassCastException -> 0x0146 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ ClassCastException -> 0x0146 }
            android.util.Pair r4 = android.util.Pair.create(r2, r0)     // Catch:{ ClassCastException -> 0x0146 }
            com.google.android.apps.gsa.search.core.al.aa.a r5 = r1.f323354b     // Catch:{ ClassCastException -> 0x0146 }
            r5.mo78374f(r4)     // Catch:{ ClassCastException -> 0x0146 }
            java.lang.String r0 = r0.mo70999g()     // Catch:{ ClassCastException -> 0x0146 }
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)     // Catch:{ ClassCastException -> 0x0146 }
            android.util.Pair r0 = android.util.Pair.create(r2, r0)     // Catch:{ ClassCastException -> 0x0146 }
            r1.f323359g = r0     // Catch:{ ClassCastException -> 0x0146 }
            goto L_0x015c
        L_0x0146:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.search.session.state.C116596bg.f323353a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r3)
            java.lang.String r3 = "Error handling location dialog response"
            r4 = 31996(0x7cfc, float:4.4836E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x015b:
            r6 = 0
        L_0x015c:
            boolean r0 = r11.f234552a
            if (r0 == 0) goto L_0x0178
            long r2 = r1.f323358f
            com.google.android.apps.gsa.search.core.state.dw r0 = r11.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r0 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r0
            long r4 = r0.f323268b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0178
            com.google.android.apps.gsa.search.core.state.dw r11 = r11.mo80533a()
            com.google.android.apps.gsa.staticplugins.search.session.state.ag r11 = (com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag) r11
            long r2 = r11.f323268b
            r1.f323358f = r2
        L_0x0178:
            if (r6 == 0) goto L_0x017f
            com.google.android.apps.gsa.staticplugins.search.session.state.bg r11 = r10.f323360a
            r11.mo80591ar()
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116597bh.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
