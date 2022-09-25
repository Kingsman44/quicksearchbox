package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fw */
/* compiled from: PG */
public final /* synthetic */ class C105630fw implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C105638gd f294708a;

    public /* synthetic */ C105630fw(C105638gd gdVar) {
        this.f294708a = gdVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28366a(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.gd r2 = r1.f294708a
            r0 = r21
            com.google.android.apps.g.d.ef r0 = (com.google.android.apps.p489g.p494d.C9251ef) r0
            com.google.android.apps.g.d.ef r3 = com.google.android.apps.p489g.p494d.C9251ef.f31988f
            boolean r3 = com.google.common.base.C58832aw.m90831a(r0, r3)
            r4 = 0
            if (r3 != 0) goto L_0x0343
            r2.f294726g = r0
            android.view.ViewGroup r0 = r2.f294728i
            r3 = 4
            r0.setVisibility(r3)
            com.google.android.apps.g.d.ef r3 = r2.f294726g
            r5 = 1
            if (r3 != 0) goto L_0x0024
            com.google.android.apps.gsa.staticplugins.nowstream.shared.c.aa r0 = r2.f294723d
            r0.mo94704f(r5)
            return
        L_0x0024:
            f.a.a.a.av r0 = r3.f31992c
            if (r0 != 0) goto L_0x002a
            f.a.a.a.av r0 = p5451f.p5452a.p5453a.p5454a.C69400av.f185693h
        L_0x002a:
            android.view.ViewGroup r6 = r2.f294728i
            r7 = 0
            r6.setOnClickListener(r7)
            int r6 = r0.f185695a
            r7 = 8
            r6 = r6 & r7
            if (r6 == 0) goto L_0x0042
            android.view.ViewGroup r6 = r2.f294728i
            com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ft r8 = new com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ft
            r8.<init>(r2)
            r6.setOnClickListener(r8)
            goto L_0x004c
        L_0x0042:
            android.view.ViewGroup r6 = r2.f294728i
            com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fu r8 = new com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fu
            r8.<init>(r2)
            r6.setOnClickListener(r8)
        L_0x004c:
            android.widget.ImageView r6 = r2.f294734o
            com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fv r8 = new com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fv
            r8.<init>(r2)
            r6.setOnClickListener(r8)
            android.widget.TextView r6 = r2.f294732m
            r6.setVisibility(r4)
            android.widget.TextView r6 = r2.f294732m
            com.google.android.apps.gsa.sidekick.shared.monet.d.a r8 = r2.f294725f
            int r8 = r8.mo86288l()
            double r8 = (double) r8
            r10 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r10
            android.content.Context r12 = r2.f294724e
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131172785(0x7f071db1, float:1.7959995E38)
            int r12 = r12.getDimensionPixelSize(r13)
            double r12 = (double) r12
            java.lang.Double.isNaN(r12)
            double r8 = r8 - r12
            int r8 = (int) r8
            r6.setMaxWidth(r8)
            int r6 = r0.f185695a
            r6 = r6 & 16
            r8 = 2
            if (r6 == 0) goto L_0x00ff
            f.a.a.a.t r6 = r0.f185700f
            if (r6 != 0) goto L_0x0091
            f.a.a.a.t r6 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c
        L_0x0091:
            int r6 = r6.f185863a
            java.lang.String r9 = ""
            if (r6 != r5) goto L_0x00b1
            android.widget.TextView r6 = r2.f294732m
            f.a.a.a.t r0 = r0.f185700f
            if (r0 != 0) goto L_0x009f
            f.a.a.a.t r0 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c
        L_0x009f:
            int r12 = r0.f185863a
            if (r12 != r5) goto L_0x00a8
            java.lang.Object r0 = r0.f185864b
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
        L_0x00a8:
            android.text.Spanned r0 = android.text.Html.fromHtml(r9)
            r6.setText(r0)
            goto L_0x0192
        L_0x00b1:
            f.a.a.a.t r0 = r0.f185700f
            if (r0 != 0) goto L_0x00b8
            f.a.a.a.t r6 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c
            goto L_0x00b9
        L_0x00b8:
            r6 = r0
        L_0x00b9:
            int r6 = r6.f185863a
            if (r6 != r8) goto L_0x0192
            android.content.Context r6 = r2.f294724e     // Catch:{ FileNotFoundException -> 0x00ef }
            if (r0 != 0) goto L_0x00c3
            f.a.a.a.t r0 = p5451f.p5452a.p5453a.p5454a.C69455t.f185861c     // Catch:{ FileNotFoundException -> 0x00ef }
        L_0x00c3:
            int r12 = r0.f185863a     // Catch:{ FileNotFoundException -> 0x00ef }
            if (r12 != r8) goto L_0x00cc
            java.lang.Object r0 = r0.f185864b     // Catch:{ FileNotFoundException -> 0x00ef }
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ FileNotFoundException -> 0x00ef }
        L_0x00cc:
            android.net.Uri r0 = android.net.Uri.parse(r9)     // Catch:{ FileNotFoundException -> 0x00ef }
            android.util.Pair r0 = com.google.android.apps.gsa.shared.util.C90772bp.m148303k(r6, r0)     // Catch:{ FileNotFoundException -> 0x00ef }
            android.widget.TextView r6 = r2.f294732m     // Catch:{ FileNotFoundException -> 0x00ef }
            java.lang.Object r9 = r0.first     // Catch:{ FileNotFoundException -> 0x00ef }
            android.content.res.Resources r9 = (android.content.res.Resources) r9     // Catch:{ FileNotFoundException -> 0x00ef }
            java.lang.Object r0 = r0.second     // Catch:{ FileNotFoundException -> 0x00ef }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ FileNotFoundException -> 0x00ef }
            int r0 = r0.intValue()     // Catch:{ FileNotFoundException -> 0x00ef }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ FileNotFoundException -> 0x00ef }
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)     // Catch:{ FileNotFoundException -> 0x00ef }
            r6.setText(r0)     // Catch:{ FileNotFoundException -> 0x00ef }
            goto L_0x0192
        L_0x00ef:
            r0 = move-exception
            com.google.common.f.e r6 = com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105638gd.f294719a
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r9 = "Cannot find string for uri."
            r12 = 22378(0x576a, float:3.1358E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r0)).mo56372aa(r12)).mo56386p(r9)
            goto L_0x0192
        L_0x00ff:
            com.google.protobuf.cq r6 = r0.f185697c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0192
            com.google.protobuf.cq r6 = r0.f185697c
            java.lang.Object r9 = r6.get(r4)
            com.google.ai.b.lb r9 = (com.google.p375ai.p378b.C7818lb) r9
            int r9 = r9.f27418a
            r9 = r9 & r8
            if (r9 == 0) goto L_0x0121
            android.widget.TextView r9 = r2.f294732m
            java.lang.Object r12 = r6.get(r4)
            com.google.ai.b.lb r12 = (com.google.p375ai.p378b.C7818lb) r12
            int r12 = r12.f27421d
            r9.setMaxLines(r12)
        L_0x0121:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Object r6 = r6.get(r4)
            com.google.ai.b.lb r6 = (com.google.p375ai.p378b.C7818lb) r6
            com.google.protobuf.cq r6 = r6.f27419b
            java.util.Iterator r6 = r6.iterator()
        L_0x0132:
            boolean r12 = r6.hasNext()
            if (r12 == 0) goto L_0x0175
            java.lang.Object r12 = r6.next()
            com.google.ai.b.kv r12 = (com.google.p375ai.p378b.C7811kv) r12
            int r13 = r12.f27308b
            if (r13 != r5) goto L_0x0147
            java.lang.Object r13 = r12.f27309c
            com.google.ai.b.ll r13 = (com.google.p375ai.p378b.C7828ll) r13
            goto L_0x0149
        L_0x0147:
            com.google.ai.b.ll r13 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x0149:
            com.google.ai.b.xj r13 = r13.f27458b
            if (r13 != 0) goto L_0x014f
            com.google.ai.b.xj r13 = com.google.p375ai.p378b.C8150xj.f28657d
        L_0x014f:
            java.lang.String r13 = r13.f28660b
            r9.append(r13)
            int r13 = r12.f27308b
            if (r13 != r5) goto L_0x015d
            java.lang.Object r14 = r12.f27309c
            com.google.ai.b.ll r14 = (com.google.p375ai.p378b.C7828ll) r14
            goto L_0x015f
        L_0x015d:
            com.google.ai.b.ll r14 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x015f:
            int r14 = r14.f27457a
            r14 = r14 & r8
            if (r14 == 0) goto L_0x0132
            android.widget.TextView r14 = r2.f294732m
            if (r13 != r5) goto L_0x016d
            java.lang.Object r12 = r12.f27309c
            com.google.ai.b.ll r12 = (com.google.p375ai.p378b.C7828ll) r12
            goto L_0x016f
        L_0x016d:
            com.google.ai.b.ll r12 = com.google.p375ai.p378b.C7828ll.f27455e
        L_0x016f:
            int r12 = r12.f27459c
            r14.setTextColor(r12)
            goto L_0x0132
        L_0x0175:
            java.lang.String r6 = r9.toString()
            android.widget.TextView r9 = r2.f294732m
            r9.setText(r6)
            int r6 = r0.f185695a
            r6 = r6 & r8
            if (r6 == 0) goto L_0x0192
            android.widget.TextView r6 = r2.f294732m
            int r0 = r0.f185698d
            float r0 = (float) r0
            android.content.Context r9 = r2.f294724e
            float r0 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148870b(r0, r9)
            int r0 = (int) r0
            r6.setMaxWidth(r0)
        L_0x0192:
            android.widget.TextView r0 = r2.f294732m
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01a4
            com.google.android.apps.gsa.staticplugins.nowstream.shared.c.aa r0 = r2.f294723d
            r0.mo94704f(r4)
            return
        L_0x01a4:
            android.view.ViewGroup r0 = r2.f294728i
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            r0.measure(r6, r9)
            com.google.android.apps.g.d.l r0 = r3.f31993d
            if (r0 != 0) goto L_0x01b7
            com.google.android.apps.g.d.l r0 = com.google.android.apps.p489g.p494d.C9268l.f32065f
        L_0x01b7:
            int r6 = r0.f32068b
            int r9 = r0.f32069c
            int r12 = r0.f32070d
            int r0 = r0.f32071e
            int r13 = r6 + r12
            int r13 = r13 / r8
            com.google.android.apps.gsa.shared.ui.TouchInterceptingFrameLayout r14 = r2.f294727h
            boolean r14 = com.google.android.apps.gsa.shared.util.p7187ui.C91115n.m148876h(r14)
            android.view.ViewGroup r15 = r2.f294728i
            r10 = 2131436642(0x7f0b2462, float:1.849516E38)
            android.view.View r11 = r15.findViewById(r10)
            r11.setVisibility(r7)
            android.view.ViewGroup r11 = r2.f294728i
            r15 = 2131436640(0x7f0b2460, float:1.8495156E38)
            android.view.View r11 = r11.findViewById(r15)
            r11.setVisibility(r7)
            android.view.ViewGroup r11 = r2.f294728i
            r10 = 2131436641(0x7f0b2461, float:1.8495158E38)
            android.view.View r11 = r11.findViewById(r10)
            r11.setVisibility(r7)
            double r10 = (double) r13
            com.google.android.apps.gsa.sidekick.shared.monet.d.a r7 = r2.f294725f
            int r7 = r7.mo86288l()
            double r4 = (double) r7
            r18 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r18
            r7 = 2131172774(0x7f071da6, float:1.7959972E38)
            r15 = 2131170796(0x7f0715ec, float:1.795596E38)
            int r19 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r19 > 0) goto L_0x0234
            android.content.Context r4 = r2.f294724e
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r15)
            int r4 = r4 / r8
            android.content.Context r5 = r2.f294724e
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r7)
            int r4 = r4 + r5
            android.view.ViewGroup r5 = r2.f294728i
            r7 = 1
            if (r7 == r14) goto L_0x0227
            r10 = 2131436642(0x7f0b2462, float:1.849516E38)
            goto L_0x022a
        L_0x0227:
            r10 = 2131436641(0x7f0b2461, float:1.8495158E38)
        L_0x022a:
            android.view.View r5 = r5.findViewById(r10)
            r7 = 0
            r5.setVisibility(r7)
            r7 = 2
            goto L_0x0294
        L_0x0234:
            r4 = 0
            com.google.android.apps.gsa.sidekick.shared.monet.d.a r5 = r2.f294725f
            int r5 = r5.mo86288l()
            double r7 = (double) r5
            java.lang.Double.isNaN(r7)
            r16 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r7 = r7 * r16
            int r5 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0260
            android.view.ViewGroup r5 = r2.f294728i
            r7 = 2131436640(0x7f0b2460, float:1.8495156E38)
            android.view.View r5 = r5.findViewById(r7)
            r5.setVisibility(r4)
            android.view.ViewGroup r5 = r2.f294728i
            int r5 = r5.getMeasuredWidth()
            r7 = 2
            int r5 = r5 / r7
            r4 = r5
            goto L_0x0294
        L_0x0260:
            android.view.ViewGroup r5 = r2.f294728i
            r7 = 1
            if (r7 == r14) goto L_0x0269
            r10 = 2131436641(0x7f0b2461, float:1.8495158E38)
            goto L_0x026c
        L_0x0269:
            r10 = 2131436642(0x7f0b2462, float:1.849516E38)
        L_0x026c:
            android.view.View r5 = r5.findViewById(r10)
            r5.setVisibility(r4)
            android.view.ViewGroup r4 = r2.f294728i
            int r4 = r4.getMeasuredWidth()
            android.content.Context r5 = r2.f294724e
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getDimensionPixelSize(r15)
            r7 = 2
            int r5 = r5 / r7
            android.content.Context r8 = r2.f294724e
            android.content.res.Resources r8 = r8.getResources()
            r10 = 2131172774(0x7f071da6, float:1.7959972E38)
            int r8 = r8.getDimensionPixelSize(r10)
            int r5 = r5 + r8
            int r4 = r4 - r5
        L_0x0294:
            android.view.ViewGroup r5 = r2.f294728i
            android.view.ViewPropertyAnimator r5 = r5.animate()
            r2.f294731l = r5
            int[] r5 = new int[r7]
            com.google.android.apps.gsa.sidekick.shared.monet.d.a r7 = r2.f294725f
            r7.mo86292q(r5)
            int r13 = r13 - r4
            r4 = 0
            r7 = r5[r4]
            int r13 = r13 - r7
            int r4 = r2.f294733n
            int r4 = r0 - r4
            r7 = 1
            r5 = r5[r7]
            int r4 = r4 - r5
            android.content.Context r5 = r2.f294724e
            android.content.res.Resources r5 = r5.getResources()
            r7 = 2131172784(0x7f071db0, float:1.7959993E38)
            int r5 = r5.getDimensionPixelSize(r7)
            int r4 = r4 - r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r6, r9, r12, r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            android.view.ViewGroup r6 = r2.f294728i
            int r6 = r6.getMeasuredWidth()
            int r6 = r6 + r13
            android.view.ViewGroup r7 = r2.f294728i
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r4
            r0.<init>(r13, r4, r6, r7)
            r5.union(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            com.google.android.apps.gsa.sidekick.shared.monet.d.a r6 = r2.f294725f
            int r6 = r6.mo86288l()
            com.google.android.apps.gsa.sidekick.shared.monet.d.a r7 = r2.f294725f
            int r7 = r7.mo86285i()
            r8 = 0
            r0.<init>(r8, r8, r6, r7)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x033c
            if (r4 <= 0) goto L_0x033c
            if (r13 > 0) goto L_0x02f6
            goto L_0x033c
        L_0x02f6:
            com.google.android.apps.gsa.staticplugins.nowstream.shared.c.ad r0 = r2.f294722c
            com.google.android.libraries.gsa.monet.tools.model.shared.b r0 = r0.mo94657b()
            com.google.android.libraries.gsa.monet.tools.model.shared.a.a r0 = (com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a) r0
            java.lang.Object r0 = r0.mo28725a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2.mo94943g(r0)
            android.view.ViewGroup r0 = r2.f294728i
            r5 = 0
            r0.setAlpha(r5)
            android.view.ViewGroup r0 = r2.f294728i
            r5 = 1065017672(0x3f7ae148, float:0.98)
            r0.setScaleX(r5)
            android.view.ViewGroup r0 = r2.f294728i
            r0.setScaleY(r5)
            com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fz r0 = new com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.fz
            r0.<init>(r2)
            r2.f294730k = r0
            com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ga r0 = new com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ga
            r0.<init>(r2, r4, r3)
            r2.f294729j = r0
            android.view.ViewPropertyAnimator r0 = r2.f294731l
            r0.getClass()
            float r3 = (float) r13
            android.view.ViewPropertyAnimator r0 = r0.x(r3)
            android.animation.AnimatorListenerAdapter r2 = r2.f294729j
            r0.setListener(r2)
            return
        L_0x033c:
            com.google.android.apps.gsa.staticplugins.nowstream.shared.c.aa r0 = r2.f294723d
            r3 = 0
            r0.mo94704f(r3)
            return
        L_0x0343:
            r3 = 0
            r2.mo94942e(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.C105630fw.mo28366a(java.lang.Object):void");
    }
}
