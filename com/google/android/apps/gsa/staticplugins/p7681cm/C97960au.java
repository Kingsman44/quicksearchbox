package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.TwoStatePreference;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.au */
/* compiled from: PG */
final class C97960au implements C22868d {

    /* renamed from: a */
    final /* synthetic */ PreferenceCategory f273520a;

    /* renamed from: b */
    final /* synthetic */ TwoStatePreference f273521b;

    /* renamed from: c */
    final /* synthetic */ TwoStatePreference f273522c;

    /* renamed from: d */
    final /* synthetic */ TwoStatePreference f273523d;

    /* renamed from: e */
    final /* synthetic */ PreferenceCategory f273524e;

    /* renamed from: f */
    final /* synthetic */ Preference f273525f;

    /* renamed from: g */
    final /* synthetic */ TwoStatePreference f273526g;

    public C97960au(PreferenceCategory preferenceCategory, TwoStatePreference twoStatePreference, TwoStatePreference twoStatePreference2, TwoStatePreference twoStatePreference3, PreferenceCategory preferenceCategory2, Preference preference, TwoStatePreference twoStatePreference4) {
        this.f273520a = preferenceCategory;
        this.f273521b = twoStatePreference;
        this.f273522c = twoStatePreference2;
        this.f273523d = twoStatePreference3;
        this.f273524e = preferenceCategory2;
        this.f273525f = preference;
        this.f273526g = twoStatePreference4;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C97962aw.f273530a.mo56225c()).mo56382g(th)).mo56372aa(30401)).mo56386p("Failed to retrieve AccountId");
        this.f273520a.removePreference(this.f273521b);
        this.f273520a.removePreference(this.f273522c);
        this.f273520a.removePreference(this.f273523d);
        this.f273524e.removePreference(this.f273525f);
        this.f273524e.removePreference(this.f273526g);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Void voidR = (Void) obj;
    }
}
