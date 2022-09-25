package com.google.android.apps.gsa.staticplugins.p7932f.p7934b;

import android.view.View;
import android.webkit.WebView;
import com.google.android.apps.gsa.shared.util.ViewReferenceParcelable;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.b.i */
/* compiled from: PG */
public final /* synthetic */ class C100681i implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f281517a;

    public /* synthetic */ C100681i(C58833ax axVar) {
        this.f281517a = axVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        View view;
        C58833ax axVar = this.f281517a;
        if (axVar.mo56113h() && (view = ((ViewReferenceParcelable) axVar.mo56107c()).f253768a) != null) {
            WebView webView = (WebView) view;
            if (webView.canGoBack()) {
                webView.goBack();
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
