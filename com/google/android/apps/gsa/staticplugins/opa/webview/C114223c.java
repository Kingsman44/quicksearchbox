package com.google.android.apps.gsa.staticplugins.opa.webview;

import com.google.android.apps.gsa.search.core.service.C86776s;
import com.google.android.apps.gsa.search.core.webview.C87261g;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.c */
/* compiled from: PG */
public final /* synthetic */ class C114223c implements C87261g {

    /* renamed from: a */
    public final /* synthetic */ C22871g f316734a;

    /* renamed from: b */
    public final /* synthetic */ C86776s f316735b;

    public /* synthetic */ C114223c(C22871g gVar, C86776s sVar) {
        this.f316734a = gVar;
        this.f316735b = sVar;
    }

    /* renamed from: a */
    public final void mo79400a(ClientEventData clientEventData) {
        this.f316734a.mo28212l("Send to current client", new C114225d(this.f316735b, clientEventData));
    }
}
