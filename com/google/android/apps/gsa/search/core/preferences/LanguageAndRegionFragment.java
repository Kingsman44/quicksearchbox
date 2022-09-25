package com.google.android.apps.gsa.search.core.preferences;

import android.os.Bundle;
import android.preference.Preference;
import android.view.Menu;
import android.view.MenuInflater;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.shared.p7129r.C90465g;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public class LanguageAndRegionFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public C68214a f233282a;

    /* renamed from: b */
    public C90465g f233283b;

    /* renamed from: c */
    public C68214a f233284c;

    /* renamed from: d */
    public C68214a f233285d;

    /* renamed from: e */
    public C86124t f233286e;

    /* renamed from: f */
    private boolean f233287f = false;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.LanguageAndRegionFragment$a */
    /* compiled from: PG */
    public interface C86276a {
        /* renamed from: qe */
        void mo79984qe(LanguageAndRegionFragment languageAndRegionFragment);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.language_and_region;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C58833ax axVar = (C58833ax) this.f233282a.mo27525b();
        if (axVar.mo56113h()) {
            return ((C86321l) axVar.mo56107c()).mo80045d();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo79972c() {
        Preference findPreference;
        super.mo79972c();
        if ((!this.f233286e.mo79746e(C90010bp.f247006r) || ((C86054o) this.f233284c.mo27525b()).mo79668a() == null || !((C85664bo) this.f233285d.mo27525b()).mo79197l(C85662bm.WEB_HISTORY)) && (findPreference = findPreference(getString(R.string.discover_feed_language_preference))) != null) {
            getPreferenceScreen().removePreference(findPreference);
        }
    }

    public final void onCreate(Bundle bundle) {
        ((C86276a) C47266f.m84076a(getActivity(), C86276a.class)).mo79984qe(this);
        super.onCreate(bundle);
    }

    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        mo82932d(menu, "language_and_region_settings", this.f233283b, ((C86054o) this.f233284c.mo27525b()).mo79668a());
    }

    public final void onPause() {
        super.onPause();
        this.f233287f = true;
    }

    public final void onResume() {
        super.onResume();
        if (this.f233287f) {
            mo79972c();
            this.f233287f = false;
        }
    }
}
