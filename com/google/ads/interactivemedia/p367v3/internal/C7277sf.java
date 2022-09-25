package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sf */
/* compiled from: PG */
public final class C7277sf extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7276se();

    /* renamed from: a */
    public final int f23743a;

    /* renamed from: b */
    public final int f23744b;

    /* renamed from: c */
    public final int f23745c;

    /* renamed from: d */
    public final int[] f23746d;

    /* renamed from: e */
    public final int[] f23747e;

    public C7277sf(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f23743a = i;
        this.f23744b = i2;
        this.f23745c = i3;
        this.f23746d = iArr;
        this.f23747e = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7277sf sfVar = (C7277sf) obj;
            return this.f23743a == sfVar.f23743a && this.f23744b == sfVar.f23744b && this.f23745c == sfVar.f23745c && Arrays.equals(this.f23746d, sfVar.f23746d) && Arrays.equals(this.f23747e, sfVar.f23747e);
        }
    }

    public final int hashCode() {
        return ((((((((this.f23743a + 527) * 31) + this.f23744b) * 31) + this.f23745c) * 31) + Arrays.hashCode(this.f23746d)) * 31) + Arrays.hashCode(this.f23747e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23743a);
        parcel.writeInt(this.f23744b);
        parcel.writeInt(this.f23745c);
        parcel.writeIntArray(this.f23746d);
        parcel.writeIntArray(this.f23747e);
    }

    public C7277sf(Parcel parcel) {
        super("MLLT");
        this.f23743a = parcel.readInt();
        this.f23744b = parcel.readInt();
        this.f23745c = parcel.readInt();
        this.f23746d = (int[]) aeu.m18536f(parcel.createIntArray());
        this.f23747e = (int[]) aeu.m18536f(parcel.createIntArray());
    }
}
