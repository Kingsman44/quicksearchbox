package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rg */
/* compiled from: PG */
public final class C7251rg implements C7242qy {
    public static final Parcelable.Creator CREATOR = new C7250rf();

    /* renamed from: a */
    public final int f23690a;

    /* renamed from: b */
    public final String f23691b;

    /* renamed from: c */
    public final String f23692c;

    /* renamed from: d */
    public final int f23693d;

    /* renamed from: e */
    public final int f23694e;

    /* renamed from: f */
    public final int f23695f;

    /* renamed from: g */
    public final int f23696g;

    /* renamed from: h */
    public final byte[] f23697h;

    public C7251rg(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f23690a = i;
        this.f23691b = str;
        this.f23692c = str2;
        this.f23693d = i2;
        this.f23694e = i3;
        this.f23695f = i4;
        this.f23696g = i5;
        this.f23697h = bArr;
    }

    public C7251rg(Parcel parcel) {
        this.f23690a = parcel.readInt();
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23691b = readString;
        this.f23692c = parcel.readString();
        this.f23693d = parcel.readInt();
        this.f23694e = parcel.readInt();
        this.f23695f = parcel.readInt();
        this.f23696g = parcel.readInt();
        this.f23697h = (byte[]) aeu.m18536f(parcel.createByteArray());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7251rg rgVar = (C7251rg) obj;
            return this.f23690a == rgVar.f23690a && this.f23691b.equals(rgVar.f23691b) && this.f23692c.equals(rgVar.f23692c) && this.f23693d == rgVar.f23693d && this.f23694e == rgVar.f23694e && this.f23695f == rgVar.f23695f && this.f23696g == rgVar.f23696g && Arrays.equals(this.f23697h, rgVar.f23697h);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f23690a + 527) * 31) + this.f23691b.hashCode()) * 31) + this.f23692c.hashCode()) * 31) + this.f23693d) * 31) + this.f23694e) * 31) + this.f23695f) * 31) + this.f23696g) * 31) + Arrays.hashCode(this.f23697h);
    }

    public final String toString() {
        String str = this.f23691b;
        String str2 = this.f23692c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23690a);
        parcel.writeString(this.f23691b);
        parcel.writeString(this.f23692c);
        parcel.writeInt(this.f23693d);
        parcel.writeInt(this.f23694e);
        parcel.writeInt(this.f23695f);
        parcel.writeInt(this.f23696g);
        parcel.writeByteArray(this.f23697h);
    }
}
