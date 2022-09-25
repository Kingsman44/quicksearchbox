package com.google.android.apps.gsa.search.core.preferences;

import android.os.Bundle;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.android.apps.gsa.settingsui.SettingsFragmentBase;
import com.google.android.apps.gsa.velvet.p8863ui.settings.C118686y;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* compiled from: PG */
public final class PrivacyAndSecurityFragment extends SettingsFragmentBase {

    /* renamed from: a */
    public static final C59071e f233295a = C59071e.m91332i("com.google.android.apps.gsa.search.core.preferences.PrivacyAndSecurityFragment");

    /* renamed from: b */
    public C68214a f233296b;

    /* renamed from: c */
    public C118686y f233297c;

    /* renamed from: d */
    public C86054o f233298d;

    /* renamed from: e */
    public C84474e f233299e;

    /* renamed from: f */
    public C22871g f233300f;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.PrivacyAndSecurityFragment$a */
    /* compiled from: PG */
    public interface C86278a {
        /* renamed from: qg */
        void mo79986qg(PrivacyAndSecurityFragment privacyAndSecurityFragment);
    }

    /* renamed from: f */
    private final void m138981f(Preference preference, C137589b bVar) {
        getPreferenceScreen().removePreference(preference);
        this.f233300f.mo28211k(this.f233297c.mo103868b(bVar), "Update TNG setting preference intent", new C86322m(this, preference));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo79969a() {
        return R.xml.privacy_and_security_preferences;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C88990e mo79971b() {
        C58833ax axVar = (C58833ax) this.f233296b.mo27525b();
        if (axVar.mo56113h()) {
            return ((C86321l) axVar.mo56107c()).mo80047f();
        }
        return null;
    }

    /* renamed from: c */
    public final void mo79972c() {
        super.mo79972c();
        m138981f(findPreference(getString(R.string.location_setting_preference)), C137589b.LOCATION_CONSENT);
        if (this.f233298d.mo79668a() != null) {
            getPreferenceScreen().removePreference(findPreference(getString(R.string.signed_out_search_preference)));
        }
        Preference findPreference = findPreference(getString(R.string.ads_personalization_setting_preference));
        if (this.f233299e.mo78128q()) {
            m138981f(findPreference, C137589b.ADS_PERSONALIZATION);
        } else {
            getPreferenceScreen().removePreference(findPreference);
        }
    }

    public final void onCreate(Bundle bundle) {
        ((C86278a) C47266f.m84076a(getActivity(), C86278a.class)).mo79986qg(this);
        super.onCreate(bundle);
    }
}
