package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class DetectedActivity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144955p();

    /* renamed from: a */
    int f391750a;

    /* renamed from: b */
    int f391751b;

    public DetectedActivity(int i, int i2) {
        this.f391750a = i;
        this.f391751b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f391750a == detectedActivity.f391750a && this.f391751b == detectedActivity.f391751b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391750a), Integer.valueOf(this.f391751b)});
    }

    public final String toString() {
        int i = this.f391750a;
        if (i > 22 || i < 0) {
            i = 4;
        }
        String num = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 7 ? i != 8 ? i != 16 ? i != 17 ? Integer.toString(i) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int i2 = this.f391751b;
        return "DetectedActivity [type=" + num + ", confidence=" + i2 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143919bh.m233958a(parcel);
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391750a);
        C143947c.m234089h(parcel, 2, this.f391751b);
        C143947c.m234083b(parcel, a);
    }
}
