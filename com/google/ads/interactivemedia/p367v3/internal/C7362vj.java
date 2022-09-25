package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vj */
/* compiled from: PG */
public final class C7362vj implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7361vi();

    /* renamed from: a */
    public static final C7362vj f24051a = new C7362vj(new C7360vh[0]);

    /* renamed from: b */
    public final int f24052b;

    /* renamed from: c */
    private final C7360vh[] f24053c;

    /* renamed from: d */
    private int f24054d;

    public C7362vj(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f24052b = readInt;
        this.f24053c = new C7360vh[readInt];
        for (int i = 0; i < this.f24052b; i++) {
            this.f24053c[i] = (C7360vh) parcel.readParcelable(C7360vh.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public final C7360vh mo16656a(int i) {
        return this.f24053c[i];
    }

    /* renamed from: b */
    public final int mo16657b(C7360vh vhVar) {
        for (int i = 0; i < this.f24052b; i++) {
            if (this.f24053c[i] == vhVar) {
                return i;
            }
        }
        return -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7362vj vjVar = (C7362vj) obj;
            return this.f24052b == vjVar.f24052b && Arrays.equals(this.f24053c, vjVar.f24053c);
        }
    }

    public final int hashCode() {
        int i = this.f24054d;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f24053c);
        this.f24054d = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24052b);
        for (int i2 = 0; i2 < this.f24052b; i2++) {
            parcel.writeParcelable(this.f24053c[i2], 0);
        }
    }

    public C7362vj(C7360vh... vhVarArr) {
        this.f24053c = vhVarArr;
        this.f24052b = vhVarArr.length;
    }
}
