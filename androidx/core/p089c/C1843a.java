package androidx.core.p089c;

import android.location.LocationManager;

/* renamed from: androidx.core.c.a */
/* compiled from: PG */
final class C1843a {
    /* renamed from: a */
    static int m5053a(LocationManager locationManager) {
        return locationManager.getGnssYearOfHardware();
    }

    /* renamed from: b */
    static String m5054b(LocationManager locationManager) {
        return locationManager.getGnssHardwareModelName();
    }

    /* renamed from: c */
    static boolean m5055c(LocationManager locationManager) {
        return locationManager.isLocationEnabled();
    }
}
