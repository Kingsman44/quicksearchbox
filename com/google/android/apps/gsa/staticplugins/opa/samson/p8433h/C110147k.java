package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.k */
/* compiled from: PG */
public final /* synthetic */ class C110147k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110161y f306918a;

    public /* synthetic */ C110147k(C110161y yVar) {
        this.f306918a = yVar;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f306918a.f306936D;
        mediaController.getClass();
        mediaController.getTransportControls().pause();
    }
}
