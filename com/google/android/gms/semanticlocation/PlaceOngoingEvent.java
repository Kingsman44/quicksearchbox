package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PlaceOngoingEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145982t();

    /* renamed from: a */
    public final int f394605a;

    /* renamed from: b */
    public final float f394606b;
    @Deprecated

    /* renamed from: c */
    public final float f394607c;

    /* renamed from: d */
    public final PlaceCandidate f394608d;

    /* renamed from: e */
    public final AdditionalPlaceCandidates f394609e;

    public PlaceOngoingEvent(int i, float f, float f2, PlaceCandidate placeCandidate, AdditionalPlaceCandidates additionalPlaceCandidates) {
        this.f394605a = i;
        this.f394606b = f;
        this.f394607c = f2;
        this.f394608d = placeCandidate;
        this.f394609e = additionalPlaceCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394605a);
        C143947c.m234087f(parcel, 2, this.f394606b);
        C143947c.m234087f(parcel, 3, this.f394607c);
        C143947c.m234105x(parcel, 4, this.f394608d, i);
        C143947c.m234105x(parcel, 5, this.f394609e, i);
        C143947c.m234083b(parcel, a);
    }
}
