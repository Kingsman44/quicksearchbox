package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.d */
/* compiled from: PG */
public final /* synthetic */ class C110140d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110161y f306910a;

    public /* synthetic */ C110140d(C110161y yVar) {
        this.f306910a = yVar;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f306910a.f306936D;
        mediaController.getClass();
        mediaController.getTransportControls().skipToPrevious();
    }
}
