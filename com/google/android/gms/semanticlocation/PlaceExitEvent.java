package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PlaceExitEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145981s();

    /* renamed from: a */
    public final int f394600a;

    /* renamed from: b */
    public final float f394601b;
    @Deprecated

    /* renamed from: c */
    public final float f394602c;

    /* renamed from: d */
    public final PlaceCandidate f394603d;

    /* renamed from: e */
    public final AdditionalPlaceCandidates f394604e;

    public PlaceExitEvent(int i, float f, float f2, PlaceCandidate placeCandidate, AdditionalPlaceCandidates additionalPlaceCandidates) {
        this.f394600a = i;
        this.f394601b = f;
        this.f394602c = f2;
        this.f394603d = placeCandidate;
        this.f394604e = additionalPlaceCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394600a);
        C143947c.m234087f(parcel, 2, this.f394601b);
        C143947c.m234087f(parcel, 3, this.f394602c);
        C143947c.m234105x(parcel, 4, this.f394603d, i);
        C143947c.m234105x(parcel, 5, this.f394604e, i);
        C143947c.m234083b(parcel, a);
    }
}
