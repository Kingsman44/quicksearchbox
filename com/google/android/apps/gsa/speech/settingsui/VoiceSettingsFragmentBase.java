package com.google.android.apps.gsa.speech.settingsui;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;

/* compiled from: PG */
public abstract class VoiceSettingsFragmentBase extends SettingsFragmentBase implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: m */
    public C86127w f258292m;

    public final void onPause() {
        this.f258292m.f232790a.mo79722a().unregisterOnSharedPreferenceChangeListener(this);
        this.f258292m.f232790a.mo79723b().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.f258292m.f232790a.mo79722a().registerOnSharedPreferenceChangeListener(this);
        this.f258292m.f232790a.mo79723b().registerOnSharedPreferenceChangeListener(this);
    }
}
