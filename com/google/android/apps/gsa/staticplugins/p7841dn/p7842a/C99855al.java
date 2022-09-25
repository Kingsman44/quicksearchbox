package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.al */
/* compiled from: PG */
public final class C99855al extends C99857an {

    /* renamed from: a */
    private final C99860d f279379a;

    public C99855al(C99860d dVar, C89688a aVar, C84411o oVar) {
        super(aVar, oVar);
        this.f279379a = dVar;
    }

    @JavascriptInterface
    public void closeModalPane(String str) {
        C58976aa aaVar = C58975e.f156826a;
        this.f279379a.mo91655a(str);
    }

    @JavascriptInterface
    public void closeModalPaneWithPromise(String str, String str2, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        this.f279379a.mo91655a(str);
        mo91647a(str2, str3).mo77962d("{}");
    }
}
