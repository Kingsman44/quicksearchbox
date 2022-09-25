package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

@Deprecated
/* compiled from: PG */
public final class Address extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146335a();

    /* renamed from: a */
    String f395257a;

    /* renamed from: b */
    String f395258b;

    /* renamed from: c */
    String f395259c;

    /* renamed from: d */
    String f395260d;

    /* renamed from: e */
    String f395261e;

    /* renamed from: f */
    String f395262f;

    /* renamed from: g */
    String f395263g;

    /* renamed from: h */
    String f395264h;

    /* renamed from: i */
    String f395265i;

    /* renamed from: j */
    boolean f395266j;

    /* renamed from: k */
    String f395267k;

    Address() {
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        this.f395257a = str;
        this.f395258b = str2;
        this.f395259c = str3;
        this.f395260d = str4;
        this.f395261e = str5;
        this.f395262f = str6;
        this.f395263g = str7;
        this.f395264h = str8;
        this.f395265i = str9;
        this.f395266j = z;
        this.f395267k = str10;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395257a);
        C143947c.m234106y(parcel, 3, this.f395258b);
        C143947c.m234106y(parcel, 4, this.f395259c);
        C143947c.m234106y(parcel, 5, this.f395260d);
        C143947c.m234106y(parcel, 6, this.f395261e);
        C143947c.m234106y(parcel, 7, this.f395262f);
        C143947c.m234106y(parcel, 8, this.f395263g);
        C143947c.m234106y(parcel, 9, this.f395264h);
        C143947c.m234106y(parcel, 10, this.f395265i);
        C143947c.m234084c(parcel, 11, this.f395266j);
        C143947c.m234106y(parcel, 12, this.f395267k);
        C143947c.m234083b(parcel, a);
    }
}
