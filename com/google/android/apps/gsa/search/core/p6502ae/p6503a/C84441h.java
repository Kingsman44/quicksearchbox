package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$GlobalSearchSource;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.h */
/* compiled from: PG */
public final class C84441h implements C91043j {

    /* renamed from: a */
    final /* synthetic */ C84431am f229777a;

    /* renamed from: b */
    final /* synthetic */ C84432an f229778b;

    /* renamed from: c */
    final /* synthetic */ SharedPreferences f229779c;

    /* renamed from: d */
    final /* synthetic */ C84444k f229780d;

    public C84441h(C84444k kVar, C84431am amVar, C84432an anVar, SharedPreferences sharedPreferences) {
        this.f229780d = kVar;
        this.f229777a = amVar;
        this.f229778b = anVar;
        this.f229779c = sharedPreferences;
    }

    /* renamed from: b */
    public final void mo17709a(GetGlobalSearchSourcesCall$GlobalSearchSource[] getGlobalSearchSourcesCall$GlobalSearchSourceArr) {
        this.f229777a.mo78011b(this.f229778b.mo78015b(getGlobalSearchSourcesCall$GlobalSearchSourceArr));
        this.f229780d.f229788a.mo28212l("sync-icing-sources-state", new C84440g(this, this.f229777a, this.f229779c));
    }
}
