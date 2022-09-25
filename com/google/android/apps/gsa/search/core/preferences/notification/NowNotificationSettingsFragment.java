package com.google.android.apps.gsa.search.core.preferences.notification;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86317h;
import com.google.android.apps.gsa.search.core.preferences.C86319j;
import com.google.android.apps.gsa.settingsui.C88993h;
import com.google.android.apps.gsa.settingsui.SettingsPreferenceFragment;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4522b.C58485gu;
import com.google.p375ai.p378b.C8091ve;
import com.google.p375ai.p378b.C8098vl;
import java.util.List;

/* compiled from: PG */
public abstract class NowNotificationSettingsFragment extends SettingsPreferenceFragment {

    /* renamed from: g */
    public static final /* synthetic */ int f233404g = 0;

    /* renamed from: a */
    public C86319j f233405a;

    /* renamed from: b */
    public C86124t f233406b;

    /* renamed from: c */
    public C118561t f233407c;

    /* renamed from: d */
    public C86333h f233408d;

    /* renamed from: e */
    public C84474e f233409e;

    /* renamed from: f */
    public C84486a f233410f;

    /* renamed from: h */
    private Preference f233411h;

    /* renamed from: i */
    private PreferenceCategory f233412i;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.notification.NowNotificationSettingsFragment$a */
    /* compiled from: PG */
    public interface C86325a {
        /* renamed from: qm */
        void mo80058qm(NowNotificationSettingsFragment nowNotificationSettingsFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo80051a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80052b(int i) {
        int preferenceCount = this.f233412i.getPreferenceCount();
        if (i != 1 || preferenceCount == 0) {
            getPreferenceScreen().removePreference(this.f233412i);
        } else {
            getPreferenceScreen().addPreference(this.f233412i);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f233406b == null) {
            ((C86325a) C47266f.m84076a(getActivity(), C86325a.class)).mo80058qm(this);
        }
        C88993h.m144664a(getPreferenceManager());
        addPreferencesFromResource(R.xml.notification_snobell_preference);
        addPreferencesFromResource(R.xml.notification_post_o_settings);
        addPreferencesFromResource(R.xml.notification_channel_settings);
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference(getString(R.string.notification_category_key));
        this.f233412i = preferenceCategory;
        preferenceCategory.setOrderingAsAdded(true);
        this.f233411h = findPreference(getString(R.string.subscriptions_preference));
        if (this.f233406b.mo79746e(C90081ef.f249843l)) {
            this.f233411h.setOnPreferenceClickListener(new C86334i(this));
            this.f233412i.setTitle(R.string.notification_category);
            return;
        }
        getPreferenceScreen().removePreference(this.f233411h);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f233410f.mo78201h()) {
            C118561t tVar = this.f233407c;
            C118522by byVar = C118522by.LEGACY_NOW_SYNC;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328824d = 1;
            agVar.f328821a |= 4;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
    }

    public final void onResume() {
        List list;
        super.onResume();
        this.f233412i.removeAll();
        C86317h a = this.f233405a.mo80040a();
        synchronized (a.f233379b) {
            C8098vl b = a.mo80034b();
            if (b == null || (b.f28475b & 16384) == 0) {
                list = C58485gu.m89845m();
            } else {
                C8091ve veVar = b.f28483j;
                if (veVar == null) {
                    veVar = C8091ve.f28455e;
                }
                list = veVar.f28458b;
            }
        }
        if (list.isEmpty()) {
            getPreferenceScreen().removePreference(this.f233412i);
        }
        mo80052b(mo80051a());
    }
}
