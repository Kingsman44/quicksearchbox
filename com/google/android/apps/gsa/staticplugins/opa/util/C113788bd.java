package com.google.android.apps.gsa.staticplugins.opa.util;

import android.graphics.Insets;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bd */
/* compiled from: PG */
public final /* synthetic */ class C113788bd implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public final /* synthetic */ C113793bi f315137a;

    /* renamed from: b */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f315138b;

    /* renamed from: c */
    public final /* synthetic */ View f315139c;

    public /* synthetic */ C113788bd(C113793bi biVar, ViewGroup.MarginLayoutParams marginLayoutParams, View view) {
        this.f315137a = biVar;
        this.f315138b = marginLayoutParams;
        this.f315139c = view;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C113793bi biVar = this.f315137a;
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f315138b;
        View view2 = this.f315139c;
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        if (biVar.f315160f) {
            return view.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), insets.bottom));
        }
        marginLayoutParams.bottomMargin = 0;
        view2.setLayoutParams(marginLayoutParams);
        return view.onApplyWindowInsets(windowInsets);
    }
}
