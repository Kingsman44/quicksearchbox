package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sj */
/* compiled from: PG */
public final class C7281sj extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7280si();

    /* renamed from: a */
    public final String f23750a;

    /* renamed from: b */
    public final String f23751b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7281sj(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f23750a = r0
            java.lang.String r3 = r3.readString()
            r2.f23751b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7281sj.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7281sj sjVar = (C7281sj) obj;
            return this.f23739f.equals(sjVar.f23739f) && aeu.m18533c(this.f23750a, sjVar.f23750a) && aeu.m18533c(this.f23751b, sjVar.f23751b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f23739f.hashCode() + 527) * 31;
        String str = this.f23750a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f23751b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f23739f;
        String str2 = this.f23750a;
        String str3 = this.f23751b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23739f);
        parcel.writeString(this.f23750a);
        parcel.writeString(this.f23751b);
    }

    public C7281sj(String str, String str2, String str3) {
        super(str);
        this.f23750a = str2;
        this.f23751b = str3;
    }
}
