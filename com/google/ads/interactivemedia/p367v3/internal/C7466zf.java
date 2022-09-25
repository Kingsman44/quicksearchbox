package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zf */
/* compiled from: PG */
public final class C7466zf implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7465ze();

    /* renamed from: a */
    public final int f24544a;

    /* renamed from: b */
    public final int f24545b;

    /* renamed from: c */
    public final String f24546c;

    /* renamed from: d */
    public final String f24547d;

    /* renamed from: e */
    public final String f24548e;

    /* renamed from: f */
    public final String f24549f;

    public C7466zf(int i, int i2, String str, String str2, String str3, String str4) {
        this.f24544a = i;
        this.f24545b = i2;
        this.f24546c = str;
        this.f24547d = str2;
        this.f24548e = str3;
        this.f24549f = str4;
    }

    public C7466zf(Parcel parcel) {
        this.f24544a = parcel.readInt();
        this.f24545b = parcel.readInt();
        this.f24546c = parcel.readString();
        this.f24547d = parcel.readString();
        this.f24548e = parcel.readString();
        this.f24549f = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7466zf zfVar = (C7466zf) obj;
            return this.f24544a == zfVar.f24544a && this.f24545b == zfVar.f24545b && TextUtils.equals(this.f24546c, zfVar.f24546c) && TextUtils.equals(this.f24547d, zfVar.f24547d) && TextUtils.equals(this.f24548e, zfVar.f24548e) && TextUtils.equals(this.f24549f, zfVar.f24549f);
        }
    }

    public final int hashCode() {
        int i = ((this.f24544a * 31) + this.f24545b) * 31;
        String str = this.f24546c;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24547d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24548e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f24549f;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24544a);
        parcel.writeInt(this.f24545b);
        parcel.writeString(this.f24546c);
        parcel.writeString(this.f24547d);
        parcel.writeString(this.f24548e);
        parcel.writeString(this.f24549f);
    }
}
