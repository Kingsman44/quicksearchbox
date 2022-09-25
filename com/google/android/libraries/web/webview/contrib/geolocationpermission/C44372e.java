package com.google.android.libraries.web.webview.contrib.geolocationpermission;

import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.GeolocationPermissions;
import com.google.common.base.C58893dc;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.web.webview.contrib.geolocationpermission.e */
/* compiled from: PG */
final class C44372e implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        C58893dc.m90996a(readString);
        return new GeolocationPermissionWindowPlugin$RequestImpl(readString, (GeolocationPermissions.Callback) null, (C60887da) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeolocationPermissionWindowPlugin$RequestImpl[i];
    }
}
