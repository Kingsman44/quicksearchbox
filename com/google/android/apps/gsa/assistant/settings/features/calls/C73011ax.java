package com.google.android.apps.gsa.assistant.settings.features.calls;

import android.content.DialogInterface;
import android.support.p033v7.app.C0391l;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.ax */
/* compiled from: PG */
public final /* synthetic */ class C73011ax implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ bw f193652a;

    public /* synthetic */ C73011ax(bw bwVar) {
        this.f193652a = bwVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        bw bwVar = this.f193652a;
        C0391l gh = bwVar.mo17796gh();
        if (gh == null) {
            return true;
        }
        gh.mo1307l(R.string.assistant_settings_duo_calls_unlink_duo_warning_dialog_title);
        gh.mo1300f(R.string.assistant_settings_duo_calls_unlink_duo_warning_dialog_summary);
        gh.setPositiveButton(R.string.assistant_settings_unlink, new C73012ay(bwVar)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create().show();
        return true;
    }
}
