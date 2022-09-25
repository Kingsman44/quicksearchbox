package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.app.Activity;
import android.preference.Preference;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.settingsui.C88994i;
import com.google.android.libraries.p11010ai.p11011a.C147591b;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.bn */
/* compiled from: PG */
public final class C97990bn extends C88994i implements Preference.OnPreferenceClickListener {

    /* renamed from: a */
    private final C86054o f273623a;

    /* renamed from: b */
    private final Activity f273624b;

    public C97990bn(Activity activity, C86054o oVar) {
        this.f273623a = oVar;
        this.f273624b = activity;
    }

    /* renamed from: c */
    public final void mo82941c(Preference preference) {
        preference.setOnPreferenceClickListener(this);
    }

    public final boolean onPreferenceClick(Preference preference) {
        C147591b.m240663b(this.f273624b, this.f273623a.mo79659F());
        return true;
    }
}
