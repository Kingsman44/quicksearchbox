package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.cr */
/* compiled from: PG */
final class C108888cr implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108890ct f302750a;

    public C108888cr(C108890ct ctVar) {
        this.f302750a = ctVar;
    }

    public final void onClick(View view) {
        this.f302750a.startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }
}
