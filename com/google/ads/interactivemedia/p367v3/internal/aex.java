package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aex */
/* compiled from: PG */
public final class aex implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aew();

    /* renamed from: a */
    public final int f20485a;

    /* renamed from: b */
    public final int f20486b;

    /* renamed from: c */
    public final int f20487c;

    /* renamed from: d */
    public final byte[] f20488d;

    /* renamed from: e */
    private int f20489e;

    public aex(int i, int i2, int i3, byte[] bArr) {
        this.f20485a = i;
        this.f20486b = i2;
        this.f20487c = i3;
        this.f20488d = bArr;
    }

    public aex(Parcel parcel) {
        this.f20485a = parcel.readInt();
        this.f20486b = parcel.readInt();
        this.f20487c = parcel.readInt();
        this.f20488d = aeu.m18549s(parcel) ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aex aex = (aex) obj;
            return this.f20485a == aex.f20485a && this.f20486b == aex.f20486b && this.f20487c == aex.f20487c && Arrays.equals(this.f20488d, aex.f20488d);
        }
    }

    public final int hashCode() {
        int i = this.f20489e;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f20485a + 527) * 31) + this.f20486b) * 31) + this.f20487c) * 31) + Arrays.hashCode(this.f20488d);
        this.f20489e = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f20485a;
        int i2 = this.f20486b;
        int i3 = this.f20487c;
        boolean z = this.f20488d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20485a);
        parcel.writeInt(this.f20486b);
        parcel.writeInt(this.f20487c);
        aeu.m18550t(parcel, this.f20488d != null);
        byte[] bArr = this.f20488d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
