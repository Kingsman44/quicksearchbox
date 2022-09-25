package com.google.android.apps.gsa.search.core.preferences;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.SwitchPreference;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.j.a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.C90718ab;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public class PrivacyAndAccountFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C68214a f233288a;

    /* renamed from: b */
    public C68214a f233289b;

    /* renamed from: c */
    public C68214a f233290c;

    /* renamed from: d */
    public C68214a f233291d;

    /* renamed from: e */
    public C68214a f233292e;

    /* renamed from: f */
    public C68214a f233293f;

    /* renamed from: g */
    public C90465g f233294g;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.PrivacyAndAccountFragment$a */
    /* compiled from: PG */
    public interface C86277a {
        /* renamed from: qf */
        void mo79985qf(PrivacyAndAccountFragment privacyAndAccountFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo79969a() {
        return R.xml.privacy_and_account_preferences;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        Bundle arguments = getArguments();
        C58833ax axVar = (C58833ax) this.f233288a.mo27525b();
        if (!axVar.mo56113h()) {
            return null;
        }
        C86321l lVar = (C86321l) axVar.mo56107c();
        Activity activity = getActivity();
        boolean z = true;
        boolean z2 = arguments != null && arguments.getBoolean("fast_account_select_mode", false);
        if (arguments == null || !arguments.getBoolean("skip_now_opt_in", false)) {
            z = false;
        }
        return lVar.mo80046e(activity, z2, z);
    }

    /* renamed from: c */
    public final void mo79972c() {
        Preference findPreference;
        super.mo79972c();
        String a = C90718ab.m148168a((AccountManager) this.f233289b.mo27525b());
        String a2 = ((a) this.f233293f.mo27525b()).a();
        if (a2 != null && a2.equals(a)) {
            SwitchPreference switchPreference = new SwitchPreference(getActivity());
            switchPreference.setKey("feedback_use_nonredacted_report_saved_decision");
            switchPreference.setTitle(R.string.sensitive_state_dump_title);
            switchPreference.setSummary(R.string.sensitive_state_dump_summary);
            switchPreference.setDefaultValue(false);
            switchPreference.setPersistent(true);
            getPreferenceScreen().addPreference(switchPreference);
            C88990e eVar = this.f241147i;
            if (eVar != null) {
                eVar.mo82941c(switchPreference);
            }
        }
        if (((C90021c) this.f233290c.mo27525b()).mo79746e(C90120fr.f250795aH) && (((C86054o) this.f233291d.mo27525b()).mo79682p() || ((SharedPreferences) this.f233292e.mo27525b()).getBoolean("force_feedback_consent_form", false))) {
            SwitchPreference switchPreference2 = new SwitchPreference(getActivity());
            switchPreference2.setKey("shake_to_send_feedback_enabled");
            switchPreference2.setTitle(R.string.shake_to_send_feedback_title);
            switchPreference2.setSummary(R.string.shake_to_send_feedback_summary);
            switchPreference2.setDefaultValue(false);
            switchPreference2.setPersistent(true);
            getPreferenceScreen().addPreference(switchPreference2);
            C88990e eVar2 = this.f241147i;
            if (eVar2 != null) {
                eVar2.mo82941c(switchPreference2);
            }
        }
        if (((C86054o) this.f233291d.mo27525b()).mo79668a() != null && (findPreference = findPreference("signed_out_search")) != null) {
            getPreferenceScreen().removePreference(findPreference);
            C88990e eVar3 = this.f241147i;
            if (eVar3 != null) {
                eVar3.mo82941c(findPreference);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ((C86277a) C47266f.m84076a(getActivity(), C86277a.class)).mo79985qf(this);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        mo82932d(menu, "now_settings", this.f233294g, ((C86054o) this.f233291d.mo27525b()).mo79668a());
    }
}
