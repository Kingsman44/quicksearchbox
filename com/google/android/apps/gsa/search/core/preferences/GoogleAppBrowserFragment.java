package com.google.android.apps.gsa.search.core.preferences;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceScreen;
import android.preference.TwoStatePreference;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28440j;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public final class GoogleAppBrowserFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C68214a f233270a;

    /* renamed from: b */
    public C90465g f233271b;

    /* renamed from: c */
    public C68214a f233272c;

    /* renamed from: d */
    public C28310af f233273d;

    /* renamed from: e */
    public C28443m f233274e;

    /* renamed from: f */
    private C28452b f233275f;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.GoogleAppBrowserFragment$a */
    /* compiled from: PG */
    public interface C86273a {
        /* renamed from: qb */
        void mo79978qb(GoogleAppBrowserFragment googleAppBrowserFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.google_app_browser_settings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C58833ax axVar = (C58833ax) this.f233270a.mo27525b();
        if (axVar.mo56113h()) {
            return ((C86321l) axVar.mo56107c()).mo80043b(getActivity());
        }
        return null;
    }

    public final void onCreate(Bundle bundle) {
        ((C86273a) C47266f.m84076a(getActivity(), C86273a.class)).mo79978qb(this);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        mo82932d(menu, "google_app_browser", this.f233271b, ((C86054o) this.f233272c.mo27525b()).mo79668a());
    }

    public final boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if ("use_google_app_browser".equals(preference.getKey())) {
            boolean isChecked = ((TwoStatePreference) preference).isChecked();
            C28440j h = C28442l.m53142h();
            h.mo33895b(C28442l.m53145k(!isChecked));
            this.f233274e.mo33853c(h.mo33894a(), this.f233275f.mo33908b(preference.getKey()));
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f233275f = new C28452b(this.f233273d.f76997b.mo33800a(C28427h.m53115a(119968)).mo33809b(view));
        this.f233275f.mo33909c(119969).mo33899a(getPreferenceScreen().findPreference("use_google_app_browser").getKey());
    }
}
