package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ri */
/* compiled from: PG */
public final class C7253ri implements C7242qy {
    public static final Parcelable.Creator CREATOR = new C7252rh();

    /* renamed from: a */
    public final String f23698a;

    /* renamed from: b */
    public final String f23699b;

    public C7253ri(Parcel parcel) {
        String readString = parcel.readString();
        int i = aeu.f20466a;
        this.f23698a = readString;
        this.f23699b = parcel.readString();
    }

    public C7253ri(String str, String str2) {
        this.f23698a = str;
        this.f23699b = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7253ri riVar = (C7253ri) obj;
            return this.f23698a.equals(riVar.f23698a) && this.f23699b.equals(riVar.f23699b);
        }
    }

    public final int hashCode() {
        return ((this.f23698a.hashCode() + 527) * 31) + this.f23699b.hashCode();
    }

    public final String toString() {
        String str = this.f23698a;
        String str2 = this.f23699b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23698a);
        parcel.writeString(this.f23699b);
    }
}
