package com.google.android.apps.gsa.staticplugins.p7841dn.p7842a;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84402f;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dn.a.aj */
/* compiled from: PG */
public final class C99853aj extends C99857an {

    /* renamed from: a */
    private final C84402f f279377a;

    public C99853aj(C84402f fVar, C89688a aVar, C84411o oVar) {
        super(aVar, oVar);
        this.f279377a = fVar;
    }

    @JavascriptInterface
    public void closeMediaPane() {
        this.f279377a.mo77956a();
    }

    @JavascriptInterface
    public void closeMediaPaneWithPromise(String str, String str2) {
        this.f279377a.mo77956a();
        mo91647a(str, str2).mo77962d("{}");
    }
}
