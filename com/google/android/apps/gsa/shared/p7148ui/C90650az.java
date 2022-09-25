package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.webkit.WebView;

/* renamed from: com.google.android.apps.gsa.shared.ui.az */
/* compiled from: PG */
public class C90650az extends WebView {
    public C90650az(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo84943c() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int round = Math.round((displayMetrics.scaledDensity * 100.0f) / displayMetrics.density);
        float f = displayMetrics.density;
        float f2 = displayMetrics.scaledDensity;
        getSettings().setTextZoom(round);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo84943c();
    }

    public C90650az(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C90650az(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
