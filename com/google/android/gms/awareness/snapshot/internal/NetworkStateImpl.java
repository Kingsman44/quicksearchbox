package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142941d();

    /* renamed from: a */
    public final int f387843a;

    /* renamed from: b */
    public final int f387844b;

    public NetworkStateImpl(int i, int i2) {
        this.f387843a = i;
        this.f387844b = i2;
    }

    public final String toString() {
        String num = Integer.toString(this.f387843a);
        String num2 = Integer.toString(this.f387844b);
        return "ConnectionState = " + num + " NetworkMeteredState = " + num2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f387843a);
        C143947c.m234089h(parcel, 3, this.f387844b);
        C143947c.m234083b(parcel, a);
    }
}
