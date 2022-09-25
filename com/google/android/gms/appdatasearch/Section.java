package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class Section extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142799ao();

    /* renamed from: a */
    public final String f387556a;

    /* renamed from: b */
    public final boolean f387557b;

    /* renamed from: c */
    public final int f387558c;

    public Section(String str) {
        this(m231701a("CreativeWork/ShortMessage", str), false, 0);
    }

    public Section(String str, boolean z, int i) {
        this.f387556a = str;
        this.f387557b = z;
        this.f387558c = i;
    }

    /* renamed from: a */
    public static String m231701a(String str, String str2) {
        return "semantic#" + str + ";" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387556a);
        C143947c.m234084c(parcel, 2, this.f387557b);
        C143947c.m234089h(parcel, 3, this.f387558c);
        C143947c.m234083b(parcel, a);
    }
}
