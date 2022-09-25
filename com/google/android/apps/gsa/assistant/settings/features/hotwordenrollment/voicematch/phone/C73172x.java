package com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.gsa.assistant.settings.base.C9514p;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92558k;
import com.google.assistant.p3861at.act;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.hotwordenrollment.voicematch.phone.x */
/* compiled from: PG */
public final class C73172x implements C9514p {

    /* renamed from: a */
    private final C92558k f193970a;

    public C73172x(C92558k kVar) {
        this.f193970a = kVar;
    }

    /* renamed from: a */
    public final void mo17827a(Preference preference) {
        y yVar;
        if (preference instanceof ListPreference) {
            yVar = new y((ListPreference) preference);
        } else if (preference instanceof TwoStatePreference) {
            yVar = new ac((TwoStatePreference) preference);
        } else {
            yVar = new ab(preference);
        }
        this.f193970a.mo87344gd(yVar);
    }

    /* renamed from: b */
    public final void mo17828b(act act) {
        this.f193970a.mo87342b();
    }

    /* renamed from: c */
    public final void mo17829c() {
        this.f193970a.mo87343c();
    }
}
