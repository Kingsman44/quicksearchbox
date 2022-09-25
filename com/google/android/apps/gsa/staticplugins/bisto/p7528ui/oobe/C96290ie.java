package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ie */
/* compiled from: PG */
public final /* synthetic */ class C96290ie implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C96292ig f269466a;

    /* renamed from: b */
    public final /* synthetic */ Activity f269467b;

    public /* synthetic */ C96290ie(C96292ig igVar, Activity activity) {
        this.f269466a = igVar;
        this.f269467b = activity;
    }

    public final void onClick(View view) {
        C96292ig igVar = this.f269466a;
        Activity activity = this.f269467b;
        igVar.f269032f = false;
        activity.finishAffinity();
    }
}
