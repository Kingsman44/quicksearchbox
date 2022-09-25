package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rs */
/* compiled from: PG */
public final class C7263rs extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7262rr();

    /* renamed from: a */
    public final String f23717a;

    /* renamed from: b */
    public final boolean f23718b;

    /* renamed from: c */
    public final boolean f23719c;

    /* renamed from: d */
    public final String[] f23720d;

    /* renamed from: e */
    private final C7273sb[] f23721e;

    public C7263rs(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23717a = readString;
        boolean z = true;
        this.f23718b = parcel.readByte() != 0;
        this.f23719c = parcel.readByte() == 0 ? false : z;
        this.f23720d = (String[]) aeu.m18536f(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f23721e = new C7273sb[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f23721e[i2] = (C7273sb) parcel.readParcelable(C7273sb.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7263rs rsVar = (C7263rs) obj;
            return this.f23718b == rsVar.f23718b && this.f23719c == rsVar.f23719c && aeu.m18533c(this.f23717a, rsVar.f23717a) && Arrays.equals(this.f23720d, rsVar.f23720d) && Arrays.equals(this.f23721e, rsVar.f23721e);
        }
    }

    public final int hashCode() {
        int i = ((((this.f23718b ? 1 : 0) + true) * 31) + (this.f23719c ? 1 : 0)) * 31;
        String str = this.f23717a;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23717a);
        parcel.writeByte(this.f23718b ? (byte) 1 : 0);
        parcel.writeByte(this.f23719c ? (byte) 1 : 0);
        parcel.writeStringArray(this.f23720d);
        parcel.writeInt(this.f23721e.length);
        for (C7273sb writeParcelable : this.f23721e) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C7263rs(String str, boolean z, boolean z2, String[] strArr, C7273sb[] sbVarArr) {
        super("CTOC");
        this.f23717a = str;
        this.f23718b = z;
        this.f23719c = z2;
        this.f23720d = strArr;
        this.f23721e = sbVarArr;
    }
}
