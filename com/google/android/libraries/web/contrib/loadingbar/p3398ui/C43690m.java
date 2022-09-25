package com.google.android.libraries.web.contrib.loadingbar.p3398ui;

import android.view.View;

/* renamed from: com.google.android.libraries.web.contrib.loadingbar.ui.m */
/* compiled from: PG */
public final class C43690m {
    /* renamed from: a */
    public static LoadingBarView m77089a(View view) {
        if (view instanceof LoadingBarView) {
            return (LoadingBarView) view;
        }
        String obj = C43687j.class.toString();
        String valueOf = String.valueOf(view.getClass());
        throw new IllegalStateException("Attempt to inject a View wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
    }
}
