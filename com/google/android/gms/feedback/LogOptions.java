package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class LogOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144210o();

    /* renamed from: a */
    String f390587a;

    /* renamed from: b */
    boolean f390588b;

    /* renamed from: c */
    boolean f390589c;

    /* renamed from: d */
    boolean f390590d;

    /* renamed from: e */
    boolean f390591e;

    public LogOptions(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f390587a = str;
        this.f390588b = z;
        this.f390589c = z2;
        this.f390590d = z3;
        this.f390591e = z4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f390587a);
        C143947c.m234084c(parcel, 3, this.f390588b);
        C143947c.m234084c(parcel, 4, this.f390589c);
        C143947c.m234084c(parcel, 5, this.f390590d);
        C143947c.m234084c(parcel, 6, this.f390591e);
        C143947c.m234083b(parcel, a);
    }
}
