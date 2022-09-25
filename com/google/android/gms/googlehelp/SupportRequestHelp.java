package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class SupportRequestHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144335m();

    /* renamed from: a */
    public GoogleHelp f390789a;

    /* renamed from: b */
    public String f390790b;

    /* renamed from: c */
    public String f390791c;

    /* renamed from: d */
    public String f390792d;

    /* renamed from: e */
    public String f390793e;

    public SupportRequestHelp(GoogleHelp googleHelp, String str, String str2, String str3, String str4) {
        this.f390789a = googleHelp;
        this.f390790b = str;
        this.f390791c = str2;
        this.f390792d = str3;
        this.f390793e = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f390789a, i);
        C143947c.m234106y(parcel, 2, this.f390790b);
        C143947c.m234106y(parcel, 3, this.f390791c);
        C143947c.m234106y(parcel, 4, this.f390792d);
        C143947c.m234106y(parcel, 5, this.f390793e);
        C143947c.m234083b(parcel, a);
    }
}
