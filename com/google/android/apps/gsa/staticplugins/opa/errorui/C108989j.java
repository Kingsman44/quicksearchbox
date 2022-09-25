package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.j */
/* compiled from: PG */
public final /* synthetic */ class C108989j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C108991l f303070a;

    /* renamed from: b */
    public final /* synthetic */ Intent f303071b;

    public /* synthetic */ C108989j(C108991l lVar, Intent intent) {
        this.f303070a = lVar;
        this.f303071b = intent;
    }

    public final void onClick(View view) {
        this.f303070a.startActivity(this.f303071b);
    }
}
