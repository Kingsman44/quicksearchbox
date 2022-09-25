package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Context;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.preferences.C86314e;
import com.google.android.apps.gsa.settingsui.C88994i;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.b */
/* compiled from: PG */
public final class C97967b extends C88994i implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    private final C86054o f273550a;

    /* renamed from: b */
    private final C68214a f273551b;

    /* renamed from: c */
    private C86314e f273552c;

    public C97967b(C86054o oVar, C68214a aVar) {
        this.f273550a = oVar;
        this.f273551b = aVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        preference.setOnPreferenceClickListener(this);
    }

    /* renamed from: e */
    public final void mo82943e() {
        C86314e eVar = this.f273552c;
        if (eVar != null) {
            eVar.mo80028a();
            this.f273552c = null;
        }
    }

    public final boolean onPreferenceClick(Preference preference) {
        Context context = preference.getContext();
        C86054o oVar = this.f273550a;
        C86314e eVar = new C86314e(context, oVar, this.f273551b, "https://myactivity.google.com", oVar.mo79668a());
        this.f273552c = eVar;
        eVar.mo80029b();
        return true;
    }
}
