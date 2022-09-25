package com.google.android.apps.gsa.search.core.preferences.notification;

import android.os.Bundle;
import android.preference.Preference;
import androidx.core.app.C1793aj;
import androidx.core.app.C1800aq;
import com.google.android.googlequicksearchbox.R;

/* compiled from: PG */
public class NotificationOPlusSettingsFragment extends NowNotificationSettingsFragment {

    /* renamed from: h */
    private Preference f233402h;

    /* renamed from: c */
    private final void m139045c(boolean z) {
        Preference preference = this.f233402h;
        if (preference != null) {
            preference.setSummary(true != z ? R.string.status_off : R.string.status_on);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo80051a() {
        return C1793aj.m4937b(new C1800aq(getContext()).f5622a) ? 1 : 3;
    }

    /* renamed from: b */
    public final void mo80052b(int i) {
        super.mo80052b(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        m139045c(z);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Preference findPreference = findPreference(getString(R.string.app_level_notification_preference));
        this.f233402h = findPreference;
        if (findPreference != null) {
            findPreference.setOnPreferenceClickListener(new C86326a(this));
        }
        boolean z = true;
        if (mo80051a() != 1) {
            z = false;
        }
        m139045c(z);
    }
}
