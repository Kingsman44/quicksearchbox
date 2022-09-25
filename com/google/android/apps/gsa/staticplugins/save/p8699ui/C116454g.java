package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.app.AlertDialog;
import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.g */
/* compiled from: PG */
public final /* synthetic */ class C116454g implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f322909a;

    public /* synthetic */ C116454g(AlertDialog alertDialog) {
        this.f322909a = alertDialog;
    }

    public final void onClick(View view) {
        AlertDialog alertDialog = this.f322909a;
        Interpolator interpolator = Interstitial.f322858a;
        alertDialog.cancel();
    }
}
