package com.google.android.apps.search.googleapp.searchwidget.settings.customization;

import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.settings.customization.cc */
/* compiled from: PG */
final class C139105cc implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C139099bx f378320a;

    public C139105cc(C139099bx bxVar) {
        this.f378320a = bxVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0074, code lost:
        if (r4 != 3) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.bx r14 = r13.f378320a
            com.google.android.apps.search.googleapp.searchwidget.settings.a.c r0 = r14.f378308f
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.be r1 = r14.f378313k
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.be r2 = com.google.android.apps.search.googleapp.searchwidget.C139135z.m226018d()
            boolean r2 = r1.equals(r2)
            r3 = 1
            if (r2 != 0) goto L_0x002b
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.av r1 = (com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139070av) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.be r2 = (com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139080be) r2
            int r4 = r2.f378250a
            r4 = r4 | r3
            r2.f378250a = r4
            r2.f378251b = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.be r1 = (com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139080be) r1
        L_0x002b:
            com.google.android.apps.search.googleapp.searchwidget.a.a r0 = r0.f378170c
            com.google.android.apps.gsa.w.i.q r0 = (com.google.android.apps.gsa.p8867w.p8879i.C118816q) r0
            com.google.android.apps.gsa.shared.aq.z r2 = r0.mo103995a()
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.android.apps.gsa.shared.aq.m r2 = (com.google.android.apps.gsa.shared.p6995aq.C89270m) r2
            boolean r4 = r1.f378251b
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r5 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r5
            int r6 = r5.f242075a
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            r5.f242075a = r6
            r5.f242081g = r4
            int r4 = r1.f378252c
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r5 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r5
            int r6 = r5.f242075a
            r6 = r6 | r3
            r5.f242075a = r6
            r5.f242076b = r4
            int r4 = r1.f378253d
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.bb r4 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139077bb.m225892a(r4)
            if (r4 != 0) goto L_0x0064
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.bb r4 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139077bb.BAR_RADIUS_24
        L_0x0064:
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.bd r5 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139079bd.THEME_UNKNOWN
            int r4 = r4.ordinal()
            r5 = 3
            r6 = 0
            r7 = 4
            r8 = 2
            if (r4 == 0) goto L_0x0095
            if (r4 == r3) goto L_0x0086
            if (r4 == r8) goto L_0x0077
            if (r4 == r5) goto L_0x0095
            goto L_0x00a3
        L_0x0077:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r4 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r4
            r4.f242077c = r3
            int r9 = r4.f242075a
            r9 = r9 | r7
            r4.f242075a = r9
            goto L_0x00a3
        L_0x0086:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r4 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r4
            r4.f242077c = r6
            int r9 = r4.f242075a
            r9 = r9 | r7
            r4.f242075a = r9
            goto L_0x00a3
        L_0x0095:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r4 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r4
            r4.f242077c = r8
            int r9 = r4.f242075a
            r9 = r9 | r7
            r4.f242075a = r9
        L_0x00a3:
            int r4 = r1.f378254e
            int r4 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139072ax.m225890a(r4)
            if (r4 != 0) goto L_0x00ac
            r4 = 2
        L_0x00ac:
            int r4 = r4 + -1
            r9 = 8
            if (r4 == r8) goto L_0x00c1
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r4 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r4
            r4.f242078d = r3
            int r10 = r4.f242075a
            r10 = r10 | r9
            r4.f242075a = r10
            goto L_0x00cf
        L_0x00c1:
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r4 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r4
            r4.f242078d = r6
            int r10 = r4.f242075a
            r10 = r10 | r9
            r4.f242075a = r10
        L_0x00cf:
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.az r4 = r1.f378255f
            if (r4 != 0) goto L_0x00d5
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.az r4 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139074az.f378227d
        L_0x00d5:
            int r4 = r4.f378231c
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r10 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r10
            int r11 = r10.f242075a
            r12 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 | r12
            r10.f242075a = r11
            r10.f242087m = r4
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.az r1 = r1.f378255f
            if (r1 != 0) goto L_0x00ed
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.az r1 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139074az.f378227d
        L_0x00ed:
            int r1 = r1.f378230b
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.bd r1 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139079bd.m225894a(r1)
            if (r1 != 0) goto L_0x00f7
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.bd r1 = com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139079bd.THEME_UNKNOWN
        L_0x00f7:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0136
            if (r1 == r3) goto L_0x0136
            if (r1 == r8) goto L_0x0126
            if (r1 == r5) goto L_0x0116
            if (r1 == r7) goto L_0x0106
            goto L_0x0145
        L_0x0106:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r1 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r1
            r1.f242083i = r5
            int r3 = r1.f242075a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r1.f242075a = r3
            goto L_0x0145
        L_0x0116:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r1 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r1
            r1.f242083i = r8
            int r3 = r1.f242075a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r1.f242075a = r3
            goto L_0x0145
        L_0x0126:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r1 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r1
            r1.f242083i = r3
            int r3 = r1.f242075a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r1.f242075a = r3
            goto L_0x0145
        L_0x0136:
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.gsa.shared.aq.z r1 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r1
            r1.f242083i = r6
            int r3 = r1.f242075a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r1.f242075a = r3
        L_0x0145:
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.apps.gsa.shared.aq.z r1 = (com.google.android.apps.gsa.shared.p6995aq.C89283z) r1
            byte[] r1 = r1.toByteArray()
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r9)
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.f331390a
            com.google.android.apps.gsa.search.core.preferences.q r0 = r0.mo80076b()
            java.lang.String r2 = "search_widget_style_proto"
            r0.mo80073h(r2, r1)
            r0.apply()
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            java.lang.String r1 = "Failed to update search widget customization data"
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r0, r1, r2)
            com.google.android.apps.search.googleapp.searchwidget.j r0 = r14.f378314l
            com.google.android.apps.search.googleapp.searchwidget.settings.customization.be r1 = r14.f378313k
            j.a.c.d.d r2 = p5535j.p5536a.p5545c.p5553d.C71163d.f189848d
            com.google.protobuf.bn r2 = r2.createBuilder()
            j.a.c.d.a r2 = (p5535j.p5536a.p5545c.p5553d.C71160a) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            j.a.c.d.d r3 = (p5535j.p5536a.p5545c.p5553d.C71163d) r3
            r1.getClass()
            r3.f189853c = r1
            int r1 = r3.f189851a
            r1 = r1 | r8
            r3.f189851a = r1
            com.google.protobuf.bv r1 = r2.build()
            j.a.c.d.d r1 = (p5535j.p5536a.p5545c.p5553d.C71163d) r1
            com.google.android.libraries.search.b.b r0 = r0.f378113d
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f98172hg
            com.google.protobuf.bt r3 = p5535j.p5536a.p5545c.p5553d.C71163d.f189849e
            com.google.android.libraries.search.b.i.a r1 = r2.mo40812e(r3, r1)
            r0.mo19974a(r1)
            com.google.android.apps.search.googleapp.searchwidget.z r0 = r14.f378311i
            r0.mo114759h()
            r14.mo114721a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.searchwidget.settings.customization.C139105cc.onClick(android.view.View):void");
    }
}
