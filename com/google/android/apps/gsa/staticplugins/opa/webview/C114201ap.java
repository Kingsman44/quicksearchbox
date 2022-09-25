package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.webkit.WebSettings;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ap */
/* compiled from: PG */
public final /* synthetic */ class C114201ap implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114206au f316667a;

    public /* synthetic */ C114201ap(C114206au auVar) {
        this.f316667a = auVar;
    }

    public final void run() {
        C114206au auVar = this.f316667a;
        try {
            WebSettings.getDefaultUserAgent(auVar.f316673b);
        } catch (Exception e) {
            C59104x d = C114206au.f316672a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OpaWebViewPool");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(28804)).mo56386p("#preloadWebView got exception");
            if (!C114206au.m189467d(e)) {
                auVar.f316689r = e;
            }
        }
    }
}
