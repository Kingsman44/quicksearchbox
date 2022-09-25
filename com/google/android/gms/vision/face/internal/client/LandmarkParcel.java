package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146317g();

    /* renamed from: a */
    public final int f395207a;

    /* renamed from: b */
    public final float f395208b;

    /* renamed from: c */
    public final float f395209c;

    /* renamed from: d */
    public final int f395210d;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.f395207a = i;
        this.f395208b = f;
        this.f395209c = f2;
        this.f395210d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f395207a);
        C143947c.m234087f(parcel, 2, this.f395208b);
        C143947c.m234087f(parcel, 3, this.f395209c);
        C143947c.m234089h(parcel, 4, this.f395210d);
        C143947c.m234083b(parcel, a);
    }
}
