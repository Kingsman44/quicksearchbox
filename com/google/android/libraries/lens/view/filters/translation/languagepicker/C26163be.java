package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.be */
/* compiled from: PG */
public final /* synthetic */ class C26163be implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ View f71073a;

    public /* synthetic */ C26163be(View view) {
        this.f71073a = view;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f71073a.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
        return windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
    }
}
