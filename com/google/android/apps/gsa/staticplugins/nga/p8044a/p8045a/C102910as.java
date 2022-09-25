package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.as */
/* compiled from: PG */
public final /* synthetic */ class C102910as implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102912au f287380a;

    /* renamed from: b */
    public final /* synthetic */ Snackbar f287381b;

    public /* synthetic */ C102910as(C102912au auVar, Snackbar snackbar) {
        this.f287380a = auVar;
        this.f287381b = snackbar;
    }

    public final void onClick(View view) {
        C102912au auVar = this.f287380a;
        Snackbar snackbar = this.f287381b;
        auVar.f287384b.edit().putInt("nga_dismissed_eligibility_snackbar", auVar.f287383a.mo71080b().f158764y).apply();
        snackbar.mo48340e(3);
    }
}
