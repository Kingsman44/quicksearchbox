package com.google.android.apps.gsa.staticplugins.webview.common;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
public final class NoTextScalingScrollableGsaWebView extends ScrollableGsaWebView {
    public NoTextScalingScrollableGsaWebView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo84943c() {
        getSettings().setTextZoom(100);
    }

    public NoTextScalingScrollableGsaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoTextScalingScrollableGsaWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
