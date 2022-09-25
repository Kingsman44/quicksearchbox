package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.au */
/* compiled from: PG */
final class C108837au implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Intent f302633a;

    /* renamed from: b */
    final /* synthetic */ C108839aw f302634b;

    public C108837au(C108839aw awVar, Intent intent) {
        this.f302634b = awVar;
        this.f302633a = intent;
    }

    public final void onClick(View view) {
        try {
            this.f302634b.startActivityForResult(this.f302633a, 13);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
