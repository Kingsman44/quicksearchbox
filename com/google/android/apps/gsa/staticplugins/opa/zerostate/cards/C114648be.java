package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.be */
/* compiled from: PG */
public final /* synthetic */ class C114648be implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ZeroStateMediaController f318067a;

    public /* synthetic */ C114648be(ZeroStateMediaController zeroStateMediaController) {
        this.f318067a = zeroStateMediaController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f318067a.f317943l;
        mediaController.getClass();
        mediaController.getTransportControls().play();
    }
}
