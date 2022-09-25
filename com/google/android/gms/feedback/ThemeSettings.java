package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ThemeSettings extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144211p();

    /* renamed from: a */
    public int f390592a;

    /* renamed from: b */
    int f390593b;

    public ThemeSettings() {
        this(3, 0);
    }

    public ThemeSettings(int i, int i2) {
        this.f390592a = i;
        this.f390593b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f390592a);
        C143947c.m234089h(parcel, 3, this.f390593b);
        C143947c.m234083b(parcel, a);
    }
}
