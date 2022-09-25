package com.google.android.libraries.search.location.web;

import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionCallbacks;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionWindowPlugin$RequestImpl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.location.web.b */
/* compiled from: PG */
final class C38719b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ GeolocationPermissionCallbacks.GeolocationPermissionRequest f102241a;

    public C38719b(GeolocationPermissionCallbacks.GeolocationPermissionRequest geolocationPermissionRequest) {
        this.f102241a = geolocationPermissionRequest;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C38720c.f102242a.mo56226d()).mo56382g(th)).mo56372aa(53178)).mo56386p("Couldn't get #hasAccessToLocationData.");
        ((GeolocationPermissionWindowPlugin$RequestImpl) this.f102241a).mo47255c(true);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GeolocationPermissionWindowPlugin$RequestImpl) this.f102241a).mo47255c(true);
        } else {
            ((GeolocationPermissionWindowPlugin$RequestImpl) this.f102241a).mo47255c(false);
        }
    }
}
