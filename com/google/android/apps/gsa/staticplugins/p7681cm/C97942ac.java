package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import android.preference.TwoStatePreference;
import com.google.android.libraries.web.profile.C44072g;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.ac */
/* compiled from: PG */
public final /* synthetic */ class C97942ac implements Preference.OnPreferenceChangeListener {

    /* renamed from: a */
    public final /* synthetic */ TwoStatePreference f273482a;

    /* renamed from: b */
    public final /* synthetic */ boolean f273483b;

    /* renamed from: c */
    public final /* synthetic */ TwoStatePreference f273484c;

    /* renamed from: d */
    public final /* synthetic */ C44072g f273485d;

    public /* synthetic */ C97942ac(TwoStatePreference twoStatePreference, boolean z, TwoStatePreference twoStatePreference2, C44072g gVar) {
        this.f273482a = twoStatePreference;
        this.f273483b = z;
        this.f273484c = twoStatePreference2;
        this.f273485d = gVar;
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        TwoStatePreference twoStatePreference = this.f273482a;
        boolean z = this.f273483b;
        TwoStatePreference twoStatePreference2 = this.f273484c;
        C44072g gVar = this.f273485d;
        C59071e eVar = C97962aw.f273530a;
        boolean z2 = false;
        if (twoStatePreference != null) {
            twoStatePreference.setEnabled(z && ((Boolean) obj).booleanValue());
        }
        if (twoStatePreference2 != null) {
            if (z && ((Boolean) obj).booleanValue()) {
                z2 = true;
            }
            twoStatePreference2.setEnabled(z2);
        }
        gVar.mo47038f(((Boolean) obj).booleanValue());
        return true;
    }
}
