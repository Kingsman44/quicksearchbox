package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.az */
/* compiled from: PG */
public final /* synthetic */ class C97966az implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C97980bd f273549a;

    public /* synthetic */ C97966az(C97980bd bdVar) {
        this.f273549a = bdVar;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        C97980bd bdVar = this.f273549a;
        if (((Boolean) obj).booleanValue()) {
            bdVar.mo90863a((SwitchPreference) preference, true);
            return true;
        }
        new AlertDialog.Builder(bdVar.f273576e).setTitle(R.string.homescreen_settings_title_predictions_prompt).setMessage(R.string.homescreen_settings_msg_predictions_prompt).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.homescreen_settings_action_turn_off, new C97977ba(bdVar, (SwitchPreference) preference)).show();
        return false;
    }
}
