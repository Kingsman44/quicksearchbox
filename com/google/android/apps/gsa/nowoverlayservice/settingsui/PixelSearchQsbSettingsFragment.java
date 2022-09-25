package com.google.android.apps.gsa.nowoverlayservice.settingsui;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.SwitchPreference;
import com.google.android.apps.gsa.settingsui.C88993h;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1859d.C22796r;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* compiled from: PG */
public final class PixelSearchQsbSettingsFragment extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    public SharedPreferences f227774a;

    /* renamed from: b */
    public Context f227775b;

    /* renamed from: c */
    private SwitchPreference f227776c;

    /* renamed from: com.google.android.apps.gsa.nowoverlayservice.settingsui.PixelSearchQsbSettingsFragment$a */
    /* compiled from: PG */
    public interface C83547a {
        /* renamed from: pX */
        void mo76870pX(PixelSearchQsbSettingsFragment pixelSearchQsbSettingsFragment);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C83547a) C47266f.m84076a(getActivity(), C83547a.class)).mo76870pX(this);
        C88993h.m144664a(getPreferenceManager());
        addPreferencesFromResource(R.xml.pixel_search_qsb_preference);
        SwitchPreference switchPreference = (SwitchPreference) findPreference("doodle_in_qsb_enabled");
        this.f227776c = switchPreference;
        if (switchPreference != null) {
            switchPreference.setChecked(this.f227774a.getBoolean("doodle_in_qsb_enabled", true));
        }
    }

    public final void onPause() {
        getPreferenceManager().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        getPreferenceManager().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals("doodle_in_qsb_enabled")) {
            this.f227775b.getContentResolver().notifyChange(C22796r.f62757b, (ContentObserver) null);
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1211;
            boolean z = this.f227774a.getBoolean("doodle_in_qsb_enabled", false);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164254i |= C89885b.HTTP_VALUE;
            ufVar2.f164171bY = z;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
