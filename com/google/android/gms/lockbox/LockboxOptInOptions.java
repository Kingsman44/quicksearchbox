package com.google.android.gms.lockbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class LockboxOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144984f();

    /* renamed from: a */
    int f391949a;

    /* renamed from: b */
    int f391950b;

    public LockboxOptInOptions(int i, int i2) {
        this.f391949a = i;
        this.f391950b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f391949a);
        C143947c.m234089h(parcel, 3, this.f391950b);
        C143947c.m234083b(parcel, a);
    }
}
