package com.google.android.apps.gsa.search.core.preferences;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public final class HomeScreenFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C68214a f233276a;

    /* renamed from: b */
    public C90932cb f233277b;

    /* renamed from: c */
    public C90931ca f233278c;

    /* renamed from: d */
    public C90465g f233279d;

    /* renamed from: e */
    public C68214a f233280e;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.HomeScreenFragment$a */
    /* compiled from: PG */
    public interface C86274a {
        /* renamed from: qc */
        void mo79979qc(HomeScreenFragment homeScreenFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.homescreen_settings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C58833ax axVar = (C58833ax) this.f233276a.mo27525b();
        if (axVar.mo56113h()) {
            return ((C86321l) axVar.mo56107c()).mo80044c(getActivity(), this.f233277b, this.f233278c);
        }
        return null;
    }

    /* renamed from: c */
    public final void mo79972c() {
        super.mo79972c();
        if (getResources().getBoolean(R.bool.allow_rotation)) {
            getPreferenceScreen().removePreference(findPreference("pref_allowRotation"));
        }
    }

    public final void onCreate(Bundle bundle) {
        ((C86274a) C47266f.m84076a(getActivity(), C86274a.class)).mo79979qc(this);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        mo82932d(menu, "home_screen_settings", this.f233279d, ((C86054o) this.f233280e.mo27525b()).mo79668a());
    }
}
