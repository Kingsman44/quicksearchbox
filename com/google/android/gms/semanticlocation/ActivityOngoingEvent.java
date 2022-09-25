package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ActivityOngoingEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145957d();

    /* renamed from: a */
    public final float f394553a;
    @Deprecated

    /* renamed from: b */
    public final float f394554b;

    /* renamed from: c */
    public final ActivityCandidate f394555c;

    /* renamed from: d */
    public final AdditionalActivityCandidates f394556d;

    public ActivityOngoingEvent(float f, float f2, ActivityCandidate activityCandidate, AdditionalActivityCandidates additionalActivityCandidates) {
        this.f394553a = f;
        this.f394554b = f2;
        this.f394555c = activityCandidate;
        this.f394556d = additionalActivityCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 1, this.f394553a);
        C143947c.m234087f(parcel, 2, this.f394554b);
        C143947c.m234105x(parcel, 3, this.f394555c, i);
        C143947c.m234105x(parcel, 4, this.f394556d, i);
        C143947c.m234083b(parcel, a);
    }
}
