package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.as */
/* compiled from: PG */
public final /* synthetic */ class C97958as implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C97962aw f273517a;

    /* renamed from: b */
    public final /* synthetic */ Preference f273518b;

    public /* synthetic */ C97958as(C97962aw awVar, Preference preference) {
        this.f273517a = awVar;
        this.f273518b = preference;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        this.f273517a.mo90854a(this.f273518b, ((Boolean) obj).booleanValue());
        return true;
    }
}
