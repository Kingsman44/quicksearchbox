package com.google.android.gms.car;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ActivityLaunchInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142973a();

    /* renamed from: a */
    public final Intent f387929a;

    /* renamed from: b */
    public final CarRegionId f387930b;

    public ActivityLaunchInfo(Intent intent, CarRegionId carRegionId) {
        this.f387929a = intent;
        this.f387930b = carRegionId;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f387929a);
        String valueOf2 = String.valueOf(this.f387930b);
        return "ActivityLaunchInfo{intent=" + valueOf + " carRegionId=" + valueOf2 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f387929a, i);
        C143947c.m234105x(parcel, 2, this.f387930b, i);
        C143947c.m234083b(parcel, a);
    }
}
