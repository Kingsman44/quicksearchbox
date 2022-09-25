package com.google.android.libraries.glide.fife;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.p3267c.p3268a.C41921c;
import java.security.MessageDigest;

/* compiled from: PG */
public final class ProvidedFifeUrl implements FifeUrl {
    public static final Parcelable.Creator CREATOR = new C22018h();

    /* renamed from: b */
    public final String f60720b;

    public ProvidedFifeUrl(Parcel parcel) {
        this.f60720b = parcel.readString();
    }

    /* renamed from: a */
    public final void mo12041a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ProvidedFifeUrl) {
            return this.f60720b.equals(((ProvidedFifeUrl) obj).f60720b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f60720b.hashCode();
    }

    public final String toString() {
        String str = this.f60720b;
        return "ProvidedFifeUrl{baseUrl='" + str + "'}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f60720b);
    }

    public ProvidedFifeUrl(String str) {
        if (C41921c.m73452a(str)) {
            this.f60720b = str;
            return;
        }
        throw new IllegalArgumentException("baseUrl is not a fife Url: ".concat(String.valueOf(str)));
    }
}
