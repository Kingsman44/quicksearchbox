package com.google.android.apps.gsa.search.core.webview;

import com.google.android.apps.gsa.search.core.google.C85923cq;

/* renamed from: com.google.android.apps.gsa.search.core.webview.v */
/* compiled from: PG */
public final /* synthetic */ class C87276v implements C87277w {

    /* renamed from: a */
    public final /* synthetic */ C85923cq f235734a;

    public /* synthetic */ C87276v(C85923cq cqVar) {
        this.f235734a = cqVar;
    }

    /* renamed from: a */
    public final boolean mo80921a() {
        C85923cq cqVar = this.f235734a;
        String j = cqVar.mo83212j();
        return j.equals("https") || j.equals(cqVar.f232307a.getString("debug_search_scheme_override", (String) null));
    }
}
