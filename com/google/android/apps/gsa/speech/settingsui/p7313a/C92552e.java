package com.google.android.apps.gsa.speech.settingsui.p7313a;

import android.content.Context;
import android.preference.Preference;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.a.e */
/* compiled from: PG */
public class C92552e implements C92557j {

    /* renamed from: a */
    private final Preference f258301a;

    public C92552e(Preference preference) {
        this.f258301a = preference;
    }

    /* renamed from: e */
    public final Context mo87329e() {
        return this.f258301a.getContext();
    }

    /* renamed from: f */
    public final String mo87330f() {
        return this.f258301a.getKey();
    }

    /* renamed from: g */
    public final void mo87331g(boolean z) {
        this.f258301a.setEnabled(z);
    }

    /* renamed from: h */
    public final void mo87332h(C92555h hVar) {
        this.f258301a.setOnPreferenceChangeListener(new C92550c(this, hVar));
    }

    /* renamed from: i */
    public final void mo87333i(C92556i iVar) {
        this.f258301a.setOnPreferenceClickListener(new C92551d(this, iVar));
    }

    /* renamed from: j */
    public final void mo87334j(int i) {
        this.f258301a.setSummary(i);
    }

    /* renamed from: k */
    public final void mo87335k(CharSequence charSequence) {
        this.f258301a.setSummary(charSequence);
    }

    /* renamed from: l */
    public final void mo87336l(CharSequence charSequence) {
        this.f258301a.setTitle(charSequence);
    }

    /* renamed from: m */
    public final boolean mo87337m() {
        return this.f258301a.isEnabled();
    }
}
