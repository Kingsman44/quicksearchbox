package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7900a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.a.r */
/* compiled from: PG */
public final /* synthetic */ class C100451r implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C100458y f280797a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f280798b;

    public /* synthetic */ C100451r(C100458y yVar, C58833ax axVar) {
        this.f280797a = yVar;
        this.f280798b = axVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        C100458y yVar = this.f280797a;
        C58833ax axVar = this.f280798b;
        if (axVar.mo56113h()) {
            WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
            C58893dc.m90996a(a);
            if (a.canGoBack()) {
                a.goBack();
                if (!a.canGoBack()) {
                    yVar.f280813d.mo28212l("Update canGoBack", new C100437d(yVar));
                }
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
