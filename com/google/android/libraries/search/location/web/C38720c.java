package com.google.android.libraries.search.location.web;

import com.google.android.libraries.search.location.p3029a.C38586af;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionCallbacks;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.location.web.c */
/* compiled from: PG */
public final class C38720c implements GeolocationPermissionCallbacks {

    /* renamed from: a */
    public static final C59071e f102242a = C59071e.m91332i("com.google.android.libraries.search.location.web.c");

    /* renamed from: b */
    private final C38586af f102243b;

    public C38720c(C38586af afVar) {
        this.f102243b = afVar;
    }

    /* renamed from: a */
    public final void mo41581a(GeolocationPermissionCallbacks.GeolocationPermissionRequest geolocationPermissionRequest) {
        C60870cx d = this.f102243b.mo41508d();
        C38719b bVar = new C38719b(geolocationPermissionRequest);
        C60856cj.m92911t(d, C47810es.m84974n(bVar), C60826bg.f164896a);
    }
}
