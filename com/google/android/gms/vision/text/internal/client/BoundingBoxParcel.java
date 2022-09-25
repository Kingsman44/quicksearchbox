package com.google.android.gms.vision.text.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class BoundingBoxParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146326a();

    /* renamed from: a */
    public final int f395231a;

    /* renamed from: b */
    public final int f395232b;

    /* renamed from: c */
    public final int f395233c;

    /* renamed from: d */
    public final int f395234d;

    /* renamed from: e */
    public final float f395235e;

    public BoundingBoxParcel(int i, int i2, int i3, int i4, float f) {
        this.f395231a = i;
        this.f395232b = i2;
        this.f395233c = i3;
        this.f395234d = i4;
        this.f395235e = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395231a);
        C143947c.m234089h(parcel, 3, this.f395232b);
        C143947c.m234089h(parcel, 4, this.f395233c);
        C143947c.m234089h(parcel, 5, this.f395234d);
        C143947c.m234087f(parcel, 6, this.f395235e);
        C143947c.m234083b(parcel, a);
    }
}
