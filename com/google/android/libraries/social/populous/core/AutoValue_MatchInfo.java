package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_MatchInfo extends C$AutoValue_MatchInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42252ae();

    static {
        AutoValue_MatchInfo.class.getClassLoader();
    }

    public AutoValue_MatchInfo(int i, int i2) {
        super(i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110653a);
        parcel.writeInt(this.f110654b);
    }

    public AutoValue_MatchInfo(Parcel parcel) {
        super(parcel.readInt(), parcel.readInt());
    }
}
