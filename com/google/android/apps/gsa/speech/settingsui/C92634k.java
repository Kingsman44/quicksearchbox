package com.google.android.apps.gsa.speech.settingsui;

import android.preference.Preference;
import com.google.android.apps.gsa.settingsui.C88987b;
import com.google.android.apps.gsa.settingsui.C88988c;
import com.google.android.apps.gsa.settingsui.C88990e;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.k */
/* compiled from: PG */
public final class C92634k extends C88987b {

    /* renamed from: b */
    public static final C58528ij f258586b = C58528ij.m90011K("profanityFilter", "downloadLanguagePacks");

    /* renamed from: c */
    private final C58881cr f258587c;

    public C92634k(C58881cr crVar) {
        this.f258587c = crVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C88990e mo82939a(Preference preference) {
        String key = preference.getKey();
        if ("profanityFilter".equals(key)) {
            return new C88988c();
        }
        if ("downloadLanguagePacks".equals(key)) {
            return new C92560b(this.f258587c);
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo82950l(Preference preference) {
        if (f258586b.contains(preference.getKey())) {
            return false;
        }
        return super.mo82950l(preference);
    }
}
