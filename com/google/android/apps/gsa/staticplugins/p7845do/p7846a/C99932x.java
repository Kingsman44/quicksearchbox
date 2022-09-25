package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58893dc;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.x */
/* compiled from: PG */
public final /* synthetic */ class C99932x implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279565a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f279566b;

    public /* synthetic */ C99932x(C99908ah ahVar, C58833ax axVar) {
        this.f279565a = ahVar;
        this.f279566b = axVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        C99908ah ahVar = this.f279565a;
        C58833ax axVar = this.f279566b;
        if (axVar.mo56113h()) {
            WebView a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a();
            C58893dc.m90996a(a);
            if (a.canGoBack()) {
                a.goBack();
                if (!a.canGoBack()) {
                    ahVar.f279483d.mo28212l("Update canGoBack", new C99931w(ahVar));
                }
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
