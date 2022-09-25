package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.preference.Preference;
import com.google.android.apps.gsa.settingsui.C88987b;
import com.google.android.apps.gsa.settingsui.C88990e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.be */
/* compiled from: PG */
public final class C97981be extends C88987b {

    /* renamed from: b */
    private final C69464a f273580b;

    /* renamed from: c */
    private final C69464a f273581c;

    /* renamed from: d */
    private final C69464a f273582d;

    public C97981be(C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f273580b = aVar;
        this.f273581c = aVar2;
        this.f273582d = aVar3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C88990e mo82939a(Preference preference) {
        String key = preference.getKey();
        if ("language_preference".equals(key)) {
            return (C88990e) this.f273580b.mo17428b();
        }
        if ("region_preference".equals(key)) {
            return (C88990e) this.f273581c.mo17428b();
        }
        if ("discover_feed_language_preference".equals(key)) {
            return (C88990e) this.f273582d.mo17428b();
        }
        return null;
    }
}
