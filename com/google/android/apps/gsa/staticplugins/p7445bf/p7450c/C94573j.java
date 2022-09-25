package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.j */
/* compiled from: PG */
public final /* synthetic */ class C94573j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C94574k f264533a;

    /* renamed from: b */
    public final /* synthetic */ String f264534b;

    public /* synthetic */ C94573j(C94574k kVar, String str) {
        this.f264533a = kVar;
        this.f264534b = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v3, types: [com.google.android.apps.gsa.staticplugins.bf.c.aa, java.lang.Object, com.google.android.apps.gsa.staticplugins.bf.c.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.bf.c.k r11 = r10.f264533a
            java.lang.String r0 = r10.f264534b
            com.google.android.apps.gsa.staticplugins.bf.c.l r11 = r11.f264540f
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r0)
            r11.mo88515c(r1)
            com.google.android.apps.gsa.staticplugins.bf.c.g r11 = r11.f264542b
            r1 = r11
            com.google.android.apps.gsa.staticplugins.bf.c.q r1 = (com.google.android.apps.gsa.staticplugins.p7445bf.p7450c.C94580q) r1
            com.google.assistant.at.ew r2 = r1.f264550d
            com.google.android.apps.gsa.staticplugins.bf.c.l r3 = r1.f264551e
            int r0 = r3.mo88513a(r0)
            com.google.protobuf.cq r2 = r2.f129827b
            java.lang.Object r0 = r2.get(r0)
            com.google.assistant.at.eu r0 = (com.google.assistant.p3861at.C49944eu) r0
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.bf.c.ab r1 = r1.f264549c
            com.google.common.base.ax r2 = r1.f264505b
            boolean r2 = r2.mo56113h()
            if (r2 != 0) goto L_0x0043
            com.google.common.f.e r11 = com.google.android.apps.gsa.staticplugins.p7445bf.p7450c.C94564ab.f264504a
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "VSTtsController"
            r11.mo56378ag(r0, r1)
            java.lang.String r0 = "playTts: synthesizer missing."
            r1 = 20221(0x4efd, float:2.8336E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0043:
            com.google.common.base.ax r2 = r1.f264505b
            java.lang.Object r2 = r2.mo56107c()
            r3 = r2
            com.google.android.apps.gsa.search.core.g.a.c r3 = (com.google.android.apps.gsa.search.core.p6788g.p6789a.C85773c) r3
            com.google.android.apps.gsa.search.shared.actions.util.TtsRequest r2 = new com.google.android.apps.gsa.search.shared.actions.util.TtsRequest
            java.util.Random r4 = r1.f264506c
            com.google.protobuf.cq r5 = r0.f129815f
            int r5 = r5.size()
            int r4 = r4.nextInt(r5)
            r5 = 0
            com.google.protobuf.cq r6 = r0.f129815f
            java.lang.Object r4 = r6.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            com.google.common.b.gu r6 = com.google.common.p4522b.C58485gu.m89846n(r4)
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = 1
            r2.f236282f = r4
            int r4 = r0.f129811b
            java.lang.String r5 = ""
            r6 = 3
            if (r4 != r6) goto L_0x007d
            java.lang.Object r4 = r0.f129812c
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x007f
        L_0x007d:
            r6 = r4
            r4 = r5
        L_0x007f:
            r2.f236284h = r4
            r4 = 7
            if (r6 != r4) goto L_0x0089
            java.lang.Object r4 = r0.f129812c
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
        L_0x0089:
            r2.f236286j = r5
            java.lang.String r4 = r0.f129816g
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0097
            java.lang.String r0 = r0.f129816g
            r2.f236285i = r0
        L_0x0097:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r5 = r0.toString()
            p3186j$.util.Objects.requireNonNull(r11)
            com.google.android.apps.gsa.staticplugins.bf.c.x r0 = new com.google.android.apps.gsa.staticplugins.bf.c.x
            r0.<init>(r11)
            java.lang.String r4 = "onTtsPlaybackDone"
            com.google.android.apps.gsa.shared.util.c.be r6 = r1.mo88508a(r4, r0)
            p3186j$.util.Objects.requireNonNull(r11)
            com.google.android.apps.gsa.staticplugins.bf.c.y r0 = new com.google.android.apps.gsa.staticplugins.bf.c.y
            r0.<init>(r11)
            java.lang.String r11 = "onTtsPlaybackError"
            com.google.android.apps.gsa.shared.util.c.be r7 = r1.mo88508a(r11, r0)
            r8 = 1
            r4 = r2
            r3.mo79433c(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7445bf.p7450c.C94573j.onClick(android.view.View):void");
    }
}
