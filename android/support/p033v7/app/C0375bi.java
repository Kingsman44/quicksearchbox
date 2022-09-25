package android.support.p033v7.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* renamed from: android.support.v7.app.bi */
/* compiled from: PG */
final class C0375bi {

    /* renamed from: a */
    public static C0375bi f1261a;

    /* renamed from: b */
    public final Context f1262b;

    /* renamed from: c */
    public final C0374bh f1263c = new C0374bh();

    /* renamed from: d */
    private final LocationManager f1264d;

    public C0375bi(Context context, LocationManager locationManager) {
        this.f1262b = context;
        this.f1264d = locationManager;
    }

    /* renamed from: a */
    public final Location mo1257a(String str) {
        try {
            if (this.f1264d.isProviderEnabled(str)) {
                return this.f1264d.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
