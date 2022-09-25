package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abe */
/* compiled from: PG */
public class abe implements Parcelable {
    public static final Parcelable.Creator CREATOR = new abc();

    /* renamed from: z */
    public static final abe f20177z;

    /* renamed from: A */
    public final arn f20178A;

    /* renamed from: B */
    public final arn f20179B;

    /* renamed from: C */
    public final int f20180C;

    /* renamed from: D */
    public final boolean f20181D;

    /* renamed from: E */
    public final int f20182E;

    static {
        abd abd = new abd();
        f20177z = new abe(abd.f20174a, abd.f20175b, abd.f20176c);
    }

    public abe(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, (ClassLoader) null);
        this.f20178A = arn.m19405l(arrayList);
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, (ClassLoader) null);
        this.f20179B = arn.m19405l(arrayList2);
        this.f20180C = parcel.readInt();
        this.f20181D = aeu.m18549s(parcel);
        this.f20182E = parcel.readInt();
    }

    public abe(arn arn, arn arn2, int i) {
        this.f20178A = arn;
        this.f20179B = arn2;
        this.f20180C = i;
        this.f20181D = false;
        this.f20182E = 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            abe abe = (abe) obj;
            return this.f20178A.equals(abe.f20178A) && this.f20179B.equals(abe.f20179B) && this.f20180C == abe.f20180C && this.f20181D == abe.f20181D && this.f20182E == abe.f20182E;
        }
    }

    public int hashCode() {
        return ((((((((this.f20178A.hashCode() + 31) * 31) + this.f20179B.hashCode()) * 31) + this.f20180C) * 31) + (this.f20181D ? 1 : 0)) * 31) + this.f20182E;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f20178A);
        parcel.writeList(this.f20179B);
        parcel.writeInt(this.f20180C);
        aeu.m18550t(parcel, this.f20181D);
        parcel.writeInt(this.f20182E);
    }
}
