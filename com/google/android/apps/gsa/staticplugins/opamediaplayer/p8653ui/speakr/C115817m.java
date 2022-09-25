package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.m */
/* compiled from: PG */
final class C115817m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Snackbar f321203a;

    /* renamed from: b */
    final /* synthetic */ View.OnClickListener f321204b;

    public C115817m(Snackbar snackbar, View.OnClickListener onClickListener) {
        this.f321203a = snackbar;
        this.f321204b = onClickListener;
    }

    public final void onClick(View view) {
        this.f321203a.mo48340e(3);
        this.f321204b.onClick(view);
    }
}
