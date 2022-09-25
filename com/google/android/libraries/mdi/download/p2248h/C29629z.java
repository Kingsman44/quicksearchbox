package com.google.android.libraries.mdi.download.p2248h;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.C1882h;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.h.z */
/* compiled from: PG */
public final class C29629z implements C29628y {

    /* renamed from: a */
    private final Context f80233a;

    /* renamed from: b */
    private final LocationManager f80234b;

    public C29629z(Context context, LocationManager locationManager) {
        this.f80233a = context;
        this.f80234b = locationManager;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        if (C1882h.m5137c(this.f80233a, "android.permission.ACCESS_FINE_LOCATION") == -1 && C1882h.m5137c(this.f80233a, "android.permission.ACCESS_COARSE_LOCATION") == -1) {
            return C58836b.f156633a;
        }
        Location lastKnownLocation = this.f80234b.getLastKnownLocation("network");
        if (lastKnownLocation != null && lastKnownLocation.hasAccuracy()) {
            return C58833ax.m90834k(lastKnownLocation);
        }
        Location lastKnownLocation2 = this.f80234b.getLastKnownLocation("gps");
        return (lastKnownLocation2 == null || !lastKnownLocation2.hasAccuracy()) ? C58836b.f156633a : C58833ax.m90834k(lastKnownLocation2);
    }
}
