package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import p3186j$.util.Objects;

/* compiled from: PG */
public class CarInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143108at();

    /* renamed from: a */
    public String f387959a;

    /* renamed from: b */
    public String f387960b;

    /* renamed from: c */
    public String f387961c;

    /* renamed from: d */
    public String f387962d;

    /* renamed from: e */
    public int f387963e;

    /* renamed from: f */
    public int f387964f;

    /* renamed from: g */
    public boolean f387965g;

    /* renamed from: h */
    public int f387966h;

    /* renamed from: i */
    public String f387967i;

    /* renamed from: j */
    public String f387968j;

    /* renamed from: k */
    public String f387969k;

    /* renamed from: l */
    public String f387970l;

    /* renamed from: m */
    public boolean f387971m;

    /* renamed from: n */
    public boolean f387972n;

    /* renamed from: o */
    public boolean f387973o;

    /* renamed from: p */
    public String f387974p;

    /* renamed from: q */
    public String f387975q;

    public CarInfo() {
    }

    public CarInfo(String str, String str2, String str3, String str4, int i, int i2, boolean z, int i3, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, String str9, String str10) {
        this.f387959a = str;
        this.f387960b = str2;
        this.f387961c = str3;
        this.f387962d = str4;
        this.f387963e = i;
        this.f387964f = i2;
        this.f387965g = z;
        this.f387966h = i3;
        this.f387967i = str5;
        this.f387968j = str6;
        this.f387969k = str7;
        this.f387970l = str8;
        this.f387971m = z2;
        this.f387972n = z3;
        this.f387973o = z4;
        this.f387974p = str9;
        this.f387975q = str10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarInfo)) {
            return false;
        }
        CarInfo carInfo = (CarInfo) obj;
        if (!Objects.equals(this.f387959a, carInfo.f387959a) || !Objects.equals(this.f387960b, carInfo.f387960b) || !Objects.equals(this.f387961c, carInfo.f387961c) || !Objects.equals(this.f387962d, carInfo.f387962d) || !Objects.equals(Integer.valueOf(this.f387963e), Integer.valueOf(carInfo.f387963e)) || !Objects.equals(Integer.valueOf(this.f387964f), Integer.valueOf(carInfo.f387964f)) || !Objects.equals(Boolean.valueOf(this.f387965g), Boolean.valueOf(carInfo.f387965g)) || !Objects.equals(Integer.valueOf(this.f387966h), Integer.valueOf(carInfo.f387966h)) || !Objects.equals(this.f387967i, carInfo.f387967i) || !Objects.equals(this.f387968j, carInfo.f387968j) || !Objects.equals(this.f387969k, carInfo.f387969k) || !Objects.equals(this.f387970l, carInfo.f387970l) || !Objects.equals(Boolean.valueOf(this.f387971m), Boolean.valueOf(carInfo.f387971m)) || !Objects.equals(Boolean.valueOf(this.f387972n), Boolean.valueOf(carInfo.f387972n)) || !Objects.equals(Boolean.valueOf(this.f387973o), Boolean.valueOf(carInfo.f387973o)) || !Objects.equals(this.f387974p, carInfo.f387974p) || !Objects.equals(this.f387975q, carInfo.f387975q)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f387959a, this.f387960b, this.f387961c, this.f387962d, Integer.valueOf(this.f387963e), Integer.valueOf(this.f387964f));
    }

    public final String toString() {
        return this.f387961c + " " + this.f387959a + " " + this.f387960b + " " + this.f387962d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387959a);
        C143947c.m234106y(parcel, 2, this.f387960b);
        C143947c.m234106y(parcel, 3, this.f387961c);
        C143947c.m234106y(parcel, 4, this.f387962d);
        C143947c.m234089h(parcel, 5, this.f387963e);
        C143947c.m234089h(parcel, 6, this.f387964f);
        C143947c.m234084c(parcel, 7, this.f387965g);
        C143947c.m234089h(parcel, 8, this.f387966h);
        C143947c.m234106y(parcel, 9, this.f387967i);
        C143947c.m234106y(parcel, 10, this.f387968j);
        C143947c.m234106y(parcel, 11, this.f387969k);
        C143947c.m234106y(parcel, 12, this.f387970l);
        C143947c.m234084c(parcel, 13, this.f387971m);
        C143947c.m234084c(parcel, 14, this.f387972n);
        C143947c.m234084c(parcel, 15, this.f387973o);
        C143947c.m234106y(parcel, 16, this.f387974p);
        C143947c.m234106y(parcel, 17, this.f387975q);
        C143947c.m234083b(parcel, a);
    }
}
