package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import android.app.AlertDialog;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.v */
/* compiled from: PG */
public final /* synthetic */ class C101854v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C101855w f284104a;

    public /* synthetic */ C101854v(C101855w wVar) {
        this.f284104a = wVar;
    }

    public final void run() {
        C101855w wVar = this.f284104a;
        if (!wVar.f284106a.isDestroyed()) {
            wVar.f284108c.mo92603a().setVisibility(8);
            wVar.f284107b.mo83702b(C89849ae.VOICE_MATCH_SHOW_RETRY_DEPENDENCY_CHECK_DIALOG);
            new AlertDialog.Builder(wVar.f284106a).setTitle(R.string.hotword_setup_wizard_connection_error_title).setMessage(R.string.hotword_setup_wizard_connection_error_message).setPositiveButton(R.string.hotword_setup_wizard_try_again_button, new C101851s(wVar)).setNegativeButton(R.string.hotword_setup_wizard_dismiss_button, new C101852t(wVar)).setCancelable(false).show();
        }
    }
}
