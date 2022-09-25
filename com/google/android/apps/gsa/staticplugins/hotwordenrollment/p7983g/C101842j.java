package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.app.AlertDialog;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.j */
/* compiled from: PG */
public final /* synthetic */ class C101842j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C101843k f284063a;

    public /* synthetic */ C101842j(C101843k kVar) {
        this.f284063a = kVar;
    }

    public final void run() {
        C101843k kVar = this.f284063a;
        if (!kVar.f284065a.isDestroyed()) {
            kVar.f284066b.mo92603a().setVisibility(8);
            new AlertDialog.Builder(kVar.f284065a).setTitle(R.string.hotword_setup_wizard_connection_error_title).setMessage(R.string.hotword_setup_wizard_connection_error_message).setPositiveButton(R.string.hotword_setup_wizard_try_again_button, new C101839g(kVar)).setNegativeButton(R.string.hotword_setup_wizard_dismiss_button, new C101840h(kVar)).setCancelable(false).show();
        }
    }
}
