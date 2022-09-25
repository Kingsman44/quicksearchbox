package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aat */
/* compiled from: PG */
public final class aat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aas();

    /* renamed from: a */
    public final int f20135a;

    /* renamed from: b */
    public final int[] f20136b;

    /* renamed from: c */
    public final int f20137c;

    /* renamed from: d */
    public final int f20138d;

    /* renamed from: e */
    public final int f20139e;

    public aat(Parcel parcel) {
        this.f20135a = parcel.readInt();
        int readByte = parcel.readByte();
        this.f20137c = readByte;
        int[] iArr = new int[readByte];
        this.f20136b = iArr;
        parcel.readIntArray(iArr);
        this.f20138d = parcel.readInt();
        this.f20139e = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aat aat = (aat) obj;
            return this.f20135a == aat.f20135a && Arrays.equals(this.f20136b, aat.f20136b) && this.f20138d == aat.f20138d && this.f20139e == aat.f20139e;
        }
    }

    public final int hashCode() {
        return (((((this.f20135a * 31) + Arrays.hashCode(this.f20136b)) * 31) + this.f20138d) * 31) + this.f20139e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20135a);
        parcel.writeInt(this.f20136b.length);
        parcel.writeIntArray(this.f20136b);
        parcel.writeInt(this.f20138d);
        parcel.writeInt(this.f20139e);
    }
}
