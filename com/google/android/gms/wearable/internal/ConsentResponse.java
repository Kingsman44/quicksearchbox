package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ConsentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146416aa();

    /* renamed from: a */
    public final int f395564a;

    /* renamed from: b */
    public final boolean f395565b;

    /* renamed from: c */
    public final boolean f395566c;

    /* renamed from: d */
    public final boolean f395567d;

    /* renamed from: e */
    public final boolean f395568e;

    public ConsentResponse(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f395564a = i;
        this.f395565b = z;
        this.f395566c = z2;
        this.f395567d = z3;
        this.f395568e = z4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f395564a);
        C143947c.m234084c(parcel, 2, this.f395565b);
        C143947c.m234084c(parcel, 3, this.f395566c);
        C143947c.m234084c(parcel, 4, this.f395567d);
        C143947c.m234084c(parcel, 5, this.f395568e);
        C143947c.m234083b(parcel, a);
    }
}
