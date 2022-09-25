package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.p */
/* compiled from: PG */
public final /* synthetic */ class C99872p implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C99850ag f279407a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f279408b;

    public /* synthetic */ C99872p(C99850ag agVar, C58833ax axVar) {
        this.f279407a = agVar;
        this.f279408b = axVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        C99850ag agVar = this.f279407a;
        C58833ax axVar = this.f279408b;
        if (axVar.mo56113h()) {
            WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
            C58893dc.m90996a(a);
            if (a.canGoBack()) {
                a.goBack();
                if (!a.canGoBack()) {
                    agVar.f279341c.mo28212l("Update canGoBack", new C99866j(agVar));
                }
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
