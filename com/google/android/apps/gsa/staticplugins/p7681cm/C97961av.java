package com.google.android.apps.gsa.staticplugins.p7681cm;

import android.content.Intent;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.cm.av */
/* compiled from: PG */
final class C97961av implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Preference f273527a;

    /* renamed from: b */
    final /* synthetic */ boolean f273528b;

    /* renamed from: c */
    final /* synthetic */ PreferenceCategory f273529c;

    public C97961av(Preference preference, boolean z, PreferenceCategory preferenceCategory) {
        this.f273527a = preference;
        this.f273528b = z;
        this.f273529c = preferenceCategory;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C97962aw.f273530a.mo56225c()).mo56382g(th)).mo56372aa(30402)).mo56386p("Failed to retrieve intent");
        this.f273529c.removePreference(this.f273527a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Intent intent = (Intent) obj;
        this.f273527a.setEnabled(this.f273528b);
        intent.setFlags(intent.getFlags() & -67108865);
        this.f273527a.setIntent(intent);
    }
}
