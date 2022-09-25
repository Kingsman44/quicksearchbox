package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ru */
/* compiled from: PG */
public final class C7265ru extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7264rt();

    /* renamed from: a */
    public final String f23722a;

    /* renamed from: b */
    public final String f23723b;

    /* renamed from: c */
    public final String f23724c;

    public C7265ru(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23722a = readString;
        this.f23723b = parcel.readString();
        this.f23724c = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7265ru ruVar = (C7265ru) obj;
            return aeu.m18533c(this.f23723b, ruVar.f23723b) && aeu.m18533c(this.f23722a, ruVar.f23722a) && aeu.m18533c(this.f23724c, ruVar.f23724c);
        }
    }

    public final int hashCode() {
        String str = this.f23722a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f23723b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f23724c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f23739f;
        String str2 = this.f23722a;
        String str3 = this.f23723b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23739f);
        parcel.writeString(this.f23722a);
        parcel.writeString(this.f23724c);
    }

    public C7265ru(String str, String str2, String str3) {
        super("COMM");
        this.f23722a = str;
        this.f23723b = str2;
        this.f23724c = str3;
    }
}
