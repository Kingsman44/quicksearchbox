package com.google.android.libraries.assistant.ampactions;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.ampactions.m */
/* compiled from: PG */
final class C11040m extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ List f36271a;

    public C11040m(List list) {
        this.f36271a = list;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        for (String startsWith : this.f36271a) {
            if (str.startsWith(startsWith)) {
                return false;
            }
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addFlags(268435456);
        webView.getContext().startActivity(intent);
        return true;
    }
}
