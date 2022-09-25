package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i.p10352a;

import android.view.View;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.a.e */
/* compiled from: PG */
public final class C136502e {
    /* renamed from: a */
    public static C136492a m221827a(View view) {
        if (view instanceof C136492a) {
            return (C136492a) view;
        }
        String obj = C136499b.class.toString();
        String valueOf = String.valueOf(view.getClass());
        throw new IllegalStateException("Attempt to inject a ActivityAgnosticView wrapper of type " + obj + ", but the wrapper available is of type: " + valueOf + ". Does your peer's @Inject constructor reference the wrong wrapper class?");
    }
}
