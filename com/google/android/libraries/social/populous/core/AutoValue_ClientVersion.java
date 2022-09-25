package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_ClientVersion extends C$AutoValue_ClientVersion implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42359t();

    static {
        AutoValue_ClientVersion.class.getClassLoader();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoValue_ClientVersion(Parcel parcel) {
        super(parcel.readString(), parcel.readString(), parcel.readByte() == 1 ? parcel.readString() : null, new int[]{1, 2, 3, 4}[parcel.readInt()]);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110611a);
        parcel.writeString(this.f110612b);
        parcel.writeByte(this.f110613c == null ? (byte) 0 : 1);
        String str = this.f110613c;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeInt(this.f110614d - 1);
    }

    public AutoValue_ClientVersion(String str, String str2, String str3, int i) {
        super(str, str2, str3, i);
    }
}
