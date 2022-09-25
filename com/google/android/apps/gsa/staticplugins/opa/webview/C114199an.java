package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.util.AndroidRuntimeException;
import android.webkit.WebView;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.an */
/* compiled from: PG */
public final /* synthetic */ class C114199an implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C114206au f316660a;

    /* renamed from: b */
    public final /* synthetic */ C89859i f316661b;

    /* renamed from: c */
    public final /* synthetic */ Query f316662c;

    public /* synthetic */ C114199an(C114206au auVar, C89859i iVar, Query query) {
        this.f316660a = auVar;
        this.f316661b = iVar;
        this.f316662c = query;
    }

    public final void run() {
        C114206au auVar = this.f316660a;
        C89859i iVar = this.f316661b;
        Query query = this.f316662c;
        Exception exc = auVar.f316689r;
        if (exc == null) {
            auVar.f316685n = true;
            C22872h.m42742b(C0826b.class);
            C58976aa aaVar = C58975e.f156826a;
            synchronized (auVar) {
                auVar.f316691t = true;
            }
            auVar.mo101260b();
            auVar.mo101261c();
            WebView webView = auVar.f316690s;
            webView.getClass();
            OpaWebView opaWebView = (OpaWebView) webView;
            opaWebView.setVisibility(4);
            opaWebView.f316493b = 0;
            opaWebView.f316494c = 0;
            opaWebView.f316498g = false;
            opaWebView.f316496e = true;
            opaWebView.f316497f = true;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.OPA_WEBVIEW_INITIALIZATION_END;
            fVar.mo83701c("rId", Long.toString(query.f252749G));
            iVar.mo74236a(fVar.mo83699a());
            return;
        }
        throw new AndroidRuntimeException(exc);
    }
}
