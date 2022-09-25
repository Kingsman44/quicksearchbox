package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sn */
/* compiled from: PG */
public final class C7285sn implements C7242qy {
    public static final Parcelable.Creator CREATOR = new C7284sm();

    /* renamed from: a */
    public final String f23754a;

    /* renamed from: b */
    public final byte[] f23755b;

    /* renamed from: c */
    public final int f23756c;

    /* renamed from: d */
    public final int f23757d;

    public /* synthetic */ C7285sn(Parcel parcel) {
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23754a = readString;
        this.f23755b = (byte[]) aeu.m18536f(parcel.createByteArray());
        this.f23756c = parcel.readInt();
        this.f23757d = parcel.readInt();
    }

    public C7285sn(String str, byte[] bArr, int i, int i2) {
        this.f23754a = str;
        this.f23755b = bArr;
        this.f23756c = i;
        this.f23757d = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7285sn snVar = (C7285sn) obj;
            return this.f23754a.equals(snVar.f23754a) && Arrays.equals(this.f23755b, snVar.f23755b) && this.f23756c == snVar.f23756c && this.f23757d == snVar.f23757d;
        }
    }

    public final int hashCode() {
        return ((((((this.f23754a.hashCode() + 527) * 31) + Arrays.hashCode(this.f23755b)) * 31) + this.f23756c) * 31) + this.f23757d;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f23754a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23754a);
        parcel.writeByteArray(this.f23755b);
        parcel.writeInt(this.f23756c);
        parcel.writeInt(this.f23757d);
    }
}
