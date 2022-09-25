package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bb */
/* compiled from: PG */
public final /* synthetic */ class C114645bb implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ZeroStateMediaController f318064a;

    public /* synthetic */ C114645bb(ZeroStateMediaController zeroStateMediaController) {
        this.f318064a = zeroStateMediaController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f318064a.f317943l;
        mediaController.getClass();
        mediaController.getTransportControls().skipToPrevious();
    }
}
