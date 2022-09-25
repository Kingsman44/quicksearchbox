package com.google.ads.interactivemedia.p367v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.p367v3.api.CompanionAdSlot;

/* renamed from: com.google.ads.interactivemedia.v3.internal.amj */
/* compiled from: PG */
final class amj extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ amk f20972a;

    public amj(amk amk) {
        this.f20972a = amk;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f20972a.f20974b.mo15009o(str);
        for (CompanionAdSlot.ClickListener onCompanionAdClick : this.f20972a.f20975c) {
            onCompanionAdClick.onCompanionAdClick();
        }
        return true;
    }
}
