package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sl */
/* compiled from: PG */
public final class C7283sl extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7282sk();

    /* renamed from: a */
    public final String f23752a;

    /* renamed from: b */
    public final String f23753b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7283sl(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f23752a = r0
            java.lang.String r3 = r3.readString()
            r2.f23753b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7283sl.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7283sl slVar = (C7283sl) obj;
            return this.f23739f.equals(slVar.f23739f) && aeu.m18533c(this.f23752a, slVar.f23752a) && aeu.m18533c(this.f23753b, slVar.f23753b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f23739f.hashCode() + 527) * 31;
        String str = this.f23752a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23753b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f23739f;
        String str2 = this.f23753b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23739f);
        parcel.writeString(this.f23752a);
        parcel.writeString(this.f23753b);
    }

    public C7283sl(String str, String str2, String str3) {
        super(str);
        this.f23752a = str2;
        this.f23753b = str3;
    }
}
