package com.google.android.apps.gsa.search.core.preferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.googlequicksearchbox.GelStubAppWatcher;
import com.google.android.apps.gsa.p6427o.C83559c;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7009b.C89336a;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public final class GeneralHubFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C58833ax f233262a;

    /* renamed from: b */
    public C90465g f233263b;

    /* renamed from: c */
    public C86054o f233264c;

    /* renamed from: d */
    public C84413ad f233265d;

    /* renamed from: e */
    public C68214a f233266e;

    /* renamed from: f */
    public C83559c f233267f;

    /* renamed from: g */
    public C89336a f233268g;

    /* renamed from: h */
    public C84474e f233269h;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.GeneralHubFragment$a */
    /* compiled from: PG */
    public interface C86272a {
        /* renamed from: qa */
        void mo79975qa(GeneralHubFragment generalHubFragment);
    }

    /* renamed from: f */
    private final void m138957f(String str) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            getPreferenceScreen().removePreference(findPreference);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.general_hub;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        Bundle arguments = getArguments();
        boolean z = true;
        boolean z2 = arguments != null && arguments.getBoolean("fast_account_select_mode", false);
        if (arguments == null || !arguments.getBoolean("skip_now_opt_in", false)) {
            z = false;
        }
        if (this.f233262a.mo56113h()) {
            return ((C86321l) this.f233262a.mo56107c()).mo80042a(getActivity(), z2, z);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo79972c() {
        super.mo79972c();
        if (this.f233264c.mo79668a() != null) {
            m138957f("signed_out_search");
        } else {
            Preference findPreference = findPreference("show_interest_feed_preference");
            if (findPreference != null) {
                findPreference.setSummary(R.string.interest_feed_details_hub_signed_out);
            }
        }
        if (!this.f233265d.mo77971h()) {
            m138957f("personal_search_results_preference");
        }
        if (this.f233267f.mo76893d(this.f233268g.mo79659F()) && ((SharedPreferences) this.f233266e.mo27525b()).getBoolean("use_custom_tabs", true)) {
            m138957f("use_custom_tabs");
            PreferenceScreen createPreferenceScreen = getPreferenceManager().createPreferenceScreen(getActivity());
            createPreferenceScreen.setKey(getString(R.string.google_app_browser_preference));
            createPreferenceScreen.setFragment(GoogleAppBrowserFragment.class.getName());
            createPreferenceScreen.setTitle(R.string.google_app_browser_settings_title);
            getPreferenceScreen().addPreference(createPreferenceScreen);
        }
        if (GelStubAppWatcher.m120504a(getActivity())) {
            PreferenceScreen createPreferenceScreen2 = getPreferenceManager().createPreferenceScreen(getActivity());
            createPreferenceScreen2.setKey(getString(R.string.homescreen_preferences));
            createPreferenceScreen2.setFragment(HomeScreenFragment.class.getName());
            createPreferenceScreen2.setPersistent(false);
            createPreferenceScreen2.setTitle(R.string.homescreen_settings_title);
            createPreferenceScreen2.setSummary(R.string.homescreen_settings_summary);
            getPreferenceScreen().addPreference(createPreferenceScreen2);
        }
        if (this.f233269h.mo78073R()) {
            m138957f("signed_out_search");
        }
    }

    public final void onCreate(Bundle bundle) {
        ((C86272a) C47266f.m84076a(getActivity(), C86272a.class)).mo79975qa(this);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        mo82932d(menu, "general_settings", this.f233263b, this.f233264c.mo79668a());
    }
}
