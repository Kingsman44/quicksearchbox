package com.google.android.apps.search.googleapp.search.srp.p10442ui;

import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ui.g */
/* compiled from: PG */
public final class C137897g {
    /* renamed from: a */
    public static RoundedFrameLayoutView m224200a(View view) {
        if (view instanceof RoundedFrameLayoutView) {
            return (RoundedFrameLayoutView) view;
        }
        String obj = C137893c.class.toString();
        String valueOf = String.valueOf(view.getClass());
        throw new IllegalStateException("Attempt to inject a View wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
    }
}
