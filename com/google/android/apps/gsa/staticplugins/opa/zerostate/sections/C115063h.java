package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.h */
/* compiled from: PG */
public final /* synthetic */ class C115063h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AmbientMediaSectionController f319396a;

    public /* synthetic */ C115063h(AmbientMediaSectionController ambientMediaSectionController) {
        this.f319396a = ambientMediaSectionController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f319396a.f319070i;
        mediaController.getClass();
        mediaController.getTransportControls().play();
    }
}
