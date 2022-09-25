package com.google.android.apps.gsa.staticplugins.videopreference;

import android.os.Bundle;
import android.preference.PreferenceCategory;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.search.core.preferences.C86293ai;
import com.google.android.apps.gsa.settingsui.C88993h;
import com.google.android.apps.gsa.settingsui.SettingsPreferenceFragment;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.inject.C47266f;
import com.google.p395al.p417d.p418a.C8590q;
import dagger.C68214a;

/* compiled from: PG */
public final class VideoPreferenceFragment extends SettingsPreferenceFragment {

    /* renamed from: a */
    public C86293ai f326466a;

    /* renamed from: b */
    public C22871g f326467b;

    /* renamed from: c */
    public C68214a f326468c;

    /* renamed from: d */
    private SwitchPreference f326469d;

    /* renamed from: e */
    private PreferenceCategory f326470e;

    /* renamed from: f */
    private SwitchPreference f326471f;

    /* renamed from: com.google.android.apps.gsa.staticplugins.videopreference.VideoPreferenceFragment$a */
    /* compiled from: PG */
    public interface C117605a {
        /* renamed from: ra */
        void mo103404ra(VideoPreferenceFragment videoPreferenceFragment);
    }

    /* renamed from: a */
    public final C8590q mo103401a() {
        if (!this.f326469d.isChecked()) {
            return C8590q.AUTOPLAY_DISABLED;
        }
        if (this.f326471f.isChecked()) {
            return C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA;
        }
        return C8590q.AUTOPLAY_ON_WIFI_ONLY;
    }

    /* renamed from: b */
    public final void mo103402b(C8590q qVar) {
        boolean z = true;
        boolean z2 = qVar != C8590q.AUTOPLAY_DISABLED;
        this.f326469d.setChecked(z2);
        if (z2) {
            getPreferenceScreen().addPreference(this.f326470e);
            SwitchPreference switchPreference = this.f326471f;
            if (qVar != C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA) {
                z = false;
            }
            switchPreference.setChecked(z);
            return;
        }
        getPreferenceScreen().removePreference(this.f326470e);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C117605a) C47266f.m84076a(getActivity(), C117605a.class)).mo103404ra(this);
        C88993h.m144664a(getPreferenceManager());
        addPreferencesFromResource(R.xml.video_preference);
        this.f326469d = (SwitchPreference) findPreference(getString(R.string.enable_video_preview_autoplay_preference));
        this.f326470e = (PreferenceCategory) findPreference(getString(R.string.enable_video_preview_network_preference_category));
        this.f326471f = (SwitchPreference) findPreference(getString(R.string.enable_video_preview_autoplay_on_mobile_data_preference));
        C117607b bVar = new C117607b(this);
        this.f326469d.setOnPreferenceChangeListener(bVar);
        this.f326471f.setOnPreferenceChangeListener(bVar);
        mo103402b(this.f326466a.mo79997a());
    }
}
