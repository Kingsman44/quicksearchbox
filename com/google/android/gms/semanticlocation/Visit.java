package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class Visit extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145954ae();

    /* renamed from: a */
    public final int f394640a;

    /* renamed from: b */
    public final float f394641b;
    @Deprecated

    /* renamed from: c */
    public final float f394642c;

    /* renamed from: d */
    public final PlaceCandidate f394643d;

    /* renamed from: e */
    public final AdditionalPlaceCandidates f394644e;

    public Visit(int i, float f, float f2, PlaceCandidate placeCandidate, AdditionalPlaceCandidates additionalPlaceCandidates) {
        this.f394640a = i;
        this.f394641b = f;
        this.f394642c = f2;
        this.f394643d = placeCandidate;
        this.f394644e = additionalPlaceCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394640a);
        C143947c.m234087f(parcel, 2, this.f394641b);
        C143947c.m234087f(parcel, 3, this.f394642c);
        C143947c.m234105x(parcel, 4, this.f394643d, i);
        C143947c.m234105x(parcel, 5, this.f394644e, i);
        C143947c.m234083b(parcel, a);
    }
}
