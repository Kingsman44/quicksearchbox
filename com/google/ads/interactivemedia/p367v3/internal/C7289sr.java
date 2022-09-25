package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.sr */
/* compiled from: PG */
public final class C7289sr implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C7288sq();

    /* renamed from: a */
    public final int f23760a;

    /* renamed from: b */
    public final int f23761b;

    /* renamed from: c */
    public final int f23762c;

    public C7289sr() {
        this.f23760a = -1;
        this.f23761b = -1;
        this.f23762c = -1;
    }

    public C7289sr(Parcel parcel) {
        this.f23760a = parcel.readInt();
        this.f23761b = parcel.readInt();
        this.f23762c = parcel.readInt();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C7289sr srVar = (C7289sr) obj;
        int i = this.f23760a - srVar.f23760a;
        if (i != 0) {
            return i;
        }
        int i2 = this.f23761b - srVar.f23761b;
        return i2 != 0 ? i2 : this.f23762c - srVar.f23762c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7289sr srVar = (C7289sr) obj;
            return this.f23760a == srVar.f23760a && this.f23761b == srVar.f23761b && this.f23762c == srVar.f23762c;
        }
    }

    public final int hashCode() {
        return (((this.f23760a * 31) + this.f23761b) * 31) + this.f23762c;
    }

    public final String toString() {
        int i = this.f23760a;
        int i2 = this.f23761b;
        int i3 = this.f23762c;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23760a);
        parcel.writeInt(this.f23761b);
        parcel.writeInt(this.f23762c);
    }
}
