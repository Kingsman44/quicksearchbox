package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Locale;

/* compiled from: PG */
public class ParcelableGeofence extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144922ak();

    /* renamed from: a */
    public final String f391867a;

    /* renamed from: b */
    public final long f391868b;

    /* renamed from: c */
    public final short f391869c;

    /* renamed from: d */
    public final double f391870d;

    /* renamed from: e */
    public final double f391871e;

    /* renamed from: f */
    public final float f391872f;

    /* renamed from: g */
    public final int f391873g;

    /* renamed from: h */
    public final int f391874h;

    /* renamed from: i */
    public final int f391875i;

    public ParcelableGeofence(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
        } else if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        } else if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.f391869c = s;
                this.f391867a = str;
                this.f391870d = d;
                this.f391871e = d2;
                this.f391872f = f;
                this.f391868b = j;
                this.f391873g = i4;
                this.f391874h = i2;
                this.f391875i = i3;
                return;
            }
            throw new IllegalArgumentException("No supported transition specified: " + i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParcelableGeofence) {
            ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
            return this.f391872f == parcelableGeofence.f391872f && this.f391870d == parcelableGeofence.f391870d && this.f391871e == parcelableGeofence.f391871e && this.f391869c == parcelableGeofence.f391869c;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f391870d);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f391871e);
        return ((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.f391872f)) * 31) + this.f391869c) * 31) + this.f391873g;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        short s = this.f391869c;
        objArr[0] = s != -1 ? s != 1 ? "UNKNOWN" : "CIRCLE" : "INVALID";
        objArr[1] = this.f391867a.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.f391873g);
        objArr[3] = Double.valueOf(this.f391870d);
        objArr[4] = Double.valueOf(this.f391871e);
        objArr[5] = Float.valueOf(this.f391872f);
        objArr[6] = Integer.valueOf(this.f391874h / 1000);
        objArr[7] = Integer.valueOf(this.f391875i);
        objArr[8] = Long.valueOf(this.f391868b);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f391867a);
        C143947c.m234090i(parcel, 2, this.f391868b);
        short s = this.f391869c;
        C143947c.m234088g(parcel, 3, 4);
        parcel.writeInt(s);
        C143947c.m234086e(parcel, 4, this.f391870d);
        C143947c.m234086e(parcel, 5, this.f391871e);
        C143947c.m234087f(parcel, 6, this.f391872f);
        C143947c.m234089h(parcel, 7, this.f391873g);
        C143947c.m234089h(parcel, 8, this.f391874h);
        C143947c.m234089h(parcel, 9, this.f391875i);
        C143947c.m234083b(parcel, a);
    }
}
