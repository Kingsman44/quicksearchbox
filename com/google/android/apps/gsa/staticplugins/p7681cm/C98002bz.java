package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bz */
/* compiled from: PG */
public final class C98002bz extends C88994i implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    private static final C59071e f273649a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.bz");

    /* renamed from: b */
    private final Context f273650b;

    public C98002bz(Context context) {
        this.f273650b = context;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
                mo82941c(preferenceGroup.getPreference(i));
            }
        } else if ("suggest_trends_enabled".equals(preference.getKey())) {
            preference.setOnPreferenceChangeListener(this);
        }
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        Intent intent = new Intent("preference-updated");
        if ("suggest_trends_enabled".equals(preference.getKey())) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((SwitchPreference) preference).setChecked(booleanValue);
            if (!booleanValue) {
                intent.putExtra("enable-trends", false);
            }
        } else {
            C59104x c = f273649a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SuggPrefCtrler");
            ((C59052c) ((C59052c) c).mo56372aa(30406)).mo56389s("Unexpected preference change: %s", preference);
        }
        Bundle extras = intent.getExtras();
        if (extras == null || extras == Bundle.EMPTY) {
            return true;
        }
        this.f273650b.sendBroadcast(intent);
        return true;
    }
}
