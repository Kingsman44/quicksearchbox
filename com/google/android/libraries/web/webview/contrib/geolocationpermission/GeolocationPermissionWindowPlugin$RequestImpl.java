package com.google.android.libraries.web.webview.contrib.geolocationpermission;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.GeolocationPermissions;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.webview.contrib.geolocationpermission.GeolocationPermissionCallbacks;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60887da;

/* compiled from: PG */
public final class GeolocationPermissionWindowPlugin$RequestImpl implements GeolocationPermissionCallbacks.GeolocationPermissionRequest {
    public static final Parcelable.Creator CREATOR = new C44372e();

    /* renamed from: a */
    public volatile GeolocationPermissions.Callback f115360a;

    /* renamed from: b */
    private final String f115361b;

    /* renamed from: c */
    private final C60887da f115362c;

    /* renamed from: d */
    private boolean f115363d;

    public GeolocationPermissionWindowPlugin$RequestImpl(String str, GeolocationPermissions.Callback callback, C60887da daVar) {
        this.f115361b = str;
        this.f115360a = callback;
        this.f115362c = daVar;
    }

    /* renamed from: a */
    public final void mo47253a(boolean z) {
        if (this.f115360a != null) {
            this.f115360a.invoke(this.f115361b, z, false);
            this.f115360a = null;
        }
    }

    /* renamed from: b */
    public final void mo47254b(GeolocationPermissionCallbacks geolocationPermissionCallbacks) {
        if (!this.f115363d && this.f115360a != null) {
            this.f115363d = true;
            geolocationPermissionCallbacks.mo41581a(this);
        }
    }

    /* renamed from: c */
    public final void mo47255c(boolean z) {
        if (this.f115360a == null) {
            return;
        }
        if (C19559g.m37305d(Thread.currentThread())) {
            mo47253a(z);
            return;
        }
        C60887da daVar = this.f115362c;
        C58893dc.m90996a(daVar);
        C46459k.m82829b(daVar.mo19398a(C47810es.m84977q(new C44371d(this, z))), "Failed to invoke geolocation permission callback", new Object[0]);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115361b);
    }
}
