package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.b */
/* compiled from: PG */
public final class C110091b {
    /* renamed from: a */
    public static void m183350a(View view, View view2, long j) {
        if (view != null && view2 != null) {
            view.animate().cancel();
            view.setVisibility(0);
            view2.animate().cancel();
            view2.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(j).start();
            view2.animate().alpha(0.0f).setDuration(j).setListener(new C110090a(view2)).start();
        }
    }
}
