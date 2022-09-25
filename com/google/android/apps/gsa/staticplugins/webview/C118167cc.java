package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.JavascriptInterface;
import com.google.common.base.C58887cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cc */
/* compiled from: PG */
public final class C118167cc {

    /* renamed from: a */
    private final Throwable f328032a;

    public C118167cc(Throwable th) {
        this.f328032a = th;
    }

    @JavascriptInterface
    public String getMessage() {
        return this.f328032a.getMessage();
    }

    @JavascriptInterface
    public String getStackTrace() {
        return C58887cx.m90975b(this.f328032a);
    }

    @JavascriptInterface
    public String getType() {
        return this.f328032a.getClass().getName();
    }
}
