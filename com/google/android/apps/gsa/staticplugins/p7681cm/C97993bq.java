package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.res.Resources;
import android.preference.Preference;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bq */
/* compiled from: PG */
public final class C97993bq extends C88994i {

    /* renamed from: a */
    private final Resources f273628a;

    /* renamed from: b */
    private final C86338r f273629b;

    public C97993bq(Resources resources, C86338r rVar) {
        this.f273628a = resources;
        this.f273629b = rVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        String str;
        String string = this.f273629b.getString("selected_search_country_code", BuildConfig.FLAVOR);
        if (!string.isEmpty()) {
            str = new Locale(BuildConfig.FLAVOR, string).getDisplayCountry();
        } else {
            str = this.f273628a.getString(R.string.search_region_setting_summary);
        }
        preference.setSummary(str);
    }
}
