package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.assistant.settings.shared.ad;
import com.google.android.apps.gsa.nga.api.C74719bw;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.gsa.search.core.p6805i.C86109e;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.nga.p8047b.C103011g;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103384h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.cv */
/* compiled from: PG */
public final class C102967cv extends C86052m implements SharedPreferences.OnSharedPreferenceChangeListener, C74719bw, C86109e, ad, C103011g, C102976e, C103384h {

    /* renamed from: a */
    public final Context f287530a;

    /* renamed from: b */
    public final C68214a f287531b;

    /* renamed from: c */
    public final C68214a f287532c;

    /* renamed from: d */
    public final C68214a f287533d;

    /* renamed from: e */
    private final C22871g f287534e;

    public C102967cv(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar) {
        this.f287530a = context;
        this.f287531b = aVar;
        this.f287532c = aVar2;
        this.f287533d = aVar3;
        this.f287534e = gVar;
    }

    /* renamed from: a */
    public final void mo70818a(C86124t tVar, C86117m mVar) {
        mo71088c();
    }

    /* renamed from: b */
    public final void mo70819b(C86124t tVar) {
        C86117m mVar = C86117m.f232762a;
        mo71088c();
    }

    /* renamed from: c */
    public final void mo71088c() {
        this.f287534e.mo28212l("[NGA] NgaStateInvalidatorImpl.invalidateNgaState", new C102965ct(this));
    }

    /* renamed from: d */
    public final void mo93545d(String str) {
        if (str.startsWith("language_settings_primary_assistant_language:")) {
            mo71088c();
        }
    }

    /* renamed from: e */
    public final void mo93546e() {
        mo71088c();
    }

    /* renamed from: f */
    public final void mo93547f() {
        mo71088c();
    }

    /* renamed from: i */
    public final void mo93533i() {
        this.f287534e.mo28212l("[NGA] NgaStateInvalidatorImpl.NgaStateInvalidatorImpl", new C102964cs(this));
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        mo71088c();
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.startsWith("opa_preferred_languages:") || str.equals("opa_enabled")) {
            mo71088c();
        }
    }
}
