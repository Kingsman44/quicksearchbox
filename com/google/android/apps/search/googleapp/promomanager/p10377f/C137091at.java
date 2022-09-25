package com.google.android.apps.search.googleapp.promomanager.p10377f;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.at */
/* compiled from: PG */
public final /* synthetic */ class C137091at implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ View f373053a;

    public /* synthetic */ C137091at(View view) {
        this.f373053a = view;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        this.f373053a.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }
}
