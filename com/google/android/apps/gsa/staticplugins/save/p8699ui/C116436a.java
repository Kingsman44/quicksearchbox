package com.google.android.apps.gsa.staticplugins.save.p8699ui;

import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28295m;

/* renamed from: com.google.android.apps.gsa.staticplugins.save.ui.a */
/* compiled from: PG */
public final /* synthetic */ class C116436a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ConfirmationTray f322871a;

    public /* synthetic */ C116436a(ConfirmationTray confirmationTray) {
        this.f322871a = confirmationTray;
    }

    public final void run() {
        ConfirmationTray confirmationTray = this.f322871a;
        confirmationTray.setTranslationY((float) confirmationTray.getHeight());
        confirmationTray.setVisibility(0);
        confirmationTray.animate().translationY(0.0f).setDuration(350).start();
        confirmationTray.sendAccessibilityEvent(32);
        C89949q.m146521e(C28285c.m52881h(2, C28295m.m52916b(confirmationTray), (View) null), false);
    }
}
