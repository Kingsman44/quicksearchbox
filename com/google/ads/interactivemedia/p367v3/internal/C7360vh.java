package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vh */
/* compiled from: PG */
public final class C7360vh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7359vg();

    /* renamed from: a */
    public final int f24048a;

    /* renamed from: b */
    private final C6864cy[] f24049b;

    /* renamed from: c */
    private int f24050c;

    public C7360vh(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f24048a = readInt;
        this.f24049b = new C6864cy[readInt];
        for (int i = 0; i < this.f24048a; i++) {
            this.f24049b[i] = (C6864cy) parcel.readParcelable(C6864cy.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public final C6864cy mo16648a(int i) {
        return this.f24049b[i];
    }

    /* renamed from: b */
    public final int mo16649b(C6864cy cyVar) {
        int i = 0;
        while (true) {
            C6864cy[] cyVarArr = this.f24049b;
            if (i >= cyVarArr.length) {
                return -1;
            }
            if (cyVar == cyVarArr[i]) {
                return i;
            }
            i++;
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
            C7360vh vhVar = (C7360vh) obj;
            return this.f24048a == vhVar.f24048a && Arrays.equals(this.f24049b, vhVar.f24049b);
        }
    }

    public final int hashCode() {
        int i = this.f24050c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f24049b) + 527;
        this.f24050c = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24048a);
        for (int i2 = 0; i2 < this.f24048a; i2++) {
            parcel.writeParcelable(this.f24049b[i2], 0);
        }
    }

    public C7360vh(C6864cy... cyVarArr) {
        int length = cyVarArr.length;
        ary.m19464q(length > 0);
        this.f24049b = cyVarArr;
        this.f24048a = length;
    }
}
