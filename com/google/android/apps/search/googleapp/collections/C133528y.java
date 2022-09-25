package com.google.android.apps.search.googleapp.collections;

import android.webkit.WebSettings;
import com.google.android.libraries.web.webview.contrib.setup.C44383b;
import com.google.android.libraries.web.webview.p3491j.C44454f;

/* renamed from: com.google.android.apps.search.googleapp.collections.y */
/* compiled from: PG */
public final class C133528y implements C44383b {
    /* renamed from: a */
    public final void mo30518a(C44454f fVar) {
        WebSettings settings = fVar.getSettings();
        fVar.setFocusable(true);
        fVar.setFocusableInTouchMode(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setLoadWithOverviewMode(false);
        settings.setBuiltInZoomControls(false);
    }
}
