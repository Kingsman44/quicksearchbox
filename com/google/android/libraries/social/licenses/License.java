package com.google.android.libraries.social.licenses;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class License implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new C41953a();

    /* renamed from: a */
    public final String f109503a;

    /* renamed from: b */
    public final long f109504b;

    /* renamed from: c */
    public final int f109505c;

    /* renamed from: d */
    public final String f109506d;

    public License(Parcel parcel) {
        this.f109503a = parcel.readString();
        this.f109504b = parcel.readLong();
        this.f109505c = parcel.readInt();
        this.f109506d = parcel.readString();
    }

    public License(String str, long j, int i, String str2) {
        this.f109503a = str;
        this.f109504b = j;
        this.f109505c = i;
        this.f109506d = str2;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f109503a.compareTo(((License) obj).f109503a);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof License)) {
            return false;
        }
        return this.f109503a.equals(((License) obj).f109503a);
    }

    public final int hashCode() {
        return this.f109503a.hashCode();
    }

    public final String toString() {
        return this.f109503a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109503a);
        parcel.writeLong(this.f109504b);
        parcel.writeInt(this.f109505c);
        parcel.writeString(this.f109506d);
    }
}
