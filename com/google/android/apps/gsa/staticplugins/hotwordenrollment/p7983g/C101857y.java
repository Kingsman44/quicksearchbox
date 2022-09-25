package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.app.AlertDialog;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.y */
/* compiled from: PG */
public final /* synthetic */ class C101857y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C101809ab f284123a;

    public /* synthetic */ C101857y(C101809ab abVar) {
        this.f284123a = abVar;
    }

    public final void run() {
        C101809ab abVar = this.f284123a;
        if (!abVar.f283961a.isDestroyed()) {
            abVar.f283962b.mo92603a().setVisibility(8);
            new AlertDialog.Builder(abVar.f283961a).setTitle(R.string.hotword_setup_wizard_connection_error_title).setMessage(R.string.hotword_setup_wizard_connection_error_message).setPositiveButton(R.string.hotword_setup_wizard_try_again_button, new C101858z(abVar)).setNegativeButton(R.string.hotword_setup_wizard_dismiss_button, new C101808aa(abVar)).setCancelable(false).show();
        }
    }
}
