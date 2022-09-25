package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.settingsui.C88994i;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bg */
/* compiled from: PG */
public final class C97983bg extends C88994i {

    /* renamed from: a */
    private final C86338r f273583a;

    public C97983bg(C86338r rVar) {
        this.f273583a = rVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        preference.setSummary(this.f273583a.getString("selected_search_language", BuildConfig.FLAVOR));
    }
}
