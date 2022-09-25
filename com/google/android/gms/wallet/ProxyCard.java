package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

@Deprecated
/* compiled from: PG */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146374o();

    /* renamed from: a */
    String f395340a;

    /* renamed from: b */
    String f395341b;

    /* renamed from: c */
    int f395342c;

    /* renamed from: d */
    int f395343d;

    public ProxyCard(String str, String str2, int i, int i2) {
        this.f395340a = str;
        this.f395341b = str2;
        this.f395342c = i;
        this.f395343d = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395340a);
        C143947c.m234106y(parcel, 3, this.f395341b);
        C143947c.m234089h(parcel, 4, this.f395342c);
        C143947c.m234089h(parcel, 5, this.f395343d);
        C143947c.m234083b(parcel, a);
    }
}
