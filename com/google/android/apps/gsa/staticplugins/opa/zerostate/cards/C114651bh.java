package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bh */
/* compiled from: PG */
public final /* synthetic */ class C114651bh implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ZeroStateMediaController f318071a;

    public /* synthetic */ C114651bh(ZeroStateMediaController zeroStateMediaController) {
        this.f318071a = zeroStateMediaController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f318071a.f317943l;
        mediaController.getClass();
        mediaController.getTransportControls().stop();
    }
}
