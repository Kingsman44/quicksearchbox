package com.google.android.apps.gsa.search.core.state;

import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.cb */
/* compiled from: PG */
public final class C86880cb implements C87143ik {

    /* renamed from: a */
    private final C86879ca f234619a;

    /* renamed from: b */
    private final C86842bk f234620b;

    /* renamed from: c */
    private final C86842bk f234621c;

    /* renamed from: d */
    private final C86842bk f234622d;

    /* renamed from: e */
    private final C86842bk f234623e;

    public C86880cb(C86879ca caVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4) {
        this.f234619a = caVar;
        this.f234620b = new C86842bk(aVar);
        this.f234621c = new C86842bk(aVar2);
        this.f234622d = new C86842bk(aVar3);
        this.f234623e = new C86842bk(aVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f234619a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80513b(com.google.android.apps.gsa.search.core.state.C87135ic r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f234620b
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f234621c
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f234622d
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r0 = r10.f234623e
            r0.mo80534b(r11)
            com.google.android.apps.gsa.search.core.state.bk r11 = r10.f234620b
            boolean r0 = r11.f234552a
            if (r0 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f234621c
            boolean r1 = r1.f234552a
            if (r1 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f234622d
            boolean r1 = r1.f234552a
            if (r1 != 0) goto L_0x002c
            com.google.android.apps.gsa.search.core.state.bk r1 = r10.f234623e
            boolean r1 = r1.f234552a
            if (r1 == 0) goto L_0x0166
        L_0x002c:
            com.google.android.apps.gsa.search.core.state.ca r1 = r10.f234619a
            com.google.android.apps.gsa.search.core.state.bk r2 = r10.f234621c
            com.google.android.apps.gsa.search.core.state.bk r3 = r10.f234622d
            com.google.android.apps.gsa.search.core.state.bk r4 = r10.f234623e
            boolean r5 = r3.f234552a
            r6 = 1
            r7 = 0
            if (r5 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x0065
        L_0x003c:
            com.google.android.apps.gsa.search.core.state.dw r0 = r3.mo80533a()
            com.google.android.apps.gsa.search.core.state.bb r0 = (com.google.android.apps.gsa.search.core.state.C86833bb) r0
            com.google.android.apps.gsa.search.core.state.dw r3 = r11.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r3 = (com.google.android.apps.gsa.search.core.state.C86812ai) r3
            com.google.android.apps.gsa.search.shared.service.ClientConfig r3 = r3.f234471a
            boolean r3 = r3.mo81902t()
            if (r3 == 0) goto L_0x0059
            boolean r0 = r0.mo80530b()
            if (r0 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r0 = 0
            goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            boolean r3 = r1.f234616d
            if (r0 == r3) goto L_0x0065
            r1.f234616d = r0
            com.google.android.apps.gsa.search.core.al.aa.a r3 = r1.f234614b
            r3.mo78377i(r0)
        L_0x0065:
            boolean r0 = r11.f234552a
            if (r0 != 0) goto L_0x006d
            boolean r0 = r4.f234552a
            if (r0 == 0) goto L_0x009a
        L_0x006d:
            com.google.android.apps.gsa.search.core.state.dw r0 = r11.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r0 = (com.google.android.apps.gsa.search.core.state.C86812ai) r0
            long r8 = r0.f234472b
            com.google.android.apps.gsa.search.core.state.dw r0 = r4.mo80533a()
            com.google.android.apps.gsa.search.core.state.hu r0 = (com.google.android.apps.gsa.search.core.state.C87126hu) r0
            boolean r0 = r0.mo80751k()
            long r3 = r1.f234618f
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0089
            boolean r3 = r1.f234617e
            if (r0 == r3) goto L_0x009a
        L_0x0089:
            r1.f234617e = r0
            if (r0 != 0) goto L_0x009a
            com.google.android.apps.gsa.search.core.al.aa.a r0 = r1.f234614b
            dagger.a r3 = r1.f234615c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.r.a.b.a r3 = (com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a) r3
            r0.mo78376h(r8, r3)
        L_0x009a:
            boolean r0 = r2.f234552a
            if (r0 == 0) goto L_0x0142
            com.google.android.apps.gsa.search.core.state.dw r0 = r2.mo80533a()
            com.google.android.apps.gsa.search.core.state.ap r0 = (com.google.android.apps.gsa.search.core.state.C86819ap) r0
            android.util.SparseArray r2 = r0.f234499a
            java.lang.Object r2 = r2.get(r6)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r2 = (com.google.android.apps.gsa.search.shared.service.ClientEventData) r2
            if (r2 == 0) goto L_0x00b3
            android.util.SparseArray r0 = r0.f234499a
            r0.remove(r6)
        L_0x00b3:
            if (r2 == 0) goto L_0x0142
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88096p.f238183a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r2.f236955a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r3.mo58887l(r0)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r0 = r0.f169971d
            boolean r0 = r3.mo58857o(r0)
            if (r0 != 0) goto L_0x00da
            com.google.common.f.e r0 = com.google.android.apps.gsa.search.core.state.C86879ca.f234613a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "ACTIVITY_COMPLETED_WITH_RESULT client event received with the wrong extension."
            r3 = 8680(0x21e8, float:1.2163E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
            goto L_0x0142
        L_0x00da:
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88096p.f238183a
            com.google.android.apps.gsa.search.shared.service.b.bw r3 = r2.f236955a
            com.google.protobuf.bt r0 = com.google.protobuf.C62942bv.checkIsLite(r0)
            r3.mo58887l(r0)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r4 = r0.f169971d
            java.lang.Object r3 = r3.mo58854l(r4)
            if (r3 != 0) goto L_0x00f2
            java.lang.Object r0 = r0.f169969b
            goto L_0x00f6
        L_0x00f2:
            java.lang.Object r0 = r0.mo58889c(r3)
        L_0x00f6:
            com.google.android.apps.gsa.search.shared.service.b.r r0 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88150r) r0
            int r3 = r0.f238284b
            if (r3 != r6) goto L_0x0142
            int r0 = r0.f238285c
            r3 = -1
            if (r0 == r3) goto L_0x0103
            r0 = 0
            goto L_0x0104
        L_0x0103:
            r0 = 1
        L_0x0104:
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable> r3 = com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable.class
            boolean r3 = r2.mo81913d(r3)     // Catch:{ ClassCastException -> 0x0132 }
            if (r3 == 0) goto L_0x0142
            java.lang.Class<com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable> r3 = com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable.class
            android.os.Parcelable r2 = r2.mo81912b(r3)     // Catch:{ ClassCastException -> 0x0132 }
            com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable r2 = (com.google.android.apps.gsa.search.shared.service.StartActivityForResultEventCompoundParcelable) r2     // Catch:{ ClassCastException -> 0x0132 }
            java.lang.Class<com.google.android.apps.gsa.location.ImproveLocationRequest$ImproveLocationDialogMetrics> r3 = com.google.android.apps.gsa.location.ImproveLocationRequest.ImproveLocationDialogMetrics.class
            boolean r3 = r2.mo81922b(r3)     // Catch:{ ClassCastException -> 0x0132 }
            if (r3 == 0) goto L_0x0142
            java.lang.Class<com.google.android.apps.gsa.location.ImproveLocationRequest$ImproveLocationDialogMetrics> r3 = com.google.android.apps.gsa.location.ImproveLocationRequest.ImproveLocationDialogMetrics.class
            android.os.Parcelable r2 = r2.mo81921a(r3)     // Catch:{ ClassCastException -> 0x0132 }
            com.google.android.apps.gsa.location.ImproveLocationRequest$ImproveLocationDialogMetrics r2 = (com.google.android.apps.gsa.location.ImproveLocationRequest.ImproveLocationDialogMetrics) r2     // Catch:{ ClassCastException -> 0x0132 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ ClassCastException -> 0x0132 }
            android.util.Pair r0 = android.util.Pair.create(r0, r2)     // Catch:{ ClassCastException -> 0x0132 }
            com.google.android.apps.gsa.search.core.al.aa.a r2 = r1.f234614b     // Catch:{ ClassCastException -> 0x0132 }
            r2.mo78374f(r0)     // Catch:{ ClassCastException -> 0x0132 }
            goto L_0x0143
        L_0x0132:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.search.core.state.C86879ca.f234613a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r3 = "Error handling location dialog response"
            r4 = 8676(0x21e4, float:1.2158E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56386p(r3)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x0142:
            r6 = 0
        L_0x0143:
            boolean r0 = r11.f234552a
            if (r0 == 0) goto L_0x015f
            long r2 = r1.f234618f
            com.google.android.apps.gsa.search.core.state.dw r0 = r11.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r0 = (com.google.android.apps.gsa.search.core.state.C86812ai) r0
            long r4 = r0.f234472b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x015f
            com.google.android.apps.gsa.search.core.state.dw r11 = r11.mo80533a()
            com.google.android.apps.gsa.search.core.state.ai r11 = (com.google.android.apps.gsa.search.core.state.C86812ai) r11
            long r2 = r11.f234472b
            r1.f234618f = r2
        L_0x015f:
            if (r6 == 0) goto L_0x0166
            com.google.android.apps.gsa.search.core.state.ca r11 = r10.f234619a
            r11.mo80591ar()
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C86880cb.mo80513b(com.google.android.apps.gsa.search.core.state.ic):void");
    }
}
