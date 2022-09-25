package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.libraries.gsa.monet.shared.C23123s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fk */
/* compiled from: PG */
public final /* synthetic */ class C115797fk implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115801fo f321125a;

    public /* synthetic */ C115797fk(C115801fo foVar) {
        this.f321125a = foVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28366a(java.lang.Object r5) {
        /*
            r4 = this;
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fo r0 = r4.f321125a
            com.google.common.b.gu r5 = (com.google.common.p4522b.C58485gu) r5
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            android.view.View r1 = r0.f321136k
            r2 = 8
            r1.setVisibility(r2)
            r0.f321132g = r5
            android.support.v7.widget.RecyclerView r5 = r0.f321131f
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.VoiceLayoutManager r1 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.VoiceLayoutManager
            android.content.Context r2 = r0.f321208b
            r1.<init>(r2)
            r5.setLayoutManager(r1)
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fv r5 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fv
            java.util.List r1 = r0.f321132g
            r5.<init>(r1)
            r0.f321135j = r5
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fv r5 = r0.f321135j
            r5.f321154c = r0
            android.support.v7.widget.RecyclerView r1 = r0.f321131f
            r1.setAdapter(r5)
            android.support.v7.widget.RecyclerView r5 = r0.f321131f
            android.content.Context r5 = r5.getContext()
            android.view.View r1 = r0.mo28297il()
            android.view.Display r1 = r1.getDisplay()
            r2 = 0
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "display"
            java.lang.Object r5 = r5.getSystemService(r1)
            android.hardware.display.DisplayManager r5 = (android.hardware.display.DisplayManager) r5
            if (r5 == 0) goto L_0x0054
            android.view.Display r1 = r5.getDisplay(r2)
            goto L_0x0056
        L_0x0054:
            r5 = 0
            goto L_0x0060
        L_0x0056:
            android.graphics.Point r5 = new android.graphics.Point
            r5.<init>()
            r1.getSize(r5)
            int r5 = r5.x
        L_0x0060:
            if (r5 != 0) goto L_0x0077
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr.C115801fo.f321130e
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "SpeakrVoiceSelectionR"
            r5.mo56378ag(r1, r2)
            java.lang.String r1 = "Unable to get screen width. Not adjusting."
            r2 = 30084(0x7584, float:4.2157E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r2)).mo56386p(r1)
            goto L_0x008c
        L_0x0077:
            android.support.v7.widget.RecyclerView r1 = r0.f321131f
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131173079(0x7f071ed7, float:1.796059E38)
            int r1 = r1.getDimensionPixelSize(r3)
            int r5 = r5 - r1
            int r5 = r5 / 2
            android.support.v7.widget.RecyclerView r1 = r0.f321131f
            r1.setPadding(r5, r2, r5, r2)
        L_0x008c:
            r0.mo102269g()
            android.support.v7.widget.RecyclerView r5 = r0.f321131f
            android.support.v7.widget.fo r1 = r5.mLayout
            if (r1 == 0) goto L_0x009d
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fx r2 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fx
            r2.<init>(r1, r0)
            r2.mo3197g(r5)
        L_0x009d:
            android.view.View r5 = r0.f321134i
            com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fh r1 = new com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fh
            r1.<init>(r0)
            r5.setOnTouchListener(r1)
            android.view.View r5 = r0.f321134i
            r5.setOnClickListener(r0)
            com.airbnb.lottie.LottieAnimationView r5 = r0.f321133h
            r1 = 1
            r5.mo9693d(r1)
            com.airbnb.lottie.LottieAnimationView r5 = r0.f321133h
            java.lang.String r1 = "voice_selection_animation.json"
            r5.mo9700j(r1)
            r0.mo102269g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr.C115797fk.mo28366a(java.lang.Object):void");
    }
}
