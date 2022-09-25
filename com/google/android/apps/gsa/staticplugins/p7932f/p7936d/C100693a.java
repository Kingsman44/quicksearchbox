package com.google.android.apps.gsa.staticplugins.p7932f.p7936d;

import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.util.ViewReferenceParcelable;
import com.google.android.libraries.assistant.ampactions.C11038k;
import com.google.android.libraries.assistant.ampactions.C11039l;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.f.d.a */
/* compiled from: PG */
public final /* synthetic */ class C100693a implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100700h f281552a;

    public /* synthetic */ C100693a(C100700h hVar) {
        this.f281552a = hVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        View view;
        C100700h hVar = this.f281552a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && (view = ((ViewReferenceParcelable) axVar.mo56107c()).f253768a) != null) {
            C11039l lVar = hVar.f281559a;
            if (lVar.f36265l != view) {
                Log.d("AmpActionsView", "Updating WebView");
                WebView webView = (WebView) view;
                lVar.f36265l = webView;
                webView.setVisibility(0);
                webView.onResume();
                lVar.f36255b.removeAllViews();
                webView.setWebChromeClient(new C11038k(lVar));
                lVar.f36255b.addView(view, new FrameLayout.LayoutParams(-1, -1, 1));
            }
        }
    }
}
