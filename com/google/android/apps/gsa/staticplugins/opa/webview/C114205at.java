package com.google.android.apps.gsa.staticplugins.opa.webview;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58887cx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.at */
/* compiled from: PG */
final class C114205at implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C114206au f316671a;

    public C114205at(C114206au auVar) {
        this.f316671a = auVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C114206au.f316672a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OpaWebViewPool");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(28801)).mo56386p("prewarmWebViewImpl onFailure maybeCreateWebView");
        C58887cx.m90979f(th, Error.class);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Void voidR = (Void) obj;
        C114206au auVar = this.f316671a;
        auVar.f316674c.mo28213m("postCreateWebView", 10, new C114204as(auVar));
    }
}
