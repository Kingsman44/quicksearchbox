package com.google.android.apps.gsa.speech.settingsui.p7313a;

import android.preference.TwoStatePreference;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.a.f */
/* compiled from: PG */
public final class C92553f extends C92552e implements C92559l {

    /* renamed from: a */
    private final TwoStatePreference f258302a;

    public C92553f(TwoStatePreference twoStatePreference) {
        super(twoStatePreference);
        this.f258302a = twoStatePreference;
    }

    /* renamed from: a */
    public final void mo87338a(boolean z) {
        this.f258302a.setChecked(z);
    }

    /* renamed from: b */
    public final boolean mo87339b() {
        return this.f258302a.isChecked();
    }
}
