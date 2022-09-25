package com.google.android.apps.gsa.staticplugins.p7898ee.p7899a.p7902c;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.ee.a.c.b */
/* compiled from: PG */
public final /* synthetic */ class C100466b implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C100470f f280856a;

    public /* synthetic */ C100466b(C100470f fVar) {
        this.f280856a = fVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        WebView a;
        ViewGroup viewGroup;
        C100470f fVar = this.f280856a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null) {
            fVar.f280861b.removeAllViews();
            if (!(a.getParent() == null || (viewGroup = (ViewGroup) a.getParent()) == null)) {
                viewGroup.removeView(a);
            }
            fVar.f280861b.addView(a);
        }
    }
}
