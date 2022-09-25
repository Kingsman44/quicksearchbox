package com.google.android.apps.gsa.search.core.preferences.notification;

import android.content.Intent;
import android.preference.Preference;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.notification.a */
/* compiled from: PG */
public final /* synthetic */ class C86326a implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationOPlusSettingsFragment f233413a;

    public /* synthetic */ C86326a(NotificationOPlusSettingsFragment notificationOPlusSettingsFragment) {
        this.f233413a = notificationOPlusSettingsFragment;
    }

    public final boolean onPreferenceClick(Preference preference) {
        NotificationOPlusSettingsFragment notificationOPlusSettingsFragment = this.f233413a;
        if (notificationOPlusSettingsFragment.f233409e.mo78081Z()) {
            notificationOPlusSettingsFragment.f233408d.mo80060a();
            return true;
        }
        notificationOPlusSettingsFragment.getContext().startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456).putExtra("android.provider.extra.APP_PACKAGE", notificationOPlusSettingsFragment.getContext().getPackageName()));
        return true;
    }
}
