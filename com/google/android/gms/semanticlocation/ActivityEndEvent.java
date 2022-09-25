package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ActivityEndEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145956c();

    /* renamed from: a */
    public final float f394549a;
    @Deprecated

    /* renamed from: b */
    public final float f394550b;

    /* renamed from: c */
    public final ActivityCandidate f394551c;

    /* renamed from: d */
    public final AdditionalActivityCandidates f394552d;

    public ActivityEndEvent(float f, float f2, ActivityCandidate activityCandidate, AdditionalActivityCandidates additionalActivityCandidates) {
        this.f394549a = f;
        this.f394550b = f2;
        this.f394551c = activityCandidate;
        this.f394552d = additionalActivityCandidates;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 1, this.f394549a);
        C143947c.m234087f(parcel, 2, this.f394550b);
        C143947c.m234105x(parcel, 3, this.f394551c, i);
        C143947c.m234105x(parcel, 4, this.f394552d, i);
        C143947c.m234083b(parcel, a);
    }
}
