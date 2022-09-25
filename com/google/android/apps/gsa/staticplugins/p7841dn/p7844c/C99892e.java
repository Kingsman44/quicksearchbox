package com.google.android.apps.gsa.staticplugins.p7841dn.p7844c;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.apps.gsa.search.core.webview.GsaWebViewContainer;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.c.e */
/* compiled from: PG */
public final /* synthetic */ class C99892e implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C99898k f279443a;

    public /* synthetic */ C99892e(C99898k kVar) {
        this.f279443a = kVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        WebView a;
        ViewGroup viewGroup;
        C99898k kVar = this.f279443a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && (a = ((GsaWebViewContainer) axVar.mo56107c()).mo80858a()) != null) {
            kVar.f279451c.removeAllViews();
            if (!(a.getParent() == null || (viewGroup = (ViewGroup) a.getParent()) == null)) {
                viewGroup.removeView(a);
            }
            kVar.f279451c.addView(a);
        }
    }
}
