package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58832aw;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class FRDProductSpecificDataEntry extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C144284b();

    /* renamed from: a */
    int f390730a;

    /* renamed from: b */
    int f390731b;

    /* renamed from: c */
    List f390732c;

    /* renamed from: d */
    List f390733d;

    /* renamed from: e */
    List f390734e;

    /* renamed from: f */
    List f390735f;

    /* renamed from: g */
    byte[][] f390736g;

    /* renamed from: h */
    Boolean f390737h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.f390730a = i;
        this.f390731b = i2;
        this.f390732c = list;
        this.f390733d = list2;
        this.f390734e = list3;
        this.f390735f = list4;
        this.f390736g = bArr;
        this.f390737h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.f390730a == fRDProductSpecificDataEntry.f390730a && this.f390731b == fRDProductSpecificDataEntry.f390731b && C58832aw.m90831a(this.f390732c, fRDProductSpecificDataEntry.f390732c) && C58832aw.m90831a(this.f390733d, fRDProductSpecificDataEntry.f390733d) && C58832aw.m90831a(this.f390734e, fRDProductSpecificDataEntry.f390734e) && C58832aw.m90831a(this.f390735f, fRDProductSpecificDataEntry.f390735f) && Arrays.equals(this.f390736g, fRDProductSpecificDataEntry.f390736g) && C58832aw.m90831a(this.f390737h, fRDProductSpecificDataEntry.f390737h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f390730a), Integer.valueOf(this.f390731b), this.f390732c, this.f390733d, this.f390734e, this.f390735f, Integer.valueOf(Arrays.deepHashCode(this.f390736g)), this.f390737h});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f390730a);
        C143947c.m234089h(parcel, 3, this.f390731b);
        C143947c.m234078A(parcel, 4, this.f390732c);
        C143947c.m234103v(parcel, 5, this.f390733d);
        C143947c.m234078A(parcel, 6, this.f390734e);
        C143947c.m234103v(parcel, 7, this.f390735f);
        C143947c.m234095n(parcel, 8, this.f390736g);
        C143947c.m234092k(parcel, 9, this.f390737h);
        C143947c.m234083b(parcel, a);
    }
}
