package com.google.android.apps.gsa.assistant.settings.features.p562ao;

import android.content.SharedPreferences;
import com.google.assistant.p3861at.C50277rc;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ao.e */
/* compiled from: PG */
public final class C10181e {

    /* renamed from: a */
    public final C68214a f34596a;

    public C10181e(C68214a aVar) {
        this.f34596a = aVar;
    }

    /* renamed from: a */
    public static String m25052a(C50277rc rcVar) {
        int i = rcVar.f130749h;
        return "assistant_settings_features:profile_proactive_card:" + i + ":dismissed";
    }

    /* renamed from: b */
    public final void mo18313b(C50277rc rcVar) {
        ((SharedPreferences) this.f34596a.mo27525b()).edit().putBoolean(m25052a(rcVar), true).commit();
    }
}
