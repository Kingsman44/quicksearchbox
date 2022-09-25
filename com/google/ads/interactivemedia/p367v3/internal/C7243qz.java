package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qz */
/* compiled from: PG */
public final class C7243qz implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7241qx();

    /* renamed from: a */
    private final C7242qy[] f23673a;

    public C7243qz(Parcel parcel) {
        this.f23673a = new C7242qy[parcel.readInt()];
        int i = 0;
        while (true) {
            C7242qy[] qyVarArr = this.f23673a;
            if (i < qyVarArr.length) {
                qyVarArr[i] = (C7242qy) parcel.readParcelable(C7242qy.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public C7243qz(C7242qy... qyVarArr) {
        this.f23673a = qyVarArr;
    }

    /* renamed from: a */
    public final int mo16341a() {
        return this.f23673a.length;
    }

    /* renamed from: b */
    public final C7242qy mo16342b(int i) {
        return this.f23673a[i];
    }

    /* renamed from: c */
    public final C7243qz mo16343c(C7243qz qzVar) {
        return qzVar == null ? this : mo16344d(qzVar.f23673a);
    }

    /* renamed from: d */
    public final C7243qz mo16344d(C7242qy... qyVarArr) {
        if (qyVarArr.length == 0) {
            return this;
        }
        return new C7243qz((C7242qy[]) aeu.m18540j(this.f23673a, qyVarArr));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f23673a, ((C7243qz) obj).f23673a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f23673a);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f23673a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23673a.length);
        for (C7242qy writeParcelable : this.f23673a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public C7243qz(List list) {
        this.f23673a = (C7242qy[]) list.toArray(new C7242qy[0]);
    }
}
