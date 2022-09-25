package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class GetCurrentExperimentIdsCall$Response extends AbstractSafeParcelable implements C143711ad {
    public static final Parcelable.Creator CREATOR = new C145899c();

    /* renamed from: a */
    public Status f394443a;

    /* renamed from: b */
    public int[] f394444b;

    public GetCurrentExperimentIdsCall$Response() {
    }

    public GetCurrentExperimentIdsCall$Response(Status status, int[] iArr) {
        this.f394443a = status;
        this.f394444b = iArr;
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this.f394443a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394443a, i);
        C143947c.m234099r(parcel, 2, this.f394444b);
        C143947c.m234083b(parcel, a);
    }
}
