package com.google.android.apps.gsa.staticplugins.p7845do.p7848c;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.c.b */
/* compiled from: PG */
public final /* synthetic */ class C99941b implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99947h f279581a;

    public /* synthetic */ C99941b(C99947h hVar) {
        this.f279581a = hVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        WebView a;
        ViewGroup viewGroup;
        C99947h hVar = this.f279581a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null) {
            hVar.f279588b.removeAllViews();
            if (!(a.getParent() == null || (viewGroup = (ViewGroup) a.getParent()) == null)) {
                viewGroup.removeView(a);
            }
            hVar.f279588b.addView(a);
        }
    }
}
