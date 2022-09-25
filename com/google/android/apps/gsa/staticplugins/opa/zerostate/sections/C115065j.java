package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.j */
/* compiled from: PG */
public final /* synthetic */ class C115065j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AmbientMediaSectionController f319398a;

    public /* synthetic */ C115065j(AmbientMediaSectionController ambientMediaSectionController) {
        this.f319398a = ambientMediaSectionController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f319398a.f319070i;
        mediaController.getClass();
        mediaController.getTransportControls().stop();
    }
}
