package com.google.android.apps.gsa.speech.settingsui.p7313a;

import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.TwoStatePreference;
import com.google.android.apps.gsa.settingsui.C88994i;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.a.g */
/* compiled from: PG */
public final class C92554g extends C88994i {

    /* renamed from: a */
    private final C92558k f258303a;

    public C92554g(C92558k kVar) {
        this.f258303a = kVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        C92557j jVar;
        if (preference instanceof ListPreference) {
            jVar = new C92549b((ListPreference) preference);
        } else if (preference instanceof TwoStatePreference) {
            jVar = new C92553f((TwoStatePreference) preference);
        } else {
            jVar = new C92552e(preference);
        }
        this.f258303a.mo87344gd(jVar);
    }

    /* renamed from: i */
    public final void mo82947i() {
        this.f258303a.mo87342b();
    }

    /* renamed from: j */
    public final void mo82948j() {
        this.f258303a.mo87343c();
    }
}
