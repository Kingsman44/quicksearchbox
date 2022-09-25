package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bx */
/* compiled from: PG */
public final /* synthetic */ class C108867bx implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108869bz f302711a;

    public /* synthetic */ C108867bx(C108869bz bzVar) {
        this.f302711a = bzVar;
    }

    public final void onClick(View view) {
        this.f302711a.requestPermissions(new String[]{"android.permission.ACTIVITY_RECOGNITION"}, 40);
    }
}
