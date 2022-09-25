package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ActivityCandidate extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145949a();

    /* renamed from: a */
    public final int f394546a;

    /* renamed from: b */
    public final float f394547b;
    @Deprecated

    /* renamed from: c */
    public final float f394548c;

    public ActivityCandidate(int i, float f, float f2) {
        this.f394546a = i;
        this.f394547b = f;
        this.f394548c = f2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f394546a);
        C143947c.m234087f(parcel, 2, this.f394547b);
        C143947c.m234087f(parcel, 3, this.f394548c);
        C143947c.m234083b(parcel, a);
    }
}
