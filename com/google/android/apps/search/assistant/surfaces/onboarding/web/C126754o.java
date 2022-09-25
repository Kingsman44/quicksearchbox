package com.google.android.apps.search.assistant.surfaces.onboarding.web;

import android.webkit.WebSettings;
import com.google.android.libraries.web.webview.contrib.setup.C44383b;
import com.google.android.libraries.web.webview.p3491j.C44454f;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.web.o */
/* compiled from: PG */
public final class C126754o implements C44383b {
    /* renamed from: a */
    public final void mo30518a(C44454f fVar) {
        WebSettings settings = fVar.getSettings();
        fVar.setHorizontalScrollBarEnabled(false);
        settings.setUseWideViewPort(false);
        settings.setLoadWithOverviewMode(false);
    }
}
