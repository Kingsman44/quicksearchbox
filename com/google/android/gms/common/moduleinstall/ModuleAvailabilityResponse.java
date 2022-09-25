package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143961b();

    /* renamed from: a */
    public final boolean f390184a;

    /* renamed from: b */
    public final int f390185b;

    public ModuleAvailabilityResponse(boolean z, int i) {
        this.f390184a = z;
        this.f390185b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 1, this.f390184a);
        C143947c.m234089h(parcel, 2, this.f390185b);
        C143947c.m234083b(parcel, a);
    }
}
