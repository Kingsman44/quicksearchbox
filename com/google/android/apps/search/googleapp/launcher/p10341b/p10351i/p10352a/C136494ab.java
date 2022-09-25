package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.ab */
/* compiled from: PG */
public final class C136494ab {
    /* renamed from: a */
    public static C136512o m221812a(View view) {
        if (view instanceof C136512o) {
            return (C136512o) view;
        }
        String obj = C136521x.class.toString();
        String valueOf = String.valueOf(view.getClass());
        throw new IllegalStateException("Attempt to inject a ActivityAgnosticView wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
    }
}
