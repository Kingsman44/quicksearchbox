package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ActivityStartEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145958e();

    /* renamed from: a */
    public final float f394557a;
    @Deprecated

    /* renamed from: b */
    public final float f394558b;

    /* renamed from: c */
    public final ActivityCandidate f394559c;

    /* renamed from: d */
    public final AdditionalActivityCandidates f394560d;

    public ActivityStartEvent(float f, float f2, ActivityCandidate activityCandidate, AdditionalActivityCandidates additionalActivityCandidates) {
        this.f394557a = f;
        this.f394558b = f2;
        this.f394559c = activityCandidate;
        this.f394560d = additionalActivityCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 1, this.f394557a);
        C143947c.m234087f(parcel, 2, this.f394558b);
        C143947c.m234105x(parcel, 3, this.f394559c, i);
        C143947c.m234105x(parcel, 4, this.f394560d, i);
        C143947c.m234083b(parcel, a);
    }
}
