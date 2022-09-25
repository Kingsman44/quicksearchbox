package com.google.android.apps.search.googleapp.stampviewer.webview;

import android.webkit.WebSettings;
import com.google.android.libraries.web.webview.contrib.setup.C44383b;
import com.google.android.libraries.web.webview.p3491j.C44454f;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.aa */
/* compiled from: PG */
public final class C139514aa implements C44383b {
    /* renamed from: a */
    public final void mo30518a(C44454f fVar) {
        WebSettings settings = fVar.getSettings();
        fVar.setHorizontalScrollBarEnabled(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setTextZoom(100);
        settings.setLoadWithOverviewMode(false);
        settings.setBuiltInZoomControls(false);
        settings.setMixedContentMode(1);
    }
}
