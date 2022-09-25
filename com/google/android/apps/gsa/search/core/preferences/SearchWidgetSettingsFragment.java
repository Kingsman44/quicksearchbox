package com.google.android.apps.gsa.search.core.preferences;

import android.os.Bundle;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.preferences.p6817a.C86283a;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import dagger.C68214a;

/* compiled from: PG */
public class SearchWidgetSettingsFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public final C28292j f233301a = new C28292j(84734);

    /* renamed from: b */
    public C68214a f233302b;

    /* renamed from: c */
    public C89257aa f233303c;

    /* renamed from: d */
    public C86283a f233304d;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.SearchWidgetSettingsFragment$a */
    /* compiled from: PG */
    public interface C86279a {
        /* renamed from: qh */
        void mo79987qh(SearchWidgetSettingsFragment searchWidgetSettingsFragment);
    }

    /* renamed from: f */
    private final Preference m138986f() {
        return findPreference(getString(R.string.customize_search_widget_preference));
    }

    /* renamed from: g */
    private final Preference m138987g() {
        return findPreference(getString(R.string.reset_search_widget_preference));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.search_widget_settings;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C58833ax axVar = (C58833ax) this.f233302b.mo27525b();
        if (!axVar.mo56113h()) {
            return null;
        }
        getActivity();
        return ((C86321l) axVar.mo56107c()).mo80049h();
    }

    /* renamed from: c */
    public final void mo79972c() {
        super.mo79972c();
        Preference g = m138987g();
        if (g != null && !this.f233303c.mo83224q()) {
            getPreferenceScreen().removePreference(g);
        }
        Preference f = m138986f();
        if (f != null && !this.f233304d.f233323a.mo83223p()) {
            getPreferenceScreen().removePreference(f);
        }
    }

    public final void onCreate(Bundle bundle) {
        ((C86279a) C47266f.m84076a(getActivity(), C86279a.class)).mo79987qh(this);
        super.onCreate(bundle);
        Preference g = m138987g();
        if (g != null) {
            g.setOnPreferenceClickListener(new C86323n(this));
        }
        Preference f = m138986f();
        if (f != null) {
            f.setOnPreferenceClickListener(new C86335o(this));
        }
    }

    public final void onResume() {
        super.onResume();
        C28293k e = C28293k.m52908e(new C28292j(84733), new C28293k[0]);
        this.f233301a.mo33795i(5);
        C89949q.m146521e(C28285c.m52875b(C28293k.m52908e(((C28257a) e).f76908a, C28293k.m52908e(this.f233301a, new C28293k[0])), 84403), false);
    }
}
