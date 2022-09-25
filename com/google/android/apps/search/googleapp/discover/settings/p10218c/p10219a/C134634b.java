package com.google.android.apps.search.googleapp.discover.settings.p10218c.p10219a;

import com.google.android.libraries.search.integrations.p3015b.p3016a.C38501g;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.discover.settings.c.a.b */
/* compiled from: PG */
public final class C134634b implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C134640h f366632a;

    public C134634b(C134640h hVar) {
        this.f366632a = hVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C47633f g = C47633f.m84733g(((C38501g) this.f366632a.f366639b).f101859a.mo46042d());
        C134640h hVar = this.f366632a;
        return new C46463o(new C60817ay(g.mo51515h(new C134633a(hVar), hVar.f366643f)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        return this.f366632a.f366639b.mo41446b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        int a = this.f366632a.f366640c.mo50068a();
        return new C46885y("discover_language_data_source_" + a);
    }
}
