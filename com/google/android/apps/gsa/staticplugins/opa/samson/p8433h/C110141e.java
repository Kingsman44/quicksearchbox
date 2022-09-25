package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.e */
/* compiled from: PG */
public final /* synthetic */ class C110141e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110161y f306911a;

    public /* synthetic */ C110141e(C110161y yVar) {
        this.f306911a = yVar;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f306911a.f306936D;
        mediaController.getClass();
        mediaController.getTransportControls().skipToNext();
    }
}
