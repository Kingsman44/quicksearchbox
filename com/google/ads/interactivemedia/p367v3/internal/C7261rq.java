package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rq */
/* compiled from: PG */
public final class C7261rq extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7260rp();

    /* renamed from: a */
    public final String f23711a;

    /* renamed from: b */
    public final int f23712b;

    /* renamed from: c */
    public final int f23713c;

    /* renamed from: d */
    public final long f23714d;

    /* renamed from: e */
    public final long f23715e;

    /* renamed from: g */
    private final C7273sb[] f23716g;

    public C7261rq(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23711a = readString;
        this.f23712b = parcel.readInt();
        this.f23713c = parcel.readInt();
        this.f23714d = parcel.readLong();
        this.f23715e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f23716g = new C7273sb[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f23716g[i2] = (C7273sb) parcel.readParcelable(C7273sb.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7261rq rqVar = (C7261rq) obj;
            return this.f23712b == rqVar.f23712b && this.f23713c == rqVar.f23713c && this.f23714d == rqVar.f23714d && this.f23715e == rqVar.f23715e && aeu.m18533c(this.f23711a, rqVar.f23711a) && Arrays.equals(this.f23716g, rqVar.f23716g);
        }
    }

    public final int hashCode() {
        int i = (((((((this.f23712b + 527) * 31) + this.f23713c) * 31) + ((int) this.f23714d)) * 31) + ((int) this.f23715e)) * 31;
        String str = this.f23711a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23711a);
        parcel.writeInt(this.f23712b);
        parcel.writeInt(this.f23713c);
        parcel.writeLong(this.f23714d);
        parcel.writeLong(this.f23715e);
        parcel.writeInt(this.f23716g.length);
        for (C7273sb writeParcelable : this.f23716g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C7261rq(String str, int i, int i2, long j, long j2, C7273sb[] sbVarArr) {
        super("CHAP");
        this.f23711a = str;
        this.f23712b = i;
        this.f23713c = i2;
        this.f23714d = j;
        this.f23715e = j2;
        this.f23716g = sbVarArr;
    }
}
