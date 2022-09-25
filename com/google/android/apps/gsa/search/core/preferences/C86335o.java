package com.google.android.apps.gsa.search.core.preferences;

import android.preference.Preference;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.o */
/* compiled from: PG */
public final /* synthetic */ class C86335o implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    public final /* synthetic */ SearchWidgetSettingsFragment f233429a;

    public /* synthetic */ C86335o(SearchWidgetSettingsFragment searchWidgetSettingsFragment) {
        this.f233429a = searchWidgetSettingsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        this.f233429a.f233303c.f242024d.sendBroadcast(C89257aa.m145198u());
        return true;
    }
}
