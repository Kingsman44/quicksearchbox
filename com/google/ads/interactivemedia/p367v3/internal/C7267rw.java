package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rw */
/* compiled from: PG */
public final class C7267rw extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7266rv();

    /* renamed from: a */
    public final String f23725a;

    /* renamed from: b */
    public final String f23726b;

    /* renamed from: c */
    public final String f23727c;

    /* renamed from: d */
    public final byte[] f23728d;

    public C7267rw(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23725a = readString;
        this.f23726b = parcel.readString();
        this.f23727c = parcel.readString();
        this.f23728d = (byte[]) aeu.m18536f(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7267rw rwVar = (C7267rw) obj;
            return aeu.m18533c(this.f23725a, rwVar.f23725a) && aeu.m18533c(this.f23726b, rwVar.f23726b) && aeu.m18533c(this.f23727c, rwVar.f23727c) && Arrays.equals(this.f23728d, rwVar.f23728d);
        }
    }

    public final int hashCode() {
        String str = this.f23725a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23726b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23727c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Arrays.hashCode(this.f23728d);
    }

    public final String toString() {
        String str = this.f23739f;
        String str2 = this.f23725a;
        String str3 = this.f23726b;
        String str4 = this.f23727c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 36 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23725a);
        parcel.writeString(this.f23726b);
        parcel.writeString(this.f23727c);
        parcel.writeByteArray(this.f23728d);
    }

    public C7267rw(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f23725a = str;
        this.f23726b = str2;
        this.f23727c = str3;
        this.f23728d = bArr;
    }
}
