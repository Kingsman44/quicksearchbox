package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144332j();

    /* renamed from: a */
    public GoogleHelp f390777a;

    /* renamed from: b */
    public String f390778b;

    /* renamed from: c */
    public String f390779c;

    /* renamed from: d */
    public int f390780d;

    /* renamed from: e */
    public String f390781e;

    /* renamed from: f */
    public int f390782f;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2) {
        this.f390777a = googleHelp;
        this.f390778b = str;
        this.f390779c = str2;
        this.f390780d = i;
        this.f390781e = str3;
        this.f390782f = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f390777a, i);
        C143947c.m234106y(parcel, 2, this.f390778b);
        C143947c.m234106y(parcel, 3, this.f390779c);
        C143947c.m234089h(parcel, 4, this.f390780d);
        C143947c.m234106y(parcel, 5, this.f390781e);
        C143947c.m234089h(parcel, 6, this.f390782f);
        C143947c.m234083b(parcel, a);
    }
}
