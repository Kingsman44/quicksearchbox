package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.i */
/* compiled from: PG */
public final /* synthetic */ class C115064i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AmbientMediaSectionController f319397a;

    public /* synthetic */ C115064i(AmbientMediaSectionController ambientMediaSectionController) {
        this.f319397a = ambientMediaSectionController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f319397a.f319070i;
        mediaController.getClass();
        mediaController.getTransportControls().pause();
    }
}
