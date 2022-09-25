package com.google.android.libraries.p579ar.sceneviewer.modelviewer;

import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.libraries.ar.sceneviewer.modelviewer.c */
/* compiled from: PG */
final class C10736c {

    /* renamed from: a */
    final /* synthetic */ WebModelView f35673a;

    public C10736c(WebModelView webModelView) {
        this.f35673a = webModelView;
    }

    @JavascriptInterface
    public void modelViewerModelVisible() {
        this.f35673a.post(new WebModelView$JavascriptCallbacks$$ExternalSyntheticLambda0(this));
    }
}
