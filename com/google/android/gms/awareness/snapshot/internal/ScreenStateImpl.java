package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class ScreenStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142943f();

    /* renamed from: a */
    public final int f387847a;

    public ScreenStateImpl(int i) {
        this.f387847a = i;
    }

    public final String toString() {
        int i = this.f387847a;
        return i == 1 ? "ScreenState: SCREEN_OFF" : i == 2 ? "ScreenState: SCREEN_ON" : "ScreenState: UNKNOWN";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f387847a);
        C143947c.m234083b(parcel, a);
    }
}
