package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import com.google.ads.interactivemedia.p367v3.impl.data.C6727at;
import com.google.ads.interactivemedia.p367v3.impl.data.CompanionData;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aml */
/* compiled from: PG */
public final class aml extends WebView {
    public aml(Context context, ane ane, CompanionData companionData, List list) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new amk(context, ane, list));
        if (companionData.type() == C6727at.Html) {
            loadData(Base64.encodeToString(companionData.src().getBytes(), 1), "text/html", "base64");
        } else if (companionData.type() == C6727at.IFrame) {
            loadUrl(companionData.src());
        } else {
            String valueOf = String.valueOf(companionData.type());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
            sb.append("Companion type ");
            sb.append(valueOf);
            sb.append(" is not valid for a CompanionWebView");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
