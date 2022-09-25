package com.google.android.apps.gsa.staticplugins.opa.webview;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ar */
/* compiled from: PG */
final class C114203ar implements View.OnKeyListener {

    /* renamed from: a */
    final /* synthetic */ C114206au f316669a;

    public C114203ar(C114206au auVar) {
        this.f316669a = auVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        WebBackForwardList copyBackForwardList;
        int currentIndex;
        WebView webView = this.f316669a.f316690s;
        webView.getClass();
        if (i != 4 || !webView.canGoBack() || (currentIndex = copyBackForwardList.getCurrentIndex()) < 0) {
            return false;
        }
        WebHistoryItem itemAtIndex = (copyBackForwardList = webView.copyBackForwardList()).getItemAtIndex(currentIndex);
        itemAtIndex.getClass();
        String url = itemAtIndex.getUrl();
        int i2 = currentIndex - 1;
        while (i2 >= 0) {
            WebHistoryItem itemAtIndex2 = copyBackForwardList.getItemAtIndex(i2);
            itemAtIndex2.getClass();
            String url2 = itemAtIndex2.getUrl();
            if (url != null && url2 != null && TextUtils.equals(C114209ax.m189475a(url), C114209ax.m189475a(url2))) {
                break;
            }
            i2--;
        }
        if (i2 < 0) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            webView.goBackOrForward(i2 - currentIndex);
        }
        return true;
    }
}
