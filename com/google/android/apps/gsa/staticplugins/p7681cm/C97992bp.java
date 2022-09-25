package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bp */
/* compiled from: PG */
public final class C97992bp extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    private final Context f273626a;

    /* renamed from: b */
    private AlertDialog f273627b;

    public C97992bp(Context context) {
        this.f273626a = context;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        preference.setOnPreferenceChangeListener(this);
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            return true;
        }
        AlertDialog create = new AlertDialog.Builder(this.f273626a).setTitle(R.string.use_recently_dialog_title).setMessage(R.string.use_recently_dialog_message).setNegativeButton(R.string.use_recently_dialog_cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.use_recently_dialog_ok, new C97991bo((SwitchPreference) preference)).create();
        this.f273627b = create;
        create.show();
        return false;
    }
}
