package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.t */
/* compiled from: PG */
final class C137126t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137125s f373152a;

    public C137126t(C137125s sVar) {
        this.f373152a = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        if (((com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a.C137057a) ((p5460g.p5461a.C69464a) r1.get(r2)).mo17428b()).mo113483a(r0) == false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            com.google.android.apps.search.googleapp.promomanager.f.s r6 = r5.f373152a
            com.google.android.apps.search.googleapp.promomanager.b.dh r0 = r6.f373145d
            int r1 = r0.f372872b
            int r2 = com.google.android.apps.search.googleapp.promomanager.p10372b.C137006dg.m222698a(r1)
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x0103
            r2 = 1
            if (r3 == 0) goto L_0x00e5
            r4 = 2
            if (r3 == r2) goto L_0x0022
            if (r3 == r4) goto L_0x0017
            return
        L_0x0017:
            r6.mo113541a()
            com.google.android.apps.search.googleapp.promomanager.b.bx r0 = r6.f373144c
            com.google.android.apps.search.googleapp.promomanager.b.dh r6 = r6.f373145d
            r0.mo113456m(r6)
            return
        L_0x0022:
            if (r1 != r4) goto L_0x0029
            java.lang.Object r0 = r0.f372873c
            com.google.protos.aw.a.a.a.w r0 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w) r0
            goto L_0x002b
        L_0x0029:
            com.google.protos.aw.a.a.a.w r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63959w.f172981b
        L_0x002b:
            com.google.protobuf.bt r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq.f172793i
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x0041
            java.lang.Object r0 = r1.f169969b
            goto L_0x0045
        L_0x0041:
            java.lang.Object r0 = r1.mo58889c(r0)
        L_0x0045:
            com.google.protos.aw.a.a.a.aq r0 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63903aq) r0
            com.google.protos.aw.a.a.a.h r0 = r0.f172801g
            if (r0 != 0) goto L_0x004d
            com.google.protos.aw.a.a.a.h r0 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h.f172933b
        L_0x004d:
            int r1 = r0.f172935a
            com.google.protos.aw.a.a.a.g r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g.m96323a(r1)
            if (r1 != 0) goto L_0x0057
            com.google.protos.aw.a.a.a.g r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g.TYPE_UNSPECIFIED
        L_0x0057:
            com.google.protos.aw.a.a.a.g r3 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g.OPEN_URL
            if (r1 != r3) goto L_0x00a3
            com.google.android.apps.search.googleapp.urlhandler.k r6 = r6.f373147f
            com.google.protobuf.bt r1 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a.C63868j.f172704c
            com.google.protobuf.bt r1 = com.google.protobuf.C62942bv.checkIsLite(r1)
            r0.mo58887l(r1)
            com.google.protobuf.bf r0 = r0.f169962ag
            com.google.protobuf.bs r3 = r1.f169971d
            java.lang.Object r0 = r0.mo58854l(r3)
            if (r0 != 0) goto L_0x0073
            java.lang.Object r0 = r1.f169969b
            goto L_0x0077
        L_0x0073:
            java.lang.Object r0 = r1.mo58889c(r0)
        L_0x0077:
            com.google.protos.aw.a.a.a.a.a.j r0 = (com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a.C63868j) r0
            java.lang.String r0 = r0.f172706a
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.google.android.apps.search.googleapp.urlhandler.j r1 = com.google.android.apps.search.googleapp.urlhandler.C139823j.f380066m
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.search.googleapp.urlhandler.i r1 = (com.google.android.apps.search.googleapp.urlhandler.C139798i) r1
            com.google.android.apps.search.googleapp.urlhandler.q r3 = com.google.android.apps.search.googleapp.urlhandler.C139851q.PROMO_MANAGER
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.android.apps.search.googleapp.urlhandler.j r4 = (com.google.android.apps.search.googleapp.urlhandler.C139823j) r4
            int r3 = r3.f380143m
            r4.f380069b = r3
            int r3 = r4.f380068a
            r2 = r2 | r3
            r4.f380068a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.googleapp.urlhandler.j r1 = (com.google.android.apps.search.googleapp.urlhandler.C139823j) r1
            r6.mo115294c(r0, r1)
            return
        L_0x00a3:
            com.google.common.b.hd r1 = r6.f373148g
            int r2 = r0.f172935a
            com.google.protos.aw.a.a.a.g r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g.m96323a(r2)
            if (r2 != 0) goto L_0x00af
            com.google.protos.aw.a.a.a.g r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g.TYPE_UNSPECIFIED
        L_0x00af:
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x00d3
            com.google.common.b.hd r1 = r6.f373148g
            int r2 = r0.f172935a
            com.google.protos.aw.a.a.a.g r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g.m96323a(r2)
            if (r2 != 0) goto L_0x00c1
            com.google.protos.aw.a.a.a.g r2 = com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g.TYPE_UNSPECIFIED
        L_0x00c1:
            java.lang.Object r1 = r1.get(r2)
            g.a.a r1 = (p5460g.p5461a.C69464a) r1
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.search.googleapp.promomanager.f.a.a r1 = (com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a.C137057a) r1
            boolean r0 = r1.mo113483a(r0)
            if (r0 != 0) goto L_0x00da
        L_0x00d3:
            com.google.android.apps.search.googleapp.promomanager.b.bx r0 = r6.f373144c
            com.google.android.apps.search.googleapp.promomanager.b.dh r1 = r6.f373145d
            r0.mo113456m(r1)
        L_0x00da:
            com.google.android.apps.search.googleapp.promomanager.b.bx r0 = r6.f373144c
            com.google.android.apps.search.googleapp.promomanager.b.dh r1 = r6.f373145d
            r0.mo113455l(r1)
            r6.mo113541a()
            return
        L_0x00e5:
            if (r1 != r2) goto L_0x00ec
            java.lang.Object r0 = r0.f372873c
            com.google.protos.aq.av r0 = (com.google.protos.p4880aq.C63733av) r0
            goto L_0x00ee
        L_0x00ec:
            com.google.protos.aq.av r0 = com.google.protos.p4880aq.C63733av.f172308c
        L_0x00ee:
            int r1 = r0.f172310a
            if (r1 != r2) goto L_0x00f7
            java.lang.Object r0 = r0.f172311b
            com.google.protos.aq.q r0 = (com.google.protos.p4880aq.C63760q) r0
            goto L_0x00f9
        L_0x00f7:
            com.google.protos.aq.q r0 = com.google.protos.p4880aq.C63760q.f172487j
        L_0x00f9:
            com.google.protos.aq.o r0 = r0.f172497i
            if (r0 != 0) goto L_0x00ff
            com.google.protos.aq.o r0 = com.google.protos.p4880aq.C63758o.f172481e
        L_0x00ff:
            r6.mo113542b(r0)
            return
        L_0x0103:
            r6 = 0
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.promomanager.p10377f.C137126t.onClick(android.view.View):void");
    }
}
