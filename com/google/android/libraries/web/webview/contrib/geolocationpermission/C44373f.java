package com.google.android.libraries.web.webview.contrib.geolocationpermission;

import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43945v;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44475p;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.web.webview.contrib.geolocationpermission.f */
/* compiled from: PG */
public final class C44373f implements C43945v {

    /* renamed from: a */
    public final C60887da f115368a;

    /* renamed from: b */
    public GeolocationPermissionWindowPlugin$RequestImpl f115369b;

    /* renamed from: c */
    public GeolocationPermissionCallbacks f115370c;

    public C44373f(C43904a aVar, C60887da daVar) {
        this.f115368a = daVar;
        ((C44475p) aVar.mo46411d(C44475p.class)).f115618c.f115565a.mo62678c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47263a(GeolocationPermissionCallbacks geolocationPermissionCallbacks) {
        GeolocationPermissionWindowPlugin$RequestImpl geolocationPermissionWindowPlugin$RequestImpl;
        if (!(geolocationPermissionCallbacks == null || (geolocationPermissionWindowPlugin$RequestImpl = this.f115369b) == null)) {
            geolocationPermissionWindowPlugin$RequestImpl.mo47254b(geolocationPermissionCallbacks);
        }
        this.f115370c = geolocationPermissionCallbacks;
    }
}
