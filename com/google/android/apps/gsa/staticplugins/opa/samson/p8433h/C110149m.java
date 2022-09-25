package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.media.session.MediaController;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.m */
/* compiled from: PG */
public final /* synthetic */ class C110149m implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110161y f306920a;

    public /* synthetic */ C110149m(C110161y yVar) {
        this.f306920a = yVar;
    }

    public final void onClick(View view) {
        MediaController mediaController = this.f306920a.f306936D;
        mediaController.getClass();
        mediaController.getTransportControls().play();
    }
}
