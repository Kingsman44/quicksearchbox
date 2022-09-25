package com.google.android.apps.gsa.speech.settingsui.hotword.base;

import android.preference.Preference;
import android.preference.PreferenceScreen;
import com.google.android.apps.gsa.settingsui.C88987b;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92597d;
import com.google.android.apps.gsa.speech.settingsui.hotword.p7316b.C92599f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.base.d */
/* compiled from: PG */
public abstract class C92605d extends C88987b {

    /* renamed from: f */
    private static final C59071e f258444f = C59071e.m91332i("com.google.android.apps.gsa.speech.settingsui.hotword.base.d");

    /* renamed from: b */
    protected final C92597d f258445b;

    /* renamed from: c */
    protected final C92599f f258446c;

    /* renamed from: d */
    protected final C92602a f258447d;

    /* renamed from: e */
    protected PreferenceScreen f258448e;

    public C92605d(C92597d dVar, C92599f fVar, C92602a aVar) {
        this.f258445b = dVar;
        this.f258446c = fVar;
        this.f258447d = aVar;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        mo87386m(preference);
        super.mo82941c(preference);
    }

    /* renamed from: e */
    public final void mo82943e() {
        super.mo82943e();
        this.f258445b.mo87371e();
    }

    /* renamed from: k */
    public final void mo82949k(PreferenceScreen preferenceScreen) {
        this.f241152a = preferenceScreen;
        this.f258448e = preferenceScreen;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo87386m(Preference preference);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo87387n(Preference preference) {
        String str;
        if (this.f258446c.mo87380c()) {
            str = "opa_hotword_enabled";
        } else {
            str = this.f258446c.mo87378a() ? "alwaysOnHotword" : "voiceEverywhereEnabled";
        }
        C58976aa aaVar = C58975e.f156826a;
        PreferenceScreen preferenceScreen = this.f258448e;
        if (preferenceScreen == null || preferenceScreen.findPreference(str) == null) {
            C59104x b = f258444f.mo56224b();
            b.mo56378ag(C58975e.f156826a, "BaseHotwordCompPrefCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(12996)).mo56386p("Preference disabled as no appropriate dependency found.");
            preference.setEnabled(false);
            return;
        }
        preference.setDependency(str);
    }
}
