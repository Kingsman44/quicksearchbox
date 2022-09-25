package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sh */
/* compiled from: PG */
public final class C7279sh extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7278sg();

    /* renamed from: a */
    public final String f23748a;

    /* renamed from: b */
    public final byte[] f23749b;

    public C7279sh(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23748a = readString;
        this.f23749b = (byte[]) aeu.m18536f(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7279sh shVar = (C7279sh) obj;
            return aeu.m18533c(this.f23748a, shVar.f23748a) && Arrays.equals(this.f23749b, shVar.f23749b);
        }
    }

    public final int hashCode() {
        String str = this.f23748a;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.f23749b);
    }

    public final String toString() {
        String str = this.f23739f;
        String str2 = this.f23748a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23748a);
        parcel.writeByteArray(this.f23749b);
    }

    public C7279sh(String str, byte[] bArr) {
        super("PRIV");
        this.f23748a = str;
        this.f23749b = bArr;
    }
}
