package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class HeadphoneStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142940c();

    /* renamed from: a */
    public final int f387842a;

    public HeadphoneStateImpl(int i) {
        this.f387842a = i;
    }

    public final String toString() {
        return Integer.toString(this.f387842a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f387842a);
        C143947c.m234083b(parcel, a);
    }
}
