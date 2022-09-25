package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.webkit.JavascriptInterface;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.ag */
/* compiled from: PG */
final class C99907ag {

    /* renamed from: a */
    private final ClipboardManager f279478a;

    public C99907ag(ClipboardManager clipboardManager) {
        this.f279478a = clipboardManager;
    }

    @JavascriptInterface
    public void writeToClipboard(String str) {
        this.f279478a.setPrimaryClip(ClipData.newPlainText("collections", str));
    }
}
