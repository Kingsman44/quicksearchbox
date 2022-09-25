package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rm */
/* compiled from: PG */
public final class C7257rm extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7256rl();

    /* renamed from: a */
    public final String f23706a;

    /* renamed from: b */
    public final String f23707b;

    /* renamed from: c */
    public final int f23708c;

    /* renamed from: d */
    public final byte[] f23709d;

    public C7257rm(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23706a = readString;
        this.f23707b = parcel.readString();
        this.f23708c = parcel.readInt();
        this.f23709d = (byte[]) aeu.m18536f(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7257rm rmVar = (C7257rm) obj;
            return this.f23708c == rmVar.f23708c && aeu.m18533c(this.f23706a, rmVar.f23706a) && aeu.m18533c(this.f23707b, rmVar.f23707b) && Arrays.equals(this.f23709d, rmVar.f23709d);
        }
    }

    public final int hashCode() {
        int i = (this.f23708c + 527) * 31;
        String str = this.f23706a;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23707b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f23709d);
    }

    public final String toString() {
        String str = this.f23739f;
        String str2 = this.f23706a;
        String str3 = this.f23707b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23706a);
        parcel.writeString(this.f23707b);
        parcel.writeInt(this.f23708c);
        parcel.writeByteArray(this.f23709d);
    }

    public C7257rm(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f23706a = str;
        this.f23707b = str2;
        this.f23708c = i;
        this.f23709d = bArr;
    }
}
