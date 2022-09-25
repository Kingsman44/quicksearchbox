package com.google.android.apps.search.googleapp.settingsui.selectedpreference;

import android.content.Context;
import androidx.preference.Preference;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class SelectablePreferenceFactory {

    /* renamed from: a */
    public final C139253b f378732a;

    /* renamed from: b */
    public final boolean f378733b;

    public SelectablePreferenceFactory(C139253b bVar, boolean z) {
        C69664n.m101061g(bVar, "currentDestinationDataService");
        this.f378732a = bVar;
        this.f378733b = z;
    }

    /* renamed from: a */
    public final Preference mo114855a(Context context, C139873i iVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(iVar, "settingEnum");
        return new SelectablePreferenceFactory$create$1(context, this, iVar);
    }
}
