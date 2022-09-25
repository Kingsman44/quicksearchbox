package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bq */
/* compiled from: PG */
final class C108860bq implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C108861br f302699a;

    public C108860bq(C108861br brVar) {
        this.f302699a = brVar;
    }

    public final void onClick(View view) {
        this.f302699a.startActivity(new Intent("android.settings.LOCALE_SETTINGS"));
    }
}
