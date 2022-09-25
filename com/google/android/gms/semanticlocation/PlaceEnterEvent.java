package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class PlaceEnterEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145980r();

    /* renamed from: a */
    public final int f394595a;

    /* renamed from: b */
    public final float f394596b;
    @Deprecated

    /* renamed from: c */
    public final float f394597c;

    /* renamed from: d */
    public final PlaceCandidate f394598d;

    /* renamed from: e */
    public final AdditionalPlaceCandidates f394599e;

    public PlaceEnterEvent(int i, float f, float f2, PlaceCandidate placeCandidate, AdditionalPlaceCandidates additionalPlaceCandidates) {
        this.f394595a = i;
        this.f394596b = f;
        this.f394597c = f2;
        this.f394598d = placeCandidate;
        this.f394599e = additionalPlaceCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394595a);
        C143947c.m234087f(parcel, 2, this.f394596b);
        C143947c.m234087f(parcel, 3, this.f394597c);
        C143947c.m234105x(parcel, 4, this.f394598d, i);
        C143947c.m234105x(parcel, 5, this.f394599e, i);
        C143947c.m234083b(parcel, a);
    }
}
