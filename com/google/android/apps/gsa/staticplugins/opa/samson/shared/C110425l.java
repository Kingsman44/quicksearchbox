package com.google.android.apps.gsa.staticplugins.opa.samson.shared;

import android.content.SharedPreferences;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.l */
/* compiled from: PG */
public final class C110425l {

    /* renamed from: a */
    private final C68214a f307805a;

    public C110425l(C68214a aVar) {
        this.f307805a = aVar;
    }

    /* renamed from: a */
    public final void mo98663a(boolean z) {
        ((SharedPreferences) this.f307805a.mo27525b()).edit().putBoolean("prctv_prs_rsp", z).apply();
    }

    /* renamed from: b */
    public final boolean mo98664b() {
        return ((SharedPreferences) this.f307805a.mo27525b()).getBoolean("prctv_prs_rsp", false);
    }
}
