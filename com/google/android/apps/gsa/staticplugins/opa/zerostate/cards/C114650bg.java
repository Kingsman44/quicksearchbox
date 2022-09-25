package com.google.android.apps.gsa.staticplugins.opa.zerostate.cards;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.cards.bg */
/* compiled from: PG */
public final /* synthetic */ class C114650bg implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ZeroStateMediaController f318070a;

    public /* synthetic */ C114650bg(ZeroStateMediaController zeroStateMediaController) {
        this.f318070a = zeroStateMediaController;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f318070a.f317943l;
        mediaController.getClass();
        mediaController.getTransportControls().pause();
    }
}
