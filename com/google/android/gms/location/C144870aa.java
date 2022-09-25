package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.location.internal.ParcelableGeofence;

/* renamed from: com.google.android.gms.location.aa */
/* compiled from: PG */
public final class C144870aa {

    /* renamed from: a */
    public int f391809a = 0;

    /* renamed from: b */
    public int f391810b = 0;

    /* renamed from: c */
    public int f391811c = -1;

    /* renamed from: d */
    private String f391812d = null;

    /* renamed from: e */
    private long f391813e = Long.MIN_VALUE;

    /* renamed from: f */
    private short f391814f = -1;

    /* renamed from: g */
    private double f391815g;

    /* renamed from: h */
    private double f391816h;

    /* renamed from: i */
    private float f391817i;

    /* renamed from: a */
    public final ParcelableGeofence mo120363a() {
        String str = this.f391812d;
        if (str != null) {
            int i = this.f391809a;
            if (i == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((i & 4) == 0 || this.f391811c >= 0) {
                long j = this.f391813e;
                if (j == Long.MIN_VALUE) {
                    throw new IllegalArgumentException("Expiration not set.");
                } else if (this.f391814f != -1) {
                    int i2 = this.f391810b;
                    if (i2 >= 0) {
                        return new ParcelableGeofence(str, i, 1, this.f391815g, this.f391816h, this.f391817i, j, i2, this.f391811c);
                    }
                    throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
                } else {
                    throw new IllegalArgumentException("Geofence region not set.");
                }
            } else {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
            }
        } else {
            throw new IllegalArgumentException("Request ID not set.");
        }
    }

    /* renamed from: b */
    public final void mo120364b(double d, double d2, float f) {
        boolean z = false;
        boolean z2 = d >= -90.0d && d <= 90.0d;
        C143919bh.m233960c(z2, "Invalid latitude: " + d);
        boolean z3 = d2 >= -180.0d && d2 <= 180.0d;
        C143919bh.m233960c(z3, "Invalid longitude: " + d2);
        if (f > 0.0f) {
            z = true;
        }
        C143919bh.m233960c(z, "Invalid radius: " + f);
        this.f391814f = 1;
        this.f391815g = d;
        this.f391816h = d2;
        this.f391817i = f;
    }

    /* renamed from: c */
    public final void mo120365c(long j) {
        if (j < 0) {
            this.f391813e = -1;
        } else {
            this.f391813e = SystemClock.elapsedRealtime() + j;
        }
    }

    /* renamed from: d */
    public final void mo120366d(String str) {
        C143919bh.m233971n(str, "Request ID can't be set to null");
        this.f391812d = str;
    }
}
