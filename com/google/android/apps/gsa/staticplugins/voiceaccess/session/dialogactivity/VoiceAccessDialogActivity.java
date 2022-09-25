package com.google.android.apps.gsa.staticplugins.voiceaccess.session.dialogactivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class VoiceAccessDialogActivity extends Activity {

    /* renamed from: a */
    private Dialog f326610a;

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aN);
        super.onCreate(bundle);
    }

    public final void onResume() {
        super.onResume();
        C58976aa aaVar = C58975e.f156826a;
        Dialog dialog = this.f326610a;
        if (dialog != null && dialog.isShowing()) {
            this.f326610a.dismiss();
        }
        AlertDialog create = new AlertDialog.Builder(this).setTitle(R.string.va_cannot_connect_dialog_title).setMessage(R.string.va_cannot_connect_dialog_message).setPositiveButton(R.string.va_cannot_connect_dialog_update_button, new C117668a(this)).setNegativeButton(R.string.va_cannot_connect_dialog_disable_button, new C117669b(this)).setCancelable(false).create();
        this.f326610a = create;
        create.show();
    }
}
