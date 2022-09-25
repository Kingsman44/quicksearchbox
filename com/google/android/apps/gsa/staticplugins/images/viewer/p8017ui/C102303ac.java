package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.ac */
/* compiled from: PG */
public final /* synthetic */ class C102303ac implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ImageViewerPage f285537a;

    public /* synthetic */ C102303ac(ImageViewerPage imageViewerPage) {
        this.f285537a = imageViewerPage;
    }

    public final void onClick(View view) {
        C102374p pVar = this.f285537a.f285454a;
        if (pVar.mo93176g()) {
            C102288a aVar = pVar.f285679a;
            ((C102289b) aVar).f285407a.mo28345s("sharePersonalPhoto", "ImagePageEventsDispatcher", new Bundle());
        }
    }
}
