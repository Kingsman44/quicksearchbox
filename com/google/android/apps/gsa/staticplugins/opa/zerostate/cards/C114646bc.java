package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bc */
/* compiled from: PG */
public final /* synthetic */ class C114646bc implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ZeroStateMediaController f318065a;

    public /* synthetic */ C114646bc(ZeroStateMediaController zeroStateMediaController) {
        this.f318065a = zeroStateMediaController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f318065a.f317943l;
        mediaController.getClass();
        mediaController.getTransportControls().skipToNext();
    }
}
