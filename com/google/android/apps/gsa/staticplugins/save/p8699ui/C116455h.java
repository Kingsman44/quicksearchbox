package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.h */
/* compiled from: PG */
public final /* synthetic */ class C116455h implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ Interstitial f322910a;

    public /* synthetic */ C116455h(Interstitial interstitial) {
        this.f322910a = interstitial;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Interstitial interstitial = this.f322910a;
        interstitial.postDelayed(new C116461n(interstitial, (InputMethodManager) interstitial.getContext().getSystemService("input_method")), 100);
    }
}
