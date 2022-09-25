package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.semanticlocation.PlaceCandidate;

/* compiled from: PG */
public class Activity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145955b();

    /* renamed from: a */
    public final PlaceCandidate.Point f394539a;

    /* renamed from: b */
    public final PlaceCandidate.Point f394540b;

    /* renamed from: c */
    public final float f394541c;

    /* renamed from: d */
    public final float f394542d;
    @Deprecated

    /* renamed from: e */
    public final float f394543e;

    /* renamed from: f */
    public final ActivityCandidate f394544f;

    /* renamed from: g */
    public final AdditionalActivityCandidates f394545g;

    public Activity(PlaceCandidate.Point point, PlaceCandidate.Point point2, float f, float f2, float f3, ActivityCandidate activityCandidate, AdditionalActivityCandidates additionalActivityCandidates) {
        this.f394539a = point;
        this.f394540b = point2;
        this.f394541c = f;
        this.f394542d = f2;
        this.f394543e = f3;
        this.f394544f = activityCandidate;
        this.f394545g = additionalActivityCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394539a, i);
        C143947c.m234105x(parcel, 2, this.f394540b, i);
        C143947c.m234087f(parcel, 3, this.f394541c);
        C143947c.m234087f(parcel, 4, this.f394542d);
        C143947c.m234087f(parcel, 5, this.f394543e);
        C143947c.m234105x(parcel, 6, this.f394544f, i);
        C143947c.m234105x(parcel, 7, this.f394545g, i);
        C143947c.m234083b(parcel, a);
    }
}
