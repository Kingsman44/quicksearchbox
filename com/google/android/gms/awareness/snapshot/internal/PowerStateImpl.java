package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PowerStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142942e();

    /* renamed from: a */
    public final int f387845a;

    /* renamed from: b */
    public final double f387846b;

    public PowerStateImpl(int i, double d) {
        this.f387845a = i;
        this.f387846b = d;
    }

    public final String toString() {
        String num = Integer.toString(this.f387845a);
        double d = this.f387846b;
        return "PowerConnectionState = " + num + " Battery Percentage = " + d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f387845a);
        C143947c.m234086e(parcel, 3, this.f387846b);
        C143947c.m234083b(parcel, a);
    }
}
