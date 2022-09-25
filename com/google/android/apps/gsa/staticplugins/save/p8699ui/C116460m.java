package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.m */
/* compiled from: PG */
public final /* synthetic */ class C116460m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Interstitial f322918a;

    public /* synthetic */ C116460m(Interstitial interstitial) {
        this.f322918a = interstitial;
    }

    public final void run() {
        Interstitial interstitial = this.f322918a;
        interstitial.announceForAccessibility(interstitial.getResources().getText(R.string.save_loading_lists));
    }
}
