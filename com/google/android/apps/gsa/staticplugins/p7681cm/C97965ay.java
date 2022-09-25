package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import android.preference.SwitchPreference;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.ay */
/* compiled from: PG */
public final /* synthetic */ class C97965ay implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C97980bd f273547a;

    /* renamed from: b */
    public final /* synthetic */ SwitchPreference f273548b;

    public /* synthetic */ C97965ay(C97980bd bdVar, SwitchPreference switchPreference) {
        this.f273547a = bdVar;
        this.f273548b = switchPreference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.f273547a.mo90863a(this.f273548b, ((Boolean) obj).booleanValue());
        return true;
    }
}
