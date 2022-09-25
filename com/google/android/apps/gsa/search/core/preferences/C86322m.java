package com.google.android.apps.gsa.search.core.preferences;

import android.content.Intent;
import android.preference.Preference;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.m */
/* compiled from: PG */
final class C86322m implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Preference f233399a;

    /* renamed from: b */
    final /* synthetic */ PrivacyAndSecurityFragment f233400b;

    public C86322m(PrivacyAndSecurityFragment privacyAndSecurityFragment, Preference preference) {
        this.f233400b = privacyAndSecurityFragment;
        this.f233399a = preference;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) PrivacyAndSecurityFragment.f233295a.mo56225c()).mo56382g(th)).mo56372aa(8310)).mo56386p("Failed to update TNG setting preference intent");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        Intent intent = (Intent) obj;
        if (intent.getBooleanExtra("IS_VISIBLE", true)) {
            this.f233399a.setIntent(intent);
            this.f233400b.getPreferenceScreen().addPreference(this.f233399a);
        }
    }
}
