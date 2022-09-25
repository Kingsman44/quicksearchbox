package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bd */
/* compiled from: PG */
public final class C97980bd extends C88994i {

    /* renamed from: a */
    public static final C59071e f273572a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cm.bd");

    /* renamed from: b */
    static final Uri f273573b = Uri.parse("content://com.google.android.launcher.settings/settings");

    /* renamed from: c */
    public static final C58495hd f273574c = C58495hd.m89903q("pref_show_predictions", 1, "pref_display_feed", 1, "pref_allowRotation", false, "pref_add_icon_to_home", true);

    /* renamed from: d */
    public final Preference.OnPreferenceChangeListener f273575d = new C97966az(this);

    /* renamed from: e */
    public final Activity f273576e;

    /* renamed from: f */
    public final ContentResolver f273577f;

    /* renamed from: g */
    private final C90932cb f273578g;

    /* renamed from: h */
    private final C90931ca f273579h;

    public C97980bd(Activity activity, ContentResolver contentResolver, C90932cb cbVar, C90931ca caVar) {
        this.f273576e = activity;
        this.f273577f = contentResolver;
        this.f273578g = cbVar;
        this.f273579h = caVar;
    }

    /* renamed from: a */
    public final void mo90863a(SwitchPreference switchPreference, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("value", z);
        this.f273577f.call(f273573b, "set_boolean_setting", switchPreference.getKey(), bundle);
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        if ((preference instanceof PreferenceScreen) && this.f273576e.getString(R.string.homescreen_preferences).equals(preference.getKey())) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) preference;
            for (int i = 0; i < preferenceScreen.getPreferenceCount(); i++) {
                SwitchPreference switchPreference = (SwitchPreference) preferenceScreen.getPreference(i);
                String key = switchPreference.getKey();
                if (!f273574c.containsKey(key)) {
                    C59104x c = f273572a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "HomeScreenPrefCtrler");
                    ((C59052c) ((C59052c) c).mo56372aa(30404)).mo56389s("Unknown preference %s", key);
                } else {
                    this.f273578g.mo85147l(this.f273579h.mo85138c(new C97978bb(this, key)), new C97979bc(this, switchPreference, preferenceScreen));
                }
            }
        }
    }
}
