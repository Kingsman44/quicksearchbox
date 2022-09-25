package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class PassFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145621s();

    /* renamed from: a */
    public PassType[] f393650a;

    /* renamed from: b */
    public String[] f393651b;

    /* renamed from: c */
    public String[] f393652c;

    /* renamed from: d */
    public String[] f393653d;

    /* renamed from: e */
    public String[] f393654e;

    /* renamed from: f */
    public String[] f393655f;

    /* renamed from: g */
    public boolean f393656g;

    /* renamed from: h */
    public int f393657h;

    /* renamed from: i */
    public PassSaveTypeFilter f393658i;

    public PassFilter() {
    }

    public PassFilter(PassType[] passTypeArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, boolean z, int i, PassSaveTypeFilter passSaveTypeFilter) {
        this.f393650a = passTypeArr;
        this.f393651b = strArr;
        this.f393652c = strArr2;
        this.f393653d = strArr3;
        this.f393654e = strArr4;
        this.f393655f = strArr5;
        this.f393656g = z;
        this.f393657h = i;
        this.f393658i = passSaveTypeFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PassFilter) {
            PassFilter passFilter = (PassFilter) obj;
            return Arrays.equals(this.f393650a, passFilter.f393650a) && Arrays.equals(this.f393651b, passFilter.f393651b) && Arrays.equals(this.f393652c, passFilter.f393652c) && Arrays.equals(this.f393653d, passFilter.f393653d) && Arrays.equals(this.f393654e, passFilter.f393654e) && Arrays.equals(this.f393655f, passFilter.f393655f) && C143912ba.m233950b(Boolean.valueOf(this.f393656g), Boolean.valueOf(passFilter.f393656g)) && C143912ba.m233950b(Integer.valueOf(this.f393657h), Integer.valueOf(passFilter.f393657h)) && C143912ba.m233950b(this.f393658i, passFilter.f393658i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f393650a)), Integer.valueOf(Arrays.hashCode(this.f393651b)), Integer.valueOf(Arrays.hashCode(this.f393652c)), Integer.valueOf(Arrays.hashCode(this.f393653d)), Integer.valueOf(Arrays.hashCode(this.f393654e)), Integer.valueOf(Arrays.hashCode(this.f393655f)), Boolean.valueOf(this.f393656g), Integer.valueOf(this.f393657h), this.f393658i});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f393650a, i);
        C143947c.m234107z(parcel, 2, this.f393651b);
        C143947c.m234107z(parcel, 3, this.f393652c);
        C143947c.m234107z(parcel, 4, this.f393653d);
        C143947c.m234107z(parcel, 5, this.f393654e);
        C143947c.m234107z(parcel, 6, this.f393655f);
        C143947c.m234084c(parcel, 7, this.f393656g);
        C143947c.m234089h(parcel, 8, this.f393657h);
        C143947c.m234105x(parcel, 9, this.f393658i, i);
        C143947c.m234083b(parcel, a);
    }
}
