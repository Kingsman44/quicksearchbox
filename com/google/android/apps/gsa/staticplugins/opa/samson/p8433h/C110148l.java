package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.l */
/* compiled from: PG */
public final /* synthetic */ class C110148l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110161y f306919a;

    public /* synthetic */ C110148l(C110161y yVar) {
        this.f306919a = yVar;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f306919a.f306936D;
        mediaController.getClass();
        mediaController.getTransportControls().stop();
    }
}
