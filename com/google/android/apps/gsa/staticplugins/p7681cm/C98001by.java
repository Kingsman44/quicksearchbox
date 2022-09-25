package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.accounts.AccountManager;
import android.preference.Preference;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.apps.gsa.shared.p7129r.C90466h;
import com.google.android.apps.gsa.shared.p7129r.C90473o;
import com.google.android.apps.gsa.shared.p7129r.C90474p;
import com.google.android.apps.gsa.shared.util.C90718ab;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.by */
/* compiled from: PG */
public final class C98001by extends C88994i implements Preference.OnPreferenceChangeListener, C90473o {

    /* renamed from: a */
    private SwitchPreference f273646a;

    /* renamed from: b */
    private final C90466h f273647b;

    /* renamed from: c */
    private final AccountManager f273648c;

    public C98001by(C90466h hVar, AccountManager accountManager) {
        this.f273647b = hVar;
        this.f273648c = accountManager;
    }

    /* renamed from: a */
    public final void mo84222a(boolean z, int i) {
        if (z) {
            this.f273646a.setChecked(true);
        }
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        this.f273646a = (SwitchPreference) preference;
        preference.setOnPreferenceChangeListener(this);
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        if (!((Boolean) obj).booleanValue() || this.f273646a.isChecked()) {
            return true;
        }
        if (!new C90474p(preference.getContext(), this, this.f273647b, C90718ab.m148168a(this.f273648c), false, (Date) null).mo84223a()) {
            return true;
        }
        return false;
    }
}
