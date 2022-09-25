package com.google.android.apps.gsa.search.core.preferences.notification;

import android.os.Bundle;
import com.google.android.apps.gsa.settingsui.SettingsPreferenceFragment;
import com.google.apps.tiktok.inject.C47266f;

/* compiled from: PG */
public class NotificationSnoPatrolSettingsFragment extends SettingsPreferenceFragment {

    /* renamed from: a */
    public C86333h f233403a;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.notification.NotificationSnoPatrolSettingsFragment$a */
    /* compiled from: PG */
    public interface C86324a {
        /* renamed from: ql */
        void mo80055ql(NotificationSnoPatrolSettingsFragment notificationSnoPatrolSettingsFragment);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f233403a == null) {
            ((C86324a) C47266f.m84076a(getActivity(), C86324a.class)).mo80055ql(this);
        }
        this.f233403a.mo80060a();
    }
}
