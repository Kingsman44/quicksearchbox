package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rk */
/* compiled from: PG */
public final class C7255rk implements C7242qy {
    public static final Parcelable.Creator CREATOR = new C7254rj();

    /* renamed from: a */
    public final int f23700a;

    /* renamed from: b */
    public final String f23701b;

    /* renamed from: c */
    public final String f23702c;

    /* renamed from: d */
    public final String f23703d;

    /* renamed from: e */
    public final boolean f23704e;

    /* renamed from: f */
    public final int f23705f;

    public C7255rk(int i, String str, String str2, String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        ary.m19462o(z2);
        this.f23700a = i;
        this.f23701b = str;
        this.f23702c = str2;
        this.f23703d = str3;
        this.f23704e = z;
        this.f23705f = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7255rk rkVar = (C7255rk) obj;
            return this.f23700a == rkVar.f23700a && aeu.m18533c(this.f23701b, rkVar.f23701b) && aeu.m18533c(this.f23702c, rkVar.f23702c) && aeu.m18533c(this.f23703d, rkVar.f23703d) && this.f23704e == rkVar.f23704e && this.f23705f == rkVar.f23705f;
        }
    }

    public final int hashCode() {
        int i = (this.f23700a + 527) * 31;
        String str = this.f23701b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23702c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23703d;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((hashCode2 + i2) * 31) + (this.f23704e ? 1 : 0)) * 31) + this.f23705f;
    }

    public final String toString() {
        String str = this.f23702c;
        String str2 = this.f23701b;
        int i = this.f23700a;
        int i2 = this.f23705f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb.append("IcyHeaders: name=\"");
        sb.append(str);
        sb.append("\", genre=\"");
        sb.append(str2);
        sb.append("\", bitrate=");
        sb.append(i);
        sb.append(", metadataInterval=");
        sb.append(i2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23700a);
        parcel.writeString(this.f23701b);
        parcel.writeString(this.f23702c);
        parcel.writeString(this.f23703d);
        aeu.m18550t(parcel, this.f23704e);
        parcel.writeInt(this.f23705f);
    }

    public C7255rk(Parcel parcel) {
        this.f23700a = parcel.readInt();
        this.f23701b = parcel.readString();
        this.f23702c = parcel.readString();
        this.f23703d = parcel.readString();
        this.f23704e = aeu.m18549s(parcel);
        this.f23705f = parcel.readInt();
    }
}
