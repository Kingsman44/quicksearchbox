package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Intent;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.TwoStatePreference;
import com.google.android.libraries.web.profile.C44071f;
import com.google.android.libraries.web.profile.C44072g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.aj */
/* compiled from: PG */
public final /* synthetic */ class C97949aj implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C97962aw f273492a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f273493b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f273494c;

    /* renamed from: d */
    public final /* synthetic */ TwoStatePreference f273495d;

    /* renamed from: e */
    public final /* synthetic */ boolean f273496e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f273497f;

    /* renamed from: g */
    public final /* synthetic */ TwoStatePreference f273498g;

    /* renamed from: h */
    public final /* synthetic */ TwoStatePreference f273499h;

    /* renamed from: i */
    public final /* synthetic */ C60870cx f273500i;

    /* renamed from: j */
    public final /* synthetic */ PreferenceCategory f273501j;

    /* renamed from: k */
    public final /* synthetic */ C60870cx f273502k;

    /* renamed from: l */
    public final /* synthetic */ TwoStatePreference f273503l;

    /* renamed from: m */
    public final /* synthetic */ C60870cx f273504m;

    /* renamed from: n */
    public final /* synthetic */ PreferenceCategory f273505n;

    /* renamed from: o */
    public final /* synthetic */ Preference f273506o;

    public /* synthetic */ C97949aj(C97962aw awVar, C60870cx cxVar, C60870cx cxVar2, TwoStatePreference twoStatePreference, boolean z, C60870cx cxVar3, TwoStatePreference twoStatePreference2, TwoStatePreference twoStatePreference3, C60870cx cxVar4, PreferenceCategory preferenceCategory, C60870cx cxVar5, TwoStatePreference twoStatePreference4, C60870cx cxVar6, PreferenceCategory preferenceCategory2, Preference preference) {
        this.f273492a = awVar;
        this.f273493b = cxVar;
        this.f273494c = cxVar2;
        this.f273495d = twoStatePreference;
        this.f273496e = z;
        this.f273497f = cxVar3;
        this.f273498g = twoStatePreference2;
        this.f273499h = twoStatePreference3;
        this.f273500i = cxVar4;
        this.f273501j = preferenceCategory;
        this.f273502k = cxVar5;
        this.f273503l = twoStatePreference4;
        this.f273504m = cxVar6;
        this.f273505n = preferenceCategory2;
        this.f273506o = preference;
    }

    public final Object call() {
        C97962aw awVar = this.f273492a;
        C60870cx cxVar = this.f273493b;
        C60870cx cxVar2 = this.f273494c;
        TwoStatePreference twoStatePreference = this.f273495d;
        boolean z = this.f273496e;
        C60870cx cxVar3 = this.f273497f;
        TwoStatePreference twoStatePreference2 = this.f273498g;
        TwoStatePreference twoStatePreference3 = this.f273499h;
        C60870cx cxVar4 = this.f273500i;
        PreferenceCategory preferenceCategory = this.f273501j;
        C60870cx cxVar5 = this.f273502k;
        TwoStatePreference twoStatePreference4 = this.f273503l;
        C60870cx cxVar6 = this.f273504m;
        PreferenceCategory preferenceCategory2 = this.f273505n;
        Preference preference = this.f273506o;
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        C44071f fVar = (C44071f) C60856cj.m92909r(cxVar2);
        C44072g c = fVar.mo47030c();
        if (twoStatePreference != null) {
            twoStatePreference.setEnabled(z);
            twoStatePreference.setChecked(((Boolean) C60856cj.m92909r(cxVar3)).booleanValue());
            twoStatePreference.setOnPreferenceChangeListener(new C97942ac(twoStatePreference2, z, twoStatePreference3, c));
        }
        if (twoStatePreference2 != null) {
            if (!awVar.f273534e.mo78065J() || booleanValue) {
                twoStatePreference2.setEnabled(z && twoStatePreference.isChecked());
                twoStatePreference2.setChecked(((Boolean) C60856cj.m92909r(cxVar4)).booleanValue());
                twoStatePreference2.setOnPreferenceChangeListener(new C97951al(c));
            } else {
                preferenceCategory.removePreference(twoStatePreference2);
            }
        }
        if (twoStatePreference3 != null) {
            if (!awVar.f273534e.mo78065J() || booleanValue) {
                twoStatePreference3.setEnabled(z && twoStatePreference.isChecked());
                twoStatePreference3.setChecked(((Boolean) C60856cj.m92909r(cxVar5)).booleanValue());
                twoStatePreference3.setOnPreferenceChangeListener(new C97952am(c));
            } else {
                preferenceCategory.removePreference(twoStatePreference3);
            }
        }
        if (twoStatePreference4 != null) {
            if (!awVar.f273534e.mo78065J() || booleanValue) {
                twoStatePreference4.setEnabled(z);
                twoStatePreference4.setChecked(((Boolean) C60856cj.m92909r(cxVar6)).booleanValue());
                twoStatePreference4.setOnPreferenceChangeListener(new C97953an(c));
            } else {
                preferenceCategory2.removePreference(twoStatePreference4);
            }
        }
        if (preference == null) {
            return null;
        }
        Intent b = fVar.mo47029b();
        if (b != null) {
            preference.setEnabled(z);
            preference.setOnPreferenceClickListener(new C97954ao(awVar, b));
            return null;
        }
        preferenceCategory2.removePreference(preference);
        return null;
    }
}
