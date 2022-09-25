package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_AutocompletionCallbackMetadata extends C$AutoValue_AutocompletionCallbackMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42357r();

    static {
        AutoValue_AutocompletionCallbackMetadata.class.getClassLoader();
    }

    public AutoValue_AutocompletionCallbackMetadata(Parcel parcel) {
        super(new int[]{1, 2, 3, 4, 5}[parcel.readInt()], new int[]{1, 2, 3}[parcel.readInt()], new int[]{1, 2}[parcel.readInt()]);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f110608a - 1);
        parcel.writeInt(this.f110609b - 1);
        parcel.writeInt(this.f110610c - 1);
    }

    public AutoValue_AutocompletionCallbackMetadata(int i, int i2, int i3) {
        super(i, i2, i3);
    }
}
