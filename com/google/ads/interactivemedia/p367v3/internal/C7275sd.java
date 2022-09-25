package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sd */
/* compiled from: PG */
public final class C7275sd extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7274sc();

    /* renamed from: a */
    public final String f23740a;

    /* renamed from: b */
    public final String f23741b;

    /* renamed from: c */
    public final String f23742c;

    public C7275sd(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23740a = readString;
        this.f23741b = parcel.readString();
        this.f23742c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7275sd sdVar = (C7275sd) obj;
            return aeu.m18533c(this.f23741b, sdVar.f23741b) && aeu.m18533c(this.f23740a, sdVar.f23740a) && aeu.m18533c(this.f23742c, sdVar.f23742c);
        }
    }

    public final int hashCode() {
        String str = this.f23740a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23741b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23742c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f23739f;
        String str2 = this.f23740a;
        String str3 = this.f23741b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23739f);
        parcel.writeString(this.f23740a);
        parcel.writeString(this.f23742c);
    }

    public C7275sd(String str, String str2, String str3) {
        super("----");
        this.f23740a = str;
        this.f23741b = str2;
        this.f23742c = str3;
    }
}
